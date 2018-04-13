package com.navshan.example.microservices.dao;

import org.springframework.data.repository.CrudRepository;

import com.navshan.example.microservices.domain.Player;

public interface PlayerDao extends CrudRepository<Player, Long>{
	Player findByName(String name);
 
}
