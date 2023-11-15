package com.telmo.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telmo.dslist.dto.GameMinDTO;
import com.telmo.dslist.entities.Game;
import com.telmo.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
 