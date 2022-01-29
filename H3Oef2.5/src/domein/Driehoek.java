package domein;

public class Driehoek {
	
	//declaring variables
	private int a=1;
	private int b=1;
	private int c=1;
	
	public Driehoek(int a, int b, int c) {
		setA(a);
		setB(b);
		setC(c);
	}
	
	private void setA(int a) {
		if (a>0)
			this.a = a;
	}
	private void setB(int b) {
		if (b>0)
			this.b = b;
	}
	private void setC(int c) {
		if (c>0)
			this.c = c;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	
	public boolean isRechthoekigeDriehoek() {
		if(a*a==b*b+c*c||b*b==c*c+a*a||c*c==a*a+b*b)
			return true;
		else return false;
	}
}
