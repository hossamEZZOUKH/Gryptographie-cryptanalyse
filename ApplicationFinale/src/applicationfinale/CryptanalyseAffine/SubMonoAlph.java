/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationfinale.CryptanalyseAffine;

/**
 *
 * @author yahya
 */
public class SubMonoAlph {
    
    public int codageNum(char lettre) {
		int a = 0 ;
		for (int i = 1; i <= 26; i++) {
			
				if (lettre == ('a' + i - 1)) {
					a = i;
				} else if (lettre == ('A' + i - 1)) {
					a = i;
				}
			
		}
		return a;
	}
	// pour les trois methodes 
	public char decodeNumminiscule(int chiffre) {

		return (char) ('a' + chiffre - 1);
	}

	public char decodeNummajuscule(int chiffre) {

		return (char) ('A' + chiffre - 1);
	}

	
	
	//pour la methode multiplication
	public int chiffrementM(int codeNum, int cle) {
		int a = 0;
		if ((codeNum * cle) <= 26) {
			a = codeNum * cle;
		}else{
			a=(codeNum*cle)%26;
		}
		if(a==0){
			a=26;
		}

		return a;
	}
	
	// pour le decryptage par methode de multiplicatione et affine 
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
	
		int a = 0;
	
		
		
		
		if ((codeNum*cle) <= 26) {
			a = (codeNum*cle);
		}else{
			a=(codeNum*cle)%26;
		}
		if(a==0){
			a=26;
		}
		return a;}
	
	// pour la methode affine 
	public int chiffrementA(int codeNum, int clea ,int cleb) {
		int a = 0;
		if ((codeNum * clea+ cleb) <= 26) {
			a = codeNum *  clea+ cleb;
		}else{
			a=(codeNum * clea+ cleb)%26;
		}
		if(a==0){
			a=26;
		}

		return a;
	}
	
	//pour la methode affine 
	public int dechiffrementA(int codeNum, int clea,int cleb) {
		int invcle=inverse(clea);
		int a = 0;
		if ((invcle*(codeNum+26-cleb)) <= 26) {
			a = (codeNum*invcle);
		}else{
			a=(invcle*(codeNum+26-cleb))%26;
		}
		if(a==0){
			a=26;
		}
		return a;}
	
	//pour la methode cesare
	public int chiffrementC(int codeNum, int cle) {
		int a = 0;
		if ((codeNum + cle) <= 26) {
			a = codeNum + cle;
		}else{
			a=(codeNum+cle)%26;
		}
		if(a==0){
			a=26;
		}

		return a;
	}
	public int dechiffrementC(int codeNum, int cle) {
		int a = 0;
		if ((codeNum +26- cle) <= 26) {
			a = codeNum +(26- cle);
		}else{
			a=(codeNum+(26-cle))%26;
		}
		if(a==0){
			a=26;
		}
		return a;}
	
    
}
