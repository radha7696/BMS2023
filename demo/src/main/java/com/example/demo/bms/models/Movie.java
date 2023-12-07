package com.example.demo.bms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
public class Movie extends BaseModel{

    private String name;
    private String genre;
}
