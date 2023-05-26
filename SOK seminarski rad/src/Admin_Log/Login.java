package Admin_Log;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Views.Reservation_Menu;

public class Login extends JFrame {

	static Common.Helper Helper = new Common.Helper();
		
	
	private JPanel contentPane;
	private JTextField txtKorisnickoime;
	private JPasswordField txtLozinka;
	public int ID;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					Login  CW =  (Login) Helper.CenterWindow(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void initComponents() {

		setBackground(new Color(255, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 589);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Wlcome = new JLabel("Welcome");
		Wlcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		Wlcome.setForeground(Color.DARK_GRAY);
		Wlcome.setHorizontalAlignment(SwingConstants.CENTER);
		Wlcome.setBounds(0, 11, 354, 32);
		contentPane.add(Wlcome);
		
		JLabel Username = new JLabel("Username");
		Username.setBackground(new Color(128, 0, 0));
		Username.setFont(new Font("Tahoma", Font.BOLD, 14));
		Username.setHorizontalAlignment(SwingConstants.CENTER);
		Username.setBounds(10, 290, 135, 17);
		contentPane.add(Username);
		
		JLabel Password = new JLabel("Password");
		Password.setFont(new Font("Tahoma", Font.BOLD, 14));
		Password.setHorizontalAlignment(SwingConstants.CENTER);
		Password.setBounds(10, 335, 135, 17);
		contentPane.add(Password);
		
		txtLozinka = new JPasswordField();
		txtLozinka.setBounds(155, 334, 189, 18);
		contentPane.add(txtLozinka);
		
		txtKorisnickoime = new JTextField();
		txtKorisnickoime.setBounds(155, 289, 189, 18);
		contentPane.add(txtKorisnickoime);
		txtKorisnickoime.setColumns(10);
		
				
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					 
				Connection connect = Helper.DBSetup();
				
				String username = txtKorisnickoime.getText();
			      char[] password = txtLozinka.getPassword();
			      String pw = "";
			      for(int i = 0; i < password.length; i++ ) {
			    	  pw+=password[i];
			      }
				
			      String sql = "SELECT * FROM users WHERE Username = '"+username+"' AND Password = '"+pw+"'";
			      
				try{			      				      				      
				      Statement stm = connect.createStatement();

				      ResultSet rs = stm.executeQuery(sql);			     
					     
					  if(rs.next()) {	
					    	 
						  	ID = rs.getInt("ID");
						     
					    	dispose();
					    	Reservation_Menu MM = new Reservation_Menu();
					    	MM.setVisible(true);
					    	Reservation_Menu MMU = (Reservation_Menu) Helper.CenterWindow(MM);
					    	 
				    	  }
				    	  else {
				    		  JOptionPane.showMessageDialog(null,String.valueOf("ERROR!!! \nWrong Username or Password."));					    	 
				    	  }

					     connect.close();
				    }
					catch(Exception eis){ System.out.println(e);}
				 
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.setBounds(102, 514, 147, 25);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
		    	Register RegPage = new Register();
		    	RegPage.setVisible(true);
		    	//Register CW = (Register) Helper.CenterWindow(RegPage);
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegister.setBounds(102, 467, 147, 23);
		contentPane.add(btnRegister);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(null);
		lblNewLabel.setBounds(48, 54, 256, 225);
		contentPane.add(lblNewLabel);
		
		
	
	}
	
	public Login() {
		setForeground(Color.BLACK);
		setTitle("PRIJAVA");
		setResizable(false);
		initComponents();
		
	}
}