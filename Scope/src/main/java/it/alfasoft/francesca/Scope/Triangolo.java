package it.alfasoft.francesca.Scope;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//implemento due interfacce, la prima mi permette di invocare il context corrente; la seconda
//mi permette di avere un riferimento all'id usato quando ho definito il bean
public class Triangolo implements ApplicationContextAware,BeanNameAware{
	
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

	//Vediamo che prima esegue il setBean e poi il set applicationcontext per ogni bean che
	//creo
	
 ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context=context;
		System.out.println("Context");
		
	}
	
	@Override
	public void setBeanName(String bean) {
		
		System.out.println(bean);
		
	}

 
	

}
