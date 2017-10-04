package com.truco21.business;

import java.util.ArrayList;
import java.util.Random;




public class Baraja extends ArrayList<Carta>{
	
 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ArrayList<Carta> paqueteCartas;
	ArrayList<Carta> mazo21;
	
	
	public Baraja() {
		super();
		
	}
	
	
	
	public Baraja(ArrayList<Carta> baraja) {
		super();
		this.paqueteCartas = baraja;
	}



	/*
	 *1  crear carta                                                           
	 * 
	 * 
	 */
	 
	
	
	
	public ArrayList<Carta> crearbaraja(){ 
		

		String[] palo = {"corazon","diamantes","trebol","pica"};
		String[] numero={"AS","K","Q","J","10","9","8","7","6","5","4","3","2"};
		String imagen="";
		
		 paqueteCartas = new ArrayList<Carta>();
		 
		for (int i=0; i< palo.length;i++) {
			
			for (int j = 0; j < numero.length; j++) {
				
				Carta carta = new Carta(palo, numero, imagen);
				paqueteCartas.add(carta);	
		
			System.out.println(carta.numero[j]+" de "+carta.palo[i]);
			
			}
		}
		
		return paqueteCartas;
		 
	}
	
	/*
	 * barajar()
	 * 
	 * Método que baraja el mazo de cartas
	 * 
	 * 
	 * */
		public  ArrayList<Carta> barajar(){
				
			
			Baraja baraja = new Baraja();
			baraja.crearbaraja();
			mazo21 = new ArrayList<>();
			
	 
		
			 
			Random random = new Random();

			// Mientras queden cartas en la baraja 
			while (mazo21.size()<20){
			   // Elegimos un índice al azar, entre 0 y el número de cartas que quedan por sacar
			   int randomIndex = random.nextInt(baraja.size());

			   // Guardamos la carta en nuevo arrayList de cartas
			   mazo21.add(baraja.get(randomIndex));

			   // Y eliminamos la carta del mazo (la borramos de la lista)
			   baraja.remove(randomIndex);
			}
			
			return mazo21;
			
		}
		
		
	
	
	/*
	 * crearMazo()
	 * 
	 * Método que crea un mazo 
	 * int desde   indice del inicio del mazo
	 * 
	 * */
		public ArrayList<Carta> crearMazo(int desde){
			
			ArrayList<Carta> mazo = new ArrayList<>();
			int i;
			
			for (i = desde; i < (i+7); i++) {
				
				mazo.add(this.mazo21.get(i));
				
			}
		
			return mazo;
		}
		
		
	public ArrayList<Carta> seleccionarMazo (String monton){
		
		ArrayList<Carta> mazo1  = new ArrayList<>();
		ArrayList<Carta> mazo2  = new ArrayList<>();
		ArrayList<Carta> mazo3  = new ArrayList<>();
		ArrayList<Carta> mazo4  = new ArrayList<>();
		
		
		if (monton.equals("I")){ // mazo de la izquierda
			
			 /**TODO*/ 
		} else if  (monton.equals("C")){ 
			
			
			
		} else if (monton.equals("D")){ 
			
			
			
		}
		
		
		
		return null;
	}
		

	
	 
		 

}





