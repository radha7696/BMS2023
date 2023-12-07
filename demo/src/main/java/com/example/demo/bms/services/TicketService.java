package com.example.demo.bms.services;

import com.example.demo.bms.exceptions.InvalidUser;
import com.example.demo.bms.exceptions.SeatsAlreadyBookedException;
import com.example.demo.bms.models.Ticket;

import java.util.List;

public interface TicketService {

    public Ticket bookTicket(List<Integer> showSeatIds, int userId) throws SeatsAlreadyBookedException, InvalidUser;
}

