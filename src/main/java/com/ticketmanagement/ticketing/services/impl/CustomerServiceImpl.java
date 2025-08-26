package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.CustomerDTO;
import com.ticketmanagement.ticketing.services.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public CustomerDTO getCustomerById(Integer custId) {
        return null;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return List.of();
    }

    @Override
    public CustomerDTO updateCustomer(Integer custId, CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public void deleteCustomer(Integer custId) {

    }
}
