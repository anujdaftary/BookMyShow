package com.springboot.bookmyshow.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class BookMovieRequestDto {
    private long UserId;
    private long ShowId;
    private List<Long> ShowSeatIds;
}
