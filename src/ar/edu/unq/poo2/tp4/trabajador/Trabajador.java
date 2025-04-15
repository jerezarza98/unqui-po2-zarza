package ar.edu.unq.poo2.tp4.trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<Ingreso> ingresos;
	
	public Trabajador() {
		this.ingresos = new ArrayList<Ingreso>();
	}
	
	
	public double getTotalPercibido() {
		double total = 0;
		
		for(Ingreso ingreso: this.ingresos) {
			total += ingreso.getMontoPercibido();
		}
		
		return total;
	}
	
	public double getMontoImponible() {
		double total = 0;
		
		for(Ingreso ingreso: this.ingresos) {
			total += ingreso.getMontoImponibleAlImpuestoAlTrabajador();
		}
		
		return total;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		this.ingresos.add(ingreso);
	}
}
