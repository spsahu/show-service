package com.show.service.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_screen", schema = "show_details")
public class ScreenEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer screenId;
	

	@OneToMany
	@JoinColumn(name = "showId", referencedColumnName = "ID")
	private List<ShowEntity> showEntityList;


	/**
	 * @return the screenId
	 */
	public Integer getScreenId() {
		return screenId;
	}


	/**
	 * @param screenId the screenId to set
	 */
	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}


	/**
	 * @return the showEntityList
	 */
	public List<ShowEntity> getShowEntityList() {
		return showEntityList;
	}


	/**
	 * @param showEntityList the showEntityList to set
	 */
	public void setShowEntityList(List<ShowEntity> showEntityList) {
		this.showEntityList = showEntityList;
	}
	
	
	
}
