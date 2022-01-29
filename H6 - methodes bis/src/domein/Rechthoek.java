package domein;

public class Rechthoek {

	private double lengte;
	private double breedte;
	private Coordinaat positie;
	
	//Constructor
	public Rechthoek(double lengte, double breedte, Coordinaat positie) {
		setLengte(lengte);
		setBreedte(breedte);
		setPositie(positie);
		
	}
	
	//setters
	public void setLengte(double lengte) {
		this.lengte=lengte;
	}
	
	public void setBreedte(double breedte) {
		this.breedte=breedte;
	}
	
	public void setPositie(Coordinaat positie) {
		this.positie=positie;
	}
	
	
	//getters
	public double getLengte() {
		return this.lengte;
	}
	
	public double getBreedte() {
		return this.breedte;
	}
	
	
	//Methodes
	public double geefOppervlakte() {
		return (this.breedte*this.lengte);
	}
	
	public double geefOmtrek() {
		return (2*(this.lengte+this.breedte));
	}
	
	public void verschuif(String richting) {
		this.positie.verplaats(richting);
	}
	
	public void verschuif(String richting, int afstand) {
		this.positie.verplaats(richting,afstand);
	}
	
	public int geefXpos() {
		return this.positie.getX();
	}
	
	public int geefYpos() {
		return this.positie.getY();
	}	
	
	@Override
	public String toString() {
		return String.format("Rechthoek van %.2f op %.2f op coordinaat (%d, %d).", lengte,breedte,this.positie.getX(),this.positie.getY());
	}
	
	
}
