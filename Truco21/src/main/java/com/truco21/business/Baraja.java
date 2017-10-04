package com.truco21.business;

import java.util.ArrayList;
import java.util.Random;

public class Baraja extends ArrayList<Carta>{
	

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
	 *crearBaraja()                                                        
	 * 
	 * método que crea un ArrayList de objetos Carta
	 * 
	 */

	
	public ArrayList<Carta> crearBaraja(){ 
		

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
	 *de  la baraja creada  guarda en el Arraylist mazo21  21 objetos de tipo Carta
	 * 
	 * @return mazo21   retorna un arrayList de objetos Cartas  
	 * */
		public  ArrayList<Carta> barajar(){
					
			Baraja baraja = new Baraja();
			baraja.crearBaraja();
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
	 * int <i>desde</i> indice del inicio del mazo
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
		ArrayList<Carta> mazoTemp  = new ArrayList<>();
		Baraja baraja = new Baraja();
		
		mazo1 = baraja.crearMazo(0);
		mazo2=  baraja.crearMazo(7);
		mazo3= baraja.crearMazo(13);
		
		if (monton.equals("I")){ // mazo de la izquierda
			
			mazoTemp= mazo1;
			mazo1=mazo2;
			mazo2=mazoTemp;
			mazo3=mazo3;
			
		 
			
		} else if  (monton.equals("C")){  // mazo Central
			
			mazoTemp= mazo2;
			
			mazo1=mazo1;
			mazo2=mazoTemp;
			mazo3=mazo3;
			
			
			
			
			
		} else if (monton.equals("D")){  // mazo de la dercha
			
			mazoTemp =mazo3;
			mazo1=mazo3;
			mazo2=mazoTemp;
			mazo3=mazo3;
			
			
		}
		
		
		
		return mazoTemp;
	}
		

	
	 
		 

}





