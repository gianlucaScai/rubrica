package interfacciaES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recapito extends Contatto{
	
	public Recapito() {
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
						Indirizzo indirizzo = new Indirizzo(getNome(),getCognome());
						indirizzo.inserimento();
		
						break;
					case 2:
						Cap cap = new Cap(getNome(),getCognome());
						cap.inserimento();
		
						break;
					case 3:
						Citta citta = new Citta(getNome(),getCognome());
						citta.inserimento();
		
						break;
					}
			}
		}
			
	private static int sceltaOperazione() {
				stampaMenu();
				int scelta = scanner.nextInt();
				while (scelta < 0 || scelta > 3) {
					System.out.println("errore.. riprova");
					stampaMenu();
					scelta = scanner.nextInt();
				}
				return scelta;
			}
			
	private static void stampaMenu(){
			System.out.println("cosa aggiungere? \n 0. indietro \n 1. indirizzo \n 2. cap \n 3. citta \n");
			}
			
			
	@Override
	public void visualizzazione() {
				Indirizzo indirizzo = new Indirizzo(getNome(),getCognome());
				Cap cap = new Cap(getNome(),getCognome());
				Citta citta = new Citta(getNome(),getCognome());

				
				
				indirizzo.visualizzazione();
				cap.visualizzazione();
				citta.visualizzazione();
		  }
			
	@Override
	public void elimina(){
		Indirizzo indirizzo = new Indirizzo(getNome(),getCognome());
		Cap cap = new Cap(getNome(),getCognome());
		Citta citta = new Citta(getNome(),getCognome());

		
		
		indirizzo.elimina();
		cap.elimina();
		citta.elimina();
				
		}
	@Override
	public void findAll(){
		Indirizzo indirizzo = new Indirizzo(getNome(),getCognome());
		Cap cap = new Cap(getNome(),getCognome());
		Citta citta = new Citta(getNome(),getCognome());
		
		indirizzo.findAll();
		cap.findAll();
		citta.findAll();
	}
}
