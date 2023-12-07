package com.example.demo.bms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class City extends BaseModel{

    private String name;

    @OneToMany(mappedBy = "city")
    private List<Theatre> theatres;
}
