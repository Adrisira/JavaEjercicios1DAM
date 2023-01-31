package ejerciciosexamen;

import java.util.Scanner;

public class Pruebaexamen2021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String titulo = "";
		int autorasMasTresLibros = 0;
		String libroMasBarato = "";
		float precioLibroMasBarato = Float.MAX_VALUE;
		String segundoLibroMasBarato = "";
		float precioSegundoLibroMasBarato = Float.MAX_VALUE;
		String tituloMasCaroAutorDosLibros = "";
		int autorasMujeres = 0;
		int autoresHombres = 0;
		float dineroAutor = 0;
		float dineroAutora = 0;
		String sexoMasDineroGastado = "";
		int libroAutoras = 0;
		int libroAutores = 0;
		int autoresMasDeDosLibros = 0;
		float precioMasCaroAutor = Float.MIN_VALUE;

		System.out.println("Indica de cu�ntos autores se introducir�n datos: ");
		int autores = sc.nextInt();

		for (int i = 0; i < autores; i++) {
			System.out.println("Indica el nombre del autor o autora: ");
			String nombre = sc.next();
			System.out.println("Introduce ahora su sexo, siendo M=mujer o H=Hombre");
			String sexo = sc.next();
			if (sexo.equals("H")) {
				autoresHombres=autoresHombres+1;
			} else {
				autorasMujeres=autorasMujeres+1;
			}

			System.out.println(
					"Introduce un t�tulo de libro de este autor, cuando ya no  haya m�s libros, introduce fin: ");
			titulo = sc.next();
			while (!titulo.equals("fin")) {

				System.out.println("Introduce el precio del libro y las unidades vendidas: ");
				float precio = sc.nextFloat();
				if (sexo.equals("H")) {
					dineroAutor++;
				} else {
					dineroAutora++;
				}

				if (dineroAutor > dineroAutora) {
					sexoMasDineroGastado = "H";
				} else {
					sexoMasDineroGastado = "M";
				}

				if (precio < precioLibroMasBarato) {
					precioSegundoLibroMasBarato = precioLibroMasBarato;
					segundoLibroMasBarato = libroMasBarato;

					precioLibroMasBarato = precio;
					libroMasBarato = titulo;

				} else if (precio < precioSegundoLibroMasBarato) {
					precioSegundoLibroMasBarato = precio;
					segundoLibroMasBarato = titulo;
				}

				int unidadesVendidas = sc.nextInt();
				if (sexo.equals("M")) {
					libroAutoras++;
					if (libroAutoras > 3) {
						autorasMasTresLibros++;
					}
				}
				if (sexo.equals("H")) {
					libroAutores++;
					if (libroAutores > 2) {
						if (precio > precioMasCaroAutor) {
							tituloMasCaroAutorDosLibros = titulo;
						}
					}
				}
			System.out.println("Introduce un t�tulo de libro de este autor:");
				titulo = sc.next();	
			}
			

			
}
	
			System.out.println("a)El porcentaje de mujeres es: " + (autorasMujeres * 100) / (autoresHombres+autorasMujeres) + "%");
			System.out.println(
					"b)El sexo del autor en el que m�s dinero se han gastado los clientes es: " + sexoMasDineroGastado);
			System.out.println("c)Hay " + autorasMasTresLibros + " autoras que hayan escrito m�s de 3 libros.");
			System.out.println("d)Los dos libros m�s baratos son: " + libroMasBarato + " y " + segundoLibroMasBarato);
			System.out.println(
					"e)El t�tulo del libro m�s caro entre los escritos por los autores que han escrito m�s de 2 libros es: "
							+ tituloMasCaroAutorDosLibros);
			
			
		sc.close();

	}

}
