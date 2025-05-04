package ar.edu.unq.poo2.tp6.banco;

import java.util.ArrayList;

public class Banco {
	
	private GestorDeClientesInterface gestorDeClientes;
	private AnalizadorDeCreditosInterface analizadorDeCreditos;
	private ArrayList<SolicitudDeCredito> solicitudesDeCreditos;
	
	public Banco(GestorDeClientesInterface gestorDeClientes, AnalizadorDeCreditosInterface analizadorDeCreditos) {
		this.gestorDeClientes = gestorDeClientes;
		this.analizadorDeCreditos = analizadorDeCreditos;
		this.solicitudesDeCreditos = new ArrayList<SolicitudDeCredito>();
	}
	
	public int getCantidadDeClientes() {
		return this.gestorDeClientes.getCantidadDeClientes();
	}
	
	public int getCantidadDeSolicitudesDeCreditos() {
		return this.solicitudesDeCreditos.size();
	}
	
	public double getMontoTotalADesembolsar() {
		return this.analizadorDeCreditos.getMontoTotalADesembolsar(this.solicitudesDeCreditos);
	}
	
	public void agregarCliente(Cliente cliente) {
		
		this.gestorDeClientes.agregarCliente(cliente);
	}
	
	public void agregarSolicitudDeCredito(SolicitudDeCredito solicitudDeCredito) {
		this.solicitudesDeCreditos.add(solicitudDeCredito);
	}

}
