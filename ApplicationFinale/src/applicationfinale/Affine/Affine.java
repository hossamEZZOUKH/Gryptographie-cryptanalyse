/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationfinale.Affine;

/**
 *
 * @author ayoub
 */
public class Affine {
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
    
    	
public char decodeNumminiscule(int chiffre){
		
		return (char) ('a'+chiffre-1);
	}
	
    public char decodeNummajuscule(int chiffre){
		
		return (char) ('A'+chiffre-1);
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
     
     public int chiffrementA(int codeNum, int clea ,int cleb) {
		int a = 0;
		if ((codeNum * clea+ cleb) <= 26) {
			a =( codeNum *  clea+ cleb);
		}else{
			a=(codeNum * clea+ cleb)%26;
		}
		if(a==0){a=26;}
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
                if(a==0){a=26;}
		return a;}

    public Object getAlpha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
