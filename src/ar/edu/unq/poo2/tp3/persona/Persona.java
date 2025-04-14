package ar.edu.unq.poo2.tp3.persona;

import java.time.LocalDate;

public class Persona {
	
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}
	
	public int getEdad() {
		return LocalDate.now().getYear() - this.fechaDeNacimiento.getYear();
	}
	
	public boolean menorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
}
