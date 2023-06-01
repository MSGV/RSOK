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
import javax.swing.ImageIcon;

public class SSSRP extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SSSRP frame = new SSSRP();
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
	public SSSRP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1857, 1068);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Nazad");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				WW2 WW = new WW2();
				WW.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(10, 995, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Legion\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\Mosin_nagant_m9130_from_cia.jpg"));
		lblNewLabel.setBounds(63, 33, 603, 183);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnMosinnagantM = new JTextPane();
		txtpnMosinnagantM.setEditable(false);
		txtpnMosinnagantM.setText("Mosin–Nagant M1891/30\r\n\r\nMosin-Nagant je vojna puška sa pet metaka, sa zatvaranjem, sa unutrašnjim punjenjem magacina. Zvanično poznata kao 3-linijska puška M1891 [potreban citat], a neformalno u Rusiji i bivšem Sovjetskom Savezu kao Mosinova puška (ruski: vintovka Mosina, ISO 9: vintovka Mosina), prvenstveno se nalazi sa komorom za svoj originalni 7,62×54 mmR uložak .\r\n\r\nRazvijen od 1882. do 1891. godine, koristile su ga oružane snage Ruskog carstva, Sovjetskog Saveza i raznih drugih država. To je jedna od najmasovnijih vojnih pušaka sa zatvaračem u istoriji, sa preko 37 miliona proizvedenih jedinica od 1891. godine. Uprkos starosti, korišćena je u raznim sukobima širom sveta do danas.");
		txtpnMosinnagantM.setBounds(676, 31, 242, 338);
		contentPane.add(txtpnMosinnagantM);
		
		JTextPane txtpnMosinnagantMCarbine = new JTextPane();
		txtpnMosinnagantMCarbine.setEditable(false);
		txtpnMosinnagantMCarbine.setText("Mosin–Nagant M1938 Carbine\r\n\r\nMosin–Nagant je vojna puška sa pet metaka, sa zatvaranjem, sa unutrašnjim punjenjem magacina. Zvanično poznata kao 3-linijska puška M1891 [potreban citat], a neformalno u Rusiji i bivšem Sovjetskom Savezu kao Mosinova puška (ruski: vintovka Mosina, ISO 9: vintovka Mosina), prvenstveno se nalazi sa komorom za svoj originalni 7,62×54 mmR uložak .\r\n\r\nRazvijen od 1882. do 1891. godine, koristile su ga oružane snage Ruske imperije, Sovjetskog Saveza i raznih drugih država. To je jedna od najmasovnijih vojnih pušaka sa zatvaračem u istoriji, sa preko 37 miliona proizvedenih jedinica od 1891. godine. Uprkos starosti, korišćena je u raznim sukobima širom sveta do danas.\r\n");
		txtpnMosinnagantMCarbine.setBounds(1541, 33, 242, 338);
		contentPane.add(txtpnMosinnagantMCarbine);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Legion\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\SVT-38_-_Ryssland_-_AM.045576.jpg"));
		lblNewLabel_2.setBounds(63, 380, 603, 245);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnTokarevSvtSvt = new JTextPane();
		txtpnTokarevSvtSvt.setEditable(false);
		txtpnTokarevSvtSvt.setText("Tokarev SVT-38/40\r\n\r\nSVT-40 (Samozariadnaia Vintovka Tokareva, Obrazec 1940 goda, „Tokarev samopunjavajuća puška, model 1940“, ruski: Samozaradnaa vintovka Tokareva, obrazec 1940 goda, često nazivana „Sveta“) je sovjetska poluautomatska borbena puška. doživeo široku službu tokom i posle Drugog svetskog rata. Trebalo je da bude nova službena puška sovjetske Crvene armije, ali njena proizvodnja je prekinuta nemačkom invazijom 1941. godine, što je rezultiralo promenom nazad na pušku Mosin-Nagant tokom Drugog svetskog rata. ");
		txtpnTokarevSvtSvt.setBounds(676, 380, 242, 272);
		contentPane.add(txtpnTokarevSvtSvt);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\Legion\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\AVS-36_-_Ryssland_-_AM.123596.jpg"));
		lblNewLabel_2_1.setBounds(928, 399, 603, 245);
		contentPane.add(lblNewLabel_2_1);
		
		JTextPane txtpnSimonovAvsAvs = new JTextPane();
		txtpnSimonovAvsAvs.setEditable(false);
		txtpnSimonovAvsAvs.setText("Simonov AVS-36\r\n\r\nAVS-36 (rus. Automatičeskaa vintovka Simonova obrazca 1936 godine (AVS-36)) je bila sovjetska automatska puška koja je služila u ranim godinama Drugog svetskog rata. Bila je među ranim selektivnim pješadijskim puškama (sposobnim za jednokratnu i potpuno automatsku vatru) formalno usvojenim za vojnu službu.\r\nDizajner, Sergej Simonov, započeo je svoj rad na samopunjaćoj pušci na gas 1930. Prvi prototip je bio spreman 1931. godine i izgledao je obećavajući. Tri godine kasnije napravljena je probna serija poboljšanog dizajna. Godine 1935. ");
		txtpnSimonovAvsAvs.setBounds(1541, 399, 242, 267);
		contentPane.add(txtpnSimonovAvsAvs);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\Users\\Legion\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\PPSh-41_from_soviet.jpg"));
		lblNewLabel_2_2.setBounds(63, 665, 603, 245);
		contentPane.add(lblNewLabel_2_2);
		
		JTextPane txtpnPpshPpshrus = new JTextPane();
		txtpnPpshPpshrus.setEditable(false);
		txtpnPpshPpshrus.setText("PPSh-41\r\n\r\nPPSh-41 (rus. Pistolet-pulemet Špagina, tr. Pistolet-pulemiot Shpagina-41, lit. 'Špaginov mitraljez-41') je sovjetski mitraljez koji je dizajnirao Georgij Špagin kao jeftiniju i pojednostavljenu alternativu PPDl-u. -40. Uobičajeni ruski nadimak za oružje je „papaša“ (papaša), što znači „tata“, a ponekad se nazivalo i „pištolj za podrigivanje“ zbog njegove velike stope vatre.\r\nPPSh je puškomitraljez sa selektivnom paljbom sa puškomitraljezom sa otvorenim zatvaračem, povratnim udarom. Napravljen uglavnom od štancanog čelika, može se puniti ili kutijom ili spremnikom za bubnjeve i ispaljuje metak Tokarev pištolja 7,62×25 mm.");
		txtpnPpshPpshrus.setBounds(676, 658, 242, 345);
		contentPane.add(txtpnPpshPpshrus);
		
		JLabel lblNewLabel_2_3 = new JLabel("New label");
		lblNewLabel_2_3.setIcon(new ImageIcon("C:\\Users\\Legion\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\PPS-43_Soviet_7.62_mm_submachine_gun.jpg"));
		lblNewLabel_2_3.setBounds(928, 665, 603, 245);
		contentPane.add(lblNewLabel_2_3);
		
		JTextPane txtpnPpsPps = new JTextPane();
		txtpnPpsPps.setEditable(false);
		txtpnPpsPps.setText("PPS-42 / PPS-43\r\n\r\nPPS (rus. PPS – „Pistolet-pulemet Sudaeva” ili „Pistolet-pulemet Sudajeva”, na engleskom: „Sudaiev’s submachine-gun”) je porodica sovjetskih automata kalibra 7,62×25mm Tokarev, koje je razvio Aleksej Sudajev kao jeftino oružje za ličnu odbranu za izviđačke jedinice, posade vozila i osoblje za podršku.[3]\r\n\r\nPPS i njegove varijante je u velikoj meri koristila Crvena armija tokom Drugog svetskog rata, a kasnije su ih usvojile oružane snage nekoliko zemalja bivšeg Varšavskog pakta, kao i brojni afrički i azijski saveznici.");
		txtpnPpsPps.setBounds(1541, 687, 242, 316);
		contentPane.add(txtpnPpsPps);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Legion\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\Mosin-Nagant_karbin_m1938_Ryssland_-_AM.032891.jpg"));
		lblNewLabel_1.setBounds(928, 33, 603, 251);
		contentPane.add(lblNewLabel_1);
	}
}
