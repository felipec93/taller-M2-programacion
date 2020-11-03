
package tallerjava;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		int numero1, numero2, salario, descuento, valorapagar;

		Scanner leer = new Scanner(System.in);
		System.out.println("lea el valor de salario de pedro ");
		numero1 = leer.nextInt();
		System.out.println("lea valor de descuento ");
		numero2 = leer.nextInt();

		salario = numero1;
		descuento = numero2;

		valorapagar = salario - descuento;

		System.out.println("leer valor a pagar a pedro: $" + valorapagar);
		// segundo salario

		System.out.println("lea el valor de salario de marta ");
		numero1 = leer.nextInt();
		System.out.println("lea valor de descuento ");
		numero2 = leer.nextInt();

		salario = numero1;
		descuento = numero2;

		valorapagar = salario - descuento;

		System.out.println("leer valor a pagar a marta:$" + valorapagar);
		// tercero salario

		System.out.println("lea el valor de salario de jose ");
		numero1 = leer.nextInt();
		System.out.println("lea valor de descuento ");
		numero2 = leer.nextInt();

		salario = numero1;
		descuento = numero2;

		valorapagar = salario - descuento;

		System.out.println("leer valor a pagar de jose:$" + valorapagar);

	}
}
