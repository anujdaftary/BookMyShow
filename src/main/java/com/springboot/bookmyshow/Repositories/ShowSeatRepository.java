package com.springboot.bookmyshow.Repositories;

import com.springboot.bookmyshow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat,Long> {
    @Override
    List<ShowSeat> findAllById(Iterable<Long> longs);
    //Find all the ShowSeats by the showSeatIds.

    @Override
    ShowSeat save(ShowSeat showSeat);
}
