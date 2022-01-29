package domein;

public class Product {
	//attributen
	String naam;
	int btwPercentage;
	int korting6StuksPercentage;
	double prijsExclBtw;
	
	//setters
	private void setNaam(String naam) {
		this.naam = naam;
	}
	public void setBtwPercentage(int btwPercentage) {
		this.btwPercentage = (btwPercentage>=6 && btwPercentage <= 21)? btwPercentage:21;
	}
	public void setKorting6StuksPercentage(int korting6Stukken) {
		this.korting6StuksPercentage = (korting6Stukken>=0 && korting6Stukken <=50)?korting6Stukken:0;
	}
	public void setPrijsExclBtw(double prijsExclBtw) {
		this.prijsExclBtw=prijsExclBtw;
	}
	
	//getters
	public String getNaam() {
		return this.naam;
	}
	public int getBtwPercentage() {
		return this.btwPercentage;
	}
	public int getKorting6StuksPercentage() {
		return this.korting6StuksPercentage;
	}
	public double getPrijsExclBtw() {
		return this.prijsExclBtw;
	}
	
	//constructoren
	public Product(String naam, double prijsExclBtw, int btwPercentage, int korting6Stukken) {
		this.setNaam(naam);
		this.setBtwPercentage(btwPercentage);
		this.setKorting6StuksPercentage(korting6Stukken);
		this.setPrijsExclBtw(prijsExclBtw);
	}
	
	//methodes
	public double berekenPrijs(int aantal) {
		//berekenen van de prijs
		double btwPercentage = this.btwPercentage;
		double korting = this.korting6StuksPercentage;
		double prijsTotaal = aantal*(this.prijsExclBtw*((btwPercentage+100)/100));
		if (aantal>=6) {
			prijsTotaal*=((100-korting)/100);
		}
		return prijsTotaal;
	}
	
	}
