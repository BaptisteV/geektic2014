package com.ninja_squad.geektic.service;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.dao.GeekDao;
import com.ninja_squad.geektic.tables.Hobby;

@RestController
@Transactional
@Service
@RequestMapping("/api/hobbies")
public class SearchHobbiesService {
	
	
	@Autowired
	private GeekDao dao;
	
	@RequestMapping(method = GET)
	public List<Hobby> getAllHobbies(){
		return dao.getAllHobbies();
	}
}
