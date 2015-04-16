package agenziaviaggi;

public class Prenotazione {
	private String codice;
	private int postiRichiesti;
	private Filiale filiale;
	private Cliente cliente;
	private Pacchetto pacchetto;
	
	public Prenotazione(String codice, int postiRichiesti, Filiale filiale,
			Cliente cliente) {
		if (codice.length() == 0)
			throw new IllegalArgumentException ("Inserire il codice, deve avere più di 0 caratteri");
		else
			this.codice = codice;
		this.postiRichiesti = postiRichiesti;
		this.filiale = filiale;
		this.cliente = cliente;
	}
	
	public void setPacchetto(Pacchetto p){
		
		this.pacchetto=p;
	}

	public String getCodice() {
		return codice;
	}

	public int getPostiRichiesti() {
		return postiRichiesti;
	}

	public Filiale getFiliale() {
		return filiale;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
		return "Prenotazione [codice=" + codice + ", postiRichiesti="
				+ postiRichiesti + ", filiale=" + filiale + ", cliente="
				+ cliente + ", pacchetto=" + pacchetto + "]";
	}
}