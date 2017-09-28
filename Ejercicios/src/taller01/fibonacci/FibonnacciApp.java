package taller01.fibonacci;

import java.util.Scanner;

public class FibonnacciApp {

	public static void main(String[] args) {

		Scanner scanNumber = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		int  number = scanNumber.nextInt();
		
		
	Fibonnacci fibonnacci= new Fibonnacci();
	
		if (number<100){
			System.out.println( fibonnacci.calculateFibonacci(number));
		} else {
			System.out.println( "Debe ser menor que 100");
			
		}
	}

}
