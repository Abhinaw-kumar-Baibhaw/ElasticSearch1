package com.example.SearchCity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Document(indexName = "locations")
public class Location {

    @Id
    private Integer id;

    private String name;

    private String city;

    private String address;

    private String type;

}
