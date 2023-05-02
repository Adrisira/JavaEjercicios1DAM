package sistemaES;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
//		Diseñar una aplicación que pida al usuario su nombre y edad. Estos
//		datos deben guardarse en el fichero "datos.txt". Si este fichero existe, debe borrarse
//		su contenido, y en caso de no existir, debe crearse.

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		String nombre = sc.next();
		System.out.println("Dime tu edad");
		int edad = sc.nextInt();
		File fich = new File("datos.txt");

		try (BufferedWriter out = new BufferedWriter(new FileWriter(fich))) {

			out.write("Nombre: " + nombre);
			out.newLine();
			out.write("Edad: " + edad);

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		sc.close();
	}

}
