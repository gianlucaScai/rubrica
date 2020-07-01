package interfacciaES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailPrivata extends Email{
	private Map<String,List<String>> mapEmailPrivata = new HashMap<String,List<String>>();
	private String emailPrivata;

	public EmailPrivata(){
		super();
	}
	public EmailPrivata(String nome, String cognome){
		setNome(nome);
		setCognome(cognome);
	}
	
	public String getEmailPrivata() {
		return emailPrivata;
	}

	public void setEmailPrivata(String emailPrivata) {
		this.emailPrivata = emailPrivata;
	}
	
	


	public Map<String, List<String>> getMapEmailPrivata() {
		return mapEmailPrivata;
	}
	public void setMapEmailPrivata(Map<String, List<String>> mapEmailPrivata) {
		this.mapEmailPrivata = mapEmailPrivata;
	}
	@Override
	public void inserimento() {
		String key = getNome().concat(getCognome());	


		System.out.println("quale è l' email? \n");
		System.out.println("email privata: ");
		this.emailPrivata = getScanner().next();
		if(!mapEmailPrivata.containsKey(key)){
			this.mapEmailPrivata.put(key,new ArrayList<String>());
		}
		this.mapEmailPrivata.get(key).add((String) this.emailPrivata);
	}
	
	@Override
	public void visualizzazione() {
		String key = getNome().concat(getCognome());	

		if(this.mapEmailPrivata.containsKey(key)){
			System.out.println("-----email private-----");
			for(String email : this.mapEmailPrivata.get(key)){
				int n = 1;
				System.out.println(n+". "+email);
				n++;
			}
		}else{
			System.out.println("nessun email \n");
		}	
	}
	
	@Override
	public void elimina(){
		
		String key = getNome().concat(getCognome());	
		this.mapEmailPrivata.remove(key);
		
	}
	
	@Override
	public void findAll(){
		
		if(this.mapEmailPrivata.isEmpty()){
			System.out.println("non sono presenti email private");
		}else{
		System.out.println(this.mapEmailPrivata.keySet());
		}
		
	}
	
}
