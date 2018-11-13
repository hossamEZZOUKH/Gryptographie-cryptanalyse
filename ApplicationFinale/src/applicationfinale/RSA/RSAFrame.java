package applicationfinale.RSA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.math.BigInteger;

import javax.swing.border.BevelBorder;

import javax.swing.JLabel;



public class RSAFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RSAFrame window = new RSAFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RSAFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setBounds(100, 100, 792, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("G\u00E9n\u00E9rer les cl\u00E9s");
		btnNewButton.setBounds(27, 419, 157, 23);
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBounds(27, 66, 150, 150);
		frame.getContentPane().add(scrollPane);
		final JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setRows(10);
		textArea.setLineWrap(true);
		
		JLabel lblN = new JLabel("e = ");
		lblN.setBounds(27, 41, 46, 14);
		frame.getContentPane().add(lblN);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_1.setBounds(27, 258, 150, 150);
		frame.getContentPane().add(scrollPane_1);
		
		final JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		textArea_1.setRows(10);
		textArea_1.setLineWrap(true);
		textArea_1.setEditable(false);
		
		JLabel lblD = new JLabel("d = ");
		lblD.setBounds(27, 233, 46, 14);
		frame.getContentPane().add(lblD);
		
		JLabel lblNewLabel = new JLabel("n =");
		lblNewLabel.setBounds(205, 218, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_2.setBounds(237, 157, 150, 150);
		frame.getContentPane().add(scrollPane_2);
		
		final JTextArea textArea_2 = new JTextArea();
		scrollPane_2.setViewportView(textArea_2);
		textArea_2.setRows(10);
		textArea_2.setLineWrap(true);
		textArea_2.setEditable(false);
		
		JButton btnChiffrer = new JButton("Chiffrer");
		btnChiffrer.setBounds(247, 419, 157, 23);
		frame.getContentPane().add(btnChiffrer);
		
		
		
		
		
		
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_3.setBounds(443, 66, 150, 150);
		frame.getContentPane().add(scrollPane_3);
		
		final JTextArea textArea_5 = new JTextArea();
		scrollPane_3.setViewportView(textArea_5);
		
		
		JLabel lblMessageClaire = new JLabel("Message claire");
		lblMessageClaire.setBounds(443, 41, 150, 14);
		frame.getContentPane().add(lblMessageClaire);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_4.setBounds(443, 258, 150, 150);
		frame.getContentPane().add(scrollPane_4);
		
		final JTextArea textArea_4 = new JTextArea();
		scrollPane_4.setViewportView(textArea_4);
		textArea_4.setRows(10);
		textArea_4.setLineWrap(true);
		textArea_4.setEditable(false);
		
		JLabel lblMessageChiffrer = new JLabel("Message chiffrer");
		lblMessageChiffrer.setBounds(443, 233, 150, 14);
		frame.getContentPane().add(lblMessageChiffrer);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_5.setBounds(603, 172, 150, 150);
		frame.getContentPane().add(scrollPane_5);
		
		final JTextArea textArea_3 = new JTextArea();
		scrollPane_5.setViewportView(textArea_3);
		
		JLabel lblMessageDchiffrer = new JLabel("Message d\u00E9chiffrer");
		lblMessageDchiffrer.setBounds(622, 145, 106, 14);
		frame.getContentPane().add(lblMessageDchiffrer);
		
	
		JButton btnDchiffrer_1 = new JButton("D\u00E9chiffrer");
		btnDchiffrer_1.setBounds(443, 419, 157, 23);
		frame.getContentPane().add(btnDchiffrer_1);
		//dechiffrement
		btnDchiffrer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BigInteger d = new BigInteger(textArea_1.getText()) ;
				BigInteger n = new BigInteger(textArea_2.getText());
				
				RSA rsa = new RSA();
				rsa.setD(d);
				rsa.setN(n);
				String  msgChiffrer = textArea_4.getText();
				
				textArea_3.setText(rsa.decrypt(msgChiffrer));
				
			}
		});
		
		
		//generer les cles 
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				RSA rsa = new RSA();
				rsa.cleRSA(256);
				
								
				textArea.setText(rsa.getE().toString());
				textArea_1.setText(rsa.getD().toString());
				textArea_2.setText(rsa.getN().toString());
			}
			
		});
		
		//chiffrement
		btnChiffrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				BigInteger e = new BigInteger(textArea.getText()) ;
				BigInteger n = new BigInteger(textArea_2.getText());
				RSA rsa = new RSA(e, n);
				String msgClaire = textArea_5.getText();
				textArea_4.setText(rsa.encrypt(msgClaire));
				
			}
		});
		
		//reset
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(622, 419, 130, 23);
		frame.getContentPane().add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea_1.setText("");
				textArea_2.setText("");
				textArea_3.setText("");
				textArea_4.setText("");
				textArea_5.setText("");
				
				
			}
		});
                
               
                JButton btnPreced = new JButton("Precedent");
		btnPreced.setBounds(622, 30, 130, 23);
		frame.getContentPane().add(btnPreced);
		btnPreced.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
				
			}
		});
	}
}
