package com.example.demo.bms.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Show extends BaseModel{

    @OneToMany(mappedBy = "show")
    private List<Ticket> tickets;

    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Screen screen;
    private Date startTime;
    @ElementCollection
    @Enumerated(value = EnumType.ORDINAL)
    private List<Features> features;
}
