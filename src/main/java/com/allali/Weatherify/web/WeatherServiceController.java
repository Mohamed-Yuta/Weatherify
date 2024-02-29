package com.allali.Weatherify.web;

import com.allali.Weatherify.dtos.WeatherData;
import com.allali.Weatherify.services.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WeatherServiceController {
    private final WeatherService weatherService ;

    @GetMapping("/weather/{lat}/{lon}")
    public WeatherData getWeatherData(@PathVariable("lat") Long lat, @PathVariable("lon") Long lon) {
        return weatherService.getWeatherData(lat, lon);
    }
}
