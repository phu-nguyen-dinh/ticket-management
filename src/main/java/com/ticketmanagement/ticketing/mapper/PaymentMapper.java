package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.PaymentDTO;
import com.ticketmanagement.ticketing.enums.PaymentStatus;
import com.ticketmanagement.ticketing.model.entity.PaymentEntity;

public class PaymentMapper {
    public static PaymentDTO toDTO(PaymentEntity payment) {
        if (payment == null) return null;
        PaymentDTO dto = new PaymentDTO();
        dto.setPaymentId(payment.getPaymentId());
        dto.setBookingId(payment.getBooking() != null ? payment.getBooking().getBookingId() : null);
        dto.setPaymentMethod(payment.getPaymentMethod());
        dto.setAmount(payment.getAmount());
        dto.setPaymentTime(payment.getPaymentTime());
        dto.setStatus(payment.getStatus() != null ? payment.getStatus().name() : null);
        return dto;
    }

    public static PaymentEntity toEntity(PaymentDTO dto) {
        if (dto == null) return null;
        PaymentEntity payment = new PaymentEntity();
        payment.setPaymentId(dto.getPaymentId());
        payment.setPaymentMethod(dto.getPaymentMethod());
        payment.setAmount(dto.getAmount());
        payment.setPaymentTime(dto.getPaymentTime());
        if (dto.getStatus() != null) {
            payment.setStatus(PaymentStatus.valueOf(dto.getStatus().toUpperCase()));
        }
        return payment;
    }
}