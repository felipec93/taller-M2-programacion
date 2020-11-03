package tallerjava;

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

		int paginas, minutos, numero2;

		System.out.println("minutos utilizados para escribir");
		numero2 = leer.nextInt();
		System.out.println("cantidad de paginas escritas ");
		minutos = leer.nextInt();

		paginas = numero2 * 15 / 30;
		minutos = 30 * 75 / 15;

		System.out.println("cantidad de paginas escritas en dos horas :" + paginas);
		System.out.println("cantidad de minutos utilizados para escribir 75 paginas :" + minutos);

	}

}
