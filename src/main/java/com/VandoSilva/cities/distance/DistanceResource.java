package com.VandoSilva.cities.distance;


import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("distances")
public class DistanceResource {

    Logger log = (Logger) LoggerFactory.getLogger(DistanceResource.class);

    private final DistanceService service;

    public DistanceResource(DistanceService service) {
        this.service = service;
    }

    @GetMapping("/by-points")
    public ResponseEntity byPoints(@RequestParam(name= "from") final Long city1,
                                   @RequestParam(name = "to" ) final Long city2) {
        log.info("/byPoints");
        return ResponseEntity.ok().body(service.distanceByPointsMiles(city1, city2);
    }

    @GetMapping("/by-cube")
    public ResponseEntity byCube(@RequestParam(name =  "from") final Long city1,
                         @RequestParam(name = "to") final Long city2) {
        log.info("/by-cube");
        return ResponseEntity.ok().body(service.distanceByCubeInMeters(city1, city2);
    }
}
