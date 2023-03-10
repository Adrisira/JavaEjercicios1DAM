package examen2018;

public class Miembro {

	private String email;
	private String nombre;
	private ListaMiembros amigos;

	public Miembro(String email, String nombre) {
		this.email = email;
		this.nombre = nombre;
		this.amigos = new ListaMiembros();
	}

	public ListaMiembros getAmigos() {
		return amigos;
	}

	public String toString() {
		return this.email + " - " + this.nombre;
	}

	public void anadeAmigo(Miembro b) {
		this.amigos.anadeMiembroSinRepetir(b);
	}

	public boolean tieneComoAmigoA(Miembro otro) {
		return this.amigos.contieneMiembro(otro);
	}

	public void eliminaAmigo(Miembro m) {
		this.amigos.eliminaMiembro(m);
	}

	public ListaMiembros personasQueQuizaConozca() {
		ListaMiembros lm = new ListaMiembros();
		Miembro[] amigosDeInvocante = this.amigos.getTabla();
		for (int i = 0; i < amigosDeInvocante.length; i++) {
			Miembro[] amigosDeAmigo = amigosDeInvocante[i].amigos.getTabla();
			for (int j = 0; j < amigosDeAmigo.length; j++) {
				if (!this.equals(amigosDeAmigo[j]) && !this.tieneComoAmigoA(amigosDeAmigo[j])) {
					lm.anadeMiembroSinRepetir(amigosDeAmigo[j]);
				}
			}
		}
		return lm;
	}

	// e
	public ListaMiembros amigosEnComun(Miembro b) {
		ListaMiembros lm = new ListaMiembros();
		Miembro[] amigosDeParametro = b.amigos.getTabla();
		for (int i = 0; i < amigosDeParametro.length; i++) {
			if (this.amigos.contieneMiembro(amigosDeParametro[i])) {
				lm.anadeMiembroSinRepetir(amigosDeParametro[i]);
			}
		}
		return lm;
	}

	// f
	public boolean tieneLosMismosAmigosQue(Miembro b) {
		return this.amigos.getTamano() == this.amigosEnComun(b).getTamano()
				&& b.amigos.getTamano() == this.amigos.getTamano();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Miembro other = (Miembro) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

}
