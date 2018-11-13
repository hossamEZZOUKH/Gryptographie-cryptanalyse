package applicationfinale.Hill;

import javax.management.openmbean.TabularType;

public class Hill {
	public boolean testInver(int a, int b, int c, int d) {
		boolean test;
		if ((a * d - b * c) % 2 == 1 && (a % 13) != 0) {// impair et n'est pas
								// multiple de 13

			return true;
		} else {
			test = false;
		}

		return test;
	}

	public int[] matricinver(int a, int b, int c, int d) {
		int matriceinv[] = new int[4];
		int det = a * d - b * c;
		int invdet = 0;
		for (int i = 0;; i++) {
			if ((det * i) % 26 == 1) {
				invdet = i;
				break;
			}
		}

		matriceinv[0] = (invdet * d) % 26;
		matriceinv[1] = (invdet * (-b)) % 26 + 26;
		matriceinv[2] = (invdet * (-c)) % 26 + 26;
		matriceinv[3] = (invdet * a) % 26;
		return matriceinv;
	}

	public String[] subdiMessage(String message) {
		int longueur = message.length();
		int j = 0;
		String[] tabChaine = new String[message.length() / 2 + 1];
		if (longueur % 2 == 0) {
			for (int i = 0; i < message.length() / 2; i++) {
				tabChaine[i] = message.substring(2 * i, 2 * i + 2);
			}
		} else {
			for (int i = 0; i < message.length() / 2; i++) {
				tabChaine[i] = message.substring(2 * i, 2 * i + 2);
			}
			tabChaine[(message.length() - 1) / 2] = message.substring(message
					.length() - 1);
		}
		return tabChaine;
	}

	public int[] chiffrementH(String message, String bString[], int a, int b,
			int c, int d) {
		int[] chiff = new int[(message.length())];
		for (int i = 0; i < (bString.length); i++) {
			chiff[2 * i] = (a * Integer.parseInt(bString[i].substring(0, 2)) + b
					* Integer.parseInt(bString[i].substring(2, 4))) % 26;
			chiff[2 * i + 1] = (c
					* Integer.parseInt(bString[i].substring(0, 2)) + d
					* Integer.parseInt(bString[i].substring(2, 4))) % 26;

			if (chiff[2 * i] == 0) {
				chiff[2 * i] = 26;
			}
			if (chiff[2 * i + 1] == 0) {
				chiff[2 * i + 1] = 26;
			}
		}
		return chiff;
	}

	public int[] dechiffrementH(String message, String bString[], int a, int b,
			int c, int d) {
		int[] chiff = new int[(message.length())];
		for (int i = 0; i < (bString.length); i++) {
			chiff[2 * i] = (a * Integer.parseInt(bString[i].substring(0, 2)) + b
					* Integer.parseInt(bString[i].substring(2, 4))) % 26;

			chiff[2 * i + 1] = (c
					* Integer.parseInt(bString[i].substring(0, 2)) + d
					* Integer.parseInt(bString[i].substring(2, 4))) % 26;
			
			if (chiff[2 * i] == 0) {
				chiff[2 * i] = 26;
			}
			if (chiff[2 * i + 1] == 0) {
				chiff[2 * i + 1] = 26;
			}}
		return chiff;
	}

	public String codageNum(String lettre) {
		String a = "";
		String b = "";
		for (int i = 1; i <= 26; i++) {
			if (i < 10) {
				if (lettre.charAt(0) == ('a' + i - 1)) {
					a = "0" + i;
				} else if (lettre.charAt(0) == ('A' + i - 1)) {
					a = "0" + i;
				}
			} else {
				if (lettre.charAt(0) == ('a' + i - 1)) {
					a = "" + i;
				} else if (lettre.charAt(0) == ('A' + i - 1)) {
					a = "" + i;
				}
			}
		}

		for (int i = 1; i <= 26; i++) {
			if (i < 10) {
				if (lettre.charAt(1) == ('a' + i - 1)) {
					b = "0" + i;
				} else if (lettre.charAt(1) == ('A' + i - 1)) {
					b = "0" + i;
				}
			} else {
				if (lettre.charAt(1) == ('a' + i - 1)) {
					b = "" + i;
				} else if (lettre.charAt(1) == ('A' + i - 1)) {
					b = "" + i;
				}
			}
		}

		return a + b;
	}

	// pour les trois methodes
	public char decodeNumminiscule(int chiffre) {

		return (char) ('a' + chiffre - 1);
	}

	public char decodeNummajuscule(int chiffre) {

		return (char) ('A' + chiffre - 1);
	}

}
