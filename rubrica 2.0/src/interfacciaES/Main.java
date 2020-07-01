package interfacciaES;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.xml.sax.HandlerBase;

public class Main {
	
	
    public static Scanner scanner = new Scanner(System.in);
    public static Telefono telefono = new Telefono();
    public static Social social = new Social();
    public static Recapito recapito = new Recapito();
    public static Email email = new Email();
	
	public static void main(String[] args) {

		metodoIniziale();
		
	}	
	
	private static void stampaMenu() {

		System.out.println("---RUBRICA---");
		System.out.println("0 per uscire");
		System.out.println("PREMI 1 per visualizzare i contatti");
		System.out.println("PREMI 2 per salvare i contatti");
		System.out.println("PREMI 3 per eliminare un contatto");
		System.out.println("PREMI 4 per visualizzare tutti i contatti inseriti");

	}
	
	
	
	private static void visualizzaContatti(){
		String nome = "";
		String cognome = "";
		nome = inserisciNome();
		cognome = inserisciCognome();
		
		boolean esc = false;

		while(!esc){
			System.out.println("--VISUALIZZA-- \n 0. Indietro \n 1. Telefono \n 2. Recapito \n 3. Social \n 4. Email");
			int scelta = sceltaMenu(0,4);
			switch (scelta){
			case 0:
				esc = true;
				break;
			case 1:
				telefono.setNome(nome);
				telefono.setCognome(cognome);
				telefono.visualizzazione();
				break;
			case 2:
				recapito.setNome(nome);
				recapito.setCognome(cognome);
				recapito.visualizzazione();
				break;
			case 3:
				social.setNome(nome);
				social.setCognome(cognome);
				social.visualizzazione();
				break;
			case 4:
				email.setNome(nome);
				email.setCognome(cognome);
				email.visualizzazione();
				break;
			}
		}
	}

	private static void eliminaContatto(){
		System.out.println("---ELIMINA--- \n");
		System.out.println("inseririre contatto da eliminare: \n");

		String nome = "";
		String cognome = "";
		nome = inserisciNome();
		cognome = inserisciCognome();
		System.out.println("proseguire con l'eliminazione di :"+ nome+" " + cognome + " ? (y/n)");
		String conferma = scanner.next().toLowerCase();
		while((!conferma.equals("y") && !conferma.equals("n"))){
			System.out.println("risposta non consentita, riprova.... \n");
			System.out.println("eliminare "+nome+" "+cognome+" ? (y/n) \n ");
		    conferma = scanner.next().toLowerCase();
		}
		if(conferma.equals("y") ){
			telefono.setNome(nome);
			telefono.setCognome(cognome);
			telefono.elimina();
			
			recapito.setNome(nome);
			recapito.setCognome(cognome);
			recapito.elimina();
			
			social.setNome(nome);
			social.setCognome(cognome);
			social.elimina();
			
			email.setNome(nome);
			email.setCognome(cognome);
			email.elimina();
			
			System.out.println("   contatto eliminato correttamente \n");

		}
		if(conferma.equals("n") ){
			System.out.println("operazione annullata \n");
		}
	}
	
	
	private static void salvaContatti(){
		String nome = "";
		String cognome = "";
		nome = inserisciNome();
		cognome = inserisciCognome();

		boolean esc = false;

		while(!esc){
			System.out.println("--SALVA-- \n 0. Indietro \n 1. Telefono \n 2. Recapito \n 3. Social \n 4. Email");
			int scelta = sceltaMenu(0,4);
			switch (scelta){
			case 0:
				esc = true;
				break;
			case 1:
				telefono.setNome(nome);
				telefono.setCognome(cognome);
				telefono.inserimento();
				break;
			case 2:
				recapito.setNome(nome);
				recapito.setCognome(cognome);
				recapito.inserimento();
				break;
			case 3:
				social.setNome(nome);
				social.setCognome(cognome);
				social.inserimento();
				break;
			case 4:
				email.setNome(nome);
				email.setCognome(cognome);
				email.inserimento();
				break;
			}
		}
	}
	
	private static void metodoIniziale(){

			boolean esc = false;
	    	
		while(!esc){
			stampaMenu();
			int scelta = sceltaMenu(0, 4);
			switch(scelta) {
			case 0: 
				System.out.println("ciao");
				esc = true;
				break;
			case 1:
				visualizzaContatti();
				break;
			case 2: 
				salvaContatti();
				break;
			case 3: 
				eliminaContatto();
				break;
			case 4: 
				visualizzaTutti();
				break;
			}
		}
	}

	private static String inserisciNome(){
		String nome = ""; 
		System.out.println("inserisci nome: \n ");
		while(nome.trim().equals("")){
			 nome = scanner.nextLine();
			}
		return nome;
	}
	
	private static String inserisciCognome(){
		String cognome = "";
		System.out.println("inserisci cognome: \n ");
		while(cognome.trim().equals("")){
			cognome = scanner.nextLine();
			}
		return cognome;
	}
	
	private static int sceltaMenu(int param1,int param2){
		int scelta = scanner.nextInt();
		while (scelta < param1 || scelta > param2 ) {
			System.out.println("errore.. riprova");
			scelta = scanner.nextInt();
		}
		
		return scelta;
	}
	
	private static void visualizzaTutti(){

		boolean esc = false;

		while(!esc){
			System.out.println("--VISUALIZZA TUTTI I CONTATTI PER-- \n 0. Indietro \n 1. Telefono \n 2. Recapito \n 3. Social \n 4. Email");
			int scelta = sceltaMenu(0,4);
			switch (scelta){
			case 0:
				esc = true;
				break;
			case 1:
				telefono.findAll();
				break;
			case 2:
				recapito.findAll();
				break;
			case 3:
				social.findAll();
				break;
			case 4:
				email.findAll();
				break;
			}
		}
	}
	
}
