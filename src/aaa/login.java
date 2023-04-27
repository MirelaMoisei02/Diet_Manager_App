package aaa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login {

	private JFrame frmManagerDieta;
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frmManagerDieta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmManagerDieta = new JFrame();
		frmManagerDieta.setTitle("Manager Dieta");
		frmManagerDieta.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmManagerDieta.getContentPane().setBackground(new Color(38, 191, 0));
		frmManagerDieta.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel.setBounds(185, 11, 76, 24);
		frmManagerDieta.getContentPane().add(lblNewLabel);
		
		JLabel lbUsername = new JLabel("Username");
		lbUsername.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbUsername.setBounds(10, 54, 189, 14);
		frmManagerDieta.getContentPane().add(lbUsername);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textFieldUsername.setBounds(10, 74, 251, 20);
		frmManagerDieta.getContentPane().add(textFieldUsername);
		textFieldUsername.setColumns(2);
		
		JLabel lbPassword = new JLabel("Password");
		lbPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbPassword.setBounds(10, 105, 189, 14);
		frmManagerDieta.getContentPane().add(lbPassword);
		
		textFieldPassword = new JPasswordField();
		textFieldPassword.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textFieldPassword.setBounds(10, 123, 251, 20);
		frmManagerDieta.getContentPane().add(textFieldPassword);
		textFieldPassword.setColumns(2);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.setBackground(new Color(128, 255, 0));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String un = textFieldUsername.getText();
				String pas = textFieldPassword.getText();
				if(un.equals("user1")&&pas.equals("1234")) {
					//JOptionPane.showMessageDialog(null, "Login Successful");
					formular page = new formular();
					page.formular.setVisible(true);
					//page.pack();
					frmManagerDieta.dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Username sau parola este gresita!");
				}
			}
		});
		btnLogIn.setForeground(new Color(0, 0, 0));
		btnLogIn.setBounds(38, 167, 89, 23);
		frmManagerDieta.getContentPane().add(btnLogIn);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(new Color(0, 0, 0));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textFieldUsername.setText("");
				 textFieldPassword.setText("");
			}
		});
		btnClear.setBackground(new Color(0, 255, 255));
		btnClear.setBounds(149, 167, 89, 23);
		frmManagerDieta.getContentPane().add(btnClear);
		frmManagerDieta.setBounds(100, 100, 450, 300);
		frmManagerDieta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

