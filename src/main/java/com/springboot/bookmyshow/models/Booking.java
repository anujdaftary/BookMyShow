package com.springboot.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name = "Booking")
public class Booking extends BaseModel{
    @ManyToMany
    private List<ShowSeat> showSeats;

    @ManyToOne
    private User user;

    private int amount;

    @OneToMany
    List<Payment> payments;
    private Date bookedDate;


    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;

}
