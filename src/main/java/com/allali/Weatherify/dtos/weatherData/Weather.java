package com.allali.Weatherify.dtos.weatherData;

import lombok.Data;

@Data
class Weather {
    private int id;
    private String main;
    private String description;
    private String icon;

    // Getters and setters
}
