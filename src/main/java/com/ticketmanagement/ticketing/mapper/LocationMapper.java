package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.LocationDTO;
import com.ticketmanagement.ticketing.model.entity.LocationEntity;

public class LocationMapper {
    public static LocationDTO toDTO(LocationEntity location) {
        if (location == null) return null;
        LocationDTO dto = new LocationDTO();
        dto.setLocation_id(location.getLocation_id());
        dto.setLocation_name(location.getLocation_name());
        dto.setAddress(location.getAddress());
        dto.setCapacity(location.getCapacity());
        return dto;
    }

    public static LocationEntity toEntity(LocationDTO dto) {
        if (dto == null) return null;
        LocationEntity location = new LocationEntity();
        location.setLocation_id(dto.getLocation_id());
        location.setLocation_name(dto.getLocation_name());
        location.setAddress(dto.getAddress());
        location.setCapacity(dto.getCapacity());
        return location;
    }
}