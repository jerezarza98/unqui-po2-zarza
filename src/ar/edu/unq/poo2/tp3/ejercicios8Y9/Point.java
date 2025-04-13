package ar.edu.unq.poo2.tp3.ejercicios8Y9;

public class Point {
	
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void moverA(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point unirCon(Point point) {
		int valorX = this.x + point.getX();
		int valorY = this.y + point.getY();
		
		return new Point(valorX, valorY);
	}
}
