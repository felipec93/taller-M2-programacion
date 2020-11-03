package tallerjava;

import java.util.Scanner;

public class ejercicioo11 {
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

		double sueldo, horaextra,total, valordehora, numerodehoras, valordehoraextra;

		//System.out.println("insertar horas extras");
		//valordehoraextra = leer.nextDouble();
		System.out.println(" inserte cantidad de horas extras");
		horaextra = leer.nextDouble();
		System.out.println(" inserte numero horas legales trabajadas  ");
		numerodehoras = leer.nextDouble();

		valordehora = 3200;
		
		sueldo = valordehora * numerodehoras;

		valordehoraextra =horaextra * valordehora * 1.2;
		
        total = sueldo + valordehoraextra;
        
		System.out.println("valor a pagar" + sueldo);
		System.out.println("valor horas extra" + valordehoraextra);
		System.out.println("valor pagado total"+total);
	}

}
