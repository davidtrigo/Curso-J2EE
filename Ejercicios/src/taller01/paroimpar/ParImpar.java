package taller01.paroimpar;

// Indica al usuario  si un numero es par o impar


public class ParImpar {
		
		private  int var1;
		
		
	public ParImpar(int var1){
		
		this.var1= var1;
		
	}
		
	public boolean isPar(){		
		boolean result = false;
	  
		if ((var1 % 2) ==0)
			result = true;
		return result;		
	} 
		

}
