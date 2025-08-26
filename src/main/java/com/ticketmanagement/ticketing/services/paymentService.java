package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.paymentDTO;

import java.util.List;

public interface paymentService {
    paymentDTO createPayment(paymentDTO paymentDTO);
    paymentDTO getPaymentById(Integer paymentId);
    List<paymentDTO> getAllPayments();
    paymentDTO updatePayment(Integer paymentId, paymentDTO paymentDTO);
    void deletePayment(Integer paymentId);
}
