package com.ninja_squad.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;




import org.springframework.stereotype.Repository;

import com.ninja_squad.geektic.tables.*;

@Repository
public class GeekDao {
	
	@PersistenceContext
	private EntityManager em;

	// find by gender
	// find by hobbit
	// le service se charge de trouver l'intersection
	/*
	public GeekDao(EntityManager entityManager){
		this.em = entityManager;
	}
	*/
	
	public List<Geek> findByGender(Gender gender){
		TypedQuery<Geek> requestByGender =  em.createQuery("select g from Geek g where g.gender = :gender", Geek.class);
		requestByGender.setParameter("gender", gender);
		return requestByGender.getResultList();
	}
	
	public List<Hobby> getAllHobbies(){
		TypedQuery<Hobby> requestAllHobbies =  em.createQuery("select h from Hobby h", Hobby.class);
		return requestAllHobbies.getResultList();
	}

}
