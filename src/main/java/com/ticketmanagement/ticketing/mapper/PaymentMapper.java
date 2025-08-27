package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.PaymentDTO;
import com.ticketmanagement.ticketing.enums.PaymentStatus;
import com.ticketmanagement.ticketing.model.entity.PaymentEntity;

public class PaymentMapper {
    public static PaymentDTO toDTO(PaymentEntity payment) {
        if (payment == null) return null;
        PaymentDTO dto = new PaymentDTO();
        dto.setPayment_id(payment.getPayment_id());
        dto.setBooking_id(payment.getBooking() != null ? payment.getBooking().getBooking_id() : null);
        dto.setPayment_method(payment.getPayment_method());
        dto.setAmount(payment.getAmount());
        dto.setPayment_time(payment.getPayment_time());
        dto.setStatus(payment.getStatus() != null ? payment.getStatus().name() : null);
        return dto;
    }

    public static PaymentEntity toEntity(PaymentDTO dto) {
        if (dto == null) return null;
        PaymentEntity payment = new PaymentEntity();
        payment.setPayment_id(dto.getPayment_id());
        payment.setPayment_method(dto.getPayment_method());
        payment.setAmount(dto.getAmount());
        payment.setPayment_time(dto.getPayment_time());
        if (dto.getStatus() != null) {
            payment.setStatus(PaymentStatus.valueOf(dto.getStatus().toUpperCase()));
        }
        return payment;
    }
}