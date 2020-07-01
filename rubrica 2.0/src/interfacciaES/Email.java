package interfacciaES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Email extends Contatto{
	
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
					EmailPrivata emailPrivata = new EmailPrivata(getNome(),getCognome());
					emailPrivata.inserimento();
	
					break;
				case 2:
					EmailAziendale emailAziendale = new EmailAziendale(getNome(),getCognome());
					emailAziendale.inserimento();
	
					break;
				}
			}
			
		}
	
	@Override
	public void visualizzazione() {
		EmailPrivata emailPrivata = new EmailPrivata(getNome(),getCognome());
		EmailAziendale emailAziendale = new EmailAziendale(getNome(),getCognome());

		emailPrivata.visualizzazione();
		emailAziendale.visualizzazione();
  }	

	
	private static int sceltaOperazione() {
		stampaMenu();
		int scelta = scanner.nextInt();
		while (scelta < 0 || scelta > 2) {
			System.out.println("errore.. riprova");
			stampaMenu();
			scelta = scanner.nextInt();
		}
		return scelta;
	}
	
	private static void stampaMenu(){
	System.out.println("quale email vuoi inserire? \n 0. indietro \n 1. email privata \n 2. email aziendale \n");
	}
	
	
	@Override
	public void elimina(){
		EmailPrivata emailPrivata = new EmailPrivata(getNome(),getCognome());
		EmailAziendale emailAziendale = new EmailAziendale(getNome(),getCognome());

		emailPrivata.elimina();
		emailAziendale.elimina();
				
		}
	
	@Override
	public void findAll(){
		EmailPrivata emailPrivata = new EmailPrivata(getNome(),getCognome());
		EmailAziendale emailAziendale = new EmailAziendale(getNome(),getCognome());

		emailPrivata.findAll();
		emailAziendale.findAll();
	}
}
