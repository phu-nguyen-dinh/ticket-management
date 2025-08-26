package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class bookingDetailDTO {
    private Integer bookingDetailId;
    private Integer bookingId;
    private Integer ticketId;
    private Double price;
}
