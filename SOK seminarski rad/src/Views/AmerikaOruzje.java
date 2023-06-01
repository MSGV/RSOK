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

public class AmerikaOruzje extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AmerikaOruzje frame = new AmerikaOruzje();
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
	public AmerikaOruzje() {
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
		lblNewLabel.setIcon(new ImageIcon(AmerikaOruzje.class.getResource("/Images/m1911.png")));
		lblNewLabel.setBounds(10, 11, 505, 318);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnPeriklePeriklestgr = new JTextPane();
		txtpnPeriklePeriklestgr.setText("M1911\r\n\r\nM1911 je ameri\u010Dki poluautomatski pi\u0161tolj kalibra .45 ACP, dizajniran od strane \u010Duvenog D\u017Eona Brauninga. Pi\u0161tolj M1911 je 1911. godine uveden u naoru\u017Eanje Ameri\u010Dke vojske koja ga je koristila sve do kraja 1980-ih. Mnoge armije, poput Gr\u010Dke vojske sve do dana\u0161njih dana koriste ovaj pi\u0161tolj kao slu\u017Ebeni. M1911 je oru\u017Eje sa najdu\u017Eim vekom upotrebe, du\u017Ee od jednog veka slu\u017Ei kao pouzdano i veoma dobro oru\u017Eje i kao takav je postao legenda me\u0111u ljubiteljima oru\u017Eja \u0161irom sveta. \r\n\r\nNakon \u0161to je Ameri\u010Dka vojska objavila tender za poluautomatski pi\u0161tolj kalibra najmanje .45, D\u017Eon Brauning, koji je u to vrijeme radio u firmi Kolt, preure\u0111uje svoj pi\u0161tolj kalibra \u201E.38 Special\u201D time \u0161to mu mijenja kalibar na \u201E.45 ACP\u201D. Ovom izmjenom on na testiranje daje jedan ve\u0107 isproban poluautomatski pi\u0161tolj dok jedini konkurent, firma \u201ESavage\u201D, svojim konceptom ne mo\u017Ee zadovoljiti potrebe vojske. ");
		txtpnPeriklePeriklestgr.setEditable(false);
		txtpnPeriklePeriklestgr.setBounds(525, 11, 404, 318);
		contentPane.add(txtpnPeriklePeriklestgr);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(AmerikaOruzje.class.getResource("/Images/thompson.png")));
		lblNewLabel_2.setBounds(10, 678, 505, 318);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnKleopatraKleopatraIli = new JTextPane();
		txtpnKleopatraKleopatraIli.setText("M1 Thompson\r\n\r\nTompson je ameri\u010Dki automat u kalibru 11.43x23mm (.45 ACP), koji je razvio general D\u017Eon T. Tompson neposredno nakon Prvog svetskog rata. Prvobitno su ga koristili kriminalci, a nakon toga ulazi i u naoru\u017Eanje Ameri\u010Dke vojske. Kori\u0161\u0107en je u svim sukobima od 1920-ih pa do danas, a tokom vi\u0161edecenijske upotrebe, automat Tompson je stekao status legende. \r\n\r\nRovovski rat kakav je vo\u0111en tokom Prvog svetskog rata podstakao je konstruisanje unikatnih oru\u017Eja, koja kasnije postaju uobi\u010Dajena na boji\u0161tima \u0161irom sveta: ru\u010Dne bombe, baca\u010Di plamena, laki minobaca\u010Di, automati i pu\u0161komitraljezi.\r\n\r\nNema\u010Dka je bila pionir u razvoju automata, sa prvom prakti\u010Dnom konstrukcijom automata. Automat je na nema\u010Dkom \u201Enem. Maschinenpistole\u201C, \u0161to doslovno zna\u010Di \u201Ema\u0161inski pi\u0161tolj\u201D, a zvani\u010Dna oznaka prvog nema\u010Dkog automata je bila 9 mm Bergman MP18/1. Nemci su tokom bitke za Verden 1916. godine brzo shvatili da su pu\u0161ke repetirke imale velika ograni\u010Denja u borbi u rovovima. ");
		txtpnKleopatraKleopatraIli.setEditable(false);
		txtpnKleopatraKleopatraIli.setBounds(525, 678, 404, 318);
		contentPane.add(txtpnKleopatraKleopatraIli);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(AmerikaOruzje.class.getResource("/Images/swm1917.png")));
		lblNewLabel_3.setBounds(939, 11, 505, 318);
		contentPane.add(lblNewLabel_3);
		
		JTextPane txtpnPitagoraPitagoragr = new JTextPane();
		txtpnPitagoraPitagoragr.setEditable(false);
		txtpnPitagoraPitagoragr.setText("Smith & Wesson M1917 Revolver\r\n\r\nM1917 Revolveri su \u0161estometci velikog okvira, kalibra .45 ACP, koje je Ameri\u010Dka vojska usvojila 1917. godine kako bi dopunili standardni pi\u0161tolj M1911 tokom Prvog svetskog rata.[1] Postojale su dve varijante M1917, jedna proizvedena od strane Colta, a druga od strane Smith & Wessona. Koristili su \"moon clip\" (mesecasti le\u017Eaj) da dr\u017Ee metke na mestu, olak\u0161avaju ponovno punjenje i poma\u017Eu pri izbacivanju, s obzirom da su revolveri bili dizajnirani za izbacivanje metaka sa ivicom, dok su .45 ACP metci bezivice namenjeni za upotrebu sa M1911 pi\u0161toljem sa spremnikom.\r\n\r\nSmith & Wesson Model 1917 je u osnovi adaptacija modela .44 Hand Ejector 2nd kompanije Smith & Wesson, ali je kalibra .45 ACP. Koristi skra\u0107eni valjak i prsten za vezicu na zadnjem delu okvira. S&W M1917 se razlikuje od Colta M1917 po tome \u0161to ima utor na valjku koji omogu\u0107ava bezivice .45 ACP metke da se fiksiraju na ustima (kao \u0161to se \u010Dini kod pi\u0161tolja).");
		txtpnPitagoraPitagoragr.setBounds(1454, 11, 404, 318);
		contentPane.add(txtpnPitagoraPitagoragr);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(AmerikaOruzje.class.getResource("/Images/springfield.png")));
		lblNewLabel_4.setBounds(939, 341, 505, 318);
		contentPane.add(lblNewLabel_4);
		
		JTextPane txtpnTiberijeTiberijeKlaudije = new JTextPane();
		txtpnTiberijeTiberijeKlaudije.setText("M1903 Springfield\r\n\r\nM1903 Springfild (engl. M1903 Springfield) je ameri\u010Dka pu\u0161ka repetirka u kalibru .30-06 koja je po\u010Detkom dvadesetog veka uvedena u naoru\u017Eanje Ameri\u010Dke vojske.\r\n\r\nTokom rata sa \u0160panijom, Ameri\u010Dke trupe su bile naoru\u017Eane pu\u0161kama Krag-Jorgensen dok je \u0161panska armija posedovala Mauzerove pu\u0161ke M1893 u kalibru 7x57mm. Tokom bitke za brda San Huan, oko 750 \u0161panskih vojnika su uspeli da zaustave napad 15.000 ameri\u010Dkih i tom prilikom za nekoliko minuta izbacili iz stroja oko 1.400 ameri\u010Dkih vojnika.\r\n\r\nAmeri\u010Dka vojna komisija je smatrala da su njihove pu\u0161ke Krag-Jorgensen nepodobne da ih je potrebno zameniti boljim sistemom. Zarobljeni \u0161panski Mauzeri su preba\u010Deni u SAD gde su se na testiranjima pokazali kao superiorni dizajn odlikovan precizno\u0161\u0107u, kvalitetom, izdr\u017Eljivo\u0161\u0107u i jednostavno\u0161\u0107u pa se Ameri\u010Dka vojska odlu\u010Dila za Mauzerov sistem.\r\n");
		txtpnTiberijeTiberijeKlaudije.setEditable(false);
		txtpnTiberijeTiberijeKlaudije.setBounds(1454, 341, 404, 318);
		contentPane.add(txtpnTiberijeTiberijeKlaudije);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(AmerikaOruzje.class.getResource("/Images/greasegun.png")));
		lblNewLabel_5.setBounds(939, 678, 505, 318);
		contentPane.add(lblNewLabel_5);
		
		JTextPane txtpnNefertitiNefertitiNefertitis = new JTextPane();
		txtpnNefertitiNefertitiNefertitis.setText("M3 Grease Gun (\"Mazalica\")\r\n\r\nM3 \"Mazalica\", poznata i kao Thompson submachine gun, bila je legendarna automatska pu\u0161ka koja je prvi put uvedena tokom perioda izme\u0111u dva svetska rata. Ova ikoni\u010Dna vatrena mo\u0107 postala je prepoznatljiv simbol i ostavila dubok utisak u vojnim i kriminalnim krugovima.\r\n\r\nM3 Mazalica je dizajnirana od strane D\u017Eona T. Tompsona i postala je omiljeno oru\u017Eje ameri\u010Dkih vojnika tokom Drugog svetskog rata. Sa svojim karakteristi\u010Dnim izgledom, visokim tempom paljbe i pouzdano\u0161\u0107u, postala je simbol ameri\u010Dke snage i borbe tokom sukoba. Ova automatska pu\u0161ka je imala jedinstvenu reputaciju me\u0111u vojnicima i odmetnicima. M3 Mazalica je pru\u017Eala izuzetnu efikasnost u bliskoj borbi i urbanim okru\u017Eenjima. Bila je cenjena zbog svoje sposobnosti da brzo ispaljuje .45 ACP metke, koji su pru\u017Eali sna\u017Enu zaustavnu mo\u0107 na kratkom dometu. ");
		txtpnNefertitiNefertitiNefertitis.setBounds(1454, 678, 404, 318);
		contentPane.add(txtpnNefertitiNefertitiNefertitis);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AmerikaOruzje.class.getResource("/Images/m1garand.png")));
		lblNewLabel_1.setBounds(10, 340, 505, 318);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnKarbinerKarabin = new JTextPane();
		txtpnKarbinerKarabin.setText("M1 Garand\r\n\r\nM1 Garand je ameri\u010Dka poluautomatska pu\u0161ka, koju je Ameri\u010Dka vojska uvela u naoru\u017Eanje 1936. godine. M1 Garand je bila prva poluautomatska pu\u0161ka uvedena u naoru\u017Eanje i masovno proizvo\u0111ena. Koristila se masovno tokom Drugog svetskog i Korejskog rata, a ograni\u010Denu primenu je videla i tokom Vijetnamskog rata. Poslednji put M1 Garand je masovno kori\u0161\u0107en 1980-ih tokom Ira\u010Dko-Iranskog rata. \r\n\r\nPu\u0161ku M1 Garand je 1929. konstruisao Kana\u0111anin francuskog porekla D\u017Eon Garand. Prvi prototip je bila pu\u0161ka \u201ET3 \u201D sa odvodom barutnih gasova. Tokom ispitivanja 1930-ih pu\u0161ka je dobijala oznake \u201ET3E2\u201D, \u201ET1E1\u201D. Pobolj\u0161ana verzija \u201ET1E2\u201D je dobila slu\u017Ebenu oznaku \u201EM1\u201D, a 1936. nakon uspe\u0161nih ispitivanja, odlu\u010Deno je da pu\u0161ka M1 Garand bude uvedena u naoru\u017Eanje Ameri\u010Dke vojske pod oznakom \u00ABUS rifle, .30 caliber, M1\u00BB. Bilo je predlo\u017Eeno da nova pu\u0161ka dobije okvire kapaciteta 10 metaka me\u0111utim general Daglas Makartur se \u017Eestoko usprotivio pa je odlu\u010Deno da pu\u0161ka koristi klip kapaciteta 8 metaka koji se ubacuje odozgo. ");
		txtpnKarbinerKarabin.setEditable(false);
		txtpnKarbinerKarabin.setBounds(525, 340, 404, 318);
		contentPane.add(txtpnKarbinerKarabin);
	}
}

