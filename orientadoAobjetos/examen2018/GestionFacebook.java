package examen2018;

public class GestionFacebook {

	public static void main(String[] args) {
		Miembro a, b, c, d, e, f, g, h, x;
		a = new Miembro("emaila", "a");
		b = new Miembro("emailb", "b");
		c = new Miembro("emailc", "c");
		d = new Miembro("emaild", "d");
		e = new Miembro("emaile", "e");
		f = new Miembro("emailf", "f");
		g = new Miembro("emailg", "g");
		h = new Miembro("emailh", "h");
		x = new Miembro("emailx", "x");

		ListaMiembros lista = new ListaMiembros();
		lista.anadeMiembro(a);
		lista.anadeMiembro(b);
		lista.anadeMiembro(c);
		lista.anadeMiembro(d);
		lista.anadeMiembro(e);
		lista.anadeMiembro(f);
		lista.anadeMiembro(g);
		lista.anadeMiembro(h);

		hacerAmigos(a, f);
		hacerAmigos(a, d);
		hacerAmigos(e, b);
		hacerAmigos(e, c);
		hacerAmigos(e, d);
		hacerAmigos(g, h);
		hacerAmigos(b, c);

		System.out.println("Apartado a)");
		System.out.println("La lista contiene al miembro a: " + lista.contieneMiembro(a));
		System.out.println("La lista contiene al miembro x: " + lista.contieneMiembro(x));

		System.out.println("\nApartado b)");
		System.out.println("Amigos de a (sin b): " + a.getAmigos());
		a.anadeAmigo(b);
		System.out.println("Amigos de a (con b): " + a.getAmigos());

		System.out.println("\nApartado c)");
		a.eliminaAmigo(b);
		System.out.println("Amigos de a (eliminado b): " + a.getAmigos());

		System.out.println("\nApartado d)");
		System.out.println("Personas que quiz� conozca d: " + d.personasQueQuizaConozca());

		System.out.println("\nApartado e)");
		System.out.println("Amigos en com�n de c y d: " + c.amigosEnComun(d));

		System.out.println("\nApartado f)");
		System.out.println("�Tienen b y c los mismos amigos? " + b.tieneLosMismosAmigosQue(c));
		System.out.println("�Tienen h y g los mismos amigos? " + h.tieneLosMismosAmigosQue(g));
		x.anadeAmigo(g);
		System.out.println("�Tienen h y x los mismos amigos? " + h.tieneLosMismosAmigosQue(x));
		x.eliminaAmigo(g);

		System.out.println("\nApartado g)");
		System.out.println("�Son todos amigos en lista? " + sonTodosAmigos(lista));
		ListaMiembros otra = new ListaMiembros();
		otra.anadeMiembro(b);
		otra.anadeMiembro(c);
		otra.anadeMiembro(e);
		System.out.println("�Son todos amigos en otra? " + sonTodosAmigos(otra));

		System.out.println("\nApartado h)");
		System.out.println("�Porcentaje del �ndice de similitud de los amigos de a y b: " + indiceDeSimilitud(a, b));
		System.out.println("�Porcentaje del �ndice de similitud de los amigos de d y b: " + indiceDeSimilitud(d, b));
		System.out.println("�Porcentaje del �ndice de similitud de los amigos de d y d: " + indiceDeSimilitud(d, d));

	}

	public static void hacerAmigos(Miembro a, Miembro b) {
		a.anadeAmigo(b);
		b.anadeAmigo(a);
	}

	public static boolean sonTodosAmigos(ListaMiembros lista) {
		return true;
	}

	public static float indiceDeSimilitud(Miembro a, Miembro b) {
		return 0;
	}
}
