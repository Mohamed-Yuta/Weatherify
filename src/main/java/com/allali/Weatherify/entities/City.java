package com.allali.Weatherify.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Builder
public class City {
    private String name ;
    private Double longtitude ;
    private Double latitude ;
    
}
