package com.allali.Weatherify.services;

import com.allali.Weatherify.dtos.WeatherData;
import lombok.AllArgsConstructor;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
public class WeatherService {
    private final WebClient.Builder webClient;
    private final String url = "http://jsonplaceholder.typicode.com/posts/9";

    public WeatherData getWeatherData() {
        return webClient.build().get()
                .uri("/your/weather/api/endpoint")
                .retrieve()
                .bodyToMono(WeatherData.class)
                .block();
    }


}
