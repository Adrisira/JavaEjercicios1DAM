package boletin1;

public class EEj3 extends VocalException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public EEj3(String mensaje) {
		super(mensaje);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		char letra = 'a';
	    try {
	        comprobarVocal(letra);
	    } catch (Throwable e) {
	        System.out.println("Se ha producido un error: " + e.getMessage());
	    }

	}
	public static void comprobarVocal(char letra) throws VocalException {
	    if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
	        throw new VocalException("La letra " + letra + " no es una vocal");
	    } else {
	        System.out.println("La letra " + letra + " es una vocal");
	    }
	}
	


}
