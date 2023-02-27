package examen2020;


public class Factura implements Comparable<Factura> {
	private int numero;
	private Cliente cliente;
	private Linea tLineas[];
	private float porcentajeDto;

	public Factura(int numero, Cliente cliente, float porcentajeDescuento) {
		this.numero = numero;
		this.cliente = cliente;
		this.porcentajeDto = porcentajeDescuento;
		this.tLineas = new Linea[0];
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getnumero() {
		return numero;
	}

	public void setnumero(int numero) {
		this.numero = numero;
	}

	public Linea[] gettLineas() {
		return tLineas;
	}

	public void settLineas(Linea[] tLineas) {
		this.tLineas = tLineas;
	}

	public void añadeLinea(Linea LineaNueva) {
		Linea nuevaTLineas[] = new Linea[this.tLineas.length + 1];
		for (int i = 0; i < this.tLineas.length; i++)
			nuevaTLineas[i] = tLineas[i];

		nuevaTLineas[this.tLineas.length] = LineaNueva;
		this.tLineas = nuevaTLineas;
	}

	public float getImporteTotalFra() {
		float totalFra = 0;
		float importeFinal = 0;

		for (Linea l : this.tLineas)
			totalFra += l.getTotalLinea();

		importeFinal = totalFra - totalFra * this.porcentajeDto / 100;
		return importeFinal;
	}

	public String toString() {
		String res = "";
		float totalFra = 0;
		float importeFinal = 0;

		res += this.cliente.toString() + "              FRA.NUM:" + this.numero + "\n";

		res += "COD DESCRIPCION                 PR.UN.  CANT. TOTAL  \n";
		res += "=== =========================== ======= ===== ========\n";

		for (Linea l : this.tLineas) {
			res += l.toString() + "\n";
			totalFra += l.getTotalLinea();
		}

		res += "                               =======================\n";
		res += "                               TOTAL........:"
				+ ("      " + totalFra).substring(("      " + totalFra).length() - 9, ("      " + totalFra).length())
				+ "\n";
		res += "                               DTO..........:" + ("      " + this.porcentajeDto + "%")
				.substring(("      " + this.porcentajeDto).length() - 9, ("      " + this.porcentajeDto).length() + 1);
		res += "\n                               =======================\n";

		importeFinal = totalFra - ((int) (totalFra * this.porcentajeDto)) / 100;
		res += "                               IMPORTE FACTURA: " + ("            " + importeFinal)
				.substring(("            " + importeFinal).length() - 6, ("            " + importeFinal).length());

		return res;
	}

	@Override
	public int compareTo(Factura o) {
		int res = 0;
		for (int i = 0; i < this.tLineas.length; i++) {
			for (int j = 0; j <o.tLineas.length; j++) {
				if (this.tLineas[i].getTotalLinea() - o.tLineas[j].getTotalLinea() > 0) {
					res = 1;
				} else if (this.tLineas[i].getTotalLinea() - o.tLineas[j].getTotalLinea() < 0) {
					res = -1;
				} else {
					res = 0;
				}
			}
			
		}
		return res;
	}

}
