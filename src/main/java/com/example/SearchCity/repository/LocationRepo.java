package com.example.SearchCity.repository;

import com.example.SearchCity.model.Location;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LocationRepo extends ElasticsearchRepository<Location, Integer> {

}
