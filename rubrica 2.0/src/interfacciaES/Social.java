package interfacciaES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Social extends Contatto{

	
	public Social() {
		super();
	}
	public Social(String nome, String cognome) {
		setNome(nome);
		setCognome(cognome);
	}

	@Override
	public void inserimento() {
		boolean esc = false;
		while(!esc){
	
			int scelta = sceltaOperazione();
			switch(scelta){
			case 0:
				esc = true;
				break;
			case 1:
				Username username = new Username(getNome(),getCognome());
				username.inserimento();
			}
		}
		
	}

	@Override
	public void visualizzazione() {

		Username username = new Username(getNome(),getCognome());
		username.visualizzazione();
		  }

	@Override
	public void elimina(){

		Username username = new Username(getNome(),getCognome());
		username.elimina();
		}
	
	@Override
	public void findAll(){
		Username username = new Username(getNome(),getCognome());
		username.findAll();
	}
	
	private static int sceltaOperazione() {
		stampaMenu();
		int scelta = scanner.nextInt();
		while (scelta < 0 || scelta > 1) {
			System.out.println("errore.. riprova");
			stampaMenu();
			scelta = scanner.nextInt();
		}
		return scelta;
	}
	
private static void stampaMenu(){
	System.out.println("cosa aggiungere? \n 0. indietro \n 1. username \n");
	}
}
