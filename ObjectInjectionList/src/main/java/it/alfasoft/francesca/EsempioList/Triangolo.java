package it.alfasoft.francesca.EsempioList;

import java.util.List;

public class Triangolo {
	
	  private List<Punto> punti;
	
	  public Triangolo() {
			
		}

	public void stampaVertici(){
		
		for(Punto p : punti){
		System.out.println(p.getX()+" "+p.getY());
		}
	
	}



	public List<Punto> getPunti() {
		return punti;
	}



	public void setPunti(List<Punto> punti) {
		this.punti = punti;
	}

}
