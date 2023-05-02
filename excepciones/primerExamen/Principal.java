package primerExamen;

import java.util.Set;

public class Principal {
	private Modelo modelo;
	private VentanaPpal vista;

	public static void main(String args[]) {
		new Principal();
	}

	public Principal() {
		this.modelo = new Modelo();
		this.vista = new VentanaPpal(this);

		this.crearDatosDePrueba();

		this.vista.setVisible(true);

	}

	private void crearDatosDePrueba() {
		Asignatura prog = new Asignatura("Programacion", 8);
		Asignatura bd = new Asignatura("Bases de Datos", 6);
		Asignatura entornos = new Asignatura("Entornos Integrados de Desarrollo", 3);
		Asignatura lenguajes = new Asignatura("Lenguajes de Marcas", 4);
		Asignatura equipos = new Asignatura("Equipos", 5);
		Asignatura aplicaciones = new Asignatura("Aplicaciones", 5);
		Asignatura redes = new Asignatura("Redes", 8);
		Asignatura adat = new Asignatura("Acceso a Datos", 5);
		Asignatura procesos = new Asignatura("Programaci�n de Servicios y Procesos", 5);

		String curso1Dam = "1�DAM";
		this.modelo.addAsignatura(prog, curso1Dam);
		this.modelo.addAsignatura(bd, curso1Dam);
		this.modelo.addAsignatura(entornos, curso1Dam);
		this.modelo.addAsignatura(lenguajes, curso1Dam);

		String curso1Smr = "1�SMR";
		this.modelo.addAsignatura(equipos, curso1Smr);
		this.modelo.addAsignatura(aplicaciones, curso1Smr);
		this.modelo.addAsignatura(redes, curso1Smr);

		String curso2Dam = "2�DAM";
		this.modelo.addAsignatura(adat, curso2Dam);
		this.modelo.addAsignatura(procesos, curso2Dam);

		MapaAsignaturasNotas asignaturasPepe = new MapaAsignaturasNotas();
		asignaturasPepe.put(prog, 7);
		asignaturasPepe.put(bd, 4);
		asignaturasPepe.put(entornos, 9);
		asignaturasPepe.put(lenguajes, 3);

		this.modelo.getAlumnosNotas().put(new Alumno("Pepe", "1�DAM"), asignaturasPepe);

		MapaAsignaturasNotas asignaturasJuan = new MapaAsignaturasNotas();
		asignaturasJuan.put(prog, 7);
		asignaturasJuan.put(bd, 4);
		asignaturasJuan.put(lenguajes, 3);
		asignaturasJuan.put(adat, 3);

		this.modelo.getAlumnosNotas().put(new Alumno("Juan", "1�DAM"), asignaturasJuan);

		MapaAsignaturasNotas asignaturasMaria = new MapaAsignaturasNotas();
		asignaturasMaria.put(equipos, 5);
		asignaturasMaria.put(aplicaciones, 8);
		asignaturasMaria.put(redes, 9);

		this.modelo.getAlumnosNotas().put(new Alumno("Mar�a", "1�SMR"), asignaturasMaria);

		MapaAsignaturasNotas asignaturasPepe2 = new MapaAsignaturasNotas();
		asignaturasPepe2.put(equipos, 9);
		asignaturasPepe2.put(aplicaciones, 2);
		asignaturasPepe2.put(redes, 2);

		this.modelo.getAlumnosNotas().put(new Alumno("Pepe", "1�SMR"), asignaturasPepe2);
		this.vista.actualizaCombos();

	}

	public Set<Alumno> getConjuntoAlumnos() {
		return this.modelo.getConjuntoAlumnos();
	}

	public Set<Asignatura> getConjuntoAsignaturas() {
		return this.modelo.getConjuntoAsignaturas();
	}

	public Set<String> getConjuntoCursos() {
		return this.modelo.getConjuntoCursos();
	}

	public String getListadoCompleto() {
		return this.modelo.getListadoCompleto();
	}

	public Modelo getModelo() {
		return this.modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public String consultar(String grupoNombreAlumno, boolean consultaMasUnCurso, boolean consultaMedia,
			boolean consultaSuspensas) {
		return this.modelo.consultar(grupoNombreAlumno, consultaMasUnCurso, consultaMedia, consultaSuspensas);
	}

	public String listadoAsignaturasPorCursos() {
		return this.modelo.listadoAsignaturasPorCursos();
	}

	public void borrarAsignatura(String nomAsignatura) {
		this.modelo.borrarAsignatura(nomAsignatura);

	}

}
