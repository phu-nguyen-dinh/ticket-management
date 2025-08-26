package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.PaymentDTO;
import com.ticketmanagement.ticketing.services.PaymentService;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public PaymentDTO createPayment(PaymentDTO paymentDTO) {
        return null;
    }

    @Override
    public PaymentDTO getPaymentById(Integer paymentId) {
        return null;
    }

    @Override
    public List<PaymentDTO> getAllPayments() {
        return List.of();
    }

    @Override
    public PaymentDTO updatePayment(Integer paymentId, PaymentDTO paymentDTO) {
        return null;
    }

    @Override
    public void deletePayment(Integer paymentId) {

    }
}
