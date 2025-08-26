package com.ticketmanagement.ticketing.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Room")
@Getter
@Setter
public class roomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;

    @ManyToOne
    @JoinColumn(name = "locationId")
    private locationEntity location;

    private String roomName;

    @OneToMany(mappedBy = "room")
    private List<seatEntity> seats;

    @OneToMany(mappedBy = "room")
    private List<showtimeEntity> showtimes;
}