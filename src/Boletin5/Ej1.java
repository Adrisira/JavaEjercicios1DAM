package Boletin5;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// En un centro educativo, en un determinado nivel existen 4 grupos: A, B, C y
		// D. El
		// grupo A tiene 25 alumnos, el B tiene 28, el C tiene 31 y el D tiene 29. Para
		// cada alumno
		// disponemos de las notas del primer, segundo y tercer parcial. Realizar un
		// programa en Java
		// que:
		// - Pida la letra del grupo que se va a introducir (sólo se va a introducir un
		// grupo).
		// - Para ese grupo, pida para cada alumno el nombre, la nota del primer
		// parcial, del
		// segundo y del tercero.
		// - Debe mostrarse al final: El nombre del alumno con mayor nota media (media
		// de los
		// tres parciales). Cuántos alumnos tienen la nota media suspensa. Si existe
		// algún
		// alumno con nota mayor o igual que 9, debe indicarse al final con el mensaje:
		// “Existen sobresalientes”
		int numAlumnos = 0;
		int parcialUno;
		int parcialDos;
		int parcialTres;
		float notaMedia;
		float mediaMax = 0;
		int suspensos = 0;
		boolean sobresalientes = false;
		String nombre;
		String alumnoMaxMedia = "a";
		char clase;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la letra de la clase:" + "La opciones son A, B, C, D");
		clase = sc.next().charAt(0);
		if (clase == ('A')) {
			numAlumnos = 25;
		}
		if (clase == ('B')) {
			numAlumnos = 28;
		}
		if (clase == ('C')) {
			numAlumnos = 31;
		}
		if (clase == ('D')) {
			numAlumnos = 29;
		}
		for (int i = 1; i <= numAlumnos; i++) {
			System.out.println("Dime el nombre del alumno:");
			nombre = sc.next();
			System.out.println("Dime la nota del primer parcial:");
			parcialUno = sc.nextInt();
			System.out.println("Dime la nota del segundo parcial:");
			parcialDos = sc.nextInt();
			System.out.println("Dime la nota del tercer parcial:");
			parcialTres = sc.nextInt();
			notaMedia = (parcialUno + parcialDos + parcialTres / 3.0f);
			if (notaMedia > mediaMax) {
				mediaMax = notaMedia;
				alumnoMaxMedia = nombre;
			}
			if (notaMedia < 5) {
				suspensos++;
			}
			if (notaMedia >= 9) {
				sobresalientes = true;
			}
		}
		System.out.println("El alumno con la mayor nota media es " + alumnoMaxMedia);
		System.out.println("Hay " + suspensos + " con la media suspensa");
		if (sobresalientes == true) {
			System.out.println("Existen sobresaleintes");
		}
		System.out.println("El alumno con la mayor nota media es " + alumnoMaxMedia);
		System.out.println("Hay " + suspensos + " con la media suspensa");
		if (sobresalientes == true) {
			System.out.println("Existen sobresaleintes");
		}
		sc.close();
	}

}
