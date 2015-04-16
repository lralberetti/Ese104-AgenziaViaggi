package agenziaviaggi;
import java.util.Vector;

public class Pacchetto {
	private String codice;
	private String descrizione;
	private int postiTotali;
	private Vector<Prenotazione> prenotazioni;
	
	
	public Pacchetto(String codice, String descrizione, int postiTotali) {
		
		this.codice = codice;
		this.descrizione = descrizione;
		this.postiTotali = postiTotali;
		this.prenotazioni = new Vector<Prenotazione>();//nome della classe non nome stesso
		
	}
	
	public void addPrenotazione(Prenotazione p){
		if(p.getPostiRichiesti()>getPostiDisponibili()) //PostiRichiesti si trova dentro prenotazione perchio uso p. per riferirmi al metodo di un altra classe
			throw new IllegalArgumentException("I posti non sono disponibili"); 
		else
			this.prenotazioni.addElement(p);
	}
	
	public int getPostiDisponibili(){
		int postiDisponibili=getPostiTotali();
		for(int i=0;i<prenotazioni.size();i++)
		{
			postiDisponibili //utiliazzare il -= 
		}
		return postiDisponibili;
	}
		
	public String getDescrizione(){
		return descrizione;
	}
	
	public String getCodice(){
		return codice;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	
}
