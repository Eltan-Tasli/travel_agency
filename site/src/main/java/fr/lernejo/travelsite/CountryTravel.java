package fr.lernejo.travelsite;

public class CountryTravel {

    private final String country;
    private final double temperature;

    public CountryTravel(String country, double temperature) {
        this.country = country;
        this.temperature = temperature;
    }

    public String getCountry() {
        return country;
    }

    public double getTemperature() {
        return temperature;
    }
}
