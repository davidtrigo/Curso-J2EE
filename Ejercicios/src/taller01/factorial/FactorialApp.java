package taller01.factorial;

import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		
		Scanner scanNumber = new Scanner(System.in);
		System.out.println("Introduzca un n�mero entero");	
		int  number = scanNumber.nextInt();
		
		
		Factorial factorial = new Factorial();
		
		System.out.println(  factorial.calculateFactorial(number));
		

	}

}
