package Boletin4;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		/* Se introducirán las edades de los alumnos hasta que una de ellas sea negativa. La aplicación mostrará la suma de las edades, la media, 
		 * de cuántos alumnos hemos introducido su edad, y cuántos alumnos son mayores de edad.**/
		int edades,alumnos,resultadoedades, mayores;
		float media;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce las edades de los alumnos: ");
		edades = sc.nextInt();
		alumnos = 0;
		media = 0;
		mayores = 0;
		resultadoedades = 0;
		while (edades > 0) {
			alumnos++;
			resultadoedades = resultadoedades + edades;
			media++;
			System.out.println("Introduce las edades de los alumnos: ");
			edades = sc.nextInt();
			if (edades > 18) {
				mayores++;
			}
		}
		System.out.println(resultadoedades);
		System.out.println(resultadoedades/(float)media);
		System.out.println(mayores);
		System.out.println(alumnos);
		sc.close();
	}

}
