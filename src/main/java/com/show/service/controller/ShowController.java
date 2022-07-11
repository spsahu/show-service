package com.show.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.show.service.model.SeatModel;
import com.show.service.service.ShowServiceI;

@RestController
public class ShowController {

	@Autowired
	private ShowServiceI showServiceI;
	
	/* Admin Service */
	
	@PostMapping("/getSeat")
	public ResponseEntity<List<SeatModel>> getAllSeats(@RequestBody Integer showId){
		List<SeatModel> allSeats = null;
		if(showId != null) {
			allSeats = showServiceI.getAllSeats(showId);
			return new ResponseEntity<List<SeatModel>>(allSeats, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/addSeat")
	public ResponseEntity<SeatModel> addSeat(@RequestBody SeatModel seatModel){
		
		SeatModel addSeat = showServiceI.addSeat(seatModel);
		
		if(addSeat != null) {
			return new ResponseEntity<SeatModel>(addSeat,HttpStatus.CREATED);
		}
		return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED) ;
	}
}
