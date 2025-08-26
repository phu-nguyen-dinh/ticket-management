package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.CustomerDTO;
import com.ticketmanagement.ticketing.model.entity.CustomerEntity;

public class CustomerMapper {

    public static CustomerDTO toDTO(CustomerEntity customer) {
        if (customer == null) return null;
        CustomerDTO dto = new CustomerDTO();
        dto.setCustId(customer.getCustId());
        dto.setFirstName(customer.getFirstName());
        dto.setLastName(customer.getLastName());
        dto.setPhoneNumber(customer.getPhoneNumber());
        dto.setEmail(customer.getEmail());
        dto.setAddress(customer.getAddress());
        return dto;
    }

    public static CustomerEntity toEntity(CustomerDTO dto) {
        if (dto == null) return null;
        CustomerEntity customer = new CustomerEntity();
        customer.setCustId(dto.getCustId());
        customer.setFirstName(dto.getFirstName());
        customer.setLastName(dto.getLastName());
        customer.setPhoneNumber(dto.getPhoneNumber());
        customer.setEmail(dto.getEmail());
        customer.setAddress(dto.getAddress());
        return customer;
    }
}