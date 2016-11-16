package it.alfasoft.francesca.Rubrica;

public class Voce {
	
	private String nome;
	private String cognome;
	private String telefono;
	
	public Voce() {
	}

	public Voce(String nome, String cognome, String telefono) {
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

}
