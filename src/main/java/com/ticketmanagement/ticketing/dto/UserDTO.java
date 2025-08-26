package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {
    private Integer userId;
    private String username;
    private String password;
}
