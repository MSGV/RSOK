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

public class NemackaTenk extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NemackaTenk frame = new NemackaTenk();
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
	public NemackaTenk() {
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
		lblNewLabel.setIcon(new ImageIcon(NemackaTenk.class.getResource("/Images/tiger1.png")));
		lblNewLabel.setBounds(10, 11, 600, 334);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnTigerI = new JTextPane();
		txtpnTigerI.setEditable(false);
		txtpnTigerI.setText("Tiger I\r\n\r\nTiger I je bio jedan od najpoznatijih i najmoćnijih tenkova koji su se koristili tokom Drugog svetskog rata. Razvijen je kao odgovor na potrebu za teškim oklopnim vozilom koje bi moglo da se suprotstavi savezničkim snagama na bojištu.\r\n\r\nTiger I je bio izuzetno težak tenk, težak oko 57 tona, što mu je pružalo snažnu zaštitu od neprijateljske vatre. Bio je oklopljen slojevima debelim do 100 mm, što ga je činilo otpornim na većinu protivtenkovskih projektila toga vremena.\r\n\r\nNjegova najupečatljivija karakteristika bila je veliki top kalibra 88 mm. Ovaj top je bio jedan od najmoćnijih topova u upotrebi tokom Drugog svetskog rata, sposoban da probije oklop bilo kog savezničkog tenka. Bio je izuzetno precizan i imao veći domet od većine protivtenkovskih topova.");
		txtpnTigerI.setBounds(620, 11, 296, 334);
		contentPane.add(txtpnTigerI);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(NemackaTenk.class.getResource("/Images/panther.png")));
		lblNewLabel_1.setBounds(939, 11, 600, 334);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnPanter = new JTextPane();
		txtpnPanter.setEditable(false);
		txtpnPanter.setText("Panther\r\n\r\nPanther je bio srednji tenk koji je razvijen tokom Drugog svetskog rata kao odgovor na tenkove sovjetskog T-34. Bio je jedan od najboljih tenkova u to vreme, kombinujući snažno oklopno odeljenje, visoku pokretljivost i izuzetno efikasan top.\r\n\r\nPanther je bio poznat po svojoj impresivnoj oklopnoj zaštiti. Njegov prednji oklop bio je naglašenog nagiba, što je povećavalo njegovu otpornost na neprijateljsku vatru. Takođe je imao dodatni bočni oklop koji je pružao dodatnu zaštitu. Oklop tenka bio je dovoljno jak da izdrži većinu protivtenkovskih projektila koje su koristile savezničke snage.\r\n\r\nPanther je bio opremljen topom kalibra 75 mm, koji je bio veoma efikasan protiv neprijateljskih tenkova.");
		txtpnPanter.setBounds(1549, 11, 296, 334);
		contentPane.add(txtpnPanter);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(NemackaTenk.class.getResource("/Images/panter4.png")));
		lblNewLabel_2.setBounds(10, 366, 600, 334);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnPanterIV = new JTextPane();
		txtpnPanterIV.setEditable(false);
		txtpnPanterIV.setText("Panther IV\r\n\r\nPanzer IV je bio srednji tenk koji je razvio Nacistički Nemačka i bio je jedan od najčešće korišćenih tenkova tokom Drugog svetskog rata. Bio je svestran i prilagodljiv, koristeći se u raznim ulogama na bojištu.\r\n\r\nPanzer IV je bio oklopljen tenk sa solidnom oklopnom zaštitom. Prednji oklop je bio debljine do 80 mm, što mu je pružalo određenu otpornost protiv neprijateljske vatre, ali nije bio toliko jak kao kod težih tenkova poput Tiger-a ili Panther-a. Ipak, Panzer IV je bio agilan i imao dobru pokretljivost, što mu je omogućavalo brze manevre na terenu.\r\n\r\nNajznačajnija karakteristika Panzer IV bila je njegova vatrena moć. Tenk je bio opremljen različitim topovima, počevši od topa kalibra 75 mm, a kasnije verzije su uključivale i topove kalibra 88 mm. ");
		txtpnPanterIV.setBounds(620, 366, 296, 334);
		contentPane.add(txtpnPanterIV);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon(NemackaTenk.class.getResource("/Images/sturmgeschutz3.png")));
		lblNewLabel_2_1.setBounds(939, 366, 600, 334);
		contentPane.add(lblNewLabel_2_1);
		
		JTextPane txtpnSturmgeschutzIII = new JTextPane();
		txtpnSturmgeschutzIII.setEditable(false);
		txtpnSturmgeschutzIII.setText("Sturmgeschütz III\r\n\r\nSturmgeschütz III (StuG III) je bio samohodno artiljerijsko vozilo koje se koristilo tokom Drugog svetskog rata. Iako se tehnički ne smatra tenkom, StuG III je igrao važnu ulogu u nemačkim oklopnim snagama.\r\n\r\nStuG III je bio baziran na šasiji tenka Panzer III, ali je umesto kupole za posadu imao otvoreno odeljenje za top. Ovo je omogućavalo postavljanje snažnog topa na platformu vozila, pružajući podršku pešadiji i uništavanje neprijateljskih tenkova. Glavno oružje StuG III bio je top kalibra 75 mm, koji je bio efikasan protiv neprijateljskih oklopnih vozila i bunkera. Oklop StuG III bio je debljine do 80 mm, pružajući solidnu zaštitu protiv neprijateljske vatre. StuG III se koristio u raznim ulogama na bojištu. Bio je korišćen kao podrška pešadiji, gde bi podržavao napredovanje trupa i gađao neprijateljske ciljeve. ");
		txtpnSturmgeschutzIII.setBounds(1549, 366, 296, 334);
		contentPane.add(txtpnSturmgeschutzIII);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(AntickoDoba.class.getResource("/Images/background.png")));
		lblNewLabel_6.setBounds(0, 0, 1904, 1041);
		contentPane.add(lblNewLabel_6);
	}
}
