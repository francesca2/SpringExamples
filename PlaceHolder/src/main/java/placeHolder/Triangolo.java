package placeHolder;

public class Triangolo {
	
	  private Punto puntoA;
	  private Punto puntoB;
	  private Punto puntoC;
	
	  public Triangolo() {
			
		}
	  
	

	public void stampaVertici(){
		System.out.println("coordinate del punto A:"+ puntoA.getX()+"-"+puntoA.getY());
 		System.out.println("coordinate del punto B:"+ puntoB.getX()+"-"+puntoB.getY());
		System.out.println("coordinate del punto C:"+ puntoC.getX()+"-"+puntoC.getY());
	
	}



	public Punto getPuntoA() {
		return puntoA;
	}



	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}



	public Punto getPuntoB() {
		return puntoB;
	}



	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}



	public Punto getPuntoC() {
		return puntoC;
	}



	public void setPuntoC(Punto puntoC) {
		this.puntoC = puntoC;
	}

	

}
