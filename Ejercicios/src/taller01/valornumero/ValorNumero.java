package taller01.valornumero;

public class ValorNumero {
	
	int var1;
	

	public ValorNumero(int var1) {
		
		this.var1 = var1;
	}

	public ValorNumero() {
		
	}

	
	public String tipoNumero(int var1){
		String result ="";
		
		
		if (var1 >0) {
			
			result ="el valor "+var1+" es positivo";
			
		}else if (var1 == 0){
			result ="el valor "+var1+" es igual que cero";
			
		}else {
			
			result ="el valor "+var1+" es negativo";
		}
		
		
		
		return result;
	}


}
