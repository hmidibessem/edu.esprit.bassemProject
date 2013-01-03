package com.esprit.bank.service;



import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.logging.Logger;



public class Resources {

	@PersistenceContext(unitName="PU1")
	EntityManager entityManager;
	
	
	@Produces
	public Logger getLogger(){
		
		return Logger.getLogger(this.getClass());
		
		
	}
	
	
	@Produces
	public EntityManager getEntityManager(){
	return entityManager;	
	}
	
	
	
}
