package com.zadaci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IspisStringaTest {

	IspisStringa rijec = new IspisStringa();
	String s = "tEst1$";

	@Before
	public void setUp() {
		rijec = new IspisStringa();
	}

	@Test
	public void shouldReturnStringLengthWhenInputString() {
		int rezultat = rijec.stringLength(s);
		assertEquals(6, rezultat);
	}

	@Test
	public void shouldReturnMalaSlovaWhenInputString() {
		int rezultat = rijec.brojMalihSlovaStringa(s);
		assertEquals(3, rezultat);
	}

	@Test
	public void shouldReturnVelikaSlovaWhenInputString() {
		int rezultat = rijec.brojVelikihSlovaStringa(s);
		assertEquals(1, rezultat);
	}

	@Test
	public void shouldReturnOstaliKarakteriWhenInputString() {
		int rezultat = rijec.ostaliKarakteri(s);
		assertEquals(2, rezultat);
	}

	@Test
	public void shouldReturnTrueKarakteriNaParnimPozicijamaWhenInputString() {
		boolean rezultat = rijec.parnePozicije(s);
		assertTrue("ts1", rezultat);
	}

	@Test
	public void shouldReturnTrueKarakteriNaNeparnimPozicijamaWhenInputString() {
		boolean rezultat = rijec.neparnePozicije(s);
		assertTrue("Et$", rezultat);
	}
}