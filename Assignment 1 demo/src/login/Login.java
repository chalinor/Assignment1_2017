package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class Login {

	private JFrame frmLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.getContentPane().setBackground(Color.GRAY);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 321, 221);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsername.setBounds(30, 43, 82, 25);
		frmLogin.getContentPane().add(lblUsername);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(144, 44, 117, 22);
		frmLogin.getContentPane().add(textArea);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(30, 79, 82, 25);
		frmLogin.getContentPane().add(lblPassword);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(144, 77, 117, 25);
		frmLogin.getContentPane().add(textArea_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(144, 129, 89, 23);
		frmLogin.getContentPane().add(btnLogin);
	}
}
