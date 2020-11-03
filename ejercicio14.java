package tallerjava;

import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		double digiteN, porcentaje, calvin, hobbes,hobbestotal;
		
		System.out.println("digite las N cantidades de aceite de oliva ");
		digiteN = leer.nextInt();
		
		porcentaje = 0.66666667;
		
		hobbes = digiteN;
		
		hobbestotal = hobbes * porcentaje;
		
		calvin = hobbes - hobbestotal;
		
		

		System.out.println("total de aceite : " + digiteN);
		
		System.out.println("Produccion de calvin : " + calvin);

		System.out.println("Produccion de hobbes : " + hobbestotal);
		
		

	}

}
