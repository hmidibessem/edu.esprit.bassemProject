package com.esprit.bank.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {

	private String cin;
	private String nom;
	private String prenom;
	
	
	@Id
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	
}
