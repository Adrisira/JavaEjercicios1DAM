package interfaces;

public class PilaTablaMain {

	public static void main(String[] args) {
		PilaTabla p1 = new PilaTabla();
		p1.apilar(1);
		p1.apilar(2);
		p1.apilar(3);
		p1.apilar(4);
		p1.apilar(5);
		p1.apilar(6);
		p1.apilar(7);
		p1.apilar(8);
		p1.apilar(9);
		p1.apilar(1);
		p1.apilar(2);
		System.out.println(p1);
		p1.desapilar();
		p1.desapilar();
		System.out.println(p1);
		p1.apilar(3);
		p1.apilar(4);
		System.out.println(p1);
		

	}

}
