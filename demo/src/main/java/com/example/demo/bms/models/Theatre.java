package com.example.demo.bms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{

    //@Setter
    private String name;
    private String address;

    @ManyToOne
    private City city;
    @OneToMany(mappedBy = "theatre")
    private List<Screen> screens;

}
