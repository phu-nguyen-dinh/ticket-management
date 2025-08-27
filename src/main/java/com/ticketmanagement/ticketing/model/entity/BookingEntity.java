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
    @Column(name = "booking_id")
    private Integer booking_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "cust_id")
    private CustomerEntity customer;

    @Column(name = "booking_time")
    private LocalDateTime booking_time;

    @Column(name = "total_amount")
    private Double total_amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private BookingStatus status;

    @OneToMany(mappedBy = "booking")
    private List<BookingDetailEntity> booking_details;

    @OneToOne(mappedBy = "booking")
    private PaymentEntity payment;
}