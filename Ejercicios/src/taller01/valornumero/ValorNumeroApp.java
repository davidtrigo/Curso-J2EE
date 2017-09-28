package taller01.valornumero;

import java.util.Scanner;



public class ValorNumeroApp {

	public static void main(String[] args) {
	
		Scanner scanNumber = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero");
			
		int  number1 = scanNumber.nextInt();
	
	
		ValorNumero valornumero = new ValorNumero();
		
	
		System.out.println(valornumero.tipoNumero(number1));

	}

}
