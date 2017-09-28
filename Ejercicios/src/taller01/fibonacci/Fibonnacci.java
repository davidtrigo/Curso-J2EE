package taller01.fibonacci;

public class Fibonnacci {

	public Fibonnacci() {
	}


	public int calculateFibonacci(int numero){
			
			int result=0;
			int var1=1;
			int temp;
			 
			 for(int i=1;i<=numero;i++){
				 
			     temp=result+var1;
			     var1=result;
			     System.out.println(var1);
			     result=temp;
			 }
	
		return result;
	}
	
	
	public static int[] fibonacci(int n){
		
		int result=0;
		int var1=1;
		int temp;
		int numero=0;
		
		for(int i=1;i<=numero;i++){
			 
		     temp=result+var1;
		     var1=result;
		     System.out.println(var1);
		     result=temp;
		 }
		
		
		return null;		 
	}
	
	
	
}

