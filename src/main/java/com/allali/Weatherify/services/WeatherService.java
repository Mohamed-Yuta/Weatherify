package com.allali.Weatherify.services;

import com.allali.Weatherify.dtos.Coord;
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
    private final String geoUrl="http://api.openweathermap.org/geo/1.0/direct?q={cityName}&limit=5&appid={API key}";
    public Coord getCoord(String cityName){
        return webClient.build()
                .get()
                .uri(geoUrl,cityName,key)
                .retrieve()
                .bodyToFlux(Coord.class) // Note the change to bodyToFlux
                .next() // Get the first item from the Flux
                .block(); // Block to wait for the response
    }
    public WeatherData getWeatherData(String cityName) {
        Coord coord = getCoord(cityName);
        return webClient.build().get()
                .uri(url,coord.getLat(),coord.getLon(),key)
                .retrieve()
                .bodyToMono(WeatherData.class)
                .block();
    }


}
