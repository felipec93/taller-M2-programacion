package tallerjava;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		int numero1, numero2, resultado1, resultado2;

		Scanner leer = new Scanner(System.in);

		System.out.println("lea el primer numero ");
		numero1 = leer.nextInt();
		System.out.println("lea el segundo numero ");
		numero2 = leer.nextInt();

		resultado1 = numero1 * numero1 * numero1;
		resultado2 = numero2 * numero2 * numero2;

		System.out.println(" El cubo de " + numero1 + " su  cubo es: " + resultado1);
		System.out.println(" El cubo de " + numero2 + " su  cubo es: " + resultado2);
	}

}
