package com.allali.Weatherify.repositories;

import com.allali.Weatherify.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Long> {
}
