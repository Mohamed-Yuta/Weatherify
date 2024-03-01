package com.allali.Weatherify.web;

import com.allali.Weatherify.dtos.weatherData.WeatherData;
import com.allali.Weatherify.services.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WeatherServiceController {
    private final WeatherService weatherService;

    @GetMapping("/weather/{cityName}")
    public WeatherData getWeatherData(@PathVariable("cityName") String cityName) {
        return weatherService.getWeatherData(cityName);
    }
}
