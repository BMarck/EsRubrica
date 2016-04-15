package it.polito.tdp.rubrica.model;

import java.util.*;

/*l'insieme di tutte le voci della rubrica e i metodi
 * per gestirle*/

public class RubricaModel {
	
	private List<Voce> rubrica;

	public RubricaModel() {
		this.rubrica = new LinkedList<Voce>();
	}
	
	public boolean addVoce(Voce v){
		if(rubrica.contains(v))
		{
			return false;
		}else {
			rubrica.add(v);
			return true;
		}
		
	}
	
	public Voce findVoceByNome(String nome){
		 for(Voce v:rubrica){
			 if(v.getNome().equals(nome)){
				 return v;
			 }
		 }
		 return null;
	}
	
	public static void main(String [] args){
		RubricaModel m= new RubricaModel();
		boolean r1=m.addVoce(new Voce("fulvio", "fulvio.corno@polito.it", "7053"));
		boolean r2=m.addVoce(new Voce("giovanni", "giovanni.squillero@polito.it", "7077"));
		boolean r3=m.addVoce(new Voce("fulvio", "fulvio.altro@polito.it", "70000"));

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		Voce v1= m.findVoceByNome("giovanni");
		Voce v2=m.findVoceByNome("fdgd");
		
		System.out.println(v1);
		System.out.println(v2);


		
}
}
