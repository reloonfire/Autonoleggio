
public class Veicolo {
	private String marca;
	private String modello;
	private int cc;
	private String colore;
	private String tipoAlimentazione;
	private int numeroPosti;
	
	public Veicolo(String marca, String modello, int cc, String colore, String tipoAlimentazione, int numeroPosti) {
		this.marca = marca;
		this.modello = modello;
		this.cc = cc;
		this.colore = colore;
		this.tipoAlimentazione = tipoAlimentazione;
		this.numeroPosti = numeroPosti;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @return the modello
	 */
	public String getModello() {
		return modello;
	}

	/**
	 * @return the cc
	 */
	public int getCc() {
		return cc;
	}

	/**
	 * @return the colore
	 */
	public String getColore() {
		return colore;
	}

	/**
	 * @return the tipoAlimentazione
	 */
	public String getTipoAlimentazione() {
		return tipoAlimentazione;
	}

	/**
	 * @return the numeroPosti
	 */
	public int getNumeroPosti() {
		return numeroPosti;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "marca=" + marca + ", modello=" + modello ;
	}
	public String getDettagli() {
		return "marca=" + marca + ", modello=" + modello + ",\ncc=" + cc + ", colore=" + colore
				+ ", tipoAlimentazione=" + tipoAlimentazione + ", numeroPosti=" + numeroPosti ;
	}
	
}
