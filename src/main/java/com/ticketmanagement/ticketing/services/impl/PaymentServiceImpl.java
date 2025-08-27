package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.PaymentDTO;
import com.ticketmanagement.ticketing.mapper.PaymentMapper;
import com.ticketmanagement.ticketing.model.entity.PaymentEntity;
import com.ticketmanagement.ticketing.repository.PaymentRepository;
import com.ticketmanagement.ticketing.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public PaymentDTO createPayment(PaymentDTO paymentDTO) {
        PaymentEntity payment = PaymentMapper.toEntity(paymentDTO);
        paymentRepository.save(payment);
        return PaymentMapper.toDTO(payment);
    }

    @Override
    public PaymentDTO getPaymentById(Integer paymentId) {
        PaymentEntity payment = paymentRepository.findById(paymentId)
                .orElseThrow(() -> new RuntimeException("Payment not found"));
        return PaymentMapper.toDTO(payment);
    }

    @Override
    public List<PaymentDTO> getAllPayments() {
        return paymentRepository.findAll()
                .stream().map(PaymentMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PaymentDTO updatePayment(Integer paymentId, PaymentDTO paymentDTO) {
        PaymentEntity payment = paymentRepository.findById(paymentId)
                .orElseThrow(() -> new RuntimeException("Payment not found"));
        payment.setPayment_method(paymentDTO.getPayment_method());
        payment.setAmount(paymentDTO.getAmount());
        payment.setPayment_time(paymentDTO.getPayment_time());
        paymentRepository.save(payment);
        return PaymentMapper.toDTO(payment);
    }

    @Override
    public void deletePayment(Integer paymentId) {
        paymentRepository.deleteById(paymentId);
    }
}
