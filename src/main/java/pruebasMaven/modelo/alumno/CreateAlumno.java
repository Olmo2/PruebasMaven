package pruebasMaven.modelo.alumno;

import pruebasMaven.modelo.util.EManager;
import pruebasMaven.negocio.AlumnoBean;

public class CreateAlumno {

	public void create(AlumnoBean alumno) {

//		EntityManagerFactory emf= Persistence.createEntityManagerFactory("com.olmo.pruebasMaven.H2");
//		EntityManager em= emf.createEntityManager() ;
//		

		EManager.getEm().getTransaction().begin();
		EManager.getEm().persist(alumno);
		EManager.getEm().getTransaction().commit();
		// No se cierra porque es un Singleton

	}

}
