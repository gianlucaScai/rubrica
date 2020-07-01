package interfacciaES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailAziendale extends Email{
	private Map<String,List<String>> mapEmailAziendale = new HashMap<String,List<String>>();

	private String emailAziendale;

	public EmailAziendale(){
		super();
	}
	public EmailAziendale(String nome, String cognome){
		setNome(nome);
		setCognome(cognome);
	}
	
	
	public String getEmailAziendale() {
		return emailAziendale;
	}

	public void setEmailAziendale(String emailAziendale) {
		this.emailAziendale = emailAziendale;
	}
	
	


	public Map<String, List<String>> getMapEmailAziendale() {
		return mapEmailAziendale;
	}
	public void setMapEmailAziendale(Map<String, List<String>> mapEmailAziendale) {
		this.mapEmailAziendale = mapEmailAziendale;
	}
	@Override
	public void inserimento() {
		String key = getNome().concat(getCognome());	


		System.out.println("quale è l' email? \n");
		System.out.println("email aziendale: ");
		this.emailAziendale = getScanner().next();
		
		if(!mapEmailAziendale.containsKey(key)){
			this.mapEmailAziendale.put(key,new ArrayList<String>());
		}
		this.mapEmailAziendale.get(key).add((String) this.emailAziendale);
		
	}
	
	@Override
	public void visualizzazione() {
		String key = getNome().concat(getCognome());	

		if(this.mapEmailAziendale.containsKey(key)){
			System.out.println("-----email aziendali-----");
			for(String email : this.mapEmailAziendale.get(key)){
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
		this.mapEmailAziendale.remove(key);
		
	}
	
	@Override
	public void findAll(){
		
		if(this.mapEmailAziendale.isEmpty()){
			System.out.println("non sono presenti email aziendali");
		}else{
		System.out.println(this.mapEmailAziendale.keySet());
		}
		
	}
}
