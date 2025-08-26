package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.customerDTO;
import com.ticketmanagement.ticketing.services.customerService;

import java.util.List;

public class customerServiceImpl implements customerService {
    @Override
    public customerDTO createCustomer(customerDTO customerDTO) {
        return null;
    }

    @Override
    public customerDTO getCustomerById(Integer custId) {
        return null;
    }

    @Override
    public List<customerDTO> getAllCustomers() {
        return List.of();
    }

    @Override
    public customerDTO updateCustomer(Integer custId, customerDTO customerDTO) {
        return null;
    }

    @Override
    public void deleteCustomer(Integer custId) {

    }
}
