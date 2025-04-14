package ar.edu.unq.poo2.tp3.ejercicios8Y9;

abstract class Rectangulo {
	private int base, altura;
	private Point ubicacion;
	
	public Rectangulo(int base, int altura, Point ubicacion) {
		this.base = base;
		this.altura = altura;
		this.ubicacion = ubicacion;
	}
	
	public int getBase() {
		return this.base;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	public Point getUbicacion() {
		return this.ubicacion;
	}
	
	public int getArea() {
		return this.base * this.altura;
	}
	
	public abstract int getPerimetro();
	
	public boolean esHorizontal() {
		return this.base > this.altura;
	}
	
	public boolean esVertical() {
		return this.altura > this.base;
	}
}
