package interfacciaES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Social extends Contatto{
	private static Username username = new Username();
	
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
				username.setNome(getNome());
				username.setCognome(getCognome());
				username.inserimento();
			}
		}
		
	}

	@Override
	public void visualizzazione() {
		username.setNome(getNome());
		username.setCognome(getCognome());
		username.visualizzazione();
		  }

	@Override
	public void elimina(){

		username.setNome(getNome());
		username.setCognome(getCognome());
		username.elimina();
		}
	
	@Override
	public void findAll(){
		username.setNome(getNome());
		username.setCognome(getCognome());
		username.findAll();
	}
	
	private int sceltaOperazione() {
		stampaMenu();
		int scelta = getScanner().nextInt();
		while (scelta < 0 || scelta > 1) {
			System.out.println("errore.. riprova");
			stampaMenu();
			scelta = getScanner().nextInt();
		}
		return scelta;
	}
	
private static void stampaMenu(){
	System.out.println("cosa aggiungere? \n 0. indietro \n 1. username \n");
	}
}
