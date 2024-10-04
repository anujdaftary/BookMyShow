package com.springboot.bookmyshow.Services;

import com.springboot.bookmyshow.Repositories.ShowSeatTypeRepository;
import com.springboot.bookmyshow.models.Show;
import com.springboot.bookmyshow.models.ShowSeat;
import com.springboot.bookmyshow.models.ShowSeatType;

import java.util.List;

public class PriceCalculatorService {
    private ShowSeatTypeRepository showSeatTypeRepository;

    public PriceCalculatorService(ShowSeatTypeRepository showSeatTypeRepository) {
        this.showSeatTypeRepository = showSeatTypeRepository;
    }

    public int calculatePrice(List<ShowSeat> showSeats, Show show) {
        List<ShowSeatType> showSeatTypes = showSeatTypeRepository.findAllByShow(show);
        int amount = 0;

        for (ShowSeat showSeat : showSeats) {
            for (ShowSeatType showSeatType : showSeatTypes) {
                if (showSeat.getSeat().getSeatType().equals(showSeatType.getSeatType())) {
                    amount += showSeatType.getPrice();
                    break;
                }
            }
        }

        return amount;
    }
    }

