package com.geometria.business;

public class Cilindro extends Figura{
	
	
	public float calculaArea(){
		
		Cilindro cilindro = new Cilindro();
		
		float r = cilindro.getRadio();
		float h = cilindro.getAltura();
		
		float aT = (float) ((2 * Math.PI*r)*(h+r));
		
		return aT;
	}

	public float calculaVolumen(){
		
		Cilindro cilindro = new Cilindro();
		
		float r = cilindro.getRadio();
		float h = cilindro.getAltura();
		
		
		
	float	v = r * h;
		
		return v;
	}
}
