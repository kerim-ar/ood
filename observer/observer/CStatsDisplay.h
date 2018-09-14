#pragma once
#include "IObserver.h"
#include "SWeatherInfo.h"
#include "CWeatherDataCalc.h"
#include <string>

class CStatsDisplay : public IObserver<SWeatherInfo>
{
private:
	void Update(SWeatherInfo const& data) override;
	void PrintData(std::string const& dataName, CWeatherDataCalc const& calc) const;

	CWeatherDataCalc m_tempCalc;
	CWeatherDataCalc m_humCalc;
	CWeatherDataCalc m_presCalc;
};
