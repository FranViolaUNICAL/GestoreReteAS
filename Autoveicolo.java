package traccia;

public class Autoveicolo {
	private String targa;
	private String marca;
	private int cilindrata;
	
	
	
	public Autoveicolo(String targa, String marca, int cilindrata) {
		super();
		this.targa = targa;
		this.marca = marca;
		this.cilindrata = cilindrata;
	}
	public Autoveicolo() {
		super();
		this.targa = "NONE";
		this.marca = "NONE";
		this.cilindrata = 0;
	}
	
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o == this) return true;
		if (!(o instanceof Autoveicolo)) return false;
		Autoveicolo a = (Autoveicolo)o;
		if(this.targa.equals(a.targa)) return true;
		return false;
	}
	public String toString() {
		return targa;
	}
	
	
}
