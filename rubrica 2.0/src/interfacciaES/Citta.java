package interfacciaES;

import java.util.HashMap;
import java.util.Map;

public class Citta extends Recapito {
	private Map<String,Object> mapCitta = new HashMap<String,Object>();
	
	public Citta(){
		super();
	}
	public Citta(String nome, String cognome){
		setNome(nome);
		setCognome(cognome);
	}
	
	public Map<String, Object> getMapCitta() {
		return mapCitta;
	}
	
	public void setMapCitta(Map<String, Object> mapCitta) {
		this.mapCitta = mapCitta;
	}

	private String citta;

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}
	@Override
	public void inserimento() {
		String key = getNome().concat(getCognome());	
		
		System.out.println("quale è la citta ? \n");
		System.out.println("citta: ");
		this.citta = getScanner().next();
		this.mapCitta.put(key, this.citta);
	}
	
	@Override
	public void visualizzazione() {
		String key = getNome().concat(getCognome());	

		if(this.mapCitta.containsKey(key)){
		System.out.println("---citta--- \n - "+ this.mapCitta.get(key));
		}else{
			System.out.println("nessuna citta \n");
		}
	}
	
	@Override
	public void elimina(){
		
		String key = getNome().concat(getCognome());	
		this.mapCitta.remove(key);
		
	}	
	
	@Override
	public void findAll(){
		
		if(this.mapCitta.isEmpty()){
			System.out.println("non sono presenti citta");
		}else{
		System.out.println(this.mapCitta.keySet());
		}
		
	}
}
