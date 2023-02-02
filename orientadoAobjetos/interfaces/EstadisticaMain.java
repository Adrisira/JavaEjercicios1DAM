package interfaces;

import java.util.Arrays;

public class EstadisticaMain {

	public static void main(String[] args) {
		TresEnteros p1 = new TresEnteros(5, 6, 8);
		
		System.out.println(Arrays.toString(p1.mayoresQue(4)));

		Enteros e1 = new Enteros(new Integer [] {1,2,3,4,5});
		System.out.println(e1.mayor());
		System.out.println(e1.menor());
		System.out.println(e1.media());
		
		System.out.println(Arrays.toString(e1.mayoresQue(4)));
		System.out.println(Arrays.toString(e1.menoresQue(4)));
		
		Cadenas c1 = new Cadenas (new String [] {"ee", "bb", "cc", "aa"});
		System.out.println(c1.mayor());
		System.out.println(c1.menor());
		System.out.println(c1.media());
		System.out.println(Arrays.toString(c1.mayoresQue("dd")));
		System.out.println(Arrays.toString(c1.menoresQue("dd")));
	}

}
