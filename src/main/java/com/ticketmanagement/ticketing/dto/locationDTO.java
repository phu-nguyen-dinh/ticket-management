package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class locationDTO {
    private Integer locationId;
    private String locationName;
    private String address;
    private Integer capacity;
}
