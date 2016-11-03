package interfaccia;


import org.springframework.beans.factory.annotation.Required;

public class Triangolo implements Figura {

	  private Punto puntoA;
	  private Punto puntoB;
	  private Punto puntoC;
	
	  public Triangolo() {
			
		}
	 
	public void stampa(){
		System.out.println("coordinato dell A:"+ puntoA.getX()+"-"+puntoA.getY());
 		System.out.println("coordinato dell B:"+ puntoB.getX()+"-"+puntoB.getY());
		System.out.println("coordinato dell C:"+ puntoC.getX()+"-"+puntoC.getY());
	
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

	 @Required
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
