package com.ticketmanagement.ticketing.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Customer")
@Getter
@Setter
public class customerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer custId;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<bookingEntity> bookings;
}
