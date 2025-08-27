package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.LocationDTO;
import com.ticketmanagement.ticketing.mapper.LocationMapper;
import com.ticketmanagement.ticketing.model.entity.LocationEntity;
import com.ticketmanagement.ticketing.repository.LocationRepository;
import com.ticketmanagement.ticketing.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public LocationDTO createLocation(LocationDTO locationDTO) {
        LocationEntity location = LocationMapper.toEntity(locationDTO);
        locationRepository.save(location);
        return LocationMapper.toDTO(location);
    }

    @Override
    public LocationDTO getLocationById(Integer locationId) {
        LocationEntity location = locationRepository.findById(locationId)
                .orElseThrow(() -> new RuntimeException("Location not found"));
        return LocationMapper.toDTO(location);
    }

    @Override
    public List<LocationDTO> getAllLocations() {
        return locationRepository.findAll()
                .stream().map(LocationMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public LocationDTO updateLocation(Integer locationId, LocationDTO locationDTO) {
        LocationEntity location = locationRepository.findById(locationId)
                .orElseThrow(() -> new RuntimeException("Location not found"));
        location.setLocation_name(locationDTO.getLocation_name());
        location.setAddress(locationDTO.getAddress());
        location.setCapacity(locationDTO.getCapacity());
        locationRepository.save(location);
        return LocationMapper.toDTO(location);
    }

    @Override
    public void deleteLocation(Integer locationId) {
        locationRepository.deleteById(locationId);
    }
}