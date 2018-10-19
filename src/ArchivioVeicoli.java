
public class ArchivioVeicoli {
	private Veicolo [] archivioVeicoli;
	private int indice=0;
	
	public ArchivioVeicoli(int dimensione) {
		archivioVeicoli = new Veicolo[dimensione];
		
	}
	
	public boolean aggiungiVeicolo(Veicolo v) {
		if(indice < archivioVeicoli.length) {
		archivioVeicoli [indice]= v;
		indice++;
		return true;
		}
	return false;
	}
	public void stampaElenco() {
		for(Veicolo v: archivioVeicoli) {
			if (v==null) break;
			System.out.println(v);
		}
	}
}
