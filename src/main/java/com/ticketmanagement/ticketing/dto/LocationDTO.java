package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LocationDTO {
    private Integer location_id;
    private String location_name;
    private String address;
    private Integer capacity;
}
