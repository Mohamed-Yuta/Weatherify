package com.allali.Weatherify.services;

import com.allali.Weatherify.dtos.WeatherData;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class WeatherService {
    private final WebClient.Builder webClient;
    private final String key ="f345577cc2f799878b461c92b791477e";
    private final String url = "https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}";

    public WeatherData getWeatherData(Long lat , Long lon) {
        return webClient.build().get()
                .uri(url,lat,lon,key)
                .retrieve()
                .bodyToMono(WeatherData.class)
                .block();
    }


}
