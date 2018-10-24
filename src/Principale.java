import java.time.LocalDate;

public class Principale {

	public static void main(String[] args) {
		
		Veicolo v = new Veicolo("Fiat","Panda",1200 ,"Verde","Diesel",5);
		
		ArchivioVeicoli av= new ArchivioVeicoli(10);
		
		av.aggiungiVeicolo(v);
		av.stampaElenco();
		
		ArchivioNoleggi an = new ArchivioNoleggi(10);
		
		an.aggiungiNoleggio(new Noleggio(v, LocalDate.of(2018,10,4), LocalDate.of(2018, 12, 2)));
		if (an.isNoleggiabile(v, LocalDate.of(2018, 11, 1))) {
			System.out.println("Noleggiabile");
		} else {
			System.out.println("occupata");
		}
		an.stampaElenco();
	}

}
