package com.geometria.business;

public class Cubo extends Figura{
	
	
	
public float calculaArea(){
		
 
		
		float arista = this.getArista();
		
		
		float aT = (6*(arista*arista));
		
		return aT;
	}

	public float calculaVolumen(){
	 
		 

		float arista = this.getArista();
		
		float	v = arista *arista*arista;
		
		return v;
	}

}
