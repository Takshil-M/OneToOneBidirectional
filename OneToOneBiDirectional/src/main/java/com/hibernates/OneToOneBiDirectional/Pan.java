package com.hibernates.OneToOneBiDirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pan {
	
	@Id
	private int id;
	private String panNumber;
	private String fatherName;
	
	@OneToOne
	@JoinColumn
	private Person person;

	@Override
	public String toString() {
		return "Pan [id=" + id + ", panNumber=" + panNumber + ", fatherName=" + fatherName + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	

}
