package interfacciaES;

import java.util.HashMap;
import java.util.Map;

public class Cap  extends Recapito{
	
	private Map<String,Object> mapCap = new HashMap<String,Object>();
	private Number cap;

	
	public Cap(){
		super();
	}
	public Cap(String nome, String cognome){
		setNome(nome);
		setCognome(cognome);
	}
	
	public Number getCap() {
		return cap;
	}

	public void setCap(Number cap) {
		this.cap = cap;
	}
	
	
	
	public Map<String, Object> getMapCap() {
		return mapCap;
	}

	public void setMapCap(Map<String, Object> mapCap) {
		this.mapCap = mapCap;
	}

	@Override
	public void inserimento() {
		String key = getNome().concat(getCognome());	


		System.out.println("quale � il cap? \n");
		System.out.println("cap: ");
		this.cap = getScanner().nextLong();
		this.mapCap.put(key, this.cap);
	}
	
	@Override
	public void visualizzazione() {
		String key = getNome().concat(getCognome());	
		if(this.mapCap.containsKey(key)){
		System.out.println("---cap--- \n - "+ this.mapCap.get(key));
		}else{
			System.out.println("nessun cap \n");
		}
	}
	
	@Override
	public void elimina(){
		
		String key = getNome().concat(getCognome());	
		this.mapCap.remove(key);
		
	}	
	
	@Override
	public void findAll(){
		
		if(this.mapCap.isEmpty()){
			System.out.println("non sono presenti cap");
		}else{
		System.out.println(this.mapCap.keySet());
		}
		
	}
}
