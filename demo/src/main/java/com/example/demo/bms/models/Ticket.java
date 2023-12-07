package com.example.demo.bms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Ticket extends BaseModel{

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "ticket")
    private List<Seat> seats;

    @ManyToOne
    private Show show;

    private Date timeOfBooking;
    private double price;

}
