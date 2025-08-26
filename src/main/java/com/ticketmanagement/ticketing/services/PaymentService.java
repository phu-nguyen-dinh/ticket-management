package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {
    PaymentDTO createPayment(PaymentDTO paymentDTO);
    PaymentDTO getPaymentById(Integer paymentId);
    List<PaymentDTO> getAllPayments();
    PaymentDTO updatePayment(Integer paymentId, PaymentDTO paymentDTO);
    void deletePayment(Integer paymentId);
}
