package com.show.service.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.show.service.dao.ShowDao;
import com.show.service.entity.SeatEntity;
import com.show.service.model.SeatModel;
import com.show.service.service.ShowServiceI;

@Service
public class ShowServiceImpl implements ShowServiceI {

	@Autowired
	private ShowDao showDao;

	@Override
	public List<SeatModel> getAllSeats(Integer showId) {
		List<SeatModel> seatList = new ArrayList();
		List<SeatEntity> allSeats = showDao.getAllSeats(showId);
		SeatModel seatModel = null;
		for (SeatEntity entity : allSeats) {
			seatModel = new SeatModel();
			BeanUtils.copyProperties(entity, seatModel);
			seatList.add(seatModel);
		}

		return seatList;
	}

	@Override
	public SeatModel addSeat(SeatModel seatModel) {
		SeatEntity entity = new SeatEntity();
		BeanUtils.copyProperties(seatModel, entity);
		SeatEntity addSeat = showDao.addSeat(entity);
		if (addSeat != null) {
			BeanUtils.copyProperties(addSeat, seatModel);
			return seatModel;
		}

		return null;
	}

}
