package com.example.launch;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.List;
import java.util.Set;


import jakarta.persistence.CascadeType; 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany; 

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Launch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 200)
    private String name;
    
    @Column(length = 200)
    private String meal;

    @Column(columnDefinition = "TEXT")
    private String review;
    
    @Column(nullable = false)
    private LocalDate createDate;
    

}
