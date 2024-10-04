package parte1;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// Creamos la variable número 1 para comprararlo con la otra variable, número 2
		int num1;
		int num2;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos el primer número
		System.out.println("Introduzca primer número");
		// Lo leemos por pantalla
		num1 = sc.nextInt();
		// Pedimos el segundo número
		System.out.println("Introduzca segundo número");
		// Lo leemos por pantalla
		num2 = sc.nextInt();
		// Comparamos los números con la condición if-else, si son iguales va al if y si
		// no prosigue
		if (num1 == num2) {
			// Imprimimos por pantalla el resultado
			System.out.println("Los números son iguales");
		} else {
			// Imprimimos por pantalla el resultado
			System.out.println("Los números no son iguales");
			//Cerramos el escáner
			sc.close();
		}

	}
}
