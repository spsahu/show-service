package com.show.service.dao;

import java.util.List;

import com.show.service.entity.SeatEntity;


public interface ShowDao {

	List<SeatEntity> getAllSeats(Integer showId);
	SeatEntity addSeat(SeatEntity seatEntity);
}
