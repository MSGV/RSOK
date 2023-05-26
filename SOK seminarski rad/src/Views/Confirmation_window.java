package Views;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Confirmation_window extends JFrame {

	private JPanel contentPane;
	private JTextField brkk;
	private JTextField prezime;
	private JTextField ime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Confirmation_window frame = new Confirmation_window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Confirmation_window() {
		setTitle("Confirmation window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 646);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel R = new JLabel("Dobrodosli na prozor potvrde, da biste potvrdili svoju rezervaciju molimo vas da unesete neophodne podatke i potvrdite rezervaciju!\r\n");
		R.setBounds(10, 11, 758, 56);
		contentPane.add(R);
		
		brkk = new JTextField();
		brkk.setColumns(10);
		brkk.setBounds(180, 243, 170, 20);
		contentPane.add(brkk);
		
		JLabel lblNewLabel_2_2 = new JLabel("Broj kreditne kartice:");
		lblNewLabel_2_2.setBounds(10, 249, 160, 14);
		contentPane.add(lblNewLabel_2_2);
		
		prezime = new JTextField();
		prezime.setColumns(10);
		prezime.setBounds(180, 212, 170, 20);
		contentPane.add(prezime);
		
		JLabel lblNewLabel_2 = new JLabel("Prezime:");
		lblNewLabel_2.setBounds(10, 218, 105, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Ime:");
		lblNewLabel_1.setBounds(10, 187, 105, 14);
		contentPane.add(lblNewLabel_1);
		
		ime = new JTextField();
		ime.setColumns(10);
		ime.setBounds(180, 181, 170, 20);
		contentPane.add(ime);
		
		JComboBox brkartica = new JComboBox();
		brkartica.setBounds(383, 211, 52, 22);
		contentPane.add(brkartica);
		
		JButton btnNewButton = new JButton("Natrag");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Reservation_Menu RM = new Reservation_Menu();
				RM.setVisible(true);
				
				
				
			}
		});
		btnNewButton.setBounds(10, 573, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Potvrdi");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//	if() {
					
			//	}
		//		else {
				
				dispose();
				
				JOptionPane.showMessageDialog(null,String.valueOf("Rezervacija uspesno obavljena!"));	
				
				Reservation_Menu MM = new Reservation_Menu();
		    	MM.setVisible(true);
		    	
				
			//	}
			}
		});
		btnNewButton_1.setBounds(669, 573, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Broj karata za rezervaciju:");
		lblNewLabel.setBounds(383, 187, 184, 14);
		contentPane.add(lblNewLabel);
	}
}
