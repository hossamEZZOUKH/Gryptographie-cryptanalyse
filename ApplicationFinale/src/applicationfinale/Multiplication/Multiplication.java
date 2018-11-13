/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationfinale.Multiplication;

/**
 *
 * @author ayoub
 */
public class Multiplication {
    
    public int chiffrementM(int codeNum, int cle) {
		int a = 0;
		if ((codeNum * cle) <= 26) {
			a = codeNum * cle;
		}else{
			a=(codeNum*cle)%26;
		}
		if(a==0){a=26;}
		return a;
	}
    public int inverse(int a)
	{int i,inva;
			
		for(i=0;;i++){
			if((26*i+1)%a==0){
				inva=(26*i+1)/a;
				break;
			}
			
		}
		
		return inva;
	}
	
	// pour les trois methodes 
	public int dechiffrementM(int codeNum, int cle) {
		int invcle=inverse(cle);
		int a = 0;
	
		
		
		
		if ((codeNum*invcle) <= 26) {
			a = (codeNum*invcle);
		}else{
			a=(codeNum*invcle)%26;
		}
		return a;}
	public char decodeNumminiscule(int chiffre){
		
		return (char) ('a'+chiffre-1);
	}
	
    public char decodeNummajuscule(int chiffre){
		
		return (char) ('A'+chiffre-1);
	}
    
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
}
