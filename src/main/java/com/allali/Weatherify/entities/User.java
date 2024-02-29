package com.allali.Weatherify.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class User {
    @Id
    private String id ;
    private String firstName ;
    private String lastName ;
    private Date dateNaissance ;
    private String password ;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<City> cities = new ArrayList<>();
}
