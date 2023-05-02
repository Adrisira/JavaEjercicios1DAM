package sistemaES;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3_v1 {

	public static void main(String[] args) {
		// Crear un programa que duplique el conenido de un fichero.
		// Duplicaremos el fichero original.txt en uno que se llame copia.txt
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el nombre y la extension del archivo que quieres duplicar: ");
		String nombreArchivo = sc.next();
		String texto = "";
		try {
			File fich = new File(nombreArchivo);
			FileReader in;
			BufferedWriter out = new BufferedWriter(new FileWriter("copia.txt"));
			if (fich.exists()) {
				fich = new File(nombreArchivo);
				in = new FileReader(fich);
				int c = in.read();
				while (c != -1) {
					texto = texto + (char) c;
					c = in.read();
					
				}
				out.write(texto);
				in.close();
				out.close();

			}

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		sc.close();
	}

}
