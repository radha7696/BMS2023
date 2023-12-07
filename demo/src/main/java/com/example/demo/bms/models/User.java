package com.example.demo.bms.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class User extends BaseModel{

    private String name;
    private String email;

    private String password;

    @OneToMany(mappedBy = "user")
    private List<Ticket> tickets;
}
