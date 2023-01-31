package Boletin5;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		//Un país centroamericano se encuentra dividido en cuatro regiones autonómicas. La
		//región número 1 tiene 10 provincias, la número 2 tiene 4 provincias, la 3 tiene 6 provincias,
		//y la 4 sólo 1 provincia. Se pretende contabilizar los votos que se han efectuado en una de
		//las autonomías. Realiza un programa en Java que:
		//- Pida el número de región del que se van a introducir datos (sólo se van a introducir
		//datos de una autonomía).
		//- Pedir, para cada provincia de esa región, el nombre de la provincia, el número de
		//votos obtenido por el partido “A”, número de votos del partido “B”, y número de
		//abstenciones.
		//- Debe mostrarse al final: Porcentaje de votos totales y de abstención en la región.
		//Nombre de la provincia donde el partido “A” ha obtenido más votos, y donde el
		//partido “B” ha obtenido más votos. Si en alguna provincia el número de
		//abstenciones es mayor de 100.000, debe mostrarse al final el mensaje: “Alta
		//abstención”.
		int region;
		int numProvincias = 0;
		int numVotosA;
		int numVotosB;
		int numAbstenciones;
		int votosTotales = 0;
		int abstencionTotal = 0;
		int poblacionTotal = 0;
		float porcentajeVotos = 0;
		float porcentajeAbstencion = 0;
		int maxVotosA = Integer.MIN_VALUE;
		int maxVotosB = Integer.MIN_VALUE;
		boolean conAbstenciones = false;
		String nombreA = " ";
		String nombreB = " ";
		String nombre;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el numero de la region:");
		region = sc.nextInt();
		switch(region) {
		case 1:
			numProvincias = 10;
			break;
		case 2:
			numProvincias = 4;
			break;
		case 3:
			numProvincias = 6;
			break;
		case 4:
			numProvincias = 1;
			break;
		}
		for (int i = 1; i <= numProvincias; i++) {
			System.out.println("Dime el nombre de la provincia " + i);
			nombre = sc.next();
			System.out.println("Dime el numero de votos del partido A:");
			numVotosA = sc.nextInt();
			System.out.println("Dime el numero de votos del partido B:");
			numVotosB = sc.nextInt();
			System.out.println("Dime el numero de abstenciones:");
			numAbstenciones = sc.nextInt();
			votosTotales = numVotosA + numVotosB + votosTotales;
			abstencionTotal = numAbstenciones + abstencionTotal;
			if (numVotosA > maxVotosA) {
				maxVotosA = numVotosA;
				nombreA = nombre;
			}
			if (numVotosB > maxVotosB) {
				maxVotosB = numVotosB;
				nombreB = nombre;
			}
			if (numAbstenciones > 100000) {
				conAbstenciones = true;
			}
		}
		poblacionTotal = votosTotales + abstencionTotal;
		porcentajeVotos = (votosTotales * 100.0f ) / poblacionTotal;
		porcentajeAbstencion = (abstencionTotal * 100.0f) / poblacionTotal;
		System.out.println("El porcentaje de votos de la region es: " + porcentajeVotos + "%.");
		System.out.println("El porcentaje de abstenciones de la region es: " + porcentajeAbstencion + "%.");
		System.out.println("La pronvincia donde el partida A ha obtenido mas votos es " + nombreA);
		System.out.println("La pronvincia donde el partida B ha obtenido mas votos es " + nombreB);
		if (conAbstenciones == true) {
			System.out.println("Alta abstencion");
		}
		sc.close();
	}

}
