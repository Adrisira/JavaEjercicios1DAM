package sistemaES;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un nombre de un archivo");
		String nombreArchivo = sc.next() + ".txt";
		String texto = "";
		File fich = new File(nombreArchivo);
		if (!fich.exists()) {
			fich = new File("Prueba.txt");
		}
		try (FileReader in = new FileReader(fich);) {

			int c = in.read();
			while (c != -1) {
				texto = texto + (char) c;
				c = in.read();
			}

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(texto);

		sc.close();
	}

}
