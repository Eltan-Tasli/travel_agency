package fr.lernejo.prediction;

import java.util.List;

public class Temperature {

    private final String country;
    private final List<TemperaturesDates> temperatures;

    public Temperature(String country, List<TemperaturesDates> temperatures) {
        this.country = country;
        this.temperatures = temperatures;
    }

    public String getCountry() {
        return country;
    }

    public List<TemperaturesDates> getTemperatures() {
        return temperatures;
    }
}
