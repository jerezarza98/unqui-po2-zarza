package ar.edu.unq.poo2.tp6.banco;

import java.util.ArrayList;

public class GestorDeClientes implements GestorDeClientesInterface{
	
	private ArrayList<Cliente> clientes;
	
	public GestorDeClientes() {
		clientes = new ArrayList<Cliente>();
	}
	
	@Override
	public int getCantidadDeClientes() {
		return this.clientes.size();
	}

	@Override
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
}
