#include "CWeatherDataCalc.h"

void CWeatherDataCalc::Update(double const data)
{
	if (m_minData > data)
	{
		m_minData = data;
	}
	if (m_maxData < data)
	{
		m_maxData = data;
	}
	m_accData += data;
	++m_countAcc;
}

double CWeatherDataCalc::GetMax() const
{
	return m_maxData;
}

double CWeatherDataCalc::GetMin() const
{
	return m_minData;
}

double CWeatherDataCalc::GetAverage() const
{
	return m_accData / m_countAcc;
}