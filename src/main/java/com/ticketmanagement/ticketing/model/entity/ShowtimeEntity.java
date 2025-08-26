package com.ticketmanagement.ticketing.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Showtime")
@Getter
@Setter
public class ShowtimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer showtimeId;

    @ManyToOne
    @JoinColumn(name = "eventId")
    private EventEntity event;

    @ManyToOne
    @JoinColumn(name = "roomId")
    private RoomEntity room;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @OneToMany(mappedBy = "showtime")
    private List<TicketEntity> tickets;
}