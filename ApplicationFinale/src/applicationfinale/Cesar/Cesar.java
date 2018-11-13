/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationfinale.Cesar;


/**
 *
 * @author ayoub
 */
public class Cesar  {
    public String codageNum(char lettre) {
		String a = "";
		for (int i = 1; i <= 26; i++) {
			if (i < 10) {
				if (lettre == ('a' + i - 1)){
					a = "0" + i;}
				else if(lettre == ('A' + i - 1)){
					a = "0" + i;
				}
			} else {
				if (lettre == ('a' + i - 1)){
					a = "" + i;}
				else if(lettre == ('A' + i - 1)){
					a = "" + i;
				}
			}
		}
		return a;
	}
    
    public int chiffrementC(int codeNum, int cle) {
		int a = 0;
		if ((codeNum + cle) <= 26) {
			a = (codeNum + cle);
		}else{
			a=((codeNum+cle)%26);
		}
		if(a==0){a=26;}
		return a;
	}
    
    public char decodeNumminiscule(int chiffre){
		
		return (char) ('a'+chiffre-1);
	}
	
    public char decodeNummajuscule(int chiffre){
		
		return (char) ('A'+chiffre-1);
    }
    
     public int dechiffrementC(int codeNum, int cle) {
		int a = 0;
		if ((codeNum +26- cle) <= 26) {
			a = codeNum +(26- cle);
		}else{
			a=(codeNum+(26-cle))%26;
		}
		return a;}
     
    
}
