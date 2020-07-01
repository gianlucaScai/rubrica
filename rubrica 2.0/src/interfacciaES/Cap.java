package interfacciaES;

import java.util.HashMap;
import java.util.Map;

public class Cap  extends Recapito{
	
	private static Map<String,Object> mapCap = new HashMap<String,Object>();
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
	
	
	
	public static Map<String, Object> getMapCap() {
		return mapCap;
	}

	public static void setMapCap(Map<String, Object> mapCap) {
		Cap.mapCap = mapCap;
	}

	@Override
	public void inserimento() {
		String key = getNome().concat(getCognome());	


		System.out.println("quale è il cap? \n");
		System.out.println("cap: ");
		this.cap = scanner.nextLong();
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
		
		String key = getNome().concat(getCognome());
		System.out.println(this.mapCap.keySet());
		
	}
}
