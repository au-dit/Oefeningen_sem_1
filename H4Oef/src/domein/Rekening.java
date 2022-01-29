package domein;

public class Rekening {
	
	//variabelle maken
	long rekeningnummer;
	double saldo;
	String houder;
	
	//constructoren
	public Rekening(long rekeningnummer, String houder) {
		setHouder(houder);
		setRekeningnummer(rekeningnummer);
		
	}
	public Rekening(long rekeningnummer) {
		this(rekeningnummer, "onbekend");
	}
	public Rekening() {
		this(123456789);
	}
	
	//getters
	public long getRekeningnummer() {
		return rekeningnummer;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getHouder() {
		return houder;
	}	
	
	
	//setters
	public void setHouder(String houder) {
		this.houder = houder;
	}
	private void setRekeningnummer(long rekeningnummer) {
		this.rekeningnummer = rekeningnummer;
	}
	
	
	//methodes
	public boolean stortOp(double bedrag) {
		if(bedrag <= 0) {
			return false;
		}else {
			this.saldo += bedrag;
			return true;
		}
	}
	public boolean haalAf(double bedrag) {
		if (bedrag <= 0 || this.saldo -bedrag < 0) {
			return false;
		}
		else {
			this.saldo -= bedrag;
			return true;
		}
	}
}
