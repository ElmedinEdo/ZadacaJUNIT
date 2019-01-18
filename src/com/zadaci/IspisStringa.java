package com.zadaci;

public class IspisStringa {

	public int stringLength(String s) {

		return s.length();
	}

	public int brojMalihSlovaStringa(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (Character.isLowerCase(s.charAt(i)))
				count++;
		return count;
	}

	public int brojVelikihSlovaStringa(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (Character.isUpperCase(s.charAt(i)))
				count++;
		return count;
	}

	public int ostaliKarakteri(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (!(Character.isLetter(s.charAt(i))))
				count++;

		return count;
	}

	public boolean parnePozicije(String s) {
		for (int i = 0; i < s.length(); i++)
			if (i % 2 != 0) {
				System.out.println(s.charAt(i) + " Neparne pozicije karaktera nekog stringa");
			} else {
				System.out.println(s.charAt(i)+ " Parne pozicije karaktera nekog stringa");
			}

		return true;
	}

	public boolean neparnePozicije(String s) {
		for (int i = 0; i < s.length(); i++)
			if (i % 2 != 0) {
				System.out.println(s.charAt(i) + " Neparne pozicije karaktera nekog stringa");
			} else {
				System.out.println(s.charAt(i)+ " Parne pozicije karaktera nekog stringa");
			}

		return true;
	}

	}

