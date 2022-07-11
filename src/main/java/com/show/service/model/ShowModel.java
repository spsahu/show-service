package com.show.service.model;

import java.security.Timestamp;
import java.util.List;

import com.movie.service.model.MovieModel;

public class ShowModel {
	
	private Integer showId;
	
	private List<SeatModel> seatList;
	
	private Timestamp startTime;
	
	private Timestamp endTime;
	
	private MovieModel movieModel;

	/**
	 * @return the showId
	 */
	public Integer getShowId() {
		return showId;
	}

	/**
	 * @param showId the showId to set
	 */
	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	/**
	 * @return the seatList
	 */
	public List<SeatModel> getSeatList() {
		return seatList;
	}

	/**
	 * @param seatList the seatList to set
	 */
	public void setSeatList(List<SeatModel> seatList) {
		this.seatList = seatList;
	}

	/**
	 * @return the startTime
	 */
	public Timestamp getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public Timestamp getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the movieModel
	 */
	public MovieModel getMovieModel() {
		return movieModel;
	}

	/**
	 * @param movieModel the movieModel to set
	 */
	public void setMovieModel(MovieModel movieModel) {
		this.movieModel = movieModel;
	}

	@Override
	public String toString() {
		return "ShowModel [showId=" + showId + ", seatList=" + seatList + ", startTime=" + startTime + ", endTime="
				+ endTime + ", movieModel=" + movieModel + "]";
	}
	
	
	
	
	
	

}
