package com.ticketmanagement.ticketing.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Location")
@Getter
@Setter
public class LocationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Integer location_id;

    @Column(name = "location_name")
    private String location_name;

    @Column(name = "address")
    private String address;

    @Column(name = "capacity")
    private Integer capacity;

    @OneToMany(mappedBy = "location")
    private List<RoomEntity> rooms;
}