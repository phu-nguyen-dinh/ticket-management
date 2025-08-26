package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.locationDTO;

import java.util.List;

public interface locationService {
    locationDTO createLocation(locationDTO locationDTO);
    locationDTO getLocationById(Integer locationId);
    List<locationDTO> getAllLocations();
    locationDTO updateLocation(Integer locationId, locationDTO locationDTO);
    void deleteLocation(Integer locationId);
}
