package com.geometria.domain;

public class Cilindro extends Figura{
	
	 	
	
	public float calculaArea(){
		
		float r = this.getRadio();
		float h = this.getAltura();
		

		float aT = (float) ((2 * Math.PI*r)*(h+r));
		
		return aT;
	}

	public float calculaVolumen(){
	 
		
		float r = this.getRadio();
		float h = this.getAltura();
			
		float	v = (float) (Math.PI *r* r * h);
		
		return v;
	}
}
