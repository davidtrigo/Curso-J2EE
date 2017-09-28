package taller01.paroimpar;

import java.util.Scanner;

public class ParImparApp {
	
	public static void main(String[] args) {
		

		
	Scanner scanNumber = new Scanner(System.in);
	
	System.out.println("Introduzca un número entero");
		
	int  number = scanNumber.nextInt();
		
		ParImpar num = new ParImpar(number);

		try {
			
			//ParImpar num = new ParImpar(5); 
			
			if ((num.isPar())==true) {
				System.out.println("El numero introducido es par");
			} else {
				System.out.println("El numero introducido es impar");
			}	
			
			
		} catch (Exception e) {
		
			System.err.println("Ha ocurrido un error");	
			
		}
		
		
	} 
	
}
