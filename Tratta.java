package traccia;

public class Tratta {
	private String codice;
	private String nome;
	private Citta cittaPartenza;
	private Citta cittaDestinazione;
	private int distanza;
	
	
	
	public Tratta(String codice, String nome, Citta cittaPartenza, Citta cittaDestinazione, int distanza) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.cittaPartenza = cittaPartenza;
		this.cittaDestinazione = cittaDestinazione;
		this.distanza = distanza;
	}
	
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Citta getCittaPartenza() {
		return cittaPartenza;
	}
	public void setCittaPartenza(Citta cittaPartenza) {
		this.cittaPartenza = cittaPartenza;
	}
	public Citta getCittaDestinazione() {
		return cittaDestinazione;
	}
	public void setCittaDestinazione(Citta cittaDestinazione) {
		this.cittaDestinazione = cittaDestinazione;
	}
	public int getDistanza() {
		return distanza;
	}
	public void setDistanza(int distanza) {
		this.distanza = distanza;
	}
	
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof Tratta)) return false;
		if(o == this) return true;
		Tratta t = (Tratta) o;
		if(t.codice == this.codice) return true;
		return false;
	}
}


