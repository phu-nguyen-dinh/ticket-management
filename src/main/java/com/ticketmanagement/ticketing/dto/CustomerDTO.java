package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerDTO {
    private Integer custId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;
}
