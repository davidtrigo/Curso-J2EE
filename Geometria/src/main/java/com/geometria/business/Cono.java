package com.geometria.business;

public class Cono extends Figura {

	public Cono() {
		
		
	}
	
	
public float calculaArea(){
		
		Cono cono = new Cono();
		
		float r = cono.getRadio();
		float g = cono.getGeneratriz();
		
		float aT =  (float) ((Math.PI*r) *(g+r));
		
		return aT;
	}

	public float calculaVolumen(){
		

		Cono cono = new Cono();
		
		float r = cono.getRadio();
		float h = cono.getAltura();
		
		
		
	float	v = (float) ((Math.PI*r *r * h)/3);
		
		return v;
	}
	
	

}
