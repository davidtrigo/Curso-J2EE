package taller01.mayorde3;

import java.util.Scanner;

public class ComparacionApp {

	public static void main(String[] args) {

		Scanner scanNumber = new Scanner(System.in);
		
		System.out.println("Introduzca el primer n�mero entero");
			
		int  number1 = scanNumber.nextInt();
	
		System.out.println("Introduzca el segundo n�mero entero");
		
		int  number2 = scanNumber.nextInt();
		
		System.out.println("Introduzca el tercero n�mero entero");
		
		int  number3 = scanNumber.nextInt();
		
		
		
		Comparacion comparar = new Comparacion();
		
		
		System.out.println(comparar.compararNumeros(number1, number2, number3));
	}

}
