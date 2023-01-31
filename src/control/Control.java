package control;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		String cuerpoCeleste = "";
		String nombreCuerpoCeleste = "";
		String nombreSatelite = "";
		String rotacionSatelite = "";
		String nombreCuerpoMaxCercanoSol = "";
		double distanciaSol = 0;
		int diametroCuerpoCeleste = 0;
		int numSatelites = 0;
		int diametroSateliteEstrella = 0;
		int diametroSatelitePlaneta = 0;
		int contadorSatelitesPlaneta = 0;
		float porcentajePlanetaSatelite = 0;
		int numSatelitesPlaneta = 0;
		double cuerpoMaxCercanoSol = Integer.MAX_VALUE;
		int contadorDiametros = 0;
		float resMediaDiametros = 0;
		int cuerpoCelesteMaxGrande = Integer.MIN_VALUE;
		int contadorPlaneta = 0;
		int sumTotalDiametroEstrella = 0;
		int sumTtotalDiametroPlaneta = 0;
		int sumTotalDiametros = 0;
		Scanner sc = new Scanner(System.in);
		while (!cuerpoCeleste.equals("fin")) {
			System.out.println(
					"Dime el tipo de cuerpo celeste que vas a introducir(Tienes estas tresopciones: estrella, planeta agujero):");
			cuerpoCeleste = sc.next();
			if (cuerpoCeleste.equals("fin")) {
				break;
				// Se que no te gusta pero no me acuerdo de otra manera, si me da tiempo lo
				// intento arreglar
			}
			System.out.println("Dime el nombre del cuerpo celeste:");
			nombreCuerpoCeleste = sc.next();
			System.out.println("Dime la distancia al sol de este cuerpo celeste:");
			distanciaSol = sc.nextDouble();
			System.out.println("Dime el diametro del cuerpo celeste:");
			diametroCuerpoCeleste = sc.nextInt();
			contadorDiametros++;
			if (cuerpoCeleste.equals("estrella")) {
				System.out.println("Dime el numero de satelites:");
				numSatelites = sc.nextInt();
				for (int i = 1; i <= numSatelites; i++) {
					System.out.println("Dime el nombre del satelite " + i + ":");
					nombreSatelite = sc.next();
					System.out.println("Dime el diametro del satelite " + i + ":");
					diametroSateliteEstrella = sc.nextInt();
					contadorDiametros++;
					System.out.println("¿Tiene el satelite rotacion sincrona?");
					rotacionSatelite = sc.next();
					sumTotalDiametroEstrella = diametroSateliteEstrella + sumTotalDiametroEstrella;
				}
			}
			if (cuerpoCeleste.equals("planeta")) {
				contadorPlaneta++;
				System.out.println("Dime el numero de satelites:");
				numSatelitesPlaneta = sc.nextInt();
				if (numSatelitesPlaneta > 0) {
					contadorSatelitesPlaneta++;
				}
				for (int i = 1; i <= numSatelitesPlaneta; i++) {
					System.out.println("Dime el nombre del satelite " + i + ":");
					nombreSatelite = sc.next();
					System.out.println("Dime el diametro del satelite " + i + ":");
					diametroSatelitePlaneta = sc.nextInt();
					contadorDiametros++;
					System.out.println("¿Tiene el satelite rotacion sincrona?");
					rotacionSatelite = sc.next();
					sumTtotalDiametroPlaneta = diametroSatelitePlaneta + sumTtotalDiametroPlaneta;
					// Se que este codigo esta repetido, si me da tiempo lo cambio y lo pongo bien.
				}
			}
			if (cuerpoMaxCercanoSol > distanciaSol) {
				cuerpoMaxCercanoSol = distanciaSol;
				nombreCuerpoMaxCercanoSol = nombreCuerpoCeleste;
			}
			sumTotalDiametros = (diametroCuerpoCeleste + sumTtotalDiametroPlaneta + sumTotalDiametroEstrella)
					+ sumTotalDiametros;
			if (distanciaSol < 230000000) {
				if (cuerpoCelesteMaxGrande < diametroCuerpoCeleste) {
					cuerpoCelesteMaxGrande = diametroCuerpoCeleste;
				}
			}

		}
		sc.close();
		porcentajePlanetaSatelite = (contadorSatelitesPlaneta * 100f) / contadorPlaneta;
		System.out.println("El porcentaje de planetas que tienen satelites es " + porcentajePlanetaSatelite + "%");
		System.out.println("El nombre del cuerpo celeste mas cercano al sol es: " + nombreCuerpoMaxCercanoSol);
		// La verdad nose porque esto me da mal
		resMediaDiametros = (float) sumTotalDiametros / contadorDiametros;
		System.out.println(
				"El diametro medio de todos los cuerpos celestes incluyendo a los satelites es: " + resMediaDiametros);
		System.out.println(
				"El diametro del cuerpo celeste mas grande entre los que están a menos de 230000000 de distancia del sol es: "
						+ cuerpoCelesteMaxGrande);
	}
}
