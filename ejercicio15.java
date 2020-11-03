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
		
	
		int digiteN, distancia, ninaida, ninavuelta,horasn;
		
		System.out.println("El viaje de la Niña, La Pinta y la Santa Maria : ");
		
		
		distancia = 1200/2;
		
		
		//la niña
		ninaida = distancia / 8;
		ninavuelta = distancia / 12;
		
		horasn = ninaida + ninavuelta;
		System.out.println("Orden de llegada : ");
		System.out.println("Horas totales de la Niña : " + horasn);
		
		//pinta
		
		
		ninaida = distancia / 9;
		ninavuelta = distancia / 11;
		
		horasn = ninaida + ninavuelta;

		System.out.println("Horas totales de la Pinta : " + horasn);
		
		//santa maria
		
		ninaida = distancia / 10;
		ninavuelta = distancia / 8;
		
		horasn = ninaida + ninavuelta;

		System.out.println("Horas totales de la Santa Maria : " + horasn);
		
		
		System.out.println(" ¿Llegaran juntas de nuevo a Buenos Aires? : NO ");
		
		
		
	}
}
