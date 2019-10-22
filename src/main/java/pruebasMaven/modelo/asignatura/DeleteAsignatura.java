package pruebasMaven.modelo.asignatura;



import pruebasMaven.modelo.util.EManager;

import pruebasMaven.negocio.AsignaturaBean;

public class DeleteAsignatura {
	
public void delete(AsignaturaBean asignatura) {
		
//		EntityManagerFactory emf= Persistence.createEntityManagerFactory("com.olmo.pruebasMaven.H2");
//		EntityManager em= emf.createEntityManager() ;
		
		
		EManager.getEm().getTransaction().begin();
		EManager.getEm().remove(asignatura);
		EManager.getEm().getTransaction().commit();
		EManager.getEm().close();
		
	}

}
