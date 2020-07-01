package interfacciaES;

import java.util.HashMap;
import java.util.Map;

public class Username extends Social{
	private Map<String,Object> mapUsername = new HashMap<String,Object>();
	
	private String username;

	public Username(){
		super();
	}
	public Username(String nome, String cognome){
		setNome(nome);
		setCognome(cognome);
	}

	

	public Map<String, Object> getMapUsername() {
		return mapUsername;
	}
	public void setMapUsername(Map<String, Object> mapUsername) {
		this.mapUsername = mapUsername;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public void inserimento() {
		String key = getNome().concat(getCognome());
		
		System.out.println("quale è l' username? \n");
		System.out.println("username: ");
		String username = "";
		while(username.equals("")){
			username = getScanner().nextLine();
		}
		this.username = username;
		this.mapUsername.put(key, this.username);
		System.out.println("   username salvato \n");
		
	}
	
	@Override
	public void visualizzazione() {
		String key = getNome().concat(getCognome());	
		if(this.mapUsername.containsKey(key)){
		System.out.println("---username--- \n - "+ this.mapUsername.get(key));
		}else{
			System.out.println("nessun username \n");
		}
	}
	@Override
	public void elimina(){
		
		String key = getNome().concat(getCognome());	
		this.mapUsername.remove(key);
		
	}

	@Override
	public void findAll(){
		
		if(this.mapUsername.isEmpty()){
			System.out.println("non sono presenti username");
		}else{
		System.out.println(this.mapUsername.keySet());
		}
		
	}

}
