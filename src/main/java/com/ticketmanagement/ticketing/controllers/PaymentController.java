package com.ticketmanagement.ticketing.controllers;

import com.ticketmanagement.ticketing.dto.PaymentDTO;
import com.ticketmanagement.ticketing.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public PaymentDTO createPayment(@RequestBody PaymentDTO paymentDTO) {
        return paymentService.createPayment(paymentDTO);
    }

    @GetMapping("/{id}")
    public PaymentDTO getPaymentById(@PathVariable Integer id) {
        return paymentService.getPaymentById(id);
    }

    @GetMapping
    public List<PaymentDTO> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @PutMapping("/{id}")
    public PaymentDTO updatePayment(@PathVariable Integer id, @RequestBody PaymentDTO paymentDTO) {
        return paymentService.updatePayment(id, paymentDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Integer id) {
        paymentService.deletePayment(id);
    }
}