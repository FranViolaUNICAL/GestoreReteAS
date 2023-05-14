package traccia;

public class Percorrenza {
	private Tratta tratta;
	private Autoveicolo auto;
	private int data;
	
	public Percorrenza(Tratta tratta, Autoveicolo auto, int data) {
		super();
		this.tratta = tratta;
		this.auto = auto;
		this.data = data;
	}

	public Tratta getTratta() {
		return tratta;
	}

	public void setTratta(Tratta tratta) {
		this.tratta = tratta;
	}

	public Autoveicolo getAuto() {
		return auto;
	}

	public void setAuto(Autoveicolo auto) {
		this.auto = auto;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o == this) return true;
		if (!(o instanceof Percorrenza)) return false;
		Percorrenza a = (Percorrenza)o;
		if(this.tratta.equals(a.tratta) && this.auto.equals(a.auto) && this.data == a.data) return true;
		return false;
	}
}
