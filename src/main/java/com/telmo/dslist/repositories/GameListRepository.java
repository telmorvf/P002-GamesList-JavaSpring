package com.telmo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telmo.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
