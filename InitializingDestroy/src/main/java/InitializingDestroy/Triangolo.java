package InitializingDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangolo implements InitializingBean,DisposableBean{
	
	  private Punto puntoA;
	  private Punto puntoB;
	  private Punto puntoC;
	
	  public Triangolo() {
			
		}
	  
	

	public void stampaVertici(){
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



	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}



	public Punto getPuntoC() {
		return puntoC;
	}



	public void setPuntoC(Punto puntoC) {
		this.puntoC = puntoC;
	}


//I metodi dell'interfaccia vengono eseguiti rispettivamente prima e dopo i metodi
//definiti come attributi
	@Override
	public void afterPropertiesSet() throws Exception {
	
		System.out.println("inizializzato !!!!");	
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("prima di distruggere !!!!");
		
	}

	public void myMethodDestroy(){
		System.out.println("Metodo destroy del triangolo");
	}
	
	
	public void myMethodInit(){
		System.out.println("Metodo init del triangolo");
		
	}

}
