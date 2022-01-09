package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SiteController {

    @PostMapping("/api/inscription")
    public void firstInscriptionRoad(@RequestBody Traveler eltan){

        System.out.println("Cela fonctionne");

    }

    @GetMapping("/api/travels")
    public List<CountryTravel> getTravels(@RequestParam String userName){

        return List.of(new CountryTravel("Turquie",32), new CountryTravel("Pakistan",41));

    }

}
