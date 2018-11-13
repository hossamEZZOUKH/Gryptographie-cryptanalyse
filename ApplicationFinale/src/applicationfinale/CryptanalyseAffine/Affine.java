/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationfinale.CryptanalyseAffine;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author yahya
 */
public class Affine {
    private HashMap<String, Character> alpha;

	public Affine() {
		alpha = new HashMap<String, Character>();

		for (int j = 0; j < 26; j++) {
			String s = "";
			if (j < 9)
				s = "0" + (j + 1);
			else
				s = "" + (j + 1);
			alpha.put(s, (char) ('a' + j));
		}
	}

	public HashMap<String, Character> getAlpha() {
		return this.alpha;
	}

	public String getCharCode(char c) {
		Iterator<String> alphaIter = alpha.keySet().iterator();
		String key = "";
		while (alphaIter.hasNext()) {
			key = (String) alphaIter.next();
			if (alpha.get(key).equals(c))
				break;
		}
		return key;
	}

	public String crypter(String s, int a, int b) {
		
		s = s.toLowerCase().replaceAll("[^a-z]", "");
		
		int ch;
		String X;
		String msgCrypte = "";

		s = s.toLowerCase();
		for (int j = 0; j < s.length(); j++) {
			if (String.valueOf(s.charAt(j)).equals(" ")) {
				msgCrypte += " ";
				continue;
			}
			X = getCharCode((char) s.charAt(j));
			ch = ((a * Integer.parseInt(X)) + b) % 26;

			if (ch == 0)
				msgCrypte += alpha.get("26");
			else if (ch >= 1 && ch <= 9)
				msgCrypte += alpha.get("0" + ch);
			else
				msgCrypte += alpha.get("" + ch);
		}
		return msgCrypte.toUpperCase();

	}

	public String decrypter(String s, int a, int b) {

		s = s.toLowerCase().replaceAll("[^a-z]", "");

		int ch;
		String msg = "";
		int invA = 1;

		for (int j = 0; j < s.length(); j++) {
			if (String.valueOf(s.charAt(j)).equals(" ")) {
				msg += " ";
				continue;
			}

			invA = inverse(a);

			ch = Math.abs(((invA) * (Integer.parseInt(getCharCode((char) s.charAt(j))) + 26 - b)) % 26);

			if (ch == 0)
				msg += alpha.get("26");
			else if (ch >= 1 && ch <= 9)
				msg += alpha.get("0" + ch);
			else
				msg += alpha.get("" + ch);
		}

		return msg.toUpperCase();

	}

	public int inverse(int a) {
		int invA = 0;
		for (int k = 26; k >= 1; k--)
			if (pgcd(k, 26) == 1 && a * k % 26 == 1) {
				invA = k;
				break;
			}
		if (invA == 26) {
			System.out.println(a + " n'a pas d'inverse");
			invA = 1;
		}
		return invA;
	}

	public int pgcd(int a, int b) {

		if (b == 0)
			return a;
		else
			return pgcd(b, a % b);

	}
    
}
