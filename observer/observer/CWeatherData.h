#pragma once

#include "SWeatherInfo.h"
#include "CObservable.h"

class CWeatherData : public CObservable<SWeatherInfo>
{
public:
	// ����������� � �������� �������
	double GetTemperature()const;

	// ������������� ��������� (0...100)
	double GetHumidity()const;
	
	// ����������� �������� (� ��.��.��)
	double GetPressure()const;

	void MeasurementsChanged();

	void SetMeasurements(double temp, double humidity, double pressure);

protected:
	SWeatherInfo GetChangedData()const override;

private:
	double m_temperature = 0.0;
	double m_humidity = 0.0;
	double m_pressure = 760.0;
};
