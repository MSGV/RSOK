package Admin_Log;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Common.Helper;
import Common.HelperPrikaz;
import Resources.CRUD_Ops_Log;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField txtime;
	private JTextField txtprezime;
	private JTextField txtEmail;
	private JPasswordField txtsifra;
	
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
				try
				{
				CRUD_Ops_Log.Registracija(txtime.getText(), txtprezime.getText(), txtEmail.getText(), txtsifra.getText());
				
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
				
				txtime.setText("");
				txtprezime.setText("");
				txtEmail.setText("");
				txtsifra.setText("");
				
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
		
		txtime = new JTextField();
		txtime.setColumns(10);
		txtime.setBounds(119, 113, 161, 20);
		contentPane.add(txtime);
		
		JLabel lblNewLabel_4 = new JLabel("Surname");
		lblNewLabel_4.setBounds(176, 144, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		txtprezime = new JTextField();
		txtprezime.setColumns(10);
		txtprezime.setBounds(119, 169, 161, 20);
		contentPane.add(txtprezime);
		
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
		
		txtsifra = new JPasswordField();
		txtsifra.setBounds(119, 292, 161, 20);
		contentPane.add(txtsifra);
	}

}
