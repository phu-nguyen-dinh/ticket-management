package com.ticketmanagement.ticketing.model.entity;

import com.ticketmanagement.ticketing.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Booking")
@Getter
@Setter
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "custId")
    private CustomerEntity customer;

    private LocalDateTime bookingTime;
    private Double totalAmount;

    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    @OneToMany(mappedBy = "booking")
    private List<BookingDetailEntity> bookingDetails;

    @OneToOne(mappedBy = "booking")
    private PaymentEntity payment;
}