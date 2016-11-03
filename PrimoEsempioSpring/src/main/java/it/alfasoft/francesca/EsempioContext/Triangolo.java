package it.alfasoft.francesca.EsempioContext;

public class Triangolo {
	 
	  private String nome;
	  private int base;
	  
	  public Triangolo() {
			
		}
	  
	public Triangolo(String nome,int base) {
		
		this.nome = nome;
		this.base=base;
	}

	public void stampaNome(){
		System.out.println("nome : " +nome);
		System.out.println("base : " +base);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

}

