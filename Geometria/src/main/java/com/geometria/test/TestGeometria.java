package com.geometria.test;

import org.junit.Assert;
import org.junit.Test;

import com.geometria.domain.*;

public class TestGeometria {
	
	
	
	@Test
	public void testcubo(){
		
		Cubo cubo = new Cubo();
		cubo.setArista(5);
		
		Assert.assertEquals(150, cubo.calculaArea(),0.1);
		Assert.assertEquals(125, cubo.calculaVolumen(),0.1);
	
	}

	
	@Test
	public void testcilindro(){
		
		Cilindro cilindro = new Cilindro();
		cilindro.setAltura(15);
		cilindro.setRadio(25);
		
		
		Assert.assertEquals(6283.19, cilindro.calculaArea(),0.1);
		Assert.assertEquals(29452.43, cilindro.calculaVolumen(),0.1);
	
	}

	@Test
	public void testEsfera(){
		
		Esfera esfera = new Esfera();
		 
		esfera.setRadio(35);
		
		
		Assert.assertEquals(15393.80, esfera.calculaArea(),0.1);
		Assert.assertEquals(179594.38, esfera.calculaVolumen(),0.1);
	
	}

	
	@Test
	public void testCono(){
		Cono cono = new Cono();
		
		 
		cono.setAltura(6);
		cono.setRadio(5);
		cono.setGeneratriz(12);
		
		
		Assert.assertEquals(267.04, cono.calculaArea(),0.1);
		Assert.assertEquals(157.08, cono.calculaVolumen(),0.1);
	
	}

}
