/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationfinale.Multiplication;

import javax.swing.ButtonGroup;

/**
 *
 * @author ayoub
 */
public class JFrameMultiplication extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMultiplication
     */
    public JFrameMultiplication() {
        setTitle("\t\t\t\t\tMETHODE DE MULTIPLICATION  "); 
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TEXTE = new javax.swing.JTextArea();
        CRYPTERM = new javax.swing.JRadioButton();
        DECRYPTERM = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AFFICHAGE = new javax.swing.JTextPane();
        EXIT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cleaM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 0)));

        TEXTE.setColumns(20);
        TEXTE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TEXTE.setRows(5);
        jScrollPane1.setViewportView(TEXTE);

        group.add(CRYPTERM);
        CRYPTERM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CRYPTERM.setText("CRYPTER");
        CRYPTERM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRYPTERMActionPerformed(evt);
            }
        });

        group.add(DECRYPTERM);
        DECRYPTERM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DECRYPTERM.setText("DECRYPTER");
        DECRYPTERM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DECRYPTERMActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("VALIDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AFFICHAGE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane2.setViewportView(AFFICHAGE);

        EXIT.setBackground(new java.awt.Color(255, 255, 0));
        EXIT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EXIT.setText("<-- PRECEDENT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MESSAGE  :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("LA CLE");

        cleaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleaMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(CRYPTERM)
                        .addGap(163, 163, 163)
                        .addComponent(DECRYPTERM))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cleaM, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(361, 361, 361))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(340, 340, 340))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cleaM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CRYPTERM)
                    .addComponent(DECRYPTERM))
                .addGap(8, 8, 8)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(clickcrypter.equals("CM")){
 	 	   AFFICHAGE.setText(CRYPTERM.getActionCommand());
 	 	  
 	 	   }else if(clickdecrypter.equals("DM")){
 	     	   AFFICHAGE.setText(DECRYPTERM.getActionCommand());
 	     	  	   }
        else if(clickdecrypter.equals("erreurDM")||clickcrypter.equals("erreurCM")){
	 	     	   AFFICHAGE.setText("\n\n\n\n\n\t\t\t   /!\\vous avez pas entrer un nombre premier avec 26/!\\");
	 	     	  	   }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CRYPTERMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRYPTERMActionPerformed
        // TODO add your handling code here:
        String c ="\t\t\t    METHODE DE MULTIPLICATION (CRYPTER) \n\n\n";
    	String[] bString = new String[TEXTE.getText().replaceAll("\\s","").length()];
		String etape1="";String etape1F ="";
		String etape2="";String etape2F ="";
		String etape3="";String etape3F ="";
		String etape4="";String etape4F ="";
		
		for (int i = 0; i <= 11; i++) {
 			if (Integer.parseInt(cleaM.getText()) == tabcle[i]) {
					test++;
				}
			}
    	
    	if(test==0){
    		clickcrypter="erreurCM";
    		
    	}
		
    	else{
		for (int i = 0; i <TEXTE.getText().replaceAll("\\s","").length(); i++) {
			bString[i] = s.codageNum(TEXTE.getText().replaceAll("\\s","").charAt(i));
		}
		for(int i=0;i<TEXTE.getText().replaceAll("\\s","").length();i++){
		etape1=etape1.concat("  Cn("+TEXTE.getText().replaceAll("\\s","").charAt(i)+")="+bString[i]+"    "); }
    	etape1F="    eatpe 1  : codage numerique \t: "+etape1;
    	
    	
    	
    	
    	// on va convertir les elements de tableau bString " String "
		// dans un taableau bEntier en  "entier"

		int[] bEntier = new int[TEXTE.getText().replaceAll("\\s","").length()];
		for (int i = 0; i < TEXTE.getText().replaceAll("\\s","").length(); i++) {
			bEntier[i] = Integer.parseInt(bString[i]);
		}
    	
		// etape 2 : on va stocker toute les chiffrement 
		// dans un tableau de type entier qui s'appele bChiffre

		int[] bChiffre = new int[TEXTE.getText().replaceAll("\\s","").length()];
		for (int i = 0; i < TEXTE.getText().replaceAll("\\s","").length(); i++) {
				bChiffre[i]=s.chiffrementM(bEntier[i],Integer.parseInt(cleaM.getText()));
		}
		
		for (int i = 0; i < TEXTE.getText().replaceAll("\\s","").length(); i++) {
			etape2 =etape2.concat("C("+bString[i]+")="+bChiffre[i]+"    ") ;
	       }
		etape2F=etape1F+"\n\n    eatpe 2  : chiffrement  \t\t : " +etape2;
		
		
		
		
		// traitement de  etat3 : decodage numerique P(i)
		char [] btextchiffre = new char[TEXTE.getText().replaceAll("\\s","").length()];
		for(int i=0;i<TEXTE.getText().replaceAll("\\s","").length();i++){
			if(Character.isUpperCase(TEXTE.getText().replaceAll("\\s","").charAt(i))){
			btextchiffre[i]=s.decodeNummajuscule(bChiffre[i]);}
			else{btextchiffre[i]=s.decodeNumminiscule(bChiffre[i]);}
		}
    	
		
		// affichage finale du text crypté 
		
		for(int i=0;i<TEXTE.getText().replaceAll("\\s","").length();i++){
			etape3=etape3.concat("Cn^-1("+bChiffre[i]+")="+btextchiffre[i] +"   ");
		}
		etape3F=etape2F+"\n\n    etape 3: decodage numerique\t :"+etape3;
		
		
		for(int i=0;i<TEXTE.getText().replaceAll("\\s","").length();i++){
			etape4=etape4.concat(btextchiffre[i]+"");
		}
    	
    	etape4F=c+etape3F+"\n\n\n"+"#################################   AFFICHAGE FINAL   ##################################"+"\n\n"+" \t\t\t\t*********    "+etape4+"  ********";
    	CRYPTERM.setActionCommand(etape4F);
    	
    //	CRYPTER.setActionCommand(etape3F);
    	
    
		clickcrypter="CM";
                clickdecrypter="";
               
        }
    }//GEN-LAST:event_CRYPTERMActionPerformed

    private void DECRYPTERMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DECRYPTERMActionPerformed
        // TODO add your handling code here:
        String c ="\t\t\t      METHODE DE MULTIPLICATION (DECRYPTER) \n\n\n";
    	String[] bString = new String[TEXTE.getText().replaceAll("\\s","").length()];
		String etape1="";String etape1F ="";
		String etape2="";String etape2F ="";
		String etape3="";String etape3F ="";
		String etape4="";String etape4F ="";
		
		for (int i = 0; i <= 11; i++) {
 			if (Integer.parseInt(cleaM.getText()) == tabcle[i]) {
					test++;
				}
			}
    	
    	if(test==0){
    		clickdecrypter="erreurDM";
    		
    	}
		
		
    	else{
		
		
		
		for (int i = 0; i <TEXTE.getText().replaceAll("\\s","").length(); i++) {
			bString[i] = s.codageNum(TEXTE.getText().replaceAll("\\s","").charAt(i));
		}
		for(int i=0;i<TEXTE.getText().replaceAll("\\s","").length();i++){
		etape1=etape1.concat("  Cn("+TEXTE.getText().replaceAll("\\s","").charAt(i)+")="+bString[i]+"    "); }
    	etape1F="    eatpe 1  : codage numerique \t : "+etape1;
    	
    	
    	
    	
    	// on va convertir les elements de tableau bString " String "
		// dans un taableau bEntier en  "entier"

		int[] bEntier = new int[TEXTE.getText().replaceAll("\\s","").length()];
		for (int i = 0; i < TEXTE.getText().replaceAll("\\s","").length(); i++) {
			bEntier[i] = Integer.parseInt(bString[i]);
		}
    	
		// etape 2 : on va stocker toute les chiffrement 
		// dans un tableau de type entier qui s'appele bChiffre

		int[] bChiffre = new int[TEXTE.getText().replaceAll("\\s","").length()];
		for (int i = 0; i < TEXTE.getText().replaceAll("\\s","").length(); i++) {
				bChiffre[i]=s.dechiffrementM(bEntier[i],Integer.parseInt(cleaM.getText()));
		}
		
		for (int i = 0; i < TEXTE.getText().replaceAll("\\s","").length(); i++) {
			etape2 =etape2.concat("C("+bString[i]+")="+bChiffre[i]+"    ") ;
	       }
		etape2F=etape1F+"\n\n    eatpe 2  : dechiffrement  \t : " +etape2;
		
		
		
		
		// traitement de  etat3 : decodage numerique P(i)
		char [] btextchiffre = new char[TEXTE.getText().replaceAll("\\s","").length()];
		for(int i=0;i<TEXTE.getText().replaceAll("\\s","").length();i++){
			if(Character.isUpperCase(TEXTE.getText().replaceAll("\\s","").charAt(i))){
			btextchiffre[i]=s.decodeNummajuscule(bChiffre[i]);}
			else{btextchiffre[i]=s.decodeNumminiscule(bChiffre[i]);}
		}
    	
		
		// affichage finale du text crypté 
		
		for(int i=0;i<TEXTE.getText().replaceAll("\\s","").length();i++){
			etape3=etape3.concat("Cn^-1("+bChiffre[i]+")="+btextchiffre[i] +"   ");
		}
		etape3F=etape2F+"\n\n    etape 3: decodage numerique\t :"+etape3;
		
		
		for(int i=0;i<TEXTE.getText().replaceAll("\\s","").length();i++){
			etape4=etape4.concat(btextchiffre[i]+"");
		}
    	
    	etape4F=c+etape3F+"\n\n\n"+"#################################   AFFICHAGE FINAL   ##################################"+"\n\n"+" \t\t\t\t*********    "+etape4+"  ********";
    	DECRYPTERM.setActionCommand(etape4F);
    	
    //	CRYPTER.setActionCommand(etape3F);
    	
    
		clickdecrypter="DM";
                clickcrypter="";
        }
    }//GEN-LAST:event_DECRYPTERMActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_EXITActionPerformed

    private void cleaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleaMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cleaMActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMultiplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMultiplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMultiplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMultiplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMultiplication().setVisible(true);
            }
        });
    }
    int test=0;
    int tabcle[] = { 1, 3, 5, 7, 9, 11, 15, 17, 19, 21, 23, 25 };
    ButtonGroup group  =  new  ButtonGroup();
    Multiplication s = new Multiplication();
    String  clickcrypter="";
    String  clickdecrypter="";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane AFFICHAGE;
    private javax.swing.JRadioButton CRYPTERM;
    private javax.swing.JRadioButton DECRYPTERM;
    private javax.swing.JButton EXIT;
    private javax.swing.JTextArea TEXTE;
    private javax.swing.JTextField cleaM;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
