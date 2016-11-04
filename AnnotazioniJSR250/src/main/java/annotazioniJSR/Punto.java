package annotazioniJSR;

import javax.annotation.PostConstruct;

public class Punto {

	private int x;
	private int y;

	public Punto() {

	}

	public Punto(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@PostConstruct
	  public void ilMioMetodoInit(){
		  System.out.println("Punto :mio metodo inizializzazione");
	  }

}
