package agenziaviaggi;

public class Cliente {
	private String nome;
	private String cognome;
	
	
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public Cliente(String nome, String cognome) {
		if(nome.length() == 0)
			throw new IllegalArgumentException (" Scrivere il nome dell'utene");
		else 
			this.nome = nome;
		if(cognome.length() == 0)
			throw new IllegalArgumentException (" Scrivere il cognome dell'utene");
		else
			this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + "]";
	}

	

}
