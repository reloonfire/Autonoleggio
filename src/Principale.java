
public class Principale {

	public static void main(String[] args) {
		
		Veicolo v = new Veicolo("Fiat","Panda",1200 ,"Verde","Diesel",5);
		
		ArchivioVeicoli av= new ArchivioVeicoli(10);
		
		av.aggiungiVeicolo(v);
		av.stampaElenco();
		
		System.out.println(v.getDettagli());
	}

}
