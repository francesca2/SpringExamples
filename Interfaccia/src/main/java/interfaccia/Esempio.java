package interfaccia;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	public static void main(String[] args) {
		
	
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 
		 //Usando l'interfaccia posso rendere "indipendente" la mia applicazione dalla
		 //classe che uso al suo interno, posso facilemente cambiare triangolo in cerchio
		 //o in quadrato e ottenere sempre in output le coordinate rilevanti.
		   Figura f=(Figura) context.getBean("triangolo");
		   
		   f.stampa();
		   
	}

}
