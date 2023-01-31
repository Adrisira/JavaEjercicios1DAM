package herencias;

public class PruebaHoraMain {

	public static void main(String[] args) {
		Hora h1 = new Hora(40,59);
		Hora12 h2 = new Hora12(12, 59, Meridiano.AM);
		System.out.println(h1);
		System.out.println(h2);
		h2.inc();
		System.out.println(h2);
		HoraExacta h3 = new HoraExacta (1, 59, 59);
		HoraExacta h4 = new HoraExacta (2, 0, 0);
		System.out.println(h3);
		System.out.println(h3.equals(h4));
		h3.inc();
		System.out.println(h3);
		System.out.println(h3.equals(h4));
	}

}
