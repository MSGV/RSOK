package Admin_Log;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Common.Helper;
import Common.HelperPrikaz;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.Color;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtSurname;
	private JTextField txtEmail;
	private JPasswordField txtPassword;
	
	static Helper Helper = new Helper();
	HelperPrikaz HelperP = new HelperPrikaz();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Register() {
		initComponents();
	}
	
	
	public void initComponents() {
		setFont(new Font("Times New Roman", Font.BOLD, 15));
		setTitle("REGISTRACIJA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 601);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Login li = new Login();
				li.setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(152, 460, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Complete Registration");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtName.getText().equals("") || txtSurname.getText().equals("") || txtEmail.getText().equals("") ||txtPassword.getText().equals("")) 
				{
					JOptionPane.showMessageDialog(null, "Please Enter the necessary Information!");
				}
				else {
					
					String Name = txtName.getText();
					String Surname = txtSurname.getText();
					String Email = txtEmail.getText();
					String Password = txtPassword.getText();
					
					Connection conn = Helper.DBSetup();
					String query = "INSERT INTO admin(ime, prezime, email, sifra) VALUES ('"+Name+"', '"+Surname+"', '"+Email+"', '"+Password+"')";
					
					try {
						java.sql.Statement stm = conn.createStatement();
						stm.execute(query);
					}
					catch(Exception be){
							be.printStackTrace();
					}
					
					JOptionPane.showMessageDialog(null, "Information Successfully Added!");
				}
				txtName.setText("");
				txtSurname.setText("");
				txtEmail.setText("");
				txtPassword.setText("");
				
				
				dispose();
				Login li = new Login();
				li.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(101, 413, 193, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("REGISTRATION");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_5.setBounds(134, 11, 128, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Please Enter The Necesary credentials to register!");
		lblNewLabel_6.setBounds(81, 53, 308, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setBounds(180, 88, 89, 14);
		contentPane.add(lblNewLabel_3);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(119, 113, 161, 20);
		contentPane.add(txtName);
		
		JLabel lblNewLabel_4 = new JLabel("Surname");
		lblNewLabel_4.setBounds(176, 144, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		txtSurname = new JTextField();
		txtSurname.setColumns(10);
		txtSurname.setBounds(119, 169, 161, 20);
		contentPane.add(txtSurname);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(176, 267, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email Address");
		lblNewLabel_2.setBounds(163, 210, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(119, 236, 161, 20);
		contentPane.add(txtEmail);
		
		JButton btnNewButton_2 = new JButton("Quit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_2.setBounds(152, 528, 89, 23);
		contentPane.add(btnNewButton_2);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(119, 292, 161, 20);
		contentPane.add(txtPassword);
	}

}
