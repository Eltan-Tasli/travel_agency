package fr.lernejo.prediction;

public class TemperaturesDates {

    private final String date;
    private final double temperature;

    public TemperaturesDates(String date, double temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    public String getDate() {
        return date;
    }

    public double getTemperature() {
        return temperature;
    }
}
