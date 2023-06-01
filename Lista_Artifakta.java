package Admin_Log;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Common.Helper;
import Common.HelperPrikaz;
import Resources.CRUD_Ops;

public class Lista_Artifakta extends JFrame {

	private JPanel contentPane;
	private JTextField txtNaziv;
	private JTextField txtPeriod;
	private JTextField txtZemlja;
	private JTextField txtGodina;
	
	static Helper Helper = new Helper();
    HelperPrikaz HelperP = new HelperPrikaz();
	private JTextField IDtxt;
	private CRUD_Ops CRUD = new CRUD_Ops();
	private JTextField txtMesto;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista_Artifakta frame = new Lista_Artifakta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Lista_Artifakta() {
		initComponents();
		CRUD_Ops.prikaz(table);
	}
	
	
	private void initComponents() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Legion\\Desktop\\Milan Buric fakultet\\LOB.png"));
		setTitle("LISTA ARTIFAKTA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1229, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(92, 90, 90));
		panel.setBounds(0, 0, 1213, 743);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Period");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(35, 108, 132, 19);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Zemlja Pronalaska");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(35, 132, 132, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Godina Datiranja");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(35, 183, 132, 20);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Naziv");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_4.setBounds(35, 82, 132, 19);
		panel.add(lblNewLabel_4);
		
		txtNaziv = new JTextField();
		txtNaziv.setBounds(177, 82, 205, 19);
		panel.add(txtNaziv);
		txtNaziv.setColumns(10);
		
		txtPeriod = new JTextField();
		txtPeriod.setBounds(177, 108, 205, 19);
		panel.add(txtPeriod);
		txtPeriod.setColumns(10);
		
		txtZemlja = new JTextField();
		txtZemlja.setBounds(177, 133, 205, 19);
		panel.add(txtZemlja);
		txtZemlja.setColumns(10);
		
		txtGodina = new JTextField();
		txtGodina.setBounds(177, 184, 205, 19);
		panel.add(txtGodina);
		txtGodina.setColumns(10);

		
		JButton btnNewButton = new JButton("Nazad");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Admin_Meni AM = new Admin_Meni();
				AM.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(10, 711, 146, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DODAJ");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					CRUD_Ops.Dodaj(txtNaziv.getText(), txtZemlja.getText(), txtPeriod.getText(), txtGodina.getText(), txtMesto.getText());
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
				
				CRUD_Ops.prikaz(table);
				
				txtNaziv.setText("");
				txtZemlja.setText("");
				txtPeriod.setText("");
				txtGodina.setText("");
				txtMesto.setText("");
				

			}
		});
		btnNewButton_1.setBounds(10, 280, 145, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("IZMENI");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					CRUD_Ops.Izmeni(txtNaziv.getText(), txtZemlja.getText(), txtPeriod.getText(), txtGodina.getText(), txtMesto.getText(), IDtxt.getText());
							
				} catch (Exception e1) {
					
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
				
				CRUD_Ops.prikaz(table);
				
				txtNaziv.setText("");
				txtZemlja.setText("");
				txtPeriod.setText("");
				txtGodina.setText("");
				txtMesto.setText("");
						
				
			}
		});
		
		btnNewButton_2.setBounds(186, 280, 145, 21);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("OBRIŠI");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try {
				CRUD_Ops.Obrisi(txtNaziv.getText(), txtZemlja.getText(), txtPeriod.getText(), txtGodina.getText(), txtMesto.getText(), IDtxt.getText());
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
			}
			
			CRUD_Ops.prikaz(table);
				
				txtNaziv.setText("");
				txtZemlja.setText("");
				txtPeriod.setText("");
				txtGodina.setText("");
				txtMesto.setText("");
			
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_3.setBounds(10, 324, 145, 21);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("LISTA ARTIFAKTA");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_5.setBounds(10, 0, 266, 60);
		panel.add(lblNewLabel_5);
		
		IDtxt = new JTextField();
		IDtxt.setBounds(177, 214, 48, 20);
		panel.add(IDtxt);
		IDtxt.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("OSVEŽI");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CRUD_Ops.prikaz(table);
				txtNaziv.setText("");
				txtZemlja.setText("");
				txtPeriod.setText("");
				txtGodina.setText("");
				txtMesto.setText("");
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_4.setBounds(187, 324, 144, 23);
		panel.add(btnNewButton_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("Mesto Pronalaska");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(35, 157, 132, 20);
		panel.add(lblNewLabel_3_1);
		
		txtMesto = new JTextField();
		txtMesto.setColumns(10);
		txtMesto.setBounds(177, 158, 205, 19);
		panel.add(txtMesto);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(409, 36, 773, 675);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		ListSelectionModel rowSelectionModel = table.getSelectionModel();
		
		table = new JTable();
		scrollPane.setViewportView(table);
		IDtxt.setVisible(false);

		rowSelectionModel.addListSelectionListener(new ListSelectionListener() {
		      public void valueChanged(ListSelectionEvent e) {
		        			        
		        ListSelectionModel lsm = (ListSelectionModel)e.getSource();
		        		        
		        
		        	int selRow = table.getSelectedRow();
		        	String idForEdit = table.getModel().getValueAt(selRow, 0).toString();
		        	String Naziv = table.getModel().getValueAt(selRow, 1).toString();
		        	String Zemlja = table.getModel().getValueAt(selRow, 2).toString();
		        	String Mesto = table.getModel().getValueAt(selRow, 3).toString();
		        	String Period = table.getModel().getValueAt(selRow, 4).toString();
		        	String Godina = table.getModel().getValueAt(selRow, 5).toString();
		        	
		        	txtNaziv.setText(Naziv);
		        	txtZemlja.setText(Zemlja);
		        	txtPeriod.setText(Mesto);
					txtGodina.setText(Period);
					txtMesto.setText(Godina);
					IDtxt.setText(idForEdit);		        	
		        }

		    });
	}
}
