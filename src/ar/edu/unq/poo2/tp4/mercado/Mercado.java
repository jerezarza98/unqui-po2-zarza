package ar.edu.unq.poo2.tp4.mercado;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
	
	private List<Caja> cajas;
	
	public Mercado() {
		this.cajas = new ArrayList<Caja>(); 
	}
	
	public int getCantidadDeCajas() {
		return this.cajas.size();
	}
	
	public void addCaja(Caja caja) {
		this.cajas.add(caja);
	}
}
