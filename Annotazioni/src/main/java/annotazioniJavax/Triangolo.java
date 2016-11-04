package annotazioniJavax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Triangolo {
     
	 @Autowired
	 private Punto puntoA;

	  public Triangolo() {
			
		}
	  
	

	public void stampaVertici(){
		System.out.println("coordinato dell A:"+ puntoA.getX()+"-"+puntoA.getY());
		
	
	}

	public Punto getPuntoA() {
		return puntoA;
	}

	
	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}

}
