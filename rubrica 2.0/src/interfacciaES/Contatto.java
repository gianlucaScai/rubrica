package interfacciaES;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public abstract class Contatto {
	
	public static Map<String,Object> contattoMap = new HashMap();
	protected static Map<String,Map<String,Object>> telefonoMap = new HashMap();
	protected static Map<String,Map<String,Object>> recapitoMap = new HashMap();
	protected static Map<String,Map<String,Object>> emailMap = new HashMap();
	protected static Map<String,Map<String,Object>> socialMap = new HashMap();


	
	private String nome;
	private String cognome;
    public static Scanner scanner = new Scanner(System.in);

    
    public Contatto(){

    }
    
	public Contatto(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
	}
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	
	public void inserimento() {
		
	}

	
	public void visualizzazione() {

	}
	
	public void elimina(){
		
	}
	
	
	public void findAll(){

	}
	
}
