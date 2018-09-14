#pragma once

#include <climits>
#include <algorithm>

class CWeatherDataCalc
{
public:
	void Update(double const data);
	double GetMax() const;
	double GetMin() const;
	double GetAverage() const;

private:
	double m_minData = std::numeric_limits<double>::infinity();
	double m_maxData = -std::numeric_limits<double>::infinity();
	double m_accData = 0;
	unsigned m_countAcc = 0;
};

