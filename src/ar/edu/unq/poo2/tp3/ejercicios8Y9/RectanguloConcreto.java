package ar.edu.unq.poo2.tp3.ejercicios8Y9;

public class RectanguloConcreto extends Rectangulo{
	
	public RectanguloConcreto(int base, int altura, Point ubicacion) {
		super(base, altura, ubicacion);
	}
	
	@Override
	public int getPerimetro() {
		return (2*this.getBase()) + (2*this.getAltura());
	}
}
