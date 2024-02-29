package com.allali.Weatherify.dtos;

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

