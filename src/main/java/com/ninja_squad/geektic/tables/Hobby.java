package com.ninja_squad.geektic.tables;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorColumn(name = "ID_HOBBY")
public class Hobby {
	@Id
	private long id_hobby;
	
	private String title;
	private String detail;
	
	public Hobby(){
		
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
