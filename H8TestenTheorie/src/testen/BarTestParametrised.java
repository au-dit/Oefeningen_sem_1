package testen;

import domein.Bar;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.*;


public class BarTestParametrised {
	
	private Bar bar;
	private int leeftijd;
	
	@BeforeEach
	public void SetUp() {
		bar = new Bar();
	};
	
	@ParameterizedTest
	@ValueSource(ints = {-1,11,15})
	public void magAlcoholDrinken_teJong_retourneerdFalse(int leeftijd) {
		Assertions.assertFalse(bar.magAlcoholDrinken(leeftijd));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {16,22,1234})
	public void magAlcoholDrinken_oudGenoeg_retourneerdTrue(int leeftijd) {
		Assertions.assertTrue(bar.magAlcoholDrinken(leeftijd));
	}
	
}
