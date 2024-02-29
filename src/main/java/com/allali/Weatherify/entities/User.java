package com.allali.Weatherify.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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

}
