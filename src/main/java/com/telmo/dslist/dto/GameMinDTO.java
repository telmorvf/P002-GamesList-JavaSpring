package com.telmo.dslist.dto;

import com.telmo.dslist.entities.Game;
import com.telmo.dslist.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}

	
	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	
}
