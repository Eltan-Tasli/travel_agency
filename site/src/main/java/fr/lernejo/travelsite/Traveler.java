package fr.lernejo.travelsite;

public record Traveler(String userEmail,
                       String userName,
                       String userCountry,
                       String weatherExpectation,
                       double minimumTemperatureDistance) {


}
