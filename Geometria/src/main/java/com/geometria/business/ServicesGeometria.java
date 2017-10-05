package com.geometria.business;

import javax.ejb.Stateless;

import com.geometria.domain.Cilindro;
import com.geometria.domain.*;



@Stateless
public class ServicesGeometria {
	
	
	public Geo  calcularCubo(float arista, String imagen){
		
		
		Cubo cubo = new Cubo();
		
		cubo.setArista(arista);
		
		float area = cubo.calculaArea();
		float volumen = cubo.calculaVolumen();
		
		
		return new Geo(area, volumen,imagen);
		
	}
	
	
	public Geo  calcularCilindro(float altura, float radio, String imagen){
		
		

		Cilindro cilindro = new Cilindro();
		
		cilindro.setAltura(altura);
		cilindro.setRadio(radio);
		
		float area = cilindro.calculaArea();
		float volumen = cilindro.calculaVolumen();
		
		
		
		return new Geo(area, volumen,imagen);
		
	}

	public Geo  calcularEsfera(float radio, String imagen){
		
		
		Esfera esfera = new Esfera();

		esfera.setRadio(radio);
		
		float area = esfera.calculaArea();
		float volumen = esfera.calculaVolumen();
		
		return new Geo(area, volumen,imagen);
		
	}

	
	public Geo CalcularCono (float altura, float radio, float generatriz, String imagen){
		
		Cono cono = new Cono();
		
	 
		cono.setAltura(altura);
		cono.setRadio(radio);
		cono.setGeneratriz(generatriz);
		
		float area = cono.calculaArea();
		float volumen = cono.calculaVolumen();
		
	 

		return new Geo(area, volumen,imagen);
	}
	

	//Clase interna
	
	public static class Geo{
		
		public final float area;
		public final float volumen;
		public final String  imagen;
		
		public Geo(float area, float volumen, String imagen) {
			super();
			this.area = area;
			this.volumen = volumen;
			this.imagen = imagen;
		}
		
		
		
	}
	

}
