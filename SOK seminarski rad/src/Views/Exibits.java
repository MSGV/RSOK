package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Exibits extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exibits frame = new Exibits();
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
	public Exibits() {
		setTitle("IZLOŽBE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Drugi Svetski Rat");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				WW2 WW = new WW2();
				WW.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(246, 78, 260, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAntikoDoba = new JButton("Antičko Doba");
		btnAntikoDoba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AntickoDoba AD = new AntickoDoba();
				AD.setVisible(true);
			}
		});
		btnAntikoDoba.setBounds(246, 108, 260, 23);
		contentPane.add(btnAntikoDoba);
		
		JButton btnUmetnostiRenesanse = new JButton("Doba Dinosaurusa");
		btnUmetnostiRenesanse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DobaDniosaurusa DD = new DobaDniosaurusa();
				DD.setVisible(true);
			}
		});
		btnUmetnostiRenesanse.setBounds(246, 169, 260, 23);
		contentPane.add(btnUmetnostiRenesanse);
		
		JLabel lblNewLabel = new JLabel("Spisak Izložbi Muzeja");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(276, 11, 213, 56);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Izlaz");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				
			}
		});
		btnNewButton_1.setBounds(338, 463, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnRenesansa = new JButton("Renesansa");
		btnRenesansa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Renesansa RE = new Renesansa();
				RE.setVisible(true);
			}
		});
		btnRenesansa.setBounds(246, 139, 260, 23);
		contentPane.add(btnRenesansa);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Exibits.class.getResource("/Images/backgroundexibit.png")));
		lblNewLabel_1.setBounds(0, 0, 749, 497);
		contentPane.add(lblNewLabel_1);
	}
}
