package boletin1;


public class Ejercicio11r2 {

	public static void main(String[] args) {
		int exponente = 3;
		int base = 9;
		System.out.println(potenciaRecursiva(base, exponente));

	}
	public static int potenciaRecursiva(int base, int exponente){
		int res;
		if (exponente == 0)  {
			res = 1;
		} else {
			res = base * potenciaRecursiva(base, exponente -1);
		}
	return(res);
}
}
