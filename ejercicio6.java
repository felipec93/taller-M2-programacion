package tallerjava;

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {

		double numero1, numero2, costo, pago, regreso;

		Scanner leer = new Scanner(System.in);

		System.out.println("lea valor de costo ");
		numero1 = leer.nextDouble();

		System.out.println("lea valor de pago");
		numero2 = leer.nextDouble();

		costo = numero1;
		pago = numero2;
		regreso = pago - costo;

		System.out.println("leer valor a devolver:" + regreso);

		// pago2

		System.out.println("lea valor de costo ");
		numero1 = leer.nextDouble();

		System.out.println("lea valor de pago");
		numero2 = leer.nextDouble();

		costo = numero1;
		pago = numero2;

		regreso = pago - costo;

		System.out.println("leer valor a devolver:" + regreso);

	}

}
