package com.example.SearchCity.service;

import com.example.SearchCity.model.Location;
import com.example.SearchCity.repository.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class LocationService {

    @Autowired
    private LocationRepo locationRepository;

    public List<Location> getAll() {
        Iterable<Location> all = locationRepository.findAll();
        return StreamSupport.stream(all.spliterator(), false)
                .collect(Collectors.toList());
    }
}