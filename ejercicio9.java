package tallerjava;

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
      
		double valorhoratrabajada,horastrabajadas,salario,porcentajehoraextra,salariototal,segurosocial, numeroextras;
		
		

		
		System.out.println("valor hora trabajada ");
		valorhoratrabajada = leer.nextInt();
		System.out.println("digite las horas normales");
		horastrabajadas= leer.nextInt();
		System.out.println("digite las horas extras");
		numeroextras= leer.nextInt();
		
		
		
		salario = valorhoratrabajada * horastrabajadas;
		porcentajehoraextra = numeroextras * (valorhoratrabajada * 1.5);
		segurosocial= salario * 0.12;
		//valor = 12 / 100;
		salariototal= (salario + porcentajehoraextra) - segurosocial;
		
		
		System.out.println("salario basico  "+salario);
		System.out.println("valor horas extras"+porcentajehoraextra);
		System.out.println("descuento por seguro social " + segurosocial);
		System.out.println("salario neto a pagar "+salariototal);
		
		
		
		
	}
}
