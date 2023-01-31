package Boletin4;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		int arbol1, contador = 1, arbol2, contador2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un arbol: ");
		arbol1 = sc.nextInt();
		/*  Ejemplo de como guardar una variable en otra para que se guarde el valor*/
		arbol2 = arbol1;
		contador2 = contador;
		while (arbol1 != -1) {
			if (arbol1 > arbol2) {
				arbol2 = arbol1;
				contador2 = contador;
			}
			System.out.print("Dime un arbol: ");
			arbol1 = sc.nextInt();
			contador++;
		}
		System.out.println("Arbol mas grande " + contador2 + " centimetros" + arbol2);
		sc.close();
	}
}
