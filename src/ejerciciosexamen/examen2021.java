package ejerciciosexamen;

import java.util.Scanner;

public class examen2021 {

	public static void main(String[] args) {
		int numAutores = 0;
		float precioUnitario = 0;
		float precioUnitarioTotal = 0;
		int unidadesVendidas = 0;
		int contadorMujeres = 0;
		float mediaMujeres = 0;
		float maxDinero = Integer.MIN_VALUE;
		char maxSexoAutores = 'm';
		float dineroTotalGanado = 0;
		int totalUnidadesVendidas = 0;
		int contadorLibros = 0;
		int contadorMujeresLibros = 1; //Supongo que cada autor va a escribir al menos un libro.
		float libroMaxBarato = Integer.MAX_VALUE;
		float segundoLibroMaxBarato = Integer.MAX_VALUE;
		float libroMaxCaro = Integer.MIN_VALUE;
		String nombreAutores = " ";
		String tituloLibro = " ";
		String primeroMaxBarato = " ";
		String segundoMaxBarato = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el numero de autores: ");
		numAutores = sc.nextInt();
		for (int i = 1; i <= numAutores; i++) {
			System.out.println("Dime el nombre del autor " + i);
			nombreAutores = sc.next();
			System.out.println("Dime el sexo del autor " + i + ", el sexo se indica mediante M o H.");
			char sexoAutores = sc.next().charAt(0);
			System.out.println("Dime el titulo del libro del autor " + i +": ");
			tituloLibro = sc.next();
			System.out.println("Dime el precio del libro:");
			precioUnitario = sc.nextFloat();
			System.out.println("Dime el numero de unidades vendias:");
			unidadesVendidas = sc.nextInt();
			while (tituloLibro.equals("fin")==false) {
				precioUnitarioTotal = precioUnitario + precioUnitarioTotal;
				totalUnidadesVendidas = unidadesVendidas + totalUnidadesVendidas;
				dineroTotalGanado = precioUnitarioTotal * totalUnidadesVendidas;
				if (precioUnitario < libroMaxBarato) {
					libroMaxBarato = precioUnitario;
					primeroMaxBarato = tituloLibro;
				}
				
				System.out.println("Dime el titulo del libro del autor " + i +": ");
				tituloLibro = sc.next();
				if (tituloLibro.equals("fin")) {
					break; // Se que no le gusta a la profesora pero era lo mejor 
				}
				contadorLibros++;
				System.out.println("Dime el precio del libro:");
				precioUnitario = sc.nextFloat();
				System.out.println("Dime el numero de unidades vendias:");
				unidadesVendidas = sc.nextInt();
			}
			if (maxDinero < dineroTotalGanado) {
				maxDinero = dineroTotalGanado;
				maxSexoAutores = sexoAutores;
			}
			if (String.valueOf(sexoAutores).equals("M")) {
				contadorMujeres++;
			}
			if (contadorLibros >= 3) {
				contadorMujeresLibros++;
			}
			
		}
		sc.close();
		mediaMujeres = (contadorMujeres * 100.0f) / numAutores;
		System.out.println("La media de mujeres es: " + mediaMujeres + "%.");
		System.out.println("El sexo del autor que mas dinero ha ganado es " + maxSexoAutores);
		System.out.println("El numero de mujeres que han escrito 3 libros o mas es " + contadorMujeresLibros);
		System.out.println("Los dos libros más baratos son " + primeroMaxBarato + " y " +  segundoMaxBarato);
	}

}
