package interfaces;

import java.util.Arrays;

public class MainMascota {

	public static void main(String[] args) {
		Mascota[] mascotas= {
				new Perro("Alan", 2, Origen.CALLE, true),
				new Gato("Misifu", 5, Origen.ASOCIACION, 8),
				new Perro("Oliver", 4, Origen.CALLE, false),
				new Gato("Bizcocho", 10, Origen.OTRODUEÑO, 12),
				new Perro("Bolido", 2, Origen.ASOCIACION, true)
		};
		Arrays.sort(mascotas);
		System.out.println(Arrays.toString(mascotas));
		
		Arrays.sort(mascotas, new OrdenacionMascotasPorEdad());
		System.out.println(Arrays.toString(mascotas));
		
		

	}

}
