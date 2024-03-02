package com.allali.Weatherify.dtos.weatherData;

import com.allali.Weatherify.dtos.weatherData.Sys;
import com.allali.Weatherify.dtos.weatherData.Weather;
import com.allali.Weatherify.dtos.weatherData.Wind;
import com.allali.Weatherify.dtos.weatherData.Clouds;
import com.allali.Weatherify.dtos.weatherData.Coord;
import com.allali.Weatherify.dtos.weatherData.Main;
import com.allali.Weatherify.dtos.weatherData.Rain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class WeatherData {

        private Coord coord;
        private List<Weather> weather;
        private String base;
        private Main main;
        private int visibility;
        private Wind wind;
        private Rain rain;
        private Clouds clouds;
        private long dt;
        private Sys sys;
        private int timezone;
        private int id;
        private String name;
        private int cod;
    }

