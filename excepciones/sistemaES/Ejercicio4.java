package sistemaES;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {

	public static void main(String[] args) {
//		Realizar un programa que lea un fichero de texto llamado carta.txt,
//		tenemos que contar los caracteres, las líneas y las palabras. Para facilitar el
//		procesamiento supondremos que cada palabra está separada de otra por un único
//		espacio en blanco.
		
		int numCarac = 0;
		int numPala = 0;
		int numLineas = 0;

		try (BufferedReader br = new BufferedReader(new FileReader("carta.txt"))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				numCarac += linea.length();
				numPala += linea.split(" ").length;
				numLineas++;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Numero de caracteres: " + numCarac);
		System.out.println("Numero de palabras: " + numPala);
		System.out.println("Numero de lineas: " + numLineas);

	}

}
