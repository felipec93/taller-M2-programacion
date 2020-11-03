package tallerjava;
import java.util.Scanner;
public class ejercicio11absoluto {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
	int absoluto, total, numero1;
	
	System.out.println(" Difite el numero para darle el valor absoluto ");
	numero1 = leer.nextInt();
	
	absoluto = numero1;
	
	
	if (absoluto < 0) {
		
		
		total = absoluto * (-1);
	 
	} else {
	  total = absoluto * 1;
	}
	 System.out.println("Numero normal : "+absoluto);
	 System.out.println("El numero absoluto es : "+total);
	}
	
}
