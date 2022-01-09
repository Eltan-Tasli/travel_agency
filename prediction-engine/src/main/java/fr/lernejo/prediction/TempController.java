package fr.lernejo.prediction;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TempController {

    @GetMapping("/api/temperature")
    public ResponseEntity<Temperature> getTemperature(@RequestParam String country){
        final TemperatureService temperatureService = new TemperatureService();
        double firstTemperature = temperatureService.getTemperature(country);
        double secondTemperature = temperatureService.getTemperature(country);
        TemperaturesDates t1 = new TemperaturesDates("08-01-2022",firstTemperature);
        TemperaturesDates t2 = new TemperaturesDates("09-01-2022",secondTemperature);
        return new ResponseEntity<>(new Temperature(country, List.of(t1,t2)), HttpStatus.OK);
    }

}
