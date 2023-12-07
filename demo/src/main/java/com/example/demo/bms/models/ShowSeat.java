package com.example.demo.bms.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ShowSeat extends BaseModel{

    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;

    @Enumerated(value = EnumType.ORDINAL)
    private SeatStatus seatStatus;

    @ManyToOne
    private User user;

}
