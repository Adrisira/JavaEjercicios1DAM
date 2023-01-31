package herencias;

public class Piano extends Instrumento {
	public String sonido = "plim";

	public Piano(NotaMusical[] notas) {
		super(notas);
	}

	@Override
	public void interpretar() {
		for (int i = 0; i < notas.length && notas[i] != null; i++) {
			System.out.println(notas[i] + " " + sonido);
		}

	}

}
