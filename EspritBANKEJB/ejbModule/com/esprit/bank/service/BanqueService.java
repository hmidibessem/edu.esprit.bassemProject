package com.esprit.bank.service;

import javax.ejb.Remote;

import com.esprit.bank.domain.Compte;
import com.esprit.bank.domain.Operation;

@Remote
public interface BanqueService {

	Compte getCompteByNumero(String string);

	void creerCompte(Compte compte);

	void insertOperation(String numCompte, Operation operation);

}
