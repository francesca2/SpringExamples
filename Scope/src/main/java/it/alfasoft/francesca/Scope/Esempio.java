package it.alfasoft.francesca.Scope;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	public static void main(String[] args) {
		
	
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 
		   Triangolo t1=(Triangolo) context.getBean("triangolo");
		   
		   t1.stampaVertici();
		   
//		   t1.getPuntoA().setX(50);
//		   t1.getPuntoA().setY(50);
		   
	
		   //Se ho definito lo scope di triangolo come prototype ora mi crea una nuova istanza della 
		   //classe Triangolo i cui attributi punti punteranno allo stesso oggetto se lo scope dei punti è singleton
		   //o ad altri oggetti creati nuovamente se lo scope dei punti era anche esso prototype
		   Triangolo t2=(Triangolo) context.getBean("triangolo");
		    
		   t2.stampaVertici();
		   
	}

}
