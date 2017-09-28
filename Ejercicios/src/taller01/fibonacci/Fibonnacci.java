package taller01.fibonacci;

public class Fibonnacci {

	public Fibonnacci() {
	}


	public String calculateFibonacci(int numero){
			
		int result=0;
		int n=1;
		int temp;
		String line="";
		 
 
			
		if ((numero==0)|| (numero == 1)){
			
			return "La sucesión Fibonacci no puede ser ni 0 ni 1";
		}else{
				 for(int i=1;i<=numero;i++){
						 
				     temp=result+n;
				     n=result;
				     result=temp;
				
				     line+=" "+result;
				     
				 }
			}

		return "La secuencia Fibonacci de "+numero+" es: "+line;	
	}	

	
}

