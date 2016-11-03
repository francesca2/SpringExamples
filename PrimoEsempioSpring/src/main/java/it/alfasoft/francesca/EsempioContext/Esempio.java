package it.alfasoft.francesca.EsempioContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	public static void main(String[] args) {
		
		//apro il context e gli do il file di configurazione 
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 
		   Triangolo t=(Triangolo) context.getBean("triangolo");
		   
		   t.stampaNome();
		   
		   //posso anche settare gli attributi direttamente dal main
		   
	}

}
