package dependencyInversionPrinciple

class Phone : WeatherAlert {
    override fun generateWeatherAlert(weatherConditions: String): String {
        return "Phone: It is $weatherConditions "
    }
}
