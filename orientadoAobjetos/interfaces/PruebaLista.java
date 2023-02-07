package interfaces;

public class PruebaLista {

	public static void main(String[] args) {
		Lista l1 = new Lista();
		System.out.println(l1);
		l1.addPrincipio(8);
		l1.addFinal(-1);
		System.out.println(l1);
		l1.eliminarElemento(0);
		System.out.println(l1);
		
		Lista l2 = new Lista();
		l2.addPrincipio(1);
		l2.addFinal(3);
		l2.addFinal(4);
		System.out.println(l2.getIndexOf(1));
		System.out.println(l2);
		l2.eliminarElemento(0);
		l1.addLista(l2);
		System.out.println(l2);
		System.out.println(l1);
		
		System.out.println(l1.getIndexOf(1));

	}

}
