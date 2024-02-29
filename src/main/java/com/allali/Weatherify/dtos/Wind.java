package com.allali.Weatherify.dtos;

import lombok.Data;

@Data
class Wind {
    private double speed;
    private int deg;
    private double gust;

    // Getters and setters
}
