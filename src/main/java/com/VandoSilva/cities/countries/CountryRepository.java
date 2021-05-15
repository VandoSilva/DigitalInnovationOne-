package com.VandoSilva.cities.countries;

import com.VandoSilva.cities.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
