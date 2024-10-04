package parte1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// Creamos la variable número
		int num;
		// Creamos la variable resto
		int resto;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos un número al usuario
		System.out.println("Introduzca número entero:");
		// Lo leemos por pantalla
		num = sc.nextInt();
		// Creamos la condición que si el resto de dividir el número entre dos es cero.
		resto = num % 2;
		if (resto == 0) {
			// Si es cierto se imprime por pantalla que es par
			System.out.println(num + " es par");
		} else {
			// Si no lo es imprimimos que es impar
			System.out.println(num + " es impar");
		}
		// Cerramos el escáner
		sc.close();
	}
}