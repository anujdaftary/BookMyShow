package com.springboot.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity(name = "Region")
public class Region extends BaseModel{

    private String name;

    //private List<Theatre> theatre;
}
