package ar.edu.unq.poo2.tp3.ejercicios8Y9;

public class Cuadrado extends Rectangulo{
	
	private int lado;
	
	public Cuadrado(int lado, Point ubicacion) {
		super(lado, lado, ubicacion);
		this.lado = lado;
	}
	
	public int getLado() {
		return this.lado;
	}
	
	@Override
	public int getPerimetro() {
		return 4 * this.lado;
	}
}
