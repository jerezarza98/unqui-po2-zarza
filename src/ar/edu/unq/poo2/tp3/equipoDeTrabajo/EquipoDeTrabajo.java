package ar.edu.unq.poo2.tp3.equipoDeTrabajo;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	
	private String nombre;
	private List <Persona> personas;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.personas = new ArrayList <Persona>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getCantidadDePersonas() {
		return this.personas.size();
	}
	
	public double getPromedioDeEdadDeIntegrantes() {

		if(this.getCantidadDePersonas() == 0) {
			return 0;
		} else {
			
			int total = 0;
			
			for(Persona persona:this.personas) {
				total += persona.getEdad();
			}
			
			return (double) total / this.personas.size();
			
		}
	}
	
	public void addPersona(Persona persona) {
		this.personas.add(persona);
	}
	
	public void printPromedio() {
		System.out.println("El promedio de edad del equipo de trabajo es: " + this.getPromedioDeEdadDeIntegrantes());
	}
	
	
}
