package com.show.service.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.movie.service.entity.MovieEntity;

@Entity
@Table(name ="tbl_show",schema = "show_details")
public class ShowEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer showId;
	
	@OneToMany(mappedBy = "showEntity", cascade=CascadeType.ALL, targetEntity=SeatEntity.class)
	@JoinColumn(name = "seatId", referencedColumnName = "ID")
	private List<SeatEntity> seatList;
	
	/*
	 * @Temporal(TemporalType.TIMESTAMP) private Timestamp startTime;
	 * 
	 * @Temporal(TemporalType.TIMESTAMP) private Timestamp endTime;
	 */
	
	
	@OneToMany(cascade=CascadeType.ALL, targetEntity=MovieEntity.class)
	@JoinColumn(name = "movieId", referencedColumnName = "ID")
	private MovieEntity movieModel;


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
	public List<SeatEntity> getSeatList() {
		return seatList;
	}


	/**
	 * @param seatList the seatList to set
	 */
	public void setSeatList(List<SeatEntity> seatList) {
		this.seatList = seatList;
	}


	/**
	 * @return the movieModel
	 */
	public MovieEntity getMovieModel() {
		return movieModel;
	}


	/**
	 * @param movieModel the movieModel to set
	 */
	public void setMovieModel(MovieEntity movieModel) {
		this.movieModel = movieModel;
	}

	
	
}
