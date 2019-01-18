package com.zadaci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KalkulatorTest {

	Kalkulator calc;
	double a, b, rezultat;
	double delta;
	double sabiranje;
	double oduzimanje;
	double mnozenje;
	double djeljenje;

	@Before
	public void setUp() {
		calc = new Kalkulator();
		sabiranje = (a + b);
		oduzimanje = (a - b);
		mnozenje = (a * b);
		djeljenje = (a / b);
	}

	@Test
	public void shouldReturnValueWhenSabiranje() {
		double rezultat = calc.sabiranje(4.0, 6.0);
		Assert.assertEquals(10.0, rezultat, delta);
	}

	@Test
	public void shouldReturnValueWhenOduzimanje() {
		double rezultat = calc.oduzimanje(6.0, 4.0);
		Assert.assertEquals(2.0, rezultat, delta);
	}

	@Test
	public void shouldReturnValueWhenMnozenje() {
		double rezultat = calc.mnozenje(6.0, 4.0);
		Assert.assertEquals(24.0, rezultat, delta);

	}

	@Test
	public void shouldReturnValueWhenDjeljenje() {
		double rezultat = calc.djeljenje(24.0, 4.0);
		Assert.assertEquals(6.0, rezultat, delta);
	}
}