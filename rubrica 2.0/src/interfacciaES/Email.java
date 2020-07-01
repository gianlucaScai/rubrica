package interfacciaES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Email extends Contatto{
	private static EmailPrivata emailPrivata = new EmailPrivata();
	private static EmailAziendale emailAziendale = new EmailAziendale();
	public Map<String,Object> postaElettronicaMap = new HashMap();
	
	public Email() {
		super();
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
					emailPrivata.setNome(getNome());
					emailPrivata.setCognome(getCognome());
					emailPrivata.inserimento();
	
					break;
				case 2:
					emailAziendale.setNome(getNome());
					emailAziendale.setCognome(getCognome());
					emailAziendale.inserimento();
					break;
				}
			}
			
		}
	
	@Override
	public void visualizzazione() {
		emailPrivata.setNome(getNome());
		emailPrivata.setCognome(getCognome());
		emailAziendale.setNome(getNome());
		emailAziendale.setCognome(getCognome());

		emailPrivata.visualizzazione();
		emailAziendale.visualizzazione();
  }	

	
	private int sceltaOperazione() {
		stampaMenu();
		int scelta = getScanner().nextInt();
		while (scelta < 0 || scelta > 2) {
			System.out.println("errore.. riprova");
			stampaMenu();
			scelta = getScanner().nextInt();
		}
		return scelta;
	}
	
	private static void stampaMenu(){
	System.out.println("quale email vuoi inserire? \n 0. indietro \n 1. email privata \n 2. email aziendale \n");
	}
	
	
	@Override
	public void elimina(){
		emailPrivata.setNome(getNome());
		emailPrivata.setCognome(getCognome());
		emailAziendale.setNome(getNome());
		emailAziendale.setCognome(getCognome());

		emailPrivata.elimina();
		emailAziendale.elimina();
				
		}
	
	@Override
	public void findAll(){
		emailPrivata.setNome(getNome());
		emailPrivata.setCognome(getCognome());
		emailAziendale.setNome(getNome());
		emailAziendale.setCognome(getCognome());

		emailPrivata.findAll();
		emailAziendale.findAll();
	}
}
