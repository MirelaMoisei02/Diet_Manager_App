package aaa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dieta{

	public JFrame dieta;
	int veg = 0;
	int lact = 0;
	int carn = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dieta window = new dieta();
					window.dieta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public dieta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		dieta = new JFrame();
		dieta.setTitle("Manager Dieta");
		dieta.getContentPane().setBackground(new Color(38, 191, 0));
		dieta.getContentPane().setLayout(null);
		
		JLabel lbVegetale = new JLabel("Vegetale");
		lbVegetale.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbVegetale.setBounds(33, 48, 46, 14);
		dieta.getContentPane().add(lbVegetale);
		
		JLabel lbLactate = new JLabel("Lactate");
		lbLactate.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbLactate.setBounds(33, 91, 46, 14);
		dieta.getContentPane().add(lbLactate);
		
		JLabel lbCarne = new JLabel("Carne");
		lbCarne.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbCarne.setBounds(33, 133, 46, 14);
		dieta.getContentPane().add(lbCarne);
		
		JRadioButton rdbtnVegDa = new JRadioButton("Da");
		rdbtnVegDa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdbtnVegDa) {
					veg = 1;
				}
			}
		});
		rdbtnVegDa.setBackground(new Color(38, 191, 0));
		rdbtnVegDa.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnVegDa.setBounds(105, 44, 109, 23);
		dieta.getContentPane().add(rdbtnVegDa);
		
		JRadioButton rdbtnVegNu = new JRadioButton("Nu");
		rdbtnVegNu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdbtnVegNu) {
					veg = 2;
				}
			}
		});
		rdbtnVegNu.setBackground(new Color(38, 191, 0));
		rdbtnVegNu.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnVegNu.setBounds(236, 44, 109, 23);
		dieta.getContentPane().add(rdbtnVegNu);
		
		ButtonGroup groupV = new ButtonGroup();
		groupV.add(rdbtnVegDa);
		groupV.add(rdbtnVegNu);
		
		JRadioButton rdbtnLactDa = new JRadioButton("Da");
		rdbtnLactDa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdbtnLactDa) {
					lact = 1;
				}
			}
		});
		rdbtnLactDa.setBackground(new Color(38, 191, 0));
		rdbtnLactDa.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnLactDa.setBounds(105, 87, 109, 23);
		dieta.getContentPane().add(rdbtnLactDa);
		
		JRadioButton rdbtnLactNu = new JRadioButton("Nu");
		rdbtnLactNu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdbtnLactNu) {
					lact = 2;
				}
			}
		});
		rdbtnLactNu.setBackground(new Color(38, 191, 0));
		rdbtnLactNu.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnLactNu.setBounds(236, 87, 109, 23);
		dieta.getContentPane().add(rdbtnLactNu);
		
		ButtonGroup groupL = new ButtonGroup();
		groupL.add(rdbtnLactDa);
		groupL.add(rdbtnLactNu);
		
		JRadioButton rdbtnCarneDa = new JRadioButton("Da");
		rdbtnCarneDa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdbtnCarneDa) {
					carn = 1;
				}
			}
		});
		rdbtnCarneDa.setBackground(new Color(38, 191, 0));
		rdbtnCarneDa.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnCarneDa.setBounds(105, 129, 109, 23);
		dieta.getContentPane().add(rdbtnCarneDa);
		
		JRadioButton rdbtnCarneNu = new JRadioButton("Nu");
		rdbtnCarneNu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdbtnCarneNu) {
					carn = 2;
				}
			}
		});
		rdbtnCarneNu.setBackground(new Color(38, 191, 0));
		rdbtnCarneNu.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnCarneNu.setBounds(236, 129, 109, 23);
		dieta.getContentPane().add(rdbtnCarneNu);
		
		ButtonGroup groupC = new ButtonGroup();
		groupC.add(rdbtnCarneDa);
		groupC.add(rdbtnCarneNu);
		
		JLabel lbtext = new JLabel("Alege optiunile pentru dierta");
		lbtext.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lbtext.setBounds(33, 11, 259, 26);
		dieta.getContentPane().add(lbtext);
		
		JLabel lbRezDieta = new JLabel("");
		lbRezDieta.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbRezDieta.setBounds(33, 181, 160, 25);
		dieta.getContentPane().add(lbRezDieta);
		
		JButton btnRezultatDieta = new JButton("Rezultat");
		btnRezultatDieta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				///
				if(veg==2 && lact == 2 && carn == 2) {lbRezDieta.setText("Post Negru");lbRezDieta.setOpaque(true);lbRezDieta.setBackground(Color.LIGHT_GRAY);}
				else if(veg==1 && lact == 2 && carn == 2) {lbRezDieta.setText("Dieta Vegana");lbRezDieta.setOpaque(true);lbRezDieta.setBackground(Color.GREEN);}
				else if(veg==2 && lact == 1 && carn == 2) {lbRezDieta.setText("Dieta Alba");lbRezDieta.setOpaque(true);lbRezDieta.setBackground(Color.WHITE);}
				else if(veg==2 && lact == 2 && carn == 1) {lbRezDieta.setText("Dieta Carnivora");lbRezDieta.setOpaque(true);lbRezDieta.setBackground(Color.RED);}
				else if(veg==1 && lact == 1 && carn == 2) {lbRezDieta.setText("Dieta Lacto-Vegetariana");lbRezDieta.setOpaque(true);lbRezDieta.setBackground(Color.YELLOW);}
				else if(veg==1 && lact == 2 && carn == 1) {lbRezDieta.setText("Dieta Flexitariana");lbRezDieta.setOpaque(true);lbRezDieta.setBackground(Color.ORANGE);}
				else if(veg==2 && lact == 1 && carn == 1) {lbRezDieta.setText("Dieta Kelly Hogan");lbRezDieta.setOpaque(true);lbRezDieta.setBackground(Color.PINK);}
				else if(veg==1 && lact == 1 && carn == 1) {lbRezDieta.setText("Dieta Weight Watcher");lbRezDieta.setOpaque(true);lbRezDieta.setBackground(Color.CYAN);}
				
			}
		});
		btnRezultatDieta.setBackground(new Color(255, 128, 128));
		btnRezultatDieta.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnRezultatDieta.setBounds(20, 227, 89, 23);
		dieta.getContentPane().add(btnRezultatDieta);
		
		JButton btnIesire = new JButton("Iesire");
		btnIesire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnIesire.setBackground(new Color(255, 0, 0));
		btnIesire.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnIesire.setBounds(288, 227, 89, 23);
		dieta.getContentPane().add(btnIesire);
		
		JButton btnResetareDieta = new JButton("Resetare");
		btnResetareDieta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//clear
				groupV.clearSelection();
				groupL.clearSelection();
				groupC.clearSelection();
				lbRezDieta.setText(null);
				lbRezDieta.setBackground(new Color(38, 191, 0));
			}
		});
		btnResetareDieta.setBackground(new Color(0, 255, 255));
		btnResetareDieta.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnResetareDieta.setBounds(119, 227, 89, 23);
		dieta.getContentPane().add(btnResetareDieta);
		
		dieta.setBackground(new Color(255, 255, 255));
		dieta.setBounds(100, 100, 450, 300);
		dieta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
