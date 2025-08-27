package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.CustomerDTO;
import com.ticketmanagement.ticketing.model.entity.CustomerEntity;

public class CustomerMapper {

    public static CustomerDTO toDTO(CustomerEntity customer) {
        if (customer == null) return null;
        CustomerDTO dto = new CustomerDTO();
        dto.setCust_id(customer.getCust_id());
        dto.setFirst_name(customer.getFirst_name());
        dto.setLast_name(customer.getLast_name());
        dto.setPhone_number(customer.getPhone_number());
        dto.setEmail(customer.getEmail());
        dto.setAddress(customer.getAddress());
        return dto;
    }

    public static CustomerEntity toEntity(CustomerDTO dto) {
        if (dto == null) return null;
        CustomerEntity customer = new CustomerEntity();
        customer.setCust_id(dto.getCust_id());
        customer.setFirst_name(dto.getFirst_name());
        customer.setLast_name(dto.getLast_name());
        customer.setPhone_number(dto.getPhone_number());
        customer.setEmail(dto.getEmail());
        customer.setAddress(dto.getAddress());
        return customer;
    }
}