package taller01.factorial;

public class Factorial {
	
	
	private int num;
		

	public Factorial() {
		 
	}

	public Factorial(int num) {
	 
		this.num = num;
	}



	public int calculateFactorial(int num){
		
		int factorial=0;
		
		  int resultado = 1;
	        for (int i = 1; i <= num; i++) {
	            resultado *= i;
	        }
	        return resultado;
	}

}
