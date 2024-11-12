package com.example.SearchCity.controller;

import com.example.SearchCity.model.Location;
import com.example.SearchCity.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private  LocationService locationService;

    @GetMapping("/findAll")
    public List<Location> findAll(){
        List<Location> result = locationService.getAll();
        return result;
    }
}

