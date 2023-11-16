package com.telmo.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.telmo.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	public GameListDTO() {
		
	}
	
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	
	// Only geters
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
}
