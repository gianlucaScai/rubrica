package interfacciaES;

import java.util.Scanner;

public abstract class Contatto {
	
	private String nome;
	private String cognome;
    private Scanner scanner = new Scanner(System.in);

    
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

	
	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
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
