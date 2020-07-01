package interfacciaES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumeroFisso extends Telefono{
	
	private static Map<String,List<Number>> mapNumeroFisso = new HashMap<String,List<Number>>();
	private Number numeroFisso;

	public Number getNumeroFisso() {
		return numeroFisso;
	}

	public void setNumeroFisso(Number numeroFisso) {
		this.numeroFisso = numeroFisso;
	}



	public static Map<String, List<Number>> getMapNumeroFisso() {
		return mapNumeroFisso;
	}

	public static void setMapNumeroFisso(Map<String, List<Number>> mapNumeroFisso) {
		NumeroFisso.mapNumeroFisso = mapNumeroFisso;
	}

	@Override
	public void inserimento() {
		String key = getNome().concat(getCognome());	

		System.out.println("quale è il numero fisso? \n");
		System.out.println("numero fisso: ");
		this.numeroFisso = scanner.nextLong();
		
		if(!mapNumeroFisso.containsKey(key)){
			this.mapNumeroFisso.put(key,new ArrayList<Number>());
		}
		this.mapNumeroFisso.get(key).add((Number) this.numeroFisso);		
	}
	
	@Override
	public void visualizzazione() {
		String key = getNome().concat(getCognome());	

		if(this.mapNumeroFisso.containsKey(key)){
			System.out.println("-----numeri fissi-----");
			for(Number numero : this.mapNumeroFisso.get(key)){
				int n = 1;
				System.out.println(n+". "+numero);
				n++;
			}
		}
	}
	
	@Override
	public void elimina(){
		
		String key = getNome().concat(getCognome());	
		this.mapNumeroFisso.remove(key);
		
	}
	@Override
	public void findAll(){
		
		String key = getNome().concat(getCognome());
		System.out.println(this.mapNumeroFisso.keySet());
		
	}
	
}
