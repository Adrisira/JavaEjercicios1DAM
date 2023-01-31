package herencias;

public class Campana extends Instrumento {
	public String sonido = "Tolon";

	public Campana(NotaMusical[] notas) {
		super(notas);
	}

	@Override
	// Se que esto hay que cambairlo
	public void interpretar() {
		for (int i = 0; i < this.notas.length && notas[i] != null; i++) {
			System.out.println(notas[i] + " " + sonido);
		}

	}

}
