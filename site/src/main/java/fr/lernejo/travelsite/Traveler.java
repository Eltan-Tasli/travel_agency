package fr.lernejo.travelsite;

public class Traveler {

    private final String userEmail;
    private final String userName;
    private final String userCountry;
    private final String weatherExpectation;
    private final double minimumTemperatureDistance;


    public Traveler(String userEmail, String userName, String userCountry, String weatherExpectation, double minimumTemperatureDistance) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userCountry = userCountry;
        this.weatherExpectation = weatherExpectation;
        this.minimumTemperatureDistance = minimumTemperatureDistance;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public String getWeatherExpectation() {
        return weatherExpectation;
    }

    public double getMinimumTemperatureDistance() {
        return minimumTemperatureDistance;
    }
}
