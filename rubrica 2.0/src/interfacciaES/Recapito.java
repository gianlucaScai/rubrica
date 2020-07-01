package interfacciaES;

public class Recapito extends Contatto{
	private static Indirizzo indirizzo = new Indirizzo();
	private static Cap cap = new Cap();
	private static Citta citta = new Citta();
	
	
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
						indirizzo.setNome(getNome());
						indirizzo.setCognome(getCognome());
						indirizzo.inserimento();
						
						break;
					case 2:
						cap.setNome(getNome());
						cap.setCognome(getCognome());
						cap.inserimento();
		
						break;
					case 3:
						citta.setNome(getNome());
						citta.setCognome(getCognome());
						citta.inserimento();
		
						break;
					}
			}
		}
			
	private int sceltaOperazione() {
				stampaMenu();
				int scelta = getScanner().nextInt();
				while (scelta < 0 || scelta > 3) {
					System.out.println("errore.. riprova");
					stampaMenu();
					scelta = getScanner().nextInt();
				}
				return scelta;
			}
			
	private static void stampaMenu(){
			System.out.println("cosa aggiungere? \n 0. indietro \n 1. indirizzo \n 2. cap \n 3. citta \n");
			}
			
			
	@Override
	public void visualizzazione() {

		indirizzo.setNome(getNome());
		indirizzo.setCognome(getCognome());
		cap.setNome(getNome());
		cap.setCognome(getCognome());
		citta.setNome(getNome());
		citta.setCognome(getCognome());
				
		indirizzo.visualizzazione();
		cap.visualizzazione();
		citta.visualizzazione();
		  }
			
	@Override
	public void elimina(){
		indirizzo.setNome(getNome());
		indirizzo.setCognome(getCognome());
		cap.setNome(getNome());
		cap.setCognome(getCognome());
		citta.setNome(getNome());
		citta.setCognome(getCognome());
		
		indirizzo.elimina();
		cap.elimina();
		citta.elimina();
				
		}
	@Override
	public void findAll(){
		indirizzo.setNome(getNome());
		indirizzo.setCognome(getCognome());
		cap.setNome(getNome());
		cap.setCognome(getCognome());
		citta.setNome(getNome());
		citta.setCognome(getCognome());
		
		indirizzo.findAll();
		cap.findAll();
		citta.findAll();
	}
}
