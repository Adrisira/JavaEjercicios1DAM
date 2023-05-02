package primerExamen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Modelo {

	private TreeMap<Alumno, MapaAsignaturasNotas> alumnosNotas = new TreeMap<>();
	private HashMap<String, HashSet<Asignatura>> cursosAsignaturas = new HashMap<>();

	public TreeMap<Alumno, MapaAsignaturasNotas> getAlumnosNotas() {
		return alumnosNotas;
	}

	public HashMap<String, HashSet<Asignatura>> getCursosAsignaturas() {
		return cursosAsignaturas;
	}

	public Set<Alumno> getConjuntoAlumnos() {
		return this.alumnosNotas.keySet();
	}
	
	public Set<String> getConjuntoCursos() {
		return this.cursosAsignaturas.keySet();
	}
	
	private String consultaTodosAlumnos(boolean consultaMasUnCurso, boolean consultaMedia, boolean consultaSuspensas) {
		String res = "";
		for (Alumno a : this.alumnosNotas.keySet()) {
			res += consultaUnAlumno(a, consultaMasUnCurso, consultaMedia, consultaSuspensas);
		}
		return res;
	}
	
	public String consultar(String grupoNombreAlumno, boolean consultaMasUnCurso, boolean consultaMedia,
			boolean consultaSuspensas) {
		String res;
		if (grupoNombreAlumno.equals("")) {
			// consultar los datos de todos los alumnos
			res = consultaTodosAlumnos(consultaMasUnCurso, consultaMedia, consultaSuspensas);
		} else {
			res = consultaUnAlumno(new Alumno(grupoNombreAlumno), consultaMasUnCurso, consultaMedia, consultaSuspensas);
		}
		return res;
	}

	private String consultaUnAlumno(Alumno alumno, boolean consultaMasUnCurso, boolean consultaMedia,
			boolean consultaSuspensas) {
		String res = alumno.toString() + "\n";
		if (consultaMasUnCurso) {
			res += "\t>1 curso: " + alumnoEnMasDeUnCurso(alumno) + "\n";
		}
		if (consultaMedia) {
			res += "\tNota media: " + notaMediaAlumno(alumno) + "\n";
		}
		if (consultaSuspensas) {
			res += "\tSuspensas:";
			if (asignaturasSuspensas(alumno).size() == 0) {
				res += " -\n";
			} else {
				for (Asignatura a : asignaturasSuspensas(alumno)) {
					res+="\n\t\t"+a;
				}
			}
			res += "\n";
		}
		return res;

	}
	
	public String listadoAsignaturasPorCursos() {
		String res="";
		for(String curso: this.cursosAsignaturas.keySet()) {
			res+=curso+":\n";
			for(Asignatura a: this.cursosAsignaturas.get(curso)) {
				res+="\t"+a+"\n";
			}
		}
		return res;
	}
	
	// apartado a)
	// A�ade dicha asignatura al mapa cursosAsignaturas.
	// Ten en cuenta que, si el curso no estuviera a�adido previamente, este m�todo
	// deber� a�adirlo.
	public void addAsignatura(Asignatura asig, String curso) {
	}

	// apartado b)
	// Devuelve los alumnos, asignaturas y notas tal y como se ve en el cuadro de
	// texto al pulsar el bot�n "Listar Alumnos Notas"
	public String getListadoCompleto() {
		return "";
	}

	// apartado c)
	// Devuelve un booleano indicando si un alumno tiene asignaturas de m�s de un
	// curso
	public boolean alumnoEnMasDeUnCurso(Alumno a) {
		return false;
	}
	
	// apartado d)
	// Devuelve la nota media del alumno recibido por par�metro
	public float notaMediaAlumno(Alumno alumno) {
		return 0;
	}

	// apartado e)
	// Devuelve una lista con las asignaturas que tiene suspensas
	public List<Asignatura> asignaturasSuspensas(Alumno alumno) {
		//este return est� puesto para que no de error
		return new ArrayList<Asignatura>();
	}

	//apartado f)
	// Devuelve un conjunto con todas las asignaturas de todos los cursos (comprobar en comboBoxAsignaturas).
	public Set<Asignatura> getConjuntoAsignaturas() {
		//este return est� puesto para que no de error
		return new HashSet<Asignatura>();
	}

	//apartado g)
	//Borra a los alumnos los pares asignatura-nota de la asignatura recibida por par�metro.
	public void borrarAsignatura(String nomAsignatura) {
		
		
	}

}

