package agenziaviaggi;

public class Filiale {
	private int numero;

	public int getNumero() {
		return numero;
	}

	public Filiale(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Filiale [numero=" + numero + "]";
	}



}
