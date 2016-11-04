package annotazioniJSR;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	public static void main(String[] args) {
		
	
		 AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 
		 context.registerShutdownHook();
		   Triangolo t=(Triangolo) context.getBean("triangolo");
		   
		   t.stampaVertici();
		   
	}

}
