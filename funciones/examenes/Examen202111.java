package examenes;

import java.util.Scanner;

public class Examen202111 {

	public static void main(String[] args) {
		final int MAX = 20;
		float[][] sucursal = new float[MAX][MAX];
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1- Introducir transferencia de una a otra sucursal. \r\n"
				+ "2- Monstrar todos los datos introducidos. \r\n"
				+ "3- Monstrar sucursal que ha recibido mas dinero. \r\n"
				+ "4- Monstrar en cuantas sucursales el total de lo enviado supera 10.000€. \r\n" + "5- Finalizar. \r\n"
				+ "");
		opcion = sc.nextInt();
		while (opcion != 5) {
			switch (opcion) {
			case 1:
				System.out.println("Dime la sucursal que envia el dinero");
				int sucursalEnvia = sc.nextInt();
				System.out.println("Dime la sucursal que recibe el dinero");
				int sucursalRecibe = sc.nextInt();
				System.out.println("Dime la cantidad de dinero enviado");
				int dinero = sc.nextInt();
				sucursal[sucursalEnvia][sucursalRecibe] = dinero;
				System.out.println("Datos almacenados");
				break;
			case 2:
				for (int i = 0; i < MAX; i++) {
					for (int j = 0; j < MAX; j++) {
						if (sucursal[i][j] > 0) {
							System.out.println("La sucursal num. " + i + " ha enviado: \r\n" + "a la sucursal " + j + ", "
									+ sucursal[i][j] + "euros.");
						}
					}
				}
				break;
			case 3:
				int suma = 0;
				int sucursalMaxRecibido = 0;
				int maxSuma = Integer.MIN_VALUE;
				for (int i = 0; i < MAX; i++) {
					for (int j = 0; j < sucursal[0].length; j++) {
						suma +=  sucursal[i][j];
						if (suma > maxSuma) {
							maxSuma = suma;
							sucursalMaxRecibido = j;
						}
					}
				}
				System.out.println("La sucursal que mas dinero ha recibido es: " + sucursalMaxRecibido );
				break;
			case 4:
				float sumSuperaDiezMil = 0;
				int contadorSucursalMaxDiezMil = 0;
				for (int i = 0; i < sucursal[0].length; i++) {
					for (int j = 0; j < MAX; j++) {
						sumSuperaDiezMil =  sucursal[i][j];
						if (sumSuperaDiezMil > 10000) {
							contadorSucursalMaxDiezMil++;
						}
					}
				}
				System.out.println("Hay " + contadorSucursalMaxDiezMil + " que superan los 10.000€ enviados.");
				break;
			case 5:
				break;
			}
			System.out.println("1- Introducir transferencia de una a otra sucursal. \r\n"
					+ "2- Monstrar todos los datos introducidos. \r\n"
					+ "3- Monstrar sucursal que ha recibido mas dinero. \r\n"
					+ "4- Monstrar en cuantas sucursales el total de lo enviado supera 10.000€. \r\n"
					+ "5- Finalizar. \r\n" + "");
			opcion = sc.nextInt();
		}
		sc.close();
	}

}
