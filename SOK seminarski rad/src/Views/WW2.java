package Views;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class WW2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WW2 frame = new WW2();
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
	public WW2() {
		setTitle("Drugi Svetski Rat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1176, 636);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Nemacko naoruzanje");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				NemackaOruzje NO = new NemackaOruzje();
				NO.setVisible(true);
			}
		});
		btnNewButton.setBounds(447, 11, 161, 62);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Sovjetske Uniforme");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				SSSRTU SU = new SSSRTU();
				SU.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(10, 276, 161, 61);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SAD Naoruzanje");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				AmerikaOruzje AO = new AmerikaOruzje();
				AO.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(989, 158, 161, 62);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Nemacke uniforme");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				NemackaUniforma NA = new NemackaUniforma();
				NA.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(177, 11, 161, 62);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Nemacki tenkovi");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				NemackaTenk NT = new NemackaTenk();
				NT.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(733, 11, 161, 62);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("SAD Uniforme");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AmerikaUniforma AU = new AmerikaUniforma();
				AU.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(989, 275, 161, 62);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("SAD Tenkovi");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AmerikaTenk AT = new AmerikaTenk();
				AT.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(989, 387, 161, 62);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Sovjetsko Naoružanje");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				SSSRP SP = new SSSRP();
				SP.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(10, 158, 161, 62);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Sovjetski Tenkovi");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SSSRT SS = new SSSRT();
				SS.setVisible(true);
			}
		});
		btnNewButton_9.setBounds(10, 387, 161, 62);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Nazad");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Exibits EB = new Exibits();
				EB.setVisible(true);
				
			}
		});
		btnNewButton_10.setBounds(10, 567, 89, 23);
		contentPane.add(btnNewButton_10);
	}

}
