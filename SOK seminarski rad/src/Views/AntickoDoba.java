package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class AntickoDoba extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AntickoDoba frame = new AntickoDoba();
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
	public AntickoDoba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Nazad");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Exibits EX = new Exibits();
				EX.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 1007, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 11, 505, 318);
		contentPane.add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(525, 11, 247, 318);
		contentPane.add(textPane);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 341, 505, 318);
		contentPane.add(lblNewLabel_1);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(525, 341, 247, 318);
		contentPane.add(textPane_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(10, 678, 505, 318);
		contentPane.add(lblNewLabel_2);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(525, 678, 247, 318);
		contentPane.add(textPane_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(782, 11, 505, 318);
		contentPane.add(lblNewLabel_3);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(1297, 11, 247, 318);
		contentPane.add(textPane_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(782, 341, 505, 318);
		contentPane.add(lblNewLabel_4);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(1297, 341, 247, 318);
		contentPane.add(textPane_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(782, 678, 505, 318);
		contentPane.add(lblNewLabel_5);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setBounds(1297, 678, 247, 318);
		contentPane.add(textPane_5);
	}

}
