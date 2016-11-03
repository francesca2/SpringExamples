package BeanDefInheritance;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	public static void main(String[] args) {
		
	
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 
		   Triangolo t1=(Triangolo) context.getBean("triangoloFiglio");
		   
		   t1.getPuntoA().setX(38);;
		   
		   t1.stampaVertici();
		   

		   
	}

}
