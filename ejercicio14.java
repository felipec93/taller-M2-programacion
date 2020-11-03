package tallerjava;

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println(" 88888888888888888888888888888888888888888 ");
		System.out.println(" -  ___________________________________  +" );
		System.out.println(" + | AUTOR:ANDRES FELIPE BOTINA        | -" );
		System.out.println(" - |         FECHA: 03-noviembre-2020    | +" );
		System.out.println(" + |       PROGRAMA DE ING. INDUSTRIAL | -" );
		System.out.println(" - |              ID:  760728          | +" );
		System.out.println(" + |___________________________________| -" );
		System.out.println(" 88888888888888888888888888888888888888888" );
		
		
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
