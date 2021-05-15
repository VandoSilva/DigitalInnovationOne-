package com.VandoSilva.cities.distance;

import com.VandoSilva.cities.cities.City;
import com.VandoSilva.cities.cities.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DistanceService {

    private final CityRepository cityRepository;
    Logger Log = LoggerFactory.getLogger(DistanceService.class);

    public DistanceService(final CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public Double distanceByPointsInMiles(final Long city1, final Long city2) {
    log.info ("nativePostgresInMiles({}, {})", city1, city2);
    return cityRepository.distanceByPoints(city1, city2);
    }

 public Double distanceByCubeInMeters(Long city1, Long city2) {
     log.info("distanceByCubeInMeters({}, {})", city1, city2);
     final List<City> cities = cityRepository.findAllById((Arrays.asList(city1, city2)));

     Point p1 = cities.get(0).getLocation();
     Point p2 = cities.get(1).getLocation();

     return cityRepository.distanceByCube(p1.getX(), p1.getY(), P2.getX(), P2.getY());
 }

}