package agenziaviaggi;
import java.util.Vector;

public class Pacchetto {
	private String codice;
	private String descrizione;
	private int postiTotali;
	private Vector<Prenotazione> prenotazioni;
	
	
	public Pacchetto(String codice, String descrizione, int postiTotali) {
		if (codice.length() == 0)
			throw new IllegalArgumentException ("Inserire il codice, deve avere più di 0 caratteri");
		else
			this.codice = codice;
		if (descrizione.length() == 0)
			throw new IllegalArgumentException("Inserire la descrizione, deve avere più di 0 caratteri");
		else
			this.descrizione = descrizione;
		this.postiTotali = postiTotali;
		this.prenotazioni = new Vector<Prenotazione>();//nome della classe non nome stesso
		
	}
	
	public void addPrenotazione(Prenotazione p){
		if (getPostiDisponibili() < p.getPostiRichiesti())
			throw new IllegalArgumentException("I posti non sono disponibili"); 
		else
			this.prenotazioni.addElement(p);
	}
	
	public int getPostiDisponibili(){
		int postiDisponibili = this.postiTotali;
		for(int i=0;i<prenotazioni.size();i++)
		{
			postiDisponibili-= prenotazioni.elementAt(i).getPostiRichiesti();
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
