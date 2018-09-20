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
		auto it = m_observersMap.find(priority);
		if (it == m_observersMap.end())
		{
			m_observersMap.insert(std::pair<unsigned, std::vector<ObserverType *>>(priority, { &observer }));
		}
		else
		{
			m_observersMap.at(priority).push_back(&observer);
		}
	}

	void NotifyObservers() override
	{
		T data = GetChangedData();
		const auto clone = m_observersMap;
		for (auto it = clone.begin(); it != clone.end(); ++it)
		{
			for (auto & observer : it->second)
			{
				observer->Update(data);
			}
		}
	}

	void RemoveObserver(ObserverType & observer) override
	{
		for (auto it = m_observersMap.begin(); it != m_observersMap.end(); )
		{
			auto & observers = it->second;
			observers.erase(std::remove(observers.begin(), observers.end(), &observer), observers.end());
			if (observers.empty())
			{
				it = m_observersMap.erase(it);
			}
			else
			{
				++it;
			}
		}
	}

protected:
	// Классы-наследники должны перегрузить данный метод, 
	// в котором возвращать информацию об изменениях в объекте
	virtual T GetChangedData()const = 0;

private:
	std::map<unsigned, std::vector<ObserverType *>, std::greater<unsigned>> m_observersMap;
};
