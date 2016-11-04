package AutowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Triangolo {
	
	 @Autowired
	 private Punto puntoA;
	 
	 @Autowired
	 @Qualifier("questo")
	 private Punto puntoB;
	
	
	  public Triangolo() {
			
		}
	  
	

	public void stampaVertici(){
		System.out.println("coordinato dell A:"+ puntoA.getX()+"-"+puntoA.getY());
		System.out.println("coordinato dell B:"+ puntoB.getX()+"-"+puntoB.getY());
	
	}


 
	public Punto getPuntoA() {
		return puntoA;
	}


	
	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}



	
	

}
