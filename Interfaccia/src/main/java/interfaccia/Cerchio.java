package interfaccia;

public class Cerchio implements Figura {
	
  private 	Punto centro;

  
  
  public Cerchio() {
		
		
	}
public Cerchio(Punto centro) {
	
	this.setCentro(centro);
}
public Punto getCentro() {
	return centro;
}
public void setCentro(Punto centro) {
	this.centro = centro;
}
@Override
public void stampa() {
	
	System.out.println("centro : "+centro.getX()+"-"+centro.getY());
	
}
  
  
  

}
