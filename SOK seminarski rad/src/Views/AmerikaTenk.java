package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AmerikaTenk extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AmerikaTenk frame = new AmerikaTenk();
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
	public AmerikaTenk() {
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
				WW2 WW = new WW2();
				WW.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 996, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AmerikaTenk.class.getResource("/Images/m4sherman.png")));
		lblNewLabel.setBounds(10, 11, 600, 334);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnM4Serman = new JTextPane();
		txtpnM4Serman.setEditable(false);
		txtpnM4Serman.setText("M4 Sherman\r\n\r\nM4 Šerman (engl. M4 Sherman) je bio američki srednji tenk i glavni američki tenk tokom Drugog svetskog rata. \r\n\r\nOsnova ovoga tenka je dizajn njegovog prethodnika M3 Li, čije su performanse procenjene nezadovoljavajućim početkom Drugog svetskog rata. Jedina konkretna razlika između ova dva tenka je bila upotreba dva topa u M3 Liju, što se pokazalo kao nepraktično rešenje koje je zamenjeno klasičnom kupolom kakvu su imali svi tada moderni tenkovi. To na kraju nije otklonilo sve greške dizajna, koje se mogu najbolje uočiti ako se uporedi slika Pancer III tenka ili Pancer IV tenka s Šermanom. To je jednostavno bio previsok tenk, što kao posledicu ima njegovo rano otkrivanje pozicije u sukobu s protivnikom.");
		txtpnM4Serman.setBounds(620, 11, 296, 334);
		contentPane.add(txtpnM4Serman);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AmerikaTenk.class.getResource("/Images/m26.png")));
		lblNewLabel_1.setBounds(939, 11, 600, 334);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnM2Persing = new JTextPane();
		txtpnM2Persing.setEditable(false);
		txtpnM2Persing.setText("M2 Pershing\r\n\r\nM26 Peršing (engl. M26 Pershing) je bio američki, zavisno od verzije srednji ili teški tenk, [1] koji se koristio u poslednja tri meseca Drugog svetskog rata. \r\n\r\nKako je Drugi svetski rat sve više odmicao, tako su svakodnevno na sto američke vojne komande stizala obaveštenja o nemogućnosti američkih tenkova M4 Šerman, M3 Li i M3/M5 Stjuart da uđe u borbu s protivničkim Pancer V ili Pancer VI Tigar. Na te pozive za pomoć odlučilo se da se prvi put odgovori još 1942. godine formalnim nastankom projekta M26 Peršing. Sledeće dve godine projekat za ovaj tenk je ležao zanemaren do trenutka savezničkog iskrcavanja u Normandiji kada ponovno u Vašington stižu panični pozivi za novi tenk koji će imati borbenu šansu protiv nemačkih oklopnih formacija. ");
		txtpnM2Persing.setBounds(1549, 11, 296, 334);
		contentPane.add(txtpnM2Persing);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(AmerikaTenk.class.getResource("/Images/m3lee.png")));
		lblNewLabel_2.setBounds(10, 366, 600, 334);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnM3Lee = new JTextPane();
		txtpnM3Lee.setEditable(false);
		txtpnM3Lee.setText("M3 Lee\r\n\r\nM3 Li (engl. M3 Lee) je bio američki srednji tenk koji se koristio u Drugom svetskom ratu, \r\n\r\nIspravna odluka američke vojne administracije iz 1939. kako je M2 tenk nezadovoljavajući za buduće vojne potrebe rezultovala je nastankom tenka M3 Li i M3/M5 Stjuart. Dizajnerska osnova za tenk M3 Li je bio francuski Šar B od kojeg uzima za današnje doba neobičnu ideju o ugrađena dva topa. \r\n\r\nOsnovno naoružanje ovog tenka su činila dva topa od kojih je jedan bio ugrađen u kupolu, a drugi u telu tenka. U kupoli se nalazio top M5 kalibra 37 mm, dok je u telu tenka sa prednje desne strane bila ugrađena haubica M2 ili M3, kalibra 75 mm. ");
		txtpnM3Lee.setBounds(620, 366, 296, 334);
		contentPane.add(txtpnM3Lee);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon(AmerikaTenk.class.getResource("/Images/m10.png")));
		lblNewLabel_2_1.setBounds(939, 366, 600, 334);
		contentPane.add(lblNewLabel_2_1);
		
		JTextPane txtpnM10 = new JTextPane();
		txtpnM10.setEditable(false);
		txtpnM10.setText("M10 Wolverine\r\n\r\nM10 Wolverine je bio američki samohodni protivtenkovski top koji se koristio tokom Drugog svetskog rata. Bio je baziran na šasiji M4 Sherman tenka. Glavna karakteristika M10 Wolverinea bila je njegova topovska platforma, koja je bila opremljena topom M7 kalibra 76,2 mm. Ovaj top je bio efikasan u uništavanju neprijateljskih tenkova.\r\n\r\nM10 Wolverine je imao relativno tanak oklop, koji je pružao ograničenu zaštitu od protivničke vatre. Međutim, zbog svoje visoke brzine i pokretljivosti, M10 je mogao da se brzo pozicionira na terenu i izbegne neprijateljske napade. Njegova uloga je bila uništavanje neprijateljskih tenkova i podrška napredovanju američkih trupa. M10 Wolverine je igrao važnu ulogu u borbama na zapadnom frontu i bio je ključni deo američke oklopne sile.");
		txtpnM10.setBounds(1549, 366, 296, 334);
		contentPane.add(txtpnM10);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(AntickoDoba.class.getResource("/Images/background.png")));
		lblNewLabel_6.setBounds(0, 0, 1904, 1041);
		contentPane.add(lblNewLabel_6);
	}
}
