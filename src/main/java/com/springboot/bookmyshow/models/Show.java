package com.springboot.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;
import java.util.List;
@Setter
@Getter
@Entity(name="BMS_SHOW")
public class Show extends BaseModel{

    @ManyToOne
    private Movie movie;

    private Date startTime;

    private Date endTime;

    @ManyToOne
    private Screen screens;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;
}
