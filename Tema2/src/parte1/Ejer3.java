package parte1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// Creamos la variable número que puede ser decimal, y otro número que será el
		// cuadrado de este
		float num;
		float num2;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número
		System.out.println("Introduzca número decimal");
		// Lo leemos
		num = sc.nextFloat();
		// Ahora hacemos que ese número se multiplique por ese mismo, si su valor
		// aumenta no será uno de ellos,
		// si su valor se queda igual tampoco, si es 0 tampoco y si es menor sí, pero es
		// al contrario con los negativos
		num2 = num * num;
		if (num >= 0) {
			if (num2 < num && num != 0) {
				// Imprimimos por pantalla
				System.out.println(num + " es un número casi 0");
			} else {
				// Imprimimos por pantalla
				System.out.println(num + " no es un número casi 0");
			}

		} else {
			if (num2 > num && num != 0) {
				// Imprimimos por pantalla
				System.out.println(num + " es un número casi 0");
			} else {
				// Imprimimos por pantalla
				System.out.println(num + " no es un número casi 0");
			}
		}

		// Cerramos el escáner
		sc.close();
	}
}
