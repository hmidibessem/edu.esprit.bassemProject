package com.esprit.bank.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Compte implements Serializable {

	private String numero;

	private float solde;

	private List<Operation> operations;

	public float getSolde() {
	
		return solde;
	}

	public void setSolde(float solde) {
		this.solde=solde;
		 
	}

	@Id
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.MERGE)
	public List<Operation> getOperations() {
		// TODO Auto-generated method stub
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	
}
