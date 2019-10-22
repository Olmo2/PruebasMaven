package pruebasMaven.modelo.asignatura;

import pruebasMaven.modelo.util.EManager;
import pruebasMaven.negocio.AsignaturaBean;

public class CreateAsignatura {

	public void create(AsignaturaBean asignatura) {

//		EntityManagerFactory emf= Persistence.createEntityManagerFactory("com.olmo.pruebasMaven.H2");
//		EntityManager em= emf.createEntityManager() ;

		EManager.getEm().getTransaction().begin();
		EManager.getEm().persist(asignatura);
		EManager.getEm().getTransaction().commit();
//		No se cierra porque es un Singleton

	}
}