package taller01.mayorde3;

public class Comparacion {

	private  int var1;
	private  int var2;
	private  int var3;
	
	
	public Comparacion(int var1, int var2, int var3){
		this.var1= var1;
		this.var2= var2;
		this.var3= var3;

	}
	
	
	public Comparacion(){
	 

	}
	
	public String compararNumeros(int var1, int var2, int var3){
		
			String result;
			
		 if(var1 > var2 && var1 > var3){
			result ="El numero mayor es " + var1;
		}else{
		    if(var1 > var1 && var2 > var3){
		    result ="El numero mayor es " + var2;
		}else{
		    result ="El numero mayor es " + var3;
		    }
		}
		return result;
		
	} 
	
	
	
	
}
