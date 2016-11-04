package annotazioniJSR;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;





public class Triangolo {
	
	 @Resource(name="p1")
	 private Punto puntoA;
	 
	 @Resource(name="p2")
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



	public Punto getPuntoB() {
		return puntoB;
	}


	
	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}

 @PostConstruct
  public void ilMioMetodoInit(){
	  System.out.println("Triangolo :mio metodo inizializzazione");
  }
	
 @PreDestroy
 public void ilMioMetodoDestroy(){
	  System.out.println("Triangolo :mio metodo destroy");
 }	

}
