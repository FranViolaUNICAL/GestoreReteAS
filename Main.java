package traccia;

import java.util.ArrayList;

public class Main {


	
	public static void main(String[] args){
		GestioneReteAS G = new GestioneReteAS();
		Citta c1 = new Citta("Rende","CS","Calabria");
		Citta c2 = new Citta("Lamezia Terme", "CA", "Calabria");
		G.add();
		int j = G.accessi(c1);
		System.out.println(j);
		ArrayList<Autoveicolo> lista = G.trovaAutoveicoli(70);
		System.out.println(lista);
		Autoveicolo a = G.trovaAutoveicolo(0, 1);
		System.out.println(a);
		ArrayList<Citta> listaCitta = G.cittaGettonate();
		System.out.println(listaCitta);

		
	}
}
