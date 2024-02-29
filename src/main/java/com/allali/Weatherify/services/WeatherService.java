package com.allali.Weatherify.services;

import lombok.AllArgsConstructor;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
public class WeatherService {
    private final WebClient webClient;



}
