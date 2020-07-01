package interfacciaES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumeroCellulare extends Telefono {
		
	private static Map<String,List<Number>> mapNumeroCellulare = new HashMap<String,List<Number>>();
	private Number numeroCellulare;

	public NumeroCellulare(){
		super();
	}
	
	public Number getNumeroCellulare() {
		return numeroCellulare;
	}

	public void setNumeroCellulare(Number numeroCellulare) {
		this.numeroCellulare = numeroCellulare;
	}
	




	public static Map<String, List<Number>> getMapNumeroCellulare() {
		return mapNumeroCellulare;
	}

	public static void setMapNumeroCellulare(Map<String, List<Number>> mapNumeroCellulare) {
		NumeroCellulare.mapNumeroCellulare = mapNumeroCellulare;
	}

	@Override
	public void inserimento() {
		String key = getNome().concat(getCognome());	

		System.out.println("quale è il numero cellulare? \n");
			System.out.println("numero cellulare: ");
			this.numeroCellulare = scanner.nextLong();
			
			if(!mapNumeroCellulare.containsKey(key)){
				this.mapNumeroCellulare.put(key,new ArrayList<Number>());
			}
			this.mapNumeroCellulare.get(key).add((Number) this.numeroCellulare);
	}
	
	@Override
	public void visualizzazione() {
		String key = getNome().concat(getCognome());	

		if(this.mapNumeroCellulare.containsKey(key)){
			System.out.println("-----numeri cellulare-----");
			for(Number numero : this.mapNumeroCellulare.get(key)){
				int n = 1;
				System.out.println(n+". "+numero);
				n++;
			}
		}else{
			System.out.println("nessun numero \n");
		}
	}
	@Override
	public void elimina(){
		
		String key = getNome().concat(getCognome());	
		this.mapNumeroCellulare.remove(key);
		
	}
	@Override
	public void findAll(){
		
		String key = getNome().concat(getCognome());
		System.out.println(this.mapNumeroCellulare.keySet());
		
	}

}
