package interfacciaES;

public class Telefono extends Contatto{
	private static NumeroCellulare numeroCellulare =  new NumeroCellulare();
	private static NumeroFisso numeroFisso = new NumeroFisso();
	private static NumeroAziendale numeroAziendale = new NumeroAziendale();
	
	public Telefono() {
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
				numeroCellulare.setNome(getNome());
				numeroCellulare.setCognome(getCognome());
				numeroCellulare.inserimento();

				break;
			case 2:
				numeroFisso.setNome(getNome());
				numeroFisso.setCognome(getCognome());
				numeroFisso.inserimento();

				break;
			case 3:
				numeroAziendale.setNome(getNome());
				numeroAziendale.setCognome(getCognome());
				numeroAziendale.inserimento();

				break;
			}

			}
		}
		
	

	@Override
	public void visualizzazione() {

		numeroCellulare.setNome(getNome());
		numeroCellulare.setCognome(getCognome());
		numeroFisso.setNome(getNome());
		numeroFisso.setCognome(getCognome());
		numeroAziendale.setNome(getNome());
		numeroAziendale.setCognome(getCognome());

		numeroCellulare.visualizzazione();
		numeroFisso.visualizzazione();
		numeroAziendale.visualizzazione();

  }	
	@Override
	public void findAll(){
		numeroCellulare.setNome(getNome());
		numeroCellulare.setCognome(getCognome());
		numeroFisso.setNome(getNome());
		numeroFisso.setCognome(getCognome());
		numeroAziendale.setNome(getNome());
		numeroAziendale.setCognome(getCognome());
		
		numeroCellulare.findAll();
		numeroFisso.findAll();
		numeroAziendale.findAll();
		
	}
	
	@Override
	public void elimina(){
		numeroCellulare.setNome(getNome());
		numeroCellulare.setCognome(getCognome());
		numeroFisso.setNome(getNome());
		numeroFisso.setCognome(getCognome());
		numeroAziendale.setNome(getNome());
		numeroAziendale.setCognome(getCognome());

		numeroCellulare.elimina();
		numeroFisso.elimina();
		numeroAziendale.elimina();
		
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
	System.out.println("quale numero vuoi inserire? \n 0. indietro \n 1. numero cellulare \n 2. numero fisso \n 3. numero aziendale \n");
	}
	
}
