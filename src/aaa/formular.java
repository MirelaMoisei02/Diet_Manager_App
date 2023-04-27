package aaa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formular{

	public JFrame formular;
	private JTextField textFieldGreutate;
	private JTextField textFieldInaltime;
	int genul = 0;
	int cal = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formular window = new formular();
					window.formular.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public formular() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		formular = new JFrame();
		formular.setTitle("Manager Dieta");
		formular.getContentPane().setBackground(new Color(38, 191, 0));
		formular.getContentPane().setLayout(null);
		
		JLabel lbGreutate = new JLabel("Greutate:");
		lbGreutate.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbGreutate.setBounds(31, 74, 66, 14);
		formular.getContentPane().add(lbGreutate);
		
		JLabel lbGen = new JLabel("Gen:");
		lbGen.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbGen.setBounds(31, 119, 66, 14);
		formular.getContentPane().add(lbGen);
		
		textFieldGreutate = new JTextField();
		textFieldGreutate.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldGreutate.setBounds(99, 71, 86, 20);
		formular.getContentPane().add(textFieldGreutate);
		textFieldGreutate.setColumns(10);
		
		JRadioButton rdbtnFeminin = new JRadioButton("Feminin");
		rdbtnFeminin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdbtnFeminin) {
					genul = 1;
				}
			}
		});
		rdbtnFeminin.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnFeminin.setBackground(new Color(38, 191, 0));
		rdbtnFeminin.setBounds(103, 115, 82, 23);
		formular.getContentPane().add(rdbtnFeminin);
		
		JRadioButton rdbtnMasculin = new JRadioButton("Masculin");
		rdbtnMasculin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdbtnMasculin) {
					genul = 2;
				}
			}
		});
		rdbtnMasculin.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnMasculin.setBackground(new Color(38, 191, 0));
		rdbtnMasculin.setBounds(199, 115, 109, 23);
		formular.getContentPane().add(rdbtnMasculin);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnFeminin);
		group.add(rdbtnMasculin);
		
		JLabel lbInaltime = new JLabel("Inaltime:");
		lbInaltime.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbInaltime.setBounds(31, 30, 66, 14);
		formular.getContentPane().add(lbInaltime);
		
		textFieldInaltime = new JTextField();
		textFieldInaltime.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textFieldInaltime.setBounds(99, 27, 86, 20);
		formular.getContentPane().add(textFieldInaltime);
		textFieldInaltime.setColumns(10);
		
		JLabel lbRezCal = new JLabel("");
		lbRezCal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbRezCal.setBounds(225, 163, 34, 20);
		formular.getContentPane().add(lbRezCal);
		
		JLabel lbRezultat = new JLabel("");
		lbRezultat.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbRezultat.setBounds(25, 163, 160, 20);
		formular.getContentPane().add(lbRezultat);
		
		JButton btnRezultat = new JButton("Rezultat");
		btnRezultat.setBackground(new Color(255, 128, 64));
		btnRezultat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			////
				double height = Double.parseDouble(textFieldInaltime.getText());
				double weight = Double.parseDouble(textFieldGreutate.getText());
				double BMI = weight / (height * height);
				cal=1;
				if(genul == 1) {
					if(BMI<18.5) {lbRezultat.setText("Subponderal");lbRezultat.setOpaque(true);lbRezultat.setBackground(Color.cyan);cal=2300;}
					else if(BMI>18.5 && BMI<24.9) {lbRezultat.setText("Normal");lbRezultat.setOpaque(true);lbRezultat.setBackground(Color.green);cal=1800;}
					else if(BMI>25 && BMI<29.9) {lbRezultat.setText("Supraponderal");lbRezultat.setOpaque(true);lbRezultat.setBackground(Color.MAGENTA);cal=1600;}
					else if(BMI>30) {lbRezultat.setText("Obez");lbRezultat.setOpaque(true);lbRezultat.setBackground(Color.RED);cal=1200;}
				}
				
				else if(genul == 2) {
					if(BMI<18.5) {lbRezultat.setText("Subponderal");lbRezultat.setOpaque(true);lbRezultat.setBackground(Color.LIGHT_GRAY);cal=2500;}
					else if(BMI>18.5 && BMI<24.9) {lbRezultat.setText("Normal");lbRezultat.setOpaque(true);lbRezultat.setBackground(Color.GREEN);cal=2000;}
					else if(BMI>25 && BMI<29.9) {lbRezultat.setText("Supraponderal");lbRezultat.setOpaque(true);lbRezultat.setBackground(Color.ORANGE);cal=1650;}
					else if(BMI>30) {lbRezultat.setText("Obez");lbRezultat.setOpaque(true);lbRezultat.setBackground(Color.RED);cal=1200;}
				}
				String calcal = String.format("%d", cal);
				lbRezCal.setText(calcal);
			}
		});
		btnRezultat.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnRezultat.setBounds(22, 199, 89, 23);
		formular.getContentPane().add(btnRezultat);
		
		
		
		JButton btnInainte = new JButton("Inainte");
		btnInainte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				///inainte
				dieta pages = new dieta();
				pages.dieta.setVisible(true);
			}
		});
		btnInainte.setBackground(new Color(128, 255, 0));
		btnInainte.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnInainte.setBounds(255, 199, 89, 23);
		formular.getContentPane().add(btnInainte);
		
		JLabel lbm = new JLabel("m");
		lbm.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbm.setBounds(195, 30, 46, 14);
		formular.getContentPane().add(lbm);
		
		JLabel lbkg = new JLabel("kg");
		lbkg.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbkg.setBounds(195, 74, 46, 14);
		formular.getContentPane().add(lbkg);
		
		JButton btnResetareRez = new JButton("Resetare");
		btnResetareRez.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnResetareRez.setBackground(new Color(0, 255, 255));
		btnResetareRez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				///
				textFieldInaltime.setText(null);
				textFieldGreutate.setText(null);
				group.clearSelection();
				lbRezultat.setText(null);
				lbRezultat.setBackground(new Color(38, 191, 0));
				cal = 0;
				lbRezCal.setText("0");
			}
		});
		btnResetareRez.setBounds(121, 199, 89, 23);
		formular.getContentPane().add(btnResetareRez);
		
		JLabel lbcalorii = new JLabel("calorii");
		lbcalorii.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbcalorii.setBounds(264, 163, 54, 20);
		formular.getContentPane().add(lbcalorii);
		formular.setBounds(100, 100, 450, 300);
		formular.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
