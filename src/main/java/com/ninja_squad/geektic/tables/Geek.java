package com.ninja_squad.geektic.tables;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Geek implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_GEEK")
	private long id_geek;

	private String name;
	private String surname;
	private String aka;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String city;
	private String email;

	@ManyToMany
	@JoinTable(name = "GEEK_HOBBY"/*, joinColumns = { @JoinColumn(name = "ID_GEEK", referencedColumnName = "ID_HOBBY") }, inverseJoinColumns = { @JoinColumn(name = "ID_HOBBY", referencedColumnName = "ID_GEEK") }*/)
	private List<Hobby> hobbies;

	public Geek() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAka() {
		return aka;
	}

	public void setAka(String aka) {
		this.aka = aka;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
