package tallerjava;

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int hora1,horat,valorhora,horastrabajadas,salario;
		

		
		System.out.println("lea valor de hora trabajada ");
		hora1 = leer.nextInt();
		System.out.println("lea cantida de horas trabajadas");
		horat= leer.nextInt();
		
		valorhora=hora1;
		horastrabajadas = horat;
		salario = valorhora *horastrabajadas;
		
		System.out.println("el valor de salario de pedro es:$"+salario);
		
		
		//lisa
		
		System.out.println("lea valor de  hora trabajada ");
		hora1 = leer.nextInt();
		System.out.println("lea cantida de horas trabajada");
		horat= leer.nextInt();
		
		valorhora=hora1;
		horastrabajadas = horat;
		salario = valorhora *horastrabajadas;
		
		System.out.println("el valor de salario de lisa es:$"+salario);
		
		//carmen
		
		System.out.println("lea valor de hora trabajada ");
		hora1 = leer.nextInt();
		System.out.println("lea cantida de horas trabajada");
		horat= leer.nextInt();
		
		valorhora=hora1;
		horastrabajadas = horat;
		salario = valorhora *horastrabajadas;
		
		System.out.println("el valor de salario de carmen es:$"+salario);
		
	}

}
