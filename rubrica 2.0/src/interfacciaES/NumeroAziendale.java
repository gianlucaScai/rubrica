package interfacciaES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumeroAziendale extends Telefono {
	
	private Map<String,List<Number>> mapNumeroAziendale = new HashMap<String,List<Number>>();
	private Number numeroAziendale;

	public Number getNumeroAziendale() {
		return numeroAziendale;
	}

	public void setNumeroAziendale(Number numeroAziendale) {
		this.numeroAziendale = numeroAziendale;
	}
	
	

	public Map<String, List<Number>> getMapNumeroAziendale() {
		return mapNumeroAziendale;
	}

	public void setMapNumeroAziendale(Map<String, List<Number>> mapNumeroAziendale) {
		this.mapNumeroAziendale = mapNumeroAziendale;
	}

	@Override
	public void inserimento() {
		String key = getNome().concat(getCognome());	

		System.out.println("quale è il numero aziendale? \n");
		System.out.println("numero aziendale: ");
		this.numeroAziendale = getScanner().nextLong();
		
		if(!mapNumeroAziendale.containsKey(key)){
			this.mapNumeroAziendale.put(key,new ArrayList<Number>());
		}
		this.mapNumeroAziendale.get(key).add((Number) this.numeroAziendale);

	}
	
	@Override
	public void visualizzazione() {
		String key = getNome().concat(getCognome());	

		if(this.mapNumeroAziendale.containsKey(key)){
			System.out.println("-----numeri aziendali-----");
			for(Number numero : this.mapNumeroAziendale.get(key)){
				int n = 1;
				System.out.println(n+". "+numero);
				n++;
			}
		}
	}
	
	@Override
	public void elimina(){
		
		String key = getNome().concat(getCognome());	
		this.mapNumeroAziendale.remove(key);
		
	}
	
	@Override
	public void findAll(){
		
		if(this.mapNumeroAziendale.isEmpty()){
			System.out.println("non sono presenti numeri aziendali");
		}else{
		System.out.println(this.mapNumeroAziendale.keySet());
		}
		
	}
}
