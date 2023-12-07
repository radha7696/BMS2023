package com.example.demo.bms.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Seat extends BaseModel{
    private String name;

    @ManyToOne
    private Screen screen;

    @ManyToOne
    private Ticket ticket;

    @OneToMany(mappedBy = "seat")
    private List<ShowSeat> showSeats;

    @Enumerated(value = EnumType.ORDINAL)
    private SeatType seatType;
    private int bottomRightX;
    private int bottomRightY;
    private int topLeftX;
    private int topLeftY;

}
