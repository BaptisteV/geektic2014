package com.ninja_squad.geektic.service;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ninja_squad.geektic.dao.GeekDao;
import com.ninja_squad.geektic.tables.Geek;
import com.ninja_squad.geektic.tables.Gender;

@RestController
@Transactional
@Service
@RequestMapping("/api/result")
public class SearchGeekService {

	@Autowired
	private GeekDao dao;

	@RequestMapping(method = GET)
	public List<Geek> getMatchingGeeks(
			@RequestParam(value = "hobby", required = false) String selectedHobby,
			@RequestParam(value = "gender", required = false) Gender selectedGender) {
		System.out.println("Parametres recupérés : " + selectedHobby + " "
				+ selectedGender);
		List<Geek> matchingGeek;
		// Si les deux critères sont renseignés
		if ((selectedGender != null) && (selectedHobby!=null)) {
			List<Geek> matchingGenderGeek = dao.findByGender(selectedGender);
			matchingGeek = dao.findByHobby(selectedHobby);
			matchingGeek.retainAll(matchingGenderGeek);
		}
		else if (selectedGender != null) {
			// Si on ne renseigne que le sexe
			matchingGeek = dao.findByGender(selectedGender);
		} else {
			// Si on ne renseigne que le hobby
			matchingGeek = dao.findByHobby(selectedHobby);
		}

		System.out.println(matchingGeek.size() + " résultat");
		return matchingGeek;
	}
}
