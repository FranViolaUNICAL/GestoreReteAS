package traccia;

public class Citta implements Comparable<Citta>{
	private String provincia;
	private String regione;
	private String nome;
	
	
	
	public Citta(String nome, String provincia, String regione) {
		super();
		this.provincia = provincia;
		this.regione = regione;
		this.nome = nome;
	}
	
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getRegione() {
		return regione;
	}
	public void setRegione(String regione) {
		this.regione = regione;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome;
	}
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o == this) return true;
		if (!(o instanceof Citta)) return false;
		Citta c = (Citta)o;
		if(this.nome.equals(c.getNome()) && this.provincia.equals(c.provincia)) return true;
		return false;
		
	}
	
	public int compareTo(Citta c) {
		GestioneReteAS g = new GestioneReteAS();
		int ret = -2;
		int autoThis = g.accessi(this);
		System.out.println(autoThis);
		int autoComparata = g.accessi(c);
		System.out.println(autoComparata);
		if(g.accessi(this) > g.accessi(c)) ret = 1;
		if(g.accessi(this) < g.accessi(c)) ret = -1;
		if(g.accessi(this) == g.accessi(c)) ret = 0;
		return ret;
	}
	
	
	
}
