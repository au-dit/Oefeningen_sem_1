package domein;

public class KauwgomAutomaat {
	
	//tag::attributen[]
	private String kleur;
	private String model;
	private int aantalBallen;
	private boolean vergrendeld = true;
	//end::attributen[]
		
	
	//tag::constructoren[]
	//tag::constructorMet1Parameter[]
	public KauwgomAutomaat(int aantalBallen) {
		setAantalBallen(aantalBallen);
		setKleur("rood");
		
	}
	//end::contructorenMet1Parameter[]
	public KauwgomAutomaat() {
		this(0);
	}
	//end::constructoren[]
	
	
	//tag::andereActies[]
	//tag::isLeeg[]
	public boolean isLeeg() {
		return aantalBallen == 0;
	}
	//end::isLeeg[]
	//tag::vulBij[]
	public void vulBij(int aantalBallen) {
		if(!vergrendeld)
			setAantalBallen(this.aantalBallen + aantalBallen);
		
	}
	//end::vulBij[]
	//end::andereActies[]
	
	//tag::gettersAndSetters[]
	public int getAantalBallen() {
		return aantalBallen;
	}
	//tag::setterMetControle[]
	private void setAantalBallen(int aantalBallen) {
		if (aantalBallen >=0 && aantalBallen < 150)
			this.aantalBallen = aantalBallen;	
	}
	//end::setterMetControle[]
	public String getKleur() {
		return kleur;
	}
	
	private void setKleur(String kleur) {
		this.kleur = kleur;
	}
	
	public boolean isVergrendeld() {
		return vergrendeld;
	}
	
	public final void setVergrendeld(boolean vergrendeld) {	
		this.vergrendeld = vergrendeld;	
	}
	//end::gettersAndSetters
	
	public void draaiHendel() {
		if(!isVergrendeld() && aantalBallen > 0)
			aantalBallen--;
	}
	
	
}
