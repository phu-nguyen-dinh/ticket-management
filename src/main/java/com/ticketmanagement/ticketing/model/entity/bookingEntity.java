package com.ticketmanagement.ticketing.model.entity;

import com.ticketmanagement.ticketing.model.enums.bookingStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Booking")
@Getter
@Setter
public class bookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private userEntity user;

    @ManyToOne
    @JoinColumn(name = "custId")
    private customerEntity customer;

    private LocalDateTime bookingTime;
    private Double totalAmount;

    @Enumerated(EnumType.STRING)
    private bookingStatus status;

    @OneToMany(mappedBy = "booking")
    private List<bookingDetailEntity> bookingDetails;

    @OneToOne(mappedBy = "booking")
    private paymentEntity payment;
}