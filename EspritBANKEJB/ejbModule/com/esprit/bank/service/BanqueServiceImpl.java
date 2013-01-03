package com.esprit.bank.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.logging.Logger;

import com.esprit.bank.domain.Compte;
import com.esprit.bank.domain.Operation;


@Stateless
@LocalBean

@TransactionManagement(TransactionManagementType.CONTAINER)
public class BanqueServiceImpl implements BanqueService {

	@Inject
	Logger logger;
	
	@Inject
	EntityManager entityManager;
	
	@Override
	public Compte getCompteByNumero(String numero) {
		
		
		
		Compte compte=entityManager.find(Compte.class,numero );
		
		return compte;
	}

	@Override
	public void creerCompte(Compte compte) {
		
		entityManager.persist(compte);
		
	}

	@Override
	public void insertOperation(String numCompte, Operation operation) {
		Compte compte=getCompteByNumero(numCompte);
		
		compte.getOperations().add(operation);
		entityManager.merge(compte);
		
		
		
		
		logger.info("Nouvelle operation: "+operation.getType());
		
	}

}
