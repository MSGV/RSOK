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

public class Renesansa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Renesansa frame = new Renesansa();
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
	public Renesansa() {
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
		lblNewLabel.setIcon(new ImageIcon(Renesansa.class.getResource("/Images/Mona_Lisa,_by_Leonardo_da_Vinci,_from_C2RMF_retouched_jpg_webp.png")));
		lblNewLabel.setBounds(10, 11, 505, 648);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnMonaLiza = new JTextPane();
		txtpnMonaLiza.setText("Mona Liza\r\n\r\nMona Liza ili \u0110okonda (ital. Monna Lisa, La Gioconda, franc. La Joconde) je \u010Duveno remek-delo renesansnog slikara Leonarda da Vin\u010Dija. Izra\u0111ena je uljanom tehnikom na drvenoj plo\u010Di od topole. Predstavlja portret mlade firentinske dame, Lize del \u0110okondo.\r\n\r\nLeonardo je pre smrti prodao ovu sliku kralju Fransoi I, koji ju je izlo\u017Eio u dvorcu Amboaz. Kasnije je slika preseljena u dvorac Fontenblo, a najzad u Versaj, u zbirku Luja XIV.\r\n\r\nPosle Francuske revolucije slika je preme\u0161tena u Luvr. Napoleon Bonaparta ju je izlo\u017Eio u svojoj spava\u0107oj sobi, ali posle njegovog poraza, slika je vra\u0107ena u Luvr.\r\n\r\nVin\u0107enco Peru\u0111a je 21. avgusta 1911. ukrao ovu sliku iz Luvra i izneo je sakrivenu ispod mantila. Namera mu je bila da Mona Lizu vrati \u201Eku\u0107i\u201C, u Italiju. Skrivao ju je u zidu svoje sobe. Ova kra\u0111a je izazvala veliki skandal u Parizu, a francuska vlada je otpustila direktora muzeja. Na mestu gde je izlagana Mona Liza, muzej je izlagao dela inspirisana Leonardovim remek-delom.\r\n\r\nPeru\u0111a je 1913. godine poku\u0161ao da proda Mona Lizu u Firenci. U prate\u0107em pismu je naveo da namerava da vrati ovu sliku u Italiju, a da za svoje tro\u0161kove o\u010Dekuje 500.000 lira naknade. Kada je policija zaplenila ovu sliku, deo javnosti je zahtevao da ona ostane u Italiji, dok je vlada bila za povra\u0107aj slike muzeju Luvr. Posle izlaganja u Rimu, Milanu i Firenci, Mona Liza je uz veliku pompu vra\u0107ena u Francusku. Peru\u0111a je dobio blagu kaznu od sedam meseci zatvora, poznata slika je ovom aferom postala jo\u0161 poznatija.\r\n\r\nNakon izbijanja Drugog svetskog rata, kustosi Luvra su sakrili Mona Lizu 1940. godine boje\u0107i se da bi je nema\u010Dki nacisti mogli prisvojiti za muzej koji je Herman Gering planirao da otvore u Lincu. Slika je ponovo javno izlo\u017Eena tek oktobra 1947. godine.\r\n\r\nDva puta su vandali napali ovo umetni\u010Dko delo 1956. godine. Prvi put je kiselina te\u0161ko o\u0161tetila donji deo slike. Drugom prilikom napada\u010D je kamenom razbio za\u0161titno staklo i o\u0161tetio mali fragment Mona Lize. Od tog doba slika je za\u0161ti\u0107ena iza specijalnog blindiranog stakla.\r\n");
		txtpnMonaLiza.setEditable(false);
		txtpnMonaLiza.setBounds(525, 11, 404, 648);
		contentPane.add(txtpnMonaLiza);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Renesansa.class.getResource("/Images/tajnavecera.png")));
		lblNewLabel_2.setBounds(10, 678, 505, 318);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnTajnaVecera = new JTextPane();
		txtpnTajnaVecera.setText("Tajna ve\u010Dera\r\n\r\nTajna ve\u010Dera ili Poslednja ve\u010Dera (ital. Ultima Cena) jedno je od najzna\u010Dajnijih dela Leonarda da Vin\u010Dija, a smatra je jednim od najve\u0107ih svetskih umetni\u010Dkih remek-dela. Slikana tehnikom freske, nastala je u periodu renesanse, verovatno od 1494. do 1498. godine.\r\n\r\nVerovatno 1494. godine Leonardo da Vin\u010Di dobija zadatak da napravi sliku Tajna ve\u010Dera u dominikanskoj crkvi Santa Marija de la Gracije. Tu je crkvu Vojvoda od Milana sebi izabrao kao porodi\u010Dnu kapelu i mauzolej, a 1492. godine Bramante ju je delimi\u010Dno renovirao. Slika je trebalo da ukra\u0161ava severni zid crkve.\r\n\r\nInteresantno je da na ovoj slici Tajne ve\u010Dere, Juda sedi na istoj strani stola sa svim ostalima, isto kao i Isus Hristos i apostoli, za razliku od tradicionalnog prikazivanja kada sedi na njima suprotnoj strani. Slika je pre\u017Eivela bomba\u0161ki napad saveznika 1943; me\u0111utim vla\u017Eni zidovi unutar crkve, ubrzo su uzrokovali konstantno pogor\u0161avanje stanja cele slike.");
		txtpnTajnaVecera.setEditable(false);
		txtpnTajnaVecera.setBounds(525, 678, 404, 318);
		contentPane.add(txtpnTajnaVecera);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Renesansa.class.getResource("/Images/Davinci.png")));
		lblNewLabel_3.setBounds(939, 11, 505, 318);
		contentPane.add(lblNewLabel_3);
		
		JTextPane txtpnDaVinci = new JTextPane();
		txtpnDaVinci.setEditable(false);
		txtpnDaVinci.setText("Leonardo da Vin\u010Di\r\n\r\nLeonardo di ser Pjero da Vin\u010Di (ital. Leonardo di ser Piero da Vinci,[a] Vin\u010Di, 15. april 1452 \u2014 Amboaz, 2. maj 1519), poznat kao Leonardo da Vin\u010Di, bio je italijanski renesansni arhitekta, pronalaza\u010D, in\u017Eenjer, vajar i slikar.\r\n\r\nZa \u017Eivota slavljen zbog svojih slikarskih dela, nakon smrti postaje poznat \u0161iroj publici i po svojim sveskama, u kojima je crtao i pisao bele\u0161ke o raznim temama, uklju\u010Duju\u0107i anatomiju, astronomiju, botaniku, kartografiju, slikarstvo i paleontologiju. Leonardov genije je oli\u010Denje renesansnog humanisti\u010Dkog ideala, a njegovo ukupno delo je doprinos kasnijim generacijama umetnika koji se mo\u017Ee meriti samo sa doprinosom njegovog mla\u0111eg savremenika, Mikelan\u0111ela.\r\n\r\nRo\u0111en kao vanbra\u010Dno dete uspe\u0161nog notara i \u017Eene iz ni\u017Ee klase u Vin\u010Diju ili blizu njega, \u0161kolovao se u Firenci kod italijanskog slikara i vajara Andrea del Verokija. ");
		txtpnDaVinci.setBounds(1454, 11, 404, 318);
		contentPane.add(txtpnDaVinci);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(Renesansa.class.getResource("/Images/gutenberg.png")));
		lblNewLabel_4.setBounds(939, 341, 505, 318);
		contentPane.add(lblNewLabel_4);
		
		JTextPane txtpnJohanGutenberg = new JTextPane();
		txtpnJohanGutenberg.setText("Johan Gutenberg\r\n\r\nJohann Gutenberg, isto tako poznat kao Johannes Gensfleisch zur Laden zur Guttenberg (1398 - 3.2. 1468.) je njema\u010Dki metalac i izumitelj, poznat po tome \u0161to je prvi \u0161tampao knjige uz pomo\u0107 pomi\u010Dnih slova i tako omogu\u0107io ve\u0107u pristupa\u010Dnost pisane rije\u010Di i br\u017Ei protok znanja u renesansnoj Evropi.\r\n\r\nGutenberg je bio prvi Evropljanin koji koristiti \u0161tampanje pokretnim tipkama, oko 1439, a globalni pronalaza\u010D \u0161tamparske prese. Me\u0111u njegovim mnogim doprinosima za \u0161tampu su: pronalazak procesa za masovnu proizvodnju pokretnog tipa, kori\u0161\u0107enje mastila na bazi nafte i kori\u0161\u0107enje drvene \u0161tamparske prese sli\u010Dne poljoprivrednoj prese na zavrtanj iz tog perioda. Njegov zaista epohalan izum je kombinacija ovih elemenata u prakti\u010Dan sistem koji je omogu\u0107io masovnu proizvodnju \u0161tampanih knjiga i bio je ekonomski odr\u017Eiv za \u0161tampa\u010De i \u010Ditalaca podjednako. Za Gutenbergov metod za izradu tipki se tradicionalno smatra da su uklju\u010Dili vrstu metalne legure i kalupa za livenje tipki.");
		txtpnJohanGutenberg.setEditable(false);
		txtpnJohanGutenberg.setBounds(1454, 341, 404, 318);
		contentPane.add(txtpnJohanGutenberg);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Renesansa.class.getResource("/Images/strasnisud.png")));
		lblNewLabel_5.setBounds(939, 678, 505, 318);
		contentPane.add(lblNewLabel_5);
		
		JTextPane txtpnStrasniSud = new JTextPane();
		txtpnStrasniSud.setText("Stra\u0161ni sud\r\n\r\nSudnji dan ili stra\u0161ni sud u eshatolo\u0161kim religijama predstavlja verovanje u poslednji i kona\u010Dni sud koji \u0107e na kraju istorije biti izveden nad ljudima, tako da razdvoji pravedne od gre\u0161nih, nakon \u010Dega \u0107e pravedni kao nagradu zadobiti ve\u010Dni \u017Eivot a gre\u0161ni kona\u010Dnu smrt kao kaznu.\r\n\r\nU hri\u0161\u0107anstvu je u\u010Denje o sveop\u0161tem vaskrsenju, jedno od osnovnih dogmi. Izme\u0111u ostalog, ono je sastavni deo Nikejsko-carigradskog simbola vere sa\u010Duvanog od Hristovih apostola. \r\n\r\nPravoslavni hri\u0161\u0107ani veruju da \u0107e Isus Hristos suditi svim narodima, kada do\u0111e u slavi i svi sveti an\u0111eli sa njim (Matej 25:31). ");
		txtpnStrasniSud.setBounds(1454, 678, 404, 318);
		contentPane.add(txtpnStrasniSud);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Renesansa.class.getResource("/Images/background.png")));
		lblNewLabel_1.setBounds(0, 0, 1904, 1041);
		contentPane.add(lblNewLabel_1);
	}

}
