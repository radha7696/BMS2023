package com.example.demo.bms.dtos;

import lombok.Data;

import java.util.List;

@Data
public class BookTicketRequestDto {
    private List<Integer> showSeatIds;
    private int userId;
}
