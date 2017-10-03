package com.geometria.business;

public class Cono extends Figura {
 
	
public float calculaArea(){
		
	 
		
		float r = this.getRadio();
		float g = this.getGeneratriz();
		
		float aT =  (float) ((Math.PI*r) *(g+r));
		
		return aT;
	}

	public float calculaVolumen(){
		

		 
		
		float r = this.getRadio();
		float h = this.getAltura();
		
		
		
	float	v = (float) ((Math.PI*r *r * h)/3);
		
		return v;
	}
	
	

}
