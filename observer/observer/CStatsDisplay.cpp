#include "CStatsDisplay.h"
#include <iostream>

/* ����� Update ������ ���������, ����� ���������� ����������� ��� ������ ��������
������ CObservable �� ����� �������� ��� �����, �.�. � ���������� IObserver ��
�������� ���������
*/
void CStatsDisplay::Update(SWeatherInfo const & data)
{
	m_tempCalc.Update(data.temperature);
	m_humCalc.Update(data.humidity);
	m_presCalc.Update(data.pressure);

	PrintData("Temp", m_tempCalc);
	PrintData("Humidity", m_humCalc);
	PrintData("Pressure", m_presCalc);
}

void CStatsDisplay::PrintData(std::string const& dataName, CWeatherDataCalc const& calc) const
{
	std::cout << "Max " << dataName << " " << calc.GetMax() << std::endl;
	std::cout << "Min " << dataName << " " << calc.GetMin() << std::endl;
	std::cout << "Average " << dataName << " " << calc.GetAverage() << std::endl;
	std::cout << "----------------" << std::endl;
}