import java.time.LocalDate;

public class Noleggio {

	Veicolo veicolo;
	LocalDate dataInizio;
	LocalDate dataFine;
	
	public Noleggio(Veicolo veicolo, LocalDate dataInizio, LocalDate dataFine) {
		this.veicolo = veicolo;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}

	public Veicolo getVeicolo() {
		return veicolo;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public LocalDate getDataFine() {
		return dataFine;
	}

	@Override
	public String toString() {
		return "Noleggio [veicolo=" + veicolo.getMarca()+" "+veicolo.getModello() +
			    ", dataInizio=" + dataInizio + ", dataFine=" + dataFine + "]";
	}
	
}