package examenParejas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Modelo {
	public static final int CORRECTO = 0;
	public static final int YA_EXISTE = 1;

	private LinkedHashSet<Persona> solicitantes;
	private HashMap<Persona, TreeMap<Persona, Persona>> gestoresParejas;

	public Modelo() {
		solicitantes = new LinkedHashSet<>();
		gestoresParejas = new HashMap<Persona, TreeMap<Persona, Persona>>();
	}

	public int anyadeSolicitante(String nombre, Sexo sexoSolicitante, Sexo sexoSolicitado, boolean gestor,
			List<String> aficiones) {
		Persona p = new Persona(nombre, sexoSolicitante, sexoSolicitado, gestor, aficiones);
		return solicitantes.add(p) ? CORRECTO : YA_EXISTE;
	}

	public Set<Persona> getListaGestores() {
		HashSet<Persona> gestores = new HashSet<>();
		for (Persona p : solicitantes) {
			if (p.isGestor()) {
				gestores.add(p);
			}
		}
		return gestores;
	}

	public Set<Persona> getListaSolicitantes() {
		return this.solicitantes;
	}

	public String getListadoAfinidades(String nombreSolicitante) {
		String listaDePersonaAfines = " ";
		Persona personaParam = getPersonaSolicitantePorNombre(nombreSolicitante);
		for (Persona persona : solicitantes) {
			if (persona.getSexoPropio().equals(personaParam.getSexoBuscado())
					&& persona.getSexoBuscado().equals(personaParam.getSexoPropio()) && !persona.equals(personaParam)) {
				listaDePersonaAfines += "Aficiones Comunes de " + nombreSolicitante + " y " + persona.getNombre()
						+ ", las aficiones en comun son: " + persona.aficionesComunesCon(personaParam);
			}
		}
		return listaDePersonaAfines;
	}

	public int creaPareja(String nombreGestor, String nombreSolicitante, String nombrePareja) {
		Persona gestor = getPersonaSolicitantePorNombre(nombreGestor);
		Persona solicitante = getPersonaSolicitantePorNombre(nombreSolicitante);
		Persona pareja = getPersonaSolicitantePorNombre(nombrePareja);
		int puedeIncluirlo = CORRECTO;
		if(!gestoresParejas.containsKey(gestor)) {
			gestoresParejas.put(gestor, new TreeMap<Persona, Persona>());
		}
		for(TreeMap<Persona, Persona> personas: gestoresParejas.values()) {
			if(personas.containsKey(pareja) || personas.containsValue(pareja) || personas.containsKey(solicitante) || personas.containsValue(solicitante)) {
				puedeIncluirlo = YA_EXISTE;
			}
		}
		if(puedeIncluirlo == CORRECTO) {
			gestoresParejas.get(gestor).put(solicitante, pareja);
		}
		return puedeIncluirlo;
	}

	private Persona getPersonaSolicitantePorNombre(String nombreSolicitante) {
		Persona personaParam = null;
		for (Persona personaP : solicitantes) {
			if (personaP.getNombre().equals(nombreSolicitante)) {
				personaParam = personaP;
			}
		}
		return personaParam;
	}

	public String getListadoSolicitantes() {
		String listaSolicitantes = " ";
		for(Persona p: solicitantes) {
			listaSolicitantes += p + " ";
		}
		return listaSolicitantes;
	}

	public String getListadoParejas() {
		String res = "";
		TreeMap<Persona, TreeMap<Persona, Persona>> mapaParejasOrdenado = new TreeMap<>(gestoresParejas);
		for (Persona gestor : mapaParejasOrdenado.keySet()) {
			if (mapaParejasOrdenado.get(gestor) != null && mapaParejasOrdenado.get(gestor).size() > 0) {
				res += "\nGestor.........:" + gestor.getNombre() + "\nParejas hechas.:";
				for (Persona p1 : mapaParejasOrdenado.get(gestor).keySet()) {
					res += "\n\t"+p1.getNombre() + " + " + mapaParejasOrdenado.get(gestor).get(p1).getNombre();
				}
			}
		}
		return res;
	}

}
