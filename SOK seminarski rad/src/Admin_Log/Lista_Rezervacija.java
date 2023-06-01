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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Common.Helper;
import Common.HelperPrikaz;
import Resources.CRUD_Ops;
import Resources.CRUD_Ops_Rez;

public class Lista_Rezervacija extends JFrame {

	private JPanel contentPane;
	
	static Helper Helper = new Helper();
    HelperPrikaz HelperP = new HelperPrikaz();
	private CRUD_Ops CRUD = new CRUD_Ops();
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
	public Lista_Rezervacija() {
		setBackground(new Color(92, 90, 90));
		
		initComponents();
		CRUD_Ops_Rez.prikaz(table);
	}
	
	
	private void initComponents() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Legion\\Desktop\\Milan Buric fakultet\\LOB.png"));
		setTitle("LISTA REZERVACIJA");
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
		
		JLabel lblNewLabel_5 = new JLabel("LISTA REZERVACIJA");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_5.setBounds(10, 0, 266, 60);
		panel.add(lblNewLabel_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(286, 36, 896, 675);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		ListSelectionModel rowSelectionModel = table.getSelectionModel();
		
		table = new JTable();
		scrollPane.setViewportView(table);

		rowSelectionModel.addListSelectionListener(new ListSelectionListener() {
		      public void valueChanged(ListSelectionEvent e) {
		        			        
		        ListSelectionModel lsm = (ListSelectionModel)e.getSource();
		        		        
		        /*
		        	int selRow = table.getSelectedRow();
		        	String idForEdit = table.getModel().getValueAt(selRow, 0).toString();
		        	String ime = table.getModel().getValueAt(selRow, 1).toString();
		        	String prezime = table.getModel().getValueAt(selRow, 2).toString();
		        	String Mesto = table.getModel().getValueAt(selRow, 3).toString();
		        	String Period = table.getModel().getValueAt(selRow, 4).toString();
		        	String Godina = table.getModel().getValueAt(selRow, 5).toString();
		        	
		        	txtNaziv.setText(Naziv);
		        	txtZemlja.setText(Zemlja);
		        	txtPeriod.setText(Mesto);
					txtGodina.setText(Period);
					txtMesto.setText(Godina);
					IDtxt.setText(idForEdit);		  
					*/      	
		        }

		    });
	}
}
