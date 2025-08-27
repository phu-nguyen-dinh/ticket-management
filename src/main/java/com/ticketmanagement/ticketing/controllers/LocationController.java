package com.ticketmanagement.ticketing.controllers;

import com.ticketmanagement.ticketing.dto.LocationDTO;
import com.ticketmanagement.ticketing.services.LocationService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping
    public LocationDTO createLocation(@RequestBody LocationDTO locationDTO) {
        return locationService.createLocation(locationDTO);
    }

    @GetMapping("/{id}")
    public LocationDTO getLocationById(@PathVariable Integer id) {
        return locationService.getLocationById(id);
    }

    @GetMapping
    public List<LocationDTO> getAllLocations() {
        return locationService.getAllLocations();
    }

    @PutMapping("/{id}")
    public LocationDTO updateLocation(@PathVariable Integer id, @RequestBody LocationDTO locationDTO) {
        return locationService.updateLocation(id, locationDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteLocation(@PathVariable Integer id) {
        locationService.deleteLocation(id);
    }
}