import java.time.LocalDate;

public class ArchivioNoleggi {
	private Noleggio [] archivioNoleggi;
	private int indice=0;
	
	public ArchivioNoleggi(int dimensione) {
		archivioNoleggi = new Noleggio[dimensione];
	}
	
	public boolean aggiungiNoleggio(Noleggio n) {
		if(indice < archivioNoleggi.length) {
			archivioNoleggi[indice]= n;
			indice++;
			return true;
		}
		return false;
	}
	
	public void stampaElenco() {
		for(Noleggio n: archivioNoleggi) {
			if (n==null) break;
			System.out.println(n);
		}
	}
	
	private void removeNoleggio(int i) {
		for(int j=i;j<archivioNoleggi.length;j++) {
			archivioNoleggi[j]=archivioNoleggi[j+1];
			if (archivioNoleggi[j]==null) break;
		}
	}
	
	public boolean isNoleggiabile(Veicolo v, LocalDate inizio) {
		Noleggio n=getNoleggio(v);
		if (null != n  && n.dataFine.isAfter(inizio)) {
			return false;
		}
		return true;
	}
	
	public Noleggio getNoleggio(Veicolo v) {
		for (int i=0;i<archivioNoleggi.length;i++) {
			if (archivioNoleggi[i]==null) break;
			if (archivioNoleggi[i].veicolo==v) {
				if (archivioNoleggi[i].dataFine.isBefore(LocalDate.now())) {
					removeNoleggio(i);
				} else {
					return archivioNoleggi[i];
				}
			}
		}
		return null;
	}
}
