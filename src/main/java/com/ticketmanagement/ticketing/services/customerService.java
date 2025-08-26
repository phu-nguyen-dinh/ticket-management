package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.customerDTO;

import java.util.List;

public interface customerService {
    customerDTO createCustomer(customerDTO customerDTO);
    customerDTO getCustomerById(Integer custId);
    List<customerDTO> getAllCustomers();
    customerDTO updateCustomer(Integer custId, customerDTO customerDTO);
    void deleteCustomer(Integer custId);
}
