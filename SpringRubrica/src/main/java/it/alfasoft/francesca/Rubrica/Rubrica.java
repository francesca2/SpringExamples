package it.alfasoft.francesca.Rubrica;

import java.util.ArrayList;
import java.util.List;

public class Rubrica {
	
	private String nomeRubrica;
	
	private List<Voce> voci=new ArrayList<Voce>();
	
	public Rubrica() {
	}

	public Rubrica(String nomeRubrica, List<Voce> voci) {
		this.nomeRubrica = nomeRubrica;
		this.voci = voci;
	}

	public String getNomeRubrica() {
		return nomeRubrica;
	}

	public void setNomeRubrica(String nomeRubrica) {
		this.nomeRubrica = nomeRubrica;
	}

	public List<Voce> getVoci() {
		return voci;
	}

	public void setVoci(List<Voce> voci) {
		this.voci = voci;
	}
	
	public void stampaVoci(){
		for(Voce v: voci){
			System.out.println(v.getNome()+ " " + v.getCognome()+ " " + v.getTelefono());
		}
	}
	
	public Voce getVoceByName(String nome){
		Voce vt=null;
		for(Voce v: voci){
			if(v.getNome().equals(nome)){
				vt=v;
				break;
			}
		}
		return vt;
	}
	
	public void addVoce(Voce v){
		this.voci.add(v);
	}
}
