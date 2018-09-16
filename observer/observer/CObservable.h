#include "IObservable.h"
#include "IObserver.h"
#include <vector>
#include <map>
#include <algorithm>

// Реализация интерфейса IObservable
template <class T>
class CObservable : public IObservable<T>
{
public:
	typedef IObserver<T> ObserverType;

	void RegisterObserver(ObserverType & observer, unsigned int priority = 0) override
	{
		auto it = m_observers.find(priority);
		if (it == m_observers.end())
		{
			m_observers.insert(std::pair<unsigned, std::vector<ObserverType *>>(priority, { &observer }));
		}
		else
		{
			m_observers.at(priority).push_back(&observer);
		}
	}

	void NotifyObservers() override
	{
		T data = GetChangedData();
		for (auto it = m_observers.begin(); it != m_observers.end(); ++it)
		{
			for (auto & observer : it->second)
			{
				observer->Update(data);
			}
		}
	}

	void RemoveObserver(ObserverType & observer) override
	{
		for (auto it = m_observers.begin(); it != m_observers.end(); ++it)
		{
			auto & observers = it->second;
			observers.erase(std::remove(observers.begin(), observers.end(), &observer), observers.end());
		}
	}

protected:
	// Классы-наследники должны перегрузить данный метод, 
	// в котором возвращать информацию об изменениях в объекте
	virtual T GetChangedData()const = 0;

private:
	std::map<unsigned, std::vector<ObserverType *>, std::greater<unsigned>> m_observers;
};
