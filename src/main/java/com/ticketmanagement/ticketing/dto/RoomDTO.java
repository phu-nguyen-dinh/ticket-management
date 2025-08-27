package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RoomDTO {
    private Integer room_id;
    private Integer location_id;
    private String room_name;
}
