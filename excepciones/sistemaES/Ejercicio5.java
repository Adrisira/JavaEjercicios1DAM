package sistemaES;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		File fich = new File("numeros.txt");
        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;

        try {
            Scanner sc = new Scanner(fich);
            while (sc.hasNext()) {
                int num = sc.nextInt();
                if (num < menor) {
                    menor = num;
                }
                if (num > mayor) {
                    mayor = num;
                }
            }
            sc.close();
            System.out.println("El menor numero es: " + menor);
            System.out.println("El mayor numero es: " + mayor);
        } catch (FileNotFoundException e) {
        	System.out.println(e.getMessage());
        }

	}

}
