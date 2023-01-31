package examenes;

import java.util.Scanner;

public class Examen20212 {

	public static void main(String[] args) {
		final int MES = 11;
		final int MAX = 20;
		float[][] sucursal = new float[MES][MAX];
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
				break;
			case 2: 
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			}
		}

	}

}
