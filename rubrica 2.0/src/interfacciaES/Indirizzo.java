package interfacciaES;

import java.util.HashMap;
import java.util.Map;

public class Indirizzo extends Recapito{
	private Map<String,Object> mapIndirizzo = new HashMap<String,Object>();
	
	private String indirizzo;

	public Indirizzo(){
		super();
	}
	public Indirizzo(String nome, String cognome){
		setNome(nome);
		setCognome(cognome);
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Map<String, Object> getMapIndirizzo() {
		return mapIndirizzo;
	}

	public void setMapIndirizzo(Map<String, Object> mapIndirizzo) {
		this.mapIndirizzo = mapIndirizzo;
	}
	
	
	@Override
	public void inserimento() {
		String key = getNome().concat(getCognome());	
		
		System.out.println("quale è l' indirizzo? \n");
		System.out.println("indirizzo: ");
		String indirizzo = "";
		while(indirizzo.equals("")){
			indirizzo = getScanner().nextLine();
		}
		this.indirizzo = indirizzo;
		this.mapIndirizzo.put(key, this.indirizzo);
		System.out.println("   indirizzo salvato \n");
		
	}
	
	@Override
	public void visualizzazione() {
		String key = getNome().concat(getCognome());	
		if(this.mapIndirizzo.containsKey(key)){
		System.out.println("---indirizzo--- \n - "+ this.mapIndirizzo.get(key));
		}else{
			System.out.println("nessun indirizzo \n");
		}
	}
	@Override
	public void elimina(){
		
		String key = getNome().concat(getCognome());	
		this.mapIndirizzo.remove(key);
		
	}

	@Override
	public void findAll(){
		
		if(this.mapIndirizzo.isEmpty()){
			System.out.println("non sono presenti indirizzi");
		}else{
		System.out.println(this.mapIndirizzo.keySet());
		}
		
	}

}
