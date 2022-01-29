package testen;

import domein.Bar;
import org.junit.jupiter.api.*;

public class BarTest {
	
	private Bar bar;
	private int leeftijd;
	
	@BeforeEach
	public void SetUp() {
		bar = new Bar();
	};
	
	
	
	@Test
	public void magAlcoholDrinken_oudGenoeg_retourneertTrue() {
		leeftijd = 22;
		boolean resultaat = bar.magAlcoholDrinken(leeftijd);
		Assertions.assertTrue(resultaat);
		
	}
	@Test
	public void magAlcoholDrinken_nietOudGenoeg_retourneertFalse() {
		leeftijd = 11;
		boolean resultaat = bar.magAlcoholDrinken(leeftijd);
		Assertions.assertFalse(resultaat);
	}
	@Test
	public void magAlcoholDrinken_grensgevalIs16_retourneertTrue() {
		leeftijd = 16;
		boolean resultaat = bar.magAlcoholDrinken(leeftijd);
		Assertions.assertTrue(resultaat);
	}
	@Test
	public void magAlcoholDrinken_grensgevalIs15_retourneertFalse() {
		leeftijd = 15;
		boolean resultaat = bar.magAlcoholDrinken(leeftijd);
		Assertions.assertFalse(resultaat);
	}
	
	
}
