package com.ticketmanagement.ticketing.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Room")
@Getter
@Setter
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Integer room_id;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private LocationEntity location;

    @Column(name = "room_name")
    private String room_name;

    @OneToMany(mappedBy = "room")
    private List<SeatEntity> seats;

    @OneToMany(mappedBy = "room")
    private List<ShowtimeEntity> showtimes;
}