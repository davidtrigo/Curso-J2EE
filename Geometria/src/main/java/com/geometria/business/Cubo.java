package com.geometria.business;

public class Cubo extends Figura{
	
	
	
public float calculaArea(){
		
		Cubo cubo = new Cubo();
		
		float arista = cubo.getArista();
		
		
		float aT = (6*(arista*arista));
		
		return aT;
	}

	public float calculaVolumen(){
		
		Cubo cubo = new Cubo();
		 

		float arista = cubo.getArista();
		
		float	v = arista *arista*arista;
		
		return v;
	}

}
