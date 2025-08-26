package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.LocationDTO;

import java.util.List;

public interface LocationService {
    LocationDTO createLocation(LocationDTO locationDTO);
    LocationDTO getLocationById(Integer locationId);
    List<LocationDTO> getAllLocations();
    LocationDTO updateLocation(Integer locationId, LocationDTO locationDTO);
    void deleteLocation(Integer locationId);
}
