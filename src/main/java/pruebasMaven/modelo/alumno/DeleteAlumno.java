package pruebasMaven.modelo.alumno;



import pruebasMaven.modelo.util.EManager;
import pruebasMaven.negocio.AlumnoBean;

public class DeleteAlumno {

	
public void delete(AlumnoBean alumno) {
		
//		EntityManagerFactory emf= Persistence.createEntityManagerFactory("com.olmo.pruebasMaven.H2");
//		EntityManager em= emf.createEntityManager() ;
		
		
		EManager.getEm().getTransaction().begin();
		AlumnoBean alumnoBorrar = EManager.getEm().find(AlumnoBean.class,alumno.getIdAlumno());
		EManager.getEm().remove(alumnoBorrar);
		
		EManager.getEm().getTransaction().commit();
		EManager.getEm().close();
		
	}
}
