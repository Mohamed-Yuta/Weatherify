package com.allali.Weatherify.dtos.weatherData;

import lombok.Data;

@Data
class Sys {
    private int type;
    private int id;
    private String country;
    private long sunrise;
    private long sunset;

    // Getters and setters
}