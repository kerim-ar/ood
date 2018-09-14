#pragma once

#include "SWeatherInfo.h"
#include "IObserver.h"

class CDisplay : public IObserver<SWeatherInfo>
{
private:
	void Update(SWeatherInfo const& data) override;
};

