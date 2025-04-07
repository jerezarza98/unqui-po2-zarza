package ar.edu.unq.poo2.tp3.counter;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> arregloDeEnteros;
	
	public Counter() {
		this.arregloDeEnteros = new ArrayList<>();
	}
	
	public void addNumero(int numero) {
		this.arregloDeEnteros.add(numero);
	}
	
	public int getCantidadDePares() {
		int cantidadDePares = 0;
		
		for(int numero:this.arregloDeEnteros) {
			if(numero%2 == 0) {
				cantidadDePares++;
			}
		}
		
		return cantidadDePares;
	}
	
	public int getCantidadDeImpares() {
		int cantidadDeImpares = 0;
		
		for(int numero:this.arregloDeEnteros) {
			if(numero%2 == 1) {
				cantidadDeImpares++;
			}
		}
		
		return cantidadDeImpares;
	}

	public int getCantidadDeMultiplosDe(int unNumero) {
		int cantidadDeMultiplos = 0;
		
		for(int numero:this.arregloDeEnteros) {
			if(numero%unNumero == 0) {
				cantidadDeMultiplos++;
			}
		}
		
		return cantidadDeMultiplos;
	}
	

}





