package com.ticketmanagement.ticketing.model.entity;

import com.ticketmanagement.ticketing.enums.SeatType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Seat")
@Getter
@Setter
public class SeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seatId;

    @ManyToOne
    @JoinColumn(name = "roomId")
    private RoomEntity room;

    private String row;
    private Integer number;

    @Enumerated(EnumType.STRING)
    private SeatType seatType;
}