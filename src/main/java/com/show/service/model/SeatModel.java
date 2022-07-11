package com.show.service.model;

public class SeatModel {
	
	private Integer seatId;
	private String rowId;
	private String columnId;
	private Boolean seatAvailable;
	
	public enum SeatClass { GOLD, SILVER }
	
	private Integer price;
	

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
	 * @return the rowId
	 */
	public String getRowId() {
		return rowId;
	}

	/**
	 * @param rowId the rowId to set
	 */
	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	/**
	 * @return the columnId
	 */
	public String getColumnId() {
		return columnId;
	}

	/**
	 * @param columnId the columnId to set
	 */
	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}

	/**
	 * @return the seatAvailable
	 */
	public Boolean getSeatAvailable() {
		return seatAvailable;
	}

	/**
	 * @param seatAvailable the seatAvailable to set
	 */
	public void setSeatAvailable(Boolean seatAvailable) {
		this.seatAvailable = seatAvailable;
	}

	/**
	 * @return the price
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
