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
	
	public List<Geek> findByGender(Gender gender){
		TypedQuery<Geek> requestByGender =  em.createQuery("SELECT g FROM Geek g WHERE g.gender = :gender", Geek.class);
		requestByGender.setParameter("gender", gender);
		return requestByGender.getResultList();
	}
	
	public List<Hobby> getAllHobbies(){
		TypedQuery<Hobby> requestAllHobbies =  em.createQuery("SELECT h FROM Hobby h", Hobby.class);
		return requestAllHobbies.getResultList();
	}
	
	public List<Geek> findByHobby(String hobby){
		TypedQuery<Geek> requestByHobby =  em.createQuery("SELECT geek FROM Geek geek INNER JOIN geek.hobbies i WHERE i.title = :title", Geek.class);
		requestByHobby.setParameter("title", hobby);
		return requestByHobby.getResultList();
	}

}
