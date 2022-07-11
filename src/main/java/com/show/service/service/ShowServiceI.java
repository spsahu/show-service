package com.show.service.service;

import java.util.List;

import com.show.service.model.SeatModel;

public interface ShowServiceI {

	List<SeatModel> getAllSeats(Integer showId);
	
	SeatModel addSeat(SeatModel seatModel);
}
