package Boletin5;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Un grupo de biólogos está realizando un trabajo de campo, tomando medidas de
		// árboles
		// de un bosque. Una vez tomados los datos, deben introducirlos en un ordenador.
		// Los datos
		// que han tomado de los árboles son: Tipo del árbol (A o B), diámetro del
		// tronco y altura en
		// metros. Además, si el árbol es de tipo B, se dispone de la edad del mismo en
		// años. Realizar
		// un programa en Java que:
		// - Pida el número de árboles de los que se van a introducir datos.
		// - Para cada árbol, debe pedir el tipo, diámetro y altura; si es tipo B
		// además, la edad.
		// - Debe mostrarse al final: Media de las alturas de los árboles. Altura
		// máxima,mínima, diámetro máximo y mínimo. Media de las edades de árboles del
		// tipo B.
		// Si existe algún árbol de más de 30 m., debe indicarse al final con el
		// mensaje:
		// “Existen árboles de más de 30 m.”
		String tipo;
		boolean altura = false;
		int diametro;
		int alturaMetros = 0;
		int edad = 0;
		float mediaEdad;
		int contEdad = 0;
		int numEdades = 0;
		int numArboles;
		int contNumArboles = 0;
		float mediaAltura;
		int alturaMaxima = Integer.MIN_VALUE;
		int alturaMinima = Integer.MAX_VALUE;
		int diametroMaximo = Integer.MIN_VALUE;
		int diametroMinimo = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el numero de arboles que vas a introducir:");
		numArboles = sc.nextInt();
		for (int i = 1; i <= numArboles; i++) {
			System.out.println("Dime el tipo de arbol");
			tipo = sc.next();
			if (tipo.equals("B")) {
				System.out.println("Dime la edad del arbol:");
				edad = sc.nextInt();
				numEdades ++;
				contEdad = edad + contEdad;
			}
			System.out.println("Dime el diametro:");
			diametro = sc.nextInt();
			System.out.println("Dime la altura en metros:");
			alturaMetros = sc.nextInt();
			contNumArboles = alturaMetros + contNumArboles;
			if (alturaMetros > alturaMaxima) {
				alturaMaxima = alturaMetros;
			}
			if (alturaMetros < alturaMinima) {
				alturaMinima = alturaMetros;
			}
			if (diametro > diametroMaximo) {
				diametroMaximo = diametro;
			}
			if (diametro < diametroMinimo) {
				diametroMinimo = diametro;
			}
			if (alturaMetros > 30) {
				altura = true;
			}
		}
		mediaAltura = contNumArboles /(float) numArboles;
		mediaEdad = contEdad / (float) numEdades;
		System.out.println("La altura media es " + mediaAltura);
		System.out.println("La altura maxima es: " + alturaMaxima);
		System.out.println("La altura minima es: " + alturaMinima);
		System.out.println("El diametro maximo es " + diametroMaximo);
		System.out.println("El diametro minimo es " + diametroMinimo);
		System.out.println("La edad media de los arboles es: " + mediaEdad);
		if (altura == true) {
			System.out.println("Existen arboles de mas de 30 m");
		}
		sc.close();
}

}
