package ar.edu.unq.poo2.tp5.mercado;

public class FacturaDeServicios implements Factura {
	
	private double costoPorUnidadConsumida;
	private int cantidadDeUnidadesConsumidas;
	
	public FacturaDeServicios(double costoPorUnidadConsumida, int cantidadDeUnidadesConsumidas) {
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}
	
	public double getCostoPorUnidadConsumida() {
		return this.costoPorUnidadConsumida;
	}
	
	public int getCantidadDeUnidadesConsumidas() {
		return this.cantidadDeUnidadesConsumidas;
	}
	
	public double getMontoAPagar() {
		return this.costoPorUnidadConsumida * this.cantidadDeUnidadesConsumidas;
	}
}
