package com.zadaci;

public class Konverter {

	public double kilogramToFunte(double i) {

		return (i * 2.20);
	}

	public double funteToKilogram(double i) {

		return (i * 0.45);
	}

		
	public double centimetarToInch(double i) {
		
		return (i * 0.39);
	}

	public double inchToCentimetar(double i) {
	
		return (i  * 2.54);
	}

	public double fahrenheitToCelsius(double fahrenheit) {
	
		return (5.0 / 9) * (fahrenheit -32);
	}
	
	public double celsiusToFahrenheit(double celsius) {
		
		return ((9.0 / 5 * celsius) + 32);
	}}
