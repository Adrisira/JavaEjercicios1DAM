package boletin1;


public class Ejercicio12 {

	public static void main(String[] args) {
		int num = 5;
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Dime un numero: ");
		//num = sc.nextInt();
		System.out.println(factorial(num));
		//sc.close();
	}
	public static int factorial(int num) {
		int resultado;
		if (num == 0) {
			resultado = 1;
		} else {
			resultado = num * factorial(num - 1);
		}
	return(resultado);
	}
}
