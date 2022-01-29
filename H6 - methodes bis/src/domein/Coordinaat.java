package domein;

public class Coordinaat {
	
	private int x;
	private int y;
	
	// Constructor
	public Coordinaat(int x, int y) {
		setX(x);
		setY(y);
	}
	
	//setters
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	
	//getters
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	//methodes
	public void verplaats(String richting) {
		verplaats(richting, 1);
	}
	
	public void verplaats(String richting, int afstand) {
		switch (richting) {
		case "boven" -> y+=afstand;
		case "onder" -> y-=afstand;
		case "rechts" -> x+=afstand;
		case "links" -> x-=afstand;
		}
	}
	
	public void wisselXenY() {
		int temp = this.x;
		this.x = this.y;
		this.y = temp;
	}
	
	@Override
	public String toString() {
		return String.format("x = %d, y= %d", x,y);
	}
	
}


