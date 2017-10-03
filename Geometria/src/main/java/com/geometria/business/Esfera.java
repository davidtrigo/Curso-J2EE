package com.geometria.business;

public class Esfera extends Figura{
	
	
	
public float calculaArea(){
		
	 
		
		float r = this.getRadio();
		
		float aT = (float) ((4 * Math.PI)*(r*r));
		
		return aT;
	}

	public float calculaVolumen(){
		
	 
		
		float r = this.getRadio();
		
		float v= (float) ((4 * Math.PI)*(r*r*r)/3);
 
		return v;
	}

}
