package dependencyInversionPrinciple

class Emailer : WeatherAlert {
    override fun generateWeatherAlert(weatherConditions: String): String {
        return "Email: It is $weatherConditions "
    }
}
