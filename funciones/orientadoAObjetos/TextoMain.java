package orientadoAObjetos;

public class TextoMain {

	public static void main(String[] args) {
		Texto t1 = new Texto(20);
		t1.setCadena("HOla usuario");
		if (t1.anadir(false, 'a')) {
			System.out.println(t1.getCadena());
		}
		if (t1.anadir(true, "amigo")) {
			System.out.println(t1.getCadena());
		}
		System.out.println("El numero de vocales es: " + t1.contadorVocales());
	}

}
