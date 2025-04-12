package ar.edu.unq.poo2.tp3.multiplos;

public class Multiplo {
	
	public int multiplo(int x, int y) {
		int numero = 0;
		
		for(int i=1; i<=1000; i++) {
			if(i%x == 0 && i%y == 0) {
				numero = i;
			}
		}
		
		return numero > 0 ? numero : -1;
	}

}
