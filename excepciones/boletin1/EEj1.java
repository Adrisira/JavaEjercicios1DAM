package boletin1;

public class EEj1 {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		int elemento = 6;
		Integer array2[] = {null};
		
		 try {
			 for (int i = 0; i < array.length; i++) {
					if (array2[i] == elemento) {
						System.out.println(i);
					}
				}
		    } catch (NullPointerException e) {
		        System.out.println("El array tiene nulos");
		    } catch (ArrayIndexOutOfBoundsException e) {
		        System.out.println("No existe esa posicion");
		    }

	}

}
