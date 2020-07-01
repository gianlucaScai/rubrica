package interfacciaES;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Telefono extends Contatto{
	

	public Telefono() {
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
				NumeroCellulare numeroCellulare = new NumeroCellulare();
				numeroCellulare.setNome(getNome());
				numeroCellulare.setCognome(getCognome());
				numeroCellulare.inserimento();

				break;
			case 2:
				NumeroFisso numeroFisso = new NumeroFisso();
				numeroFisso.setNome(getNome());
				numeroFisso.setCognome(getCognome());
				numeroFisso.inserimento();

				break;
			case 3:
				NumeroAziendale numeroAziendale = new NumeroAziendale();
				numeroAziendale.setNome(getNome());
				numeroAziendale.setCognome(getCognome());
				numeroAziendale.inserimento();

				break;
			}

			}
		}
		
	

	@Override
	public void visualizzazione() {
		NumeroCellulare numeroCellulare = new NumeroCellulare();
		NumeroAziendale numeroAziendale = new NumeroAziendale();
		NumeroFisso numeroFisso = new NumeroFisso();

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
		NumeroCellulare numeroCellulare = new NumeroCellulare();
		NumeroAziendale numeroAziendale = new NumeroAziendale();
		NumeroFisso numeroFisso = new NumeroFisso();

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
		NumeroCellulare numeroCellulare = new NumeroCellulare();
		NumeroAziendale numeroAziendale = new NumeroAziendale();
		NumeroFisso numeroFisso = new NumeroFisso();

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
	System.out.println("quale numero vuoi inserire? \n 0. indietro \n 1. numero cellulare \n 2. numero fisso \n 3. numero aziendale \n");
	}
	
}
