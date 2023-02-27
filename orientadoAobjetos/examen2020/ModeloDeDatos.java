package examen2020;

public class ModeloDeDatos {
	Articulo tArticulos[];
	Cliente tClientes[];
	Factura tFacturas[];

	public ModeloDeDatos() {
		this.tArticulos = new Articulo[0];
		this.tClientes = new Cliente[0];
		this.tFacturas = new Factura[0];
	}

	public void anadeArticulo(Articulo ArticuloNuevo) {
		Articulo nuevaTArticulos[] = new Articulo[this.tArticulos.length + 1];
		for (int i = 0; i < this.tArticulos.length; i++)
			nuevaTArticulos[i] = tArticulos[i];

		nuevaTArticulos[this.tArticulos.length] = ArticuloNuevo;
		this.tArticulos = nuevaTArticulos;
	}

	public void anadeFactura(Factura FacturaNueva) {
		Factura nuevaTFacturas[] = new Factura[this.tFacturas.length + 1];
		for (int i = 0; i < this.tFacturas.length; i++)
			nuevaTFacturas[i] = tFacturas[i];

		nuevaTFacturas[this.tFacturas.length] = FacturaNueva;
		this.tFacturas = nuevaTFacturas;
	}

	public void anadeCliente(Cliente clienteNuevo) {
		Cliente nuevaTClientes[] = new Cliente[this.tClientes.length + 1];
		for (int i = 0; i < this.tClientes.length; i++)
			nuevaTClientes[i] = tClientes[i];

		nuevaTClientes[this.tClientes.length] = clienteNuevo;
		this.tClientes = nuevaTClientes;
	}
	//a 
	public Factura facturaFusionada(Cliente cliente, int numFra) {
		Factura facturaFusionada = new Factura(numFra, cliente, 0.0f);
		for (int i = 0; i < this.tFacturas.length; i++) {
			if (this.tFacturas[i].getCliente().getDni().equals(facturaFusionada.getCliente().getDni())) {
				for (int j = 0; j < this.tFacturas[i].gettLineas().length; j++) {
					facturaFusionada.añadeLinea(new Linea(tFacturas[i].gettLineas()[j].getarticulo(),
							tFacturas[i].gettLineas()[j].getCantidad()));
				}
			}
		}

		return facturaFusionada;
	}

	// Revisar No esta bien del todo b
	public Factura facturaFusionadaResumida(Cliente cliente, int numFra) {
		Factura facturaFusionadaResumida = new Factura(numFra, cliente, 0.0f);
		for (int i = 0; i < this.tFacturas.length; i++) {
			if (this.tFacturas[i].getCliente().getDni().equals(facturaFusionadaResumida.getCliente().getDni())) {
				for (int j = 0; j < this.tFacturas[i].gettLineas().length; j++) {
					boolean esta = false;
					for (int z = 0; z < facturaFusionadaResumida.gettLineas().length; z++) {
						if (facturaFusionadaResumida.gettLineas()[z].getarticulo()
								.equals(tFacturas[i].gettLineas()[j].getarticulo())) {
							facturaFusionadaResumida.gettLineas()[z]
									.setCantidad(tFacturas[i].gettLineas()[j].getCantidad()
											+ tFacturas[i].gettLineas()[z].getCantidad());
							esta = true;
						}
					}
					if (!esta) {
						facturaFusionadaResumida.añadeLinea(new Linea(tFacturas[i].gettLineas()[j].getarticulo(),
								tFacturas[i].gettLineas()[j].getCantidad()));
					}
				}
			}
		}

		return facturaFusionadaResumida;
	}
	//c
	public float gastoPorCliente(Cliente cliente) {
		float gastoCliente = 0.0f;
		for (int i = 0; i < this.tFacturas.length; i++) {
			if (this.tFacturas[i].getCliente().getDni().equals(cliente.getDni())) {
				gastoCliente += tFacturas[i].getImporteTotalFra();
			}

		}
		return gastoCliente;
	}

	public Cliente clienteMayorGasto() {
		Cliente clienteMayorGasto = tFacturas[0].getCliente();
		Factura mayorFactura = tFacturas[0];
		for (int i = 0; i < tFacturas.length; i++) {
			if (mayorFactura.compareTo(tFacturas[i]) > 0) {
				mayorFactura = tFacturas[i];
				clienteMayorGasto = tFacturas[i].getCliente();
			}
		}
		
		return clienteMayorGasto;
	}

	public Articulo[] ArticulosPorVentas() {
		//Primero copiamos los articulos en un nuevo array
		Articulo [] copiaArticulos = new Articulo[this.tArticulos.length];
		for (int i = 0; i <this.tArticulos.length; i++) {
			copiaArticulos[i] = this.tArticulos[i];
		}
		
		//Ordenamos el array de articulos por cantidad vendida de manera descendete
		for (int i = 0; i < copiaArticulos.length - 1; i++) {
			for (int j = i + 1; j < copiaArticulos.length; j++) {
				int cantidadI = 0;
				int cantidadJ = 0;
				
				//Calculamos la calntidad total vendida de cada articulo
				for (Factura factura : this.tFacturas) {
					for (Linea linea : factura.gettLineas()) {
						if (linea.getarticulo().equals(copiaArticulos[i])) {
							cantidadI += linea.getCantidad();
						}
						if (linea.getarticulo().equals(copiaArticulos[j])) {
							cantidadJ += linea.getCantidad();
						}
					}
				}
				
				//Intercambiar los elementos del array si estan en el orden incorrecto
				if (cantidadJ > cantidadI) {
					Articulo temp = copiaArticulos[i];
					copiaArticulos[i] = copiaArticulos[j];
					copiaArticulos[j] = temp;
				}
			}
		}
		return copiaArticulos;
	}

	public int totalUnidadesVendidas(Articulo Articulo) {
		int numUnidadesVendidas = 0;
		for (int i = 0; i < this.tFacturas.length; i++) {
			for (int j = 0; j < this.tFacturas[i].gettLineas().length; j++) {
				if (this.tFacturas[i].gettLineas()[j].articulo.equals(Articulo)) {
					numUnidadesVendidas += tFacturas[i].gettLineas()[j].getCantidad();
				}
			}
		}
		return numUnidadesVendidas;
	}
}
