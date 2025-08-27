package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookingDetailDTO {
    private Integer booking_detail_id;
    private Integer booking_id;
    private Integer ticket_id;
    private Double price;
}
