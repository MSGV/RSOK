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

import Resources.CRUD_Ops_Log;
import Views.Reservation_Menu;

public class Login extends JFrame {

	static Common.Helper Helper = new Common.Helper();
		
	
	private JPanel contentPane;
	private JTextField txtIme;
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
		setBounds(100, 100, 370, 446);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Wlcome = new JLabel("Dobrodošli");
		Wlcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		Wlcome.setForeground(Color.DARK_GRAY);
		Wlcome.setHorizontalAlignment(SwingConstants.CENTER);
		Wlcome.setBounds(0, 11, 354, 32);
		contentPane.add(Wlcome);
		
		JLabel Name = new JLabel("Ime");
		Name.setBackground(new Color(128, 0, 0));
		Name.setFont(new Font("Tahoma", Font.BOLD, 14));
		Name.setHorizontalAlignment(SwingConstants.CENTER);
		Name.setBounds(8, 144, 135, 17);
		contentPane.add(Name);
		
		JLabel Password = new JLabel("Šifra");
		Password.setFont(new Font("Tahoma", Font.BOLD, 14));
		Password.setHorizontalAlignment(SwingConstants.CENTER);
		Password.setBounds(8, 189, 135, 17);
		contentPane.add(Password);
		
		txtLozinka = new JPasswordField();
		txtLozinka.setBounds(155, 189, 189, 18);
		contentPane.add(txtLozinka);
		
		txtIme = new JTextField();
		txtIme.setBounds(155, 144, 189, 18);
		contentPane.add(txtIme);
		txtIme.setColumns(10);
		
				
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					 
				//CRUD_Ops_Log.Login(txtIme, txtLozinka);
				Connection connect = Helper.DBSetup();
				
				String username = txtIme.getText();
			      char[] password = txtLozinka.getPassword();
			      String pw = "";
			      for(int i = 0; i < password.length; i++ ) {
			    	  pw+=password[i];
			      }
				
			      String sql = "SELECT * FROM admin WHERE ime = '"+username+"' AND sifra = '"+pw+"'";
			      
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
		btnLogin.setBounds(102, 369, 147, 25);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("Registruj se");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
		    	Register RegPage = new Register();
		    	RegPage.setVisible(true);
		    	//Register CW = (Register) Helper.CenterWindow(RegPage);
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegister.setBounds(102, 322, 147, 23);
		contentPane.add(btnRegister);
		
		
	
	}
	
	public Login() {
		setForeground(Color.BLACK);
		setTitle("PRIJAVA");
		setResizable(false);
		initComponents();
		
	}
}