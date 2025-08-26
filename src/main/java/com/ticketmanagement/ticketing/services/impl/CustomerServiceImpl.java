package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.CustomerDTO;
import com.ticketmanagement.ticketing.mapper.CustomerMapper;
import com.ticketmanagement.ticketing.model.entity.CustomerEntity;
import com.ticketmanagement.ticketing.repository.CustomerRepository;
import com.ticketmanagement.ticketing.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        CustomerEntity customer = CustomerMapper.toEntity(customerDTO);
        customerRepository.save(customer);
        return CustomerMapper.toDTO(customer);
    }

    @Override
    public CustomerDTO getCustomerById(Integer custId) {
        CustomerEntity customer = customerRepository.findById(custId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        return CustomerMapper.toDTO(customer);
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.findAll()
                .stream().map(CustomerMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDTO updateCustomer(Integer custId, CustomerDTO customerDTO) {
        CustomerEntity customer = customerRepository.findById(custId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setFirstName(customerDTO.getFirstName());
        customer.setLastName(customerDTO.getLastName());
        customer.setPhoneNumber(customerDTO.getPhoneNumber());
        customer.setEmail(customerDTO.getEmail());
        customer.setAddress(customerDTO.getAddress());
        customerRepository.save(customer);
        return CustomerMapper.toDTO(customer);
    }

    @Override
    public void deleteCustomer(Integer custId) {
        customerRepository.deleteById(custId);
    }
}