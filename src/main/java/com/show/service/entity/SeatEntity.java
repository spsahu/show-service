package com.show.service.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;


@Table(name = "tbl_seat", schema = "show_details")
@Entity
public class SeatEntity implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer seatId;

	@Column
	private String rowId;

	@Column
	private String columnId;

	@Column
	private Boolean seatAvailable;

	@Column(name ="price" , precision=0)
	private Integer price;
	
	@ManyToOne
	@JoinColumn(name="showId")
	private ShowEntity showEntity;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getColumnId() {
		return columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}

	public Boolean getSeatAvailable() {
		return seatAvailable;
	}

	public void setSeatAvailable(Boolean seatAvailable) {
		this.seatAvailable = seatAvailable;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	/**
	 * @return the seatId
	 */
	public Integer getSeatId() {
		return seatId;
	}

	/**
	 * @param seatId the seatId to set
	 */
	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}
	
	

	/**
	 * @return the showEntity
	 */
	public ShowEntity getShowEntity() {
		return showEntity;
	}

	/**
	 * @param showEntity the showEntity to set
	 */
	public void setShowEntity(ShowEntity showEntity) {
		this.showEntity = showEntity;
	}

	@Override
	public String toString() {
		return "SeatEntity [seatId=" + seatId + ", rowId=" + rowId + ", columnId=" + columnId + ", seatAvailable="
				+ seatAvailable + ", price=" + price + "]";
	}

	
	
}
