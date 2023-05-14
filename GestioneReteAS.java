package traccia;
import java.util.*;
public class GestioneReteAS {
	Autoveicolo a0 = new Autoveicolo("XXX","ALF",2400);
	Autoveicolo a1 = new Autoveicolo("YYY","MER",1600);
	Autoveicolo a2 = new Autoveicolo("ZZZ","VOL",1900);
	Autoveicolo a3 = new Autoveicolo("WWW","REN",1600);	
	ArrayList<Autoveicolo> autoveicoli = new ArrayList<>();
	Citta c0 = new Citta("Lamezia Terme","CZ","Calabria");
	Citta c1 = new Citta("Rende","CS","Calabria");
	Citta c2 = new Citta("Milano","MI","Lombardia");
	Citta c3 = new Citta("Roma","RM","Lazio");
	Citta c4 = new Citta("Firenze","FI","Toscana");
	Citta c5 = new Citta("Torino","TO","Piemonte");
	ArrayList<Citta> citta = new ArrayList<>();
	Tratta t0 = new Tratta("cod00","tratta0",c0,c1,80);
	Tratta t1 = new Tratta("cod01","tratta1",c3,c1,516);
	Tratta t2 = new Tratta("cod02","tratta2",c3,c4,277);
	Tratta t3 = new Tratta("cod03","tratta3",c4,c2,302);
	Tratta t4 = new Tratta("cod04","tratta4",c5,c2,141);
	ArrayList<Tratta> tratte = new ArrayList<>();
	Percorrenza p0 = new Percorrenza(t0,a0,1);
	Percorrenza p1 = new Percorrenza(t0,a1,1);
	Percorrenza p2 = new Percorrenza(t2,a1,1);
	ArrayList<Percorrenza> percorrenze = new ArrayList<>();
	
	public void add() {
		  autoveicoli.add(a0);
		   autoveicoli.add(a1);
		   autoveicoli.add(a2);
		   autoveicoli.add(a3);
		   citta.add(c0);
		   citta.add(c1);
		   citta.add(c2);
		   citta.add(c3);
		   citta.add(c4);
		   citta.add(c5);
		   tratte.add(t0);
		   tratte.add(t1);
		   tratte.add(t2);
		   tratte.add(t3);
		   tratte.add(t4);
		   percorrenze.add(p0);
		   percorrenze.add(p1);
		   percorrenze.add(p2);
	}

	public int accessi(Citta c) {
		int ret = 0;
		for(int i = 0; i < percorrenze.size(); i++) {
			Tratta t = percorrenze.get(i).getTratta();
			if(t.getCittaDestinazione().equals(c)) {
				ret++;
			}
		}
		return ret;
	}	  
	
	public ArrayList<Autoveicolo> trovaAutoveicoli(int x){
		ArrayList<Autoveicolo> ret = new ArrayList<>();
		ArrayList<Autoveicolo> ignora = new ArrayList<>();
		for(int i = 0; i<percorrenze.size();i++) {
			Autoveicolo a = percorrenze.get(i).getAuto();
			Tratta t = percorrenze.get(i).getTratta();
			int distanza = t.getDistanza();
			if(distanza > x) {
				ignora.add(a);
			}
		}
		for(int j = 0;j<autoveicoli.size();j++) {
			if(!(ignora.contains(autoveicoli.get(j)))) 
				ret.add(autoveicoli.get(j));
		}
		System.out.println(ignora);
		return ret;
	}
	
	public Autoveicolo trovaAutoveicolo(int d1, int d2) {
		Autoveicolo ret = new Autoveicolo();
		int contatore = 0;
		for(int i = 0; i < autoveicoli.size();i++) {
			Autoveicolo auto = autoveicoli.get(i);
			int trattePercorse = trattePercorse(auto,d1,d2);
			if(trattePercorse > contatore) {
				contatore = trattePercorse;
				ret = auto;
			}
		}
		return ret;
		
	}
	   
	private int trattePercorse(Autoveicolo a,int d1,int d2) {
		int ret = 0;
		for(int i = 0; i < percorrenze.size();i++) {
			int data = percorrenze.get(i).getData();
			Autoveicolo auto = percorrenze.get(i).getAuto();
			System.out.println(data);
			if(data >= d1 && data <= d2) {
				if(auto.equals(a)){
					System.out.println("YES");
					ret++;
				}
			}
		}
		return ret;
	}
	public ArrayList<Citta> cittaGettonate() {
	    ArrayList<Citta> ret = new ArrayList<>();
	    ArrayList<Citta> retTrue = new ArrayList<>();
	    ArrayList<Citta> listaCitta = new ArrayList<>(citta);
	    for(Citta c : citta) {
	        listaCitta.add(c);
	    }
	    while(listaCitta.size() > 0) {
	        Citta citta = cittaPiuAccessi(listaCitta);
	        listaCitta.remove(citta);
	        if(!(ret.contains(citta))) ret.add(citta);
	    }
	    return ret;
	}
	
	private Citta cittaPiuAccessi(ArrayList<Citta> listaCitta) {
	    Citta ret = listaCitta.get(0);
	    int accessiMax = accessi(ret);
	    for(int i = 1; i < listaCitta.size(); i++) {
	        Citta citta = listaCitta.get(i);
	        int accessiCitta = accessi(citta);
	        if(accessiCitta > accessiMax) {
	            ret = citta;
	            accessiMax = accessiCitta;
	        }
	    }
	    return ret;
	}
