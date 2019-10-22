package pruebasMaven.inicio;

import pruebasMaven.modelo.alumno.CreateAlumno;
import pruebasMaven.modelo.alumno.DeleteAlumno;
import pruebasMaven.modelo.asignatura.CreateAsignatura;
import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.negocio.AsignaturaBean;

public class Start {

	public static void main(String[] args) {

		AsignaturaBean mates = new AsignaturaBean();
		mates.setNombre("Mates");
		AsignaturaBean lengua = new AsignaturaBean();
		lengua.setNombre("Lengua");
		CreateAsignatura createAsignatura = new CreateAsignatura();
		createAsignatura.create(mates);
		createAsignatura.create(lengua);

		AlumnoBean olmo = new AlumnoBean();
//		DeleteAlumno deleteAlumno = new DeleteAlumno();
//		deleteAlumno.delete(olmo);
		olmo.setNombre("Olmo");
		olmo.setTelefono("12354689");
		olmo.setCiudad("Oviedo");
		olmo.setAsignatura(mates);
		AlumnoBean paco = new AlumnoBean();
		paco.setNombre("Paco");
		paco.setTelefono("12354689");
		paco.setCiudad("A Coruña");
		paco.setAsignatura(lengua);

		CreateAlumno createAlumno = new CreateAlumno();
		createAlumno.create(olmo);
		createAlumno.create(paco);

	}

}
