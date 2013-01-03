package com.esprit.bank.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Operation implements Serializable{

	private int id;
	
	
	private String type;
	private float montant;

	public void setType(String type) {
		this.type=type;
		
	}

	public void setMontant(float montant) {
		this.montant=montant;
		
	}

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}
	
	
	public float getMontant() {
		return montant;
	}
	
	
}
