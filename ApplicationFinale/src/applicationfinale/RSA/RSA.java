
package applicationfinale.RSA;

import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA {
	
	
//d: cle prive key, e,n cle public 
	
    private BigInteger n, d, e;
   

    public BigInteger getN() {
        return n;
    }

    public void setN(BigInteger n) {
        this.n = n;
    }

    public BigInteger getD() {
        return d;
    }

    public void setD(BigInteger d) {
        this.d = d;
    }

    public BigInteger getE() {
        return e;
    }

    public void setE(BigInteger e) {
        this.e = e;
    }

    /**
     * Create an instance that can encrypt using someone elses public key.
     */
    public RSA(BigInteger _e, BigInteger _n) {
        this.n = _n;
        this.e = _e;
    }

    /**
     * Create an instance that can both encrypt and decrypt.
     */
    public RSA() {
        
       
    }
    
  

	public void cleRSA(int bits){
        
        
        SecureRandom r = new SecureRandom();//create BigInteger r random
        BigInteger p = new BigInteger(bits , 100, r);
        BigInteger q = new BigInteger(bits , 100, r);
        n = p.multiply(q);
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        boolean trouver = false;
        do {
            this.e = new BigInteger(bits , 50, r);
            if (phi.gcd(e).equals(BigInteger.ONE) && e.compareTo(phi) < 0) {
                trouver = true;
            }
        } while (!trouver);
        this.d = e.modInverse(phi);
        
    }


    // Encrypt the given plaintext message.Use public key decrypt
   
    
    public synchronized String encrypt(String message) {
       return (new BigInteger(message.getBytes())).modPow(e, n).toString();
    }

   
    //Encrypt the given plaintext message.Use public key decrypt
 
   // public synchronized BigInteger encrypt(BigInteger message) {
     //   return message.modPow(e, n);
    //}

  
     // Decrypt the given ciphertext message.Use private key decrypt
   
    public synchronized String decrypt(String message) {
        return new String((new BigInteger(message)).modPow(this.d, this.n).toByteArray());
    }

  
     // Decrypt the given ciphertext message.Use private key decrypt
 
    //public synchronized BigInteger decrypt(BigInteger message) {
     //   return message.modPow(d, n);
   // }

    
    
    
}
