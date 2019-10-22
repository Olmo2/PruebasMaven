package pruebasMaven.modelo.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EManager {
	private static EntityManager em = null;
	private static EntityManagerFactory emf= null;

	private EManager() {
		 emf= Persistence.createEntityManagerFactory("com.olmo.pruebasMaven.H2");
		 em= emf.createEntityManager() ;
	}
	
	public static EntityManager getEm() {
		
		if(em==null) {
			
			new EManager();
		}
		
		return em;
	}
}
