package com.navshan.example.microservices;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.navshan.example.microservices.dao.TeamDao;
import com.navshan.example.microservices.domain.Player;
import com.navshan.example.microservices.domain.Team;

@Controller
public class RestController {
	
	private Team team;
	
	@Autowired
	TeamDao teamDao;
	
	@RequestMapping("/hi/{name}")
	public @ResponseBody String hiThere(@PathVariable String name) {
		return "hello world!"+ name;
	}
	
	/*@RequestMapping("/teams")
	public @ResponseBody Team getTeam() {
		return team;
	}*/
	
	@RequestMapping("/team/{name}")
	public @ResponseBody Team getTeamInfo(@PathVariable String name) {
		return  teamDao.findByName(name);
	}

}
