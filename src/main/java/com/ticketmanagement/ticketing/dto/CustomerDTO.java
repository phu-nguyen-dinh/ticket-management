package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerDTO {
    private Integer cust_id;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String email;
    private String address;
}
