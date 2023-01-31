package herencias;

import java.util.Arrays;

public abstract class Instrumento {
	protected NotaMusical[] notas = new NotaMusical[100];

	public Instrumento(NotaMusical[] notas) {
		super();
		setNotas(notas);
	}

	public NotaMusical[] getNotas() {
		return notas;
	}

	public void setNotas(NotaMusical[] notas) {
		if (notas.length <= 100) {
			this.notas = notas;
		}

	}

	// metodos
	public void add(NotaMusical notas) {
		boolean insertado = false;
		if (this.notas.length < 100) {
			this.notas = Arrays.copyOf(this.notas, this.notas.length + 1);
		}
		for (int i = 0; i < this.notas.length && insertado == false; i++) {
			if (this.notas[i] == null) {
				this.notas[i] = notas;
				insertado = true;
			}
		}
	}

	public abstract void interpretar();

	@Override
	public String toString() {
		return "Instrumento [notas=" + Arrays.toString(notas) + "]";
	}

}
