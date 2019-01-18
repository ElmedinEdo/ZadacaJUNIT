package com.zadaci;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KonverterTest {

	Konverter konverter = new Konverter();
	double rezultat, unos;
	double delta;
	double celsius, fahrenheit;
    double inch, centimetar;
	double kilogram, funte;
	
	@Before
	public void setUp(){
		konverter = new Konverter();
		
		kilogram = (unos / 2.20);
		funte = (unos * 2.20);
		
		centimetar = (unos / 2.54);
		inch = (unos * 2.54);
		
		
		celsius = celsius =(5.0 / 9) * (fahrenheit -32);
		fahrenheit =((9.0 / 5 * celsius ) + 32);
		}
	
	@Test
	public void shouldReturnKilogramWhenEnterFunte(){
		rezultat = konverter.funteToKilogram(4.0);
		Assert.assertEquals(1.8, rezultat, delta);
	}
	@Test
	public void shouldReturnFunteWhenEnterKilogram(){
		rezultat = konverter.kilogramToFunte(2.0);
		Assert.assertEquals(4.4, rezultat, delta);
}
	
	
	@Test
	public void shouldReturnCentimetarWhenEnterInch(){
		rezultat = konverter.inchToCentimetar(1);
		Assert.assertEquals(2.54, rezultat, delta);
	}
	@Test
	public void shouldReturnInchWhenEnterCentimetar(){
		rezultat = konverter.centimetarToInch(1.0);
		Assert.assertEquals(0.39, rezultat, delta);
	}

	@Test
	public void shouldReturnCelsiusWhenEnterFahrenheit(){
		rezultat = konverter.fahrenheitToCelsius(32);
		Assert.assertEquals(0.0, rezultat, delta);
	
}
		
	@Test
	public void shouldReturnFahrenheitWhenEnterCelsius(){
		rezultat = konverter.celsiusToFahrenheit(32);
		Assert.assertEquals(89.6, rezultat, delta);
}
}




