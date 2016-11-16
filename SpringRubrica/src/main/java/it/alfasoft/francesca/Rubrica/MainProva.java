package it.alfasoft.francesca.Rubrica;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainProva {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 
		   Rubrica r=(Rubrica) context.getBean("rubrica");
		   
		   Voce v=r.getVoceByName("Donald");
		   
//		   System.out.println(v.getNome()+" "+ v.getCognome());
		   
		   r.stampaVoci();
	}

}
