package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.BookingDTO;
import com.ticketmanagement.ticketing.enums.BookingStatus;
import com.ticketmanagement.ticketing.model.entity.BookingEntity;
import com.ticketmanagement.ticketing.model.entity.CustomerEntity;
import com.ticketmanagement.ticketing.model.entity.UserEntity;

public class BookingMapper {

    public static BookingDTO toDTO(BookingEntity booking) {
        if (booking == null) return null;
        BookingDTO dto = new BookingDTO();
        dto.setBooking_id(booking.getBooking_id());
        dto.setUser_id(booking.getUser() != null ? booking.getUser().getUser_id() : null);
        dto.setCust_id(booking.getCustomer() != null ? booking.getCustomer().getCust_id() : null);
        dto.setBooking_time(booking.getBooking_time());
        dto.setTotal_amount(booking.getTotal_amount());
        dto.setStatus(booking.getStatus() != null ? booking.getStatus().name() : null);
        return dto;
    }

    public static BookingEntity toEntity(BookingDTO dto) {
        if (dto == null) return null;
        BookingEntity booking = new BookingEntity();
        booking.setBooking_id(dto.getBooking_id());
        booking.setBooking_time(dto.getBooking_time());
        booking.setTotal_amount(dto.getTotal_amount());
        if (dto.getStatus() != null) {
            booking.setStatus(BookingStatus.valueOf(dto.getStatus()));
        }
        if (dto.getUser_id() != null) {
            UserEntity user = new UserEntity();
            user.setUser_id(dto.getUser_id());
            booking.setUser(user);
        }
        if (dto.getCust_id() != null) {
            CustomerEntity customer = new CustomerEntity();
            customer.setCust_id(dto.getCust_id());
            booking.setCustomer(customer);
        }
        return booking;
    }
}
