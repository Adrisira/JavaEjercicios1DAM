package comercial;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Modelo {
	private HashMap<Comercial, TreeSet<Empresa>> asignaciones;
	private Vector<Visita> visitas;

	public Modelo() {
		this.asignaciones = new HashMap<Comercial, TreeSet<Empresa>>();
		this.visitas = new Vector<Visita>();
	}

	public void anadeComercial(Comercial c) {
		// a�ade al mapa de asignaciones una nueva pareja con el comercial pasado como
		// par�metro y un conjunto nuevo vac�o de empresas asignadas.
		asignaciones.put(c, new TreeSet<Empresa>());
	}

	public void asignaEmpresaAComercial(Comercial c, Empresa e) {
		// asigna la empresa pasada como par�metro al conjunto de empresas que tiene
		// asignadas
		// el comercial pasado como par�metro.
		if (!asignaciones.containsKey(c)) {
			this.anadeComercial(c);
		}
		asignaciones.get(c).add(e);
	}

	public void anadeVisita(Visita visita) {
		this.visitas.add(visita);
	}

	public boolean hayErrores() {
		// Devuelve true si hay alguna visita hecha por un comercial a una empresa que
		// NO estaba
		// asignada a ese comercial. Devuelve false en otro caso.
		// No es la manera eficiente
		boolean hayErrores = false;
		for (Visita v : this.visitas) {
			if (!asignaciones.get(v.getComercial()).contains(v.getEmpresa())) {
				hayErrores = true;
				System.out.println(v.toString());
			}

		}
		return hayErrores;
	}

	public float totalComprasPorComercial(Comercial c) {
		// Devuelve el total de compras hechas por las empresas asignadas al comercial
		// pasado como par�metro.
		float number = 0;
		for (Empresa e : asignaciones.get(c)) {

			number += e.getCompras();
		}
		return number;
	}

	public float totalVentasPorEmpresa(Empresa e) {
		// Devuelve el total de ventas hechas por todos los comerciales asignados a
		// la empresa pasada como par�metro.
		float number = 0;
		for (Comercial c : asignaciones.keySet()) {
			for (Empresa ee : asignaciones.get(c)) {
				if (ee.equals(e)) {
					number += c.getVentas();
				}
			}
		}

		return number;

	}

	public TreeSet<Comercial> comercialesQueVisitaronEnElMes(int mes) {
		// Devuelve un TreeSet con todos los comerciales que hicieron alguna visita
		// en el mes pasado como par�metro.
		TreeSet<Comercial> comerciales = new TreeSet<>();
		for (Visita v : this.visitas) {
			if (v.getMes() == mes) {
				comerciales.add(v.getComercial());
			}
		}
		return comerciales;
	}

	public TreeSet<String> nombresDeEmpresasNoVisitadas() {
		// Devuelve un TreeSet con todas las empresas que no han recibido ninguna
		// visita.
		TreeSet<String> empresas = new TreeSet<>();
//		for (Comercial c : asignaciones.keySet()) {
//			for (Empresa e : asignaciones.get(c)) {
//				for(Visita v: this.visitas) {
//					if(!e.equals(v.getEmpresa())) {
//						empresas.add(e.getNombre());
//					}
//				}
//				
//			}
//
//		}
		for(TreeSet<Empresa> t:this.asignaciones.values())
		{
			for(Empresa e:t)
			{
				boolean visitada = false;
				for(Visita v:this.visitas)
					if(v.getEmpresa().equals(e))
						visitada = true;
				if(!visitada)
					empresas.add(e.getNombre());
			}	
		}
		return empresas;
	}

	public TreeMap<Comercial, LinkedList<Visita>> mapaVisitasPorComercial() {
		// Devuelve un mapa con todos los comerciales como claves, y el valor asociado a
		// cada comercial es una LinkedList de las visitas que ha hecho ese comercial.
		TreeMap<Comercial, LinkedList<Visita>> porComercial = new TreeMap<>();
		for(Comercial c: asignaciones.keySet()) {
			LinkedList<Visita> lista = new LinkedList<>();
			for(Visita v: this.visitas) {
				if(v.getComercial().equals(c)) {
					lista.add(v);
				}
				porComercial.put(c, lista);
			}
		}
		return porComercial;
	}
}
