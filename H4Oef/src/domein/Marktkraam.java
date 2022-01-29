package domein;

public class Marktkraam {
	
	// attributen
	private String naam = "anoniem";
	private int lengteInM;
	private double inkomsten;
	
	//constructor
	public Marktkraam(String naam, int lengteInM) {
		setNaam(naam);
		setLengteInM(lengteInM);
	}
	
	//setter
	public void setNaam(String naam) {
		if (naam == null||naam=="")
			this.naam = "anoniem";
		else
			this.naam = naam;
	}
	public void setLengteInM(int lengteInM) {
		if(lengteInM<=10 && lengteInM>=2)
			this.lengteInM = lengteInM;
		else
			this.lengteInM = 10;
	}
	//getters
	public String getNaam() {
		return this.naam;
	}
	public int getLengteInM() {
		return this.lengteInM;
	}
	public double getInkomsten() {
		return this.inkomsten;
	}
	//methodes
	public void voegToeAanInkomsten(double bedrag) {
		if (bedrag>0)
			this.inkomsten+=bedrag;
	}
	public double berekenWinst() {
		double winst;
		double lengte = this.lengteInM;
		if (lengte<=5)
			winst = this.inkomsten-(lengte*3);
		else
			winst = this.inkomsten-(lengte*2.5);
		
		return winst;
	}
	
	
}
