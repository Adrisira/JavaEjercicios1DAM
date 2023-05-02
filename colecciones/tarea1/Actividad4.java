package tarea1;

import java.util.ArrayList;
import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		//Utilizar hashSet para saber cual se esta introduciendo, si se rrepite se introduce en el array de repetidos y si no en el otro array
		//Sin terminar
		System.out.println("Introduce una frase: ");
		Scanner sc = new Scanner (System.in);
		String palabraString = sc.nextLine();
		palabraString.split(palabraString);
		
		ArrayList<String> listaFrase = new ArrayList <>();
		listaFrase.add(palabraString);
		System.out.println(palabraString);
		sc.close();
	}

}
