package com.geometria.business;

public class Cilindro extends Figura{
	
	private float area;
	
	public float calculaArea(float r){
		
		Cilindro cilindro = new Cilindro();
		
		area = cilindro.getRadio();
		
		return area;
	}

}
