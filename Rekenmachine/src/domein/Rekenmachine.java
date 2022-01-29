package domein;

public class Rekenmachine {
	
	//attributen
	private double resultaat;
	
	//getters
	public double getResultaat() {
		return this.resultaat;
	}
	
	//methodes
	public void telOp(double getal) {
		this.resultaat += getal;
	}
	public void trekAf(double getal) {
		this.resultaat -= getal;
	}
	public void vermenigvuldig(double getal) {
		this.resultaat *= getal;
	}
	public void deelDoor(double getal) {
		this.resultaat /= getal;
	}
	public void clear() {
		this.resultaat = 0.0;
	}
	
	
}
