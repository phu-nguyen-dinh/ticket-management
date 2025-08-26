package com.ticketmanagement.ticketing.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Location")
@Getter
@Setter
public class locationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer locationId;

    private String locationName;
    private String address;
    private Integer capacity;

    @OneToMany(mappedBy = "location")
    private List<roomEntity> rooms;
}