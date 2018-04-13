package com.navshan.example.microservices;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.navshan.example.microservices.dao.TeamDao;
import com.navshan.example.microservices.domain.Player;
import com.navshan.example.microservices.domain.Team;

@SpringBootApplication
public class MicroservicesApplication {
    
	@Autowired
	TeamDao teamDao;
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		Set <Player> players=new HashSet();
		players.add(new Player("Charlie Brown","pitcher"));
		players.add(new Player("Snoopy","shortstop"));
		Team team= new Team("California","Peanuts",players);
		teamDao.save(team);
		
	}
}
