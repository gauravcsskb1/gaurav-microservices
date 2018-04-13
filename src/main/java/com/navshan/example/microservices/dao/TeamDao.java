package com.navshan.example.microservices.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.navshan.example.microservices.domain.Team;

public interface TeamDao extends CrudRepository<Team, Long> {
	
	List<Team> findAll();
	
	Team findByName(String name);
	

}
