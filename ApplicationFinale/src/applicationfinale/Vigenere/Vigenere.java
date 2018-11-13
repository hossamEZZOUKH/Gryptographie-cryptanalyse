/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationfinale.Vigenere;

/**
 *
 * @author ayoub
 */
public class Vigenere {
    public static int[]codagNum(String lettre){
		int[] KdM=new int[lettre.length()];
		for(int i=0;i<26;i++){
			for (int j = 0; j <lettre.length(); j++){
			if(lettre.charAt(j)==(char)('a'+i)){
				KdM[j]=i+1;
			}else if(lettre.charAt(j)==(char)('A'+i)){
				KdM[j]=i+1;
			}
		}}
		return KdM;
	}
	
	public static int[]chifrement(int[]a,int[]b){
		int[]chi=new int[a.length];
		int test = 0;
		
		int j=0;
		for(int i=0;i<a.length;i++){
			
			if(j==b.length){j=0;}
			test=a[i]+b[j];
			j++;
			
			if(test>26){
                            
				chi[i]=test%26;
                                
			}else{
			chi[i]=test;
			}
                        
		}
		
		return chi;
	}
	public static int[]dechifrement(int[]a,int[]b){
		int[]chi=new int[a.length];
		int test = 0;
		
		int j=0;
		for(int i=0;i<a.length;i++){
			
			if(j==b.length){j=0;}
			test=a[i]-b[j];
			j++;
			if(test==0){
				chi[i]=26;
			}
			else if(test>26){
				chi[i]=test%26;
			}else if(test<0){
				chi[i]=26+test;
		        }else{
			chi[i]=test;
			}
		}
		
		return chi;
	}
	public static char[] Deco(int[]a){
		char[] b=new char[a.length];
		
		for(int i=0;i<a.length;i++){
			
			
			
			b[i]=(char)('A'+a[i]-1);
			
		}
		return b;
	}
}
