package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.paymentDTO;
import com.ticketmanagement.ticketing.services.paymentService;

import java.util.List;

public class paymentServiceImpl implements paymentService {
    @Override
    public paymentDTO createPayment(paymentDTO paymentDTO) {
        return null;
    }

    @Override
    public paymentDTO getPaymentById(Integer paymentId) {
        return null;
    }

    @Override
    public List<paymentDTO> getAllPayments() {
        return List.of();
    }

    @Override
    public paymentDTO updatePayment(Integer paymentId, paymentDTO paymentDTO) {
        return null;
    }

    @Override
    public void deletePayment(Integer paymentId) {

    }
}
