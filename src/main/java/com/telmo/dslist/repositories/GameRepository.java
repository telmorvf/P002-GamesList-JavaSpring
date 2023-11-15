package com.telmo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telmo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
