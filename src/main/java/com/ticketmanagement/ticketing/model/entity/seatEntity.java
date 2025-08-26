package com.ticketmanagement.ticketing.model.entity;

import com.ticketmanagement.ticketing.model.enums.seatType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Seat")
@Getter
@Setter
public class seatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seatId;

    @ManyToOne
    @JoinColumn(name = "roomId")
    private roomEntity room;

    private String row;
    private Integer number;

    @Enumerated(EnumType.STRING)
    private seatType seatType;
}