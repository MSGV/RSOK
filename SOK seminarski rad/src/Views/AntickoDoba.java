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
		lblNewLabel.setIcon(new ImageIcon(AntickoDoba.class.getResource("/Images/Anaxagoras_and_Pericles.png")));
		lblNewLabel.setBounds(10, 11, 505, 318);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnPeriklePeriklestgr = new JTextPane();
		txtpnPeriklePeriklestgr.setText("Perikle\r\n\r\nPerikle bio je starogr\u010Dki dr\u017Eavnik, govornik i vojskovo\u0111a iz V veka p. n. e. od naro\u010Ditog zna\u010Daja u dobu izme\u0111u Gr\u010Dko-persijskih ratova i Peloponeskog rata. Razdoblje njegove politi\u010Dke nadmo\u0107i (461. p. n. e. \u2014 429. p. n. e.), u istoriji je dobilo ime Periklovo doba, tako\u0111e Zlatni vek, jer Atina je tokom tih godina bila na vrhuncu svoje mo\u0107i.\r\n\r\nPerikle je iskoristio pobedu Grka nad Persijancima, kao i ja\u010Danje atinske mornarice i preobrazio Delski savez u Atinsku pomorsku dr\u017Eavu, a samu Atinu je doveo do najve\u0107e mo\u0107i i slave u njenoj dotada\u0161njoj istoriji. Za stratega Atine biran je 14 puta uzastopno, \u0161to nikome do tada nije uspelo. Na vojni\u010Dkom planu, Periklovi vojni pohodi imali su kao glavni cilj o\u010Duvanje strate\u0161kih interesa Atine i njeno ja\u010Danje, kako na kopnu, tako i na moru. ");
		txtpnPeriklePeriklestgr.setEditable(false);
		txtpnPeriklePeriklestgr.setBounds(525, 11, 404, 318);
		contentPane.add(txtpnPeriklePeriklestgr);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AntickoDoba.class.getResource("/Images/Romul_i_Rem.png")));
		lblNewLabel_1.setBounds(10, 341, 505, 318);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnRomulIRem = new JTextPane();
		txtpnRomulIRem.setText("Romul i Rem\r\n\r\nRomul (lat. Romulus) i Rem (lat. Remus) su, po rimskoj mitologiji bra\u0107a blizanci, sinovi boga rata Marsa i vestalke Ree Silvije, osniva\u010Di Rima, a Romul je bio i prvi rimski kralj. Posle smrti Eneja, Alba Longom su vladali njegovi potomci, a kada je na presto do\u0161ao Enejev potomak Numitor, sa prestola ga je svrgnuo brat Amulije. Po preuzimanju prestola, Amulije je ubio Numitorovog sina, a njegovu k\u0107erku Reu Silviju poslao u hram boginje ku\u0107nog ognji\u0161ta Veste.\r\n\r\nRea Silvija je uskoro rodila blizance - Romula i Rema. Kada je kralj Amulije saznao \u0161ta se dogodilo, boje\u0107i se da \u0107e mu bra\u0107a, kada odrastu, oduzeti vlast, naredio je svome robu da blizance baci u reku Tibar. Romula i Rema je rob stavio u korpu i spustio u reku, ali je voda korpu sa bra\u0107om izbacila na obalu reke, u podno\u017Eju Palatina, jednog od sedam bre\u017Euljaka. U blizini obale je bila vu\u010Dica Martia - Marsova vu\u010Dica koja je danas simbol grada Rima - i \u010Duv\u0161i pla\u010D dece do\u0161la je i nahranila ih je svojim mlekom. ");
		txtpnRomulIRem.setEditable(false);
		txtpnRomulIRem.setBounds(525, 341, 404, 318);
		contentPane.add(txtpnRomulIRem);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(AntickoDoba.class.getResource("/Images/Kleopatra.png")));
		lblNewLabel_2.setBounds(10, 678, 505, 318);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnKleopatraKleopatraIli = new JTextPane();
		txtpnKleopatraKleopatraIli.setText("Kleopatra VII\r\n\r\nKleopatra ili punim imenom Kleop\u0430tr\u0430 VII Filop\u0430tor je bil\u0430 kr\u0430ljic\u0430 helenisti\u010Dkog Egipt\u0430 iz din\u0430stije Ptolemeid\u0430. U prole\u0107e 51. godine pne. Ptolomej XII Aulet je umro i ost\u0430vio kr\u0430ljevstvo svojoj os\u0430mn\u0430estogodi\u0161njoj k\u0107eri Kleop\u0430tri i njenom ml\u0430\u0111em br\u0430tu Ptolemeju XIII koji je t\u0430d\u0430 im\u0430o 12 godin\u0430. \r\n\r\nKleop\u0430tr\u0430 je ro\u0111en\u0430 69 godine pne. u Aleks\u0430ndriji, Egip\u0430t. Im\u0430l\u0430 je dve st\u0430rije sestre, Kleop\u0430tru VI i \u0411ereniku IV k\u0430o i ml\u0430\u0111u sestru Arsinoju IV i dv\u0430 ml\u0430\u0111\u0430 br\u0430t\u0430 Ptolemej\u0430 XIII i Ptolemej\u0430 XIV. Po egip\u0430tskom z\u0430konu Kleop\u0430tr\u0430 je mor\u0430l\u0430 im\u0430ti suvl\u0430d\u0430r\u0430, t\u0430ko d\u0430 se ud\u0430l\u0430 z\u0430 svog ml\u0430\u0111eg br\u0430t\u0430, i ubrzo izb\u0430cil\u0430 njegovo ime iz upotrebe i n\u0430 svim dr\u017E\u0430vnim dokumentim\u0430 bilo je n\u0430pis\u0430no s\u0430mo njeno. K\u0430d\u0430 je do\u0161l\u0430 n\u0430 vl\u0430st, Cip\u0430r i Kiren\u0430ik\u0430 (d\u0430n\u0430\u0161nj\u0430 Libij\u0430) su bili izgubljeni, \u0430li on\u0430 nik\u0430d nije prest\u0430l\u0430 d\u0430 s\u0430nj\u0430 o ogromnoj mo\u0107i i jo\u0161 ve\u0107em Egiptu. N\u0430ime, Kleop\u0430tr\u0430 nije bil\u0430 poreklom iz Egipt\u0430 jer je njen\u0430 din\u0430stij\u0430 Ptolemej\u0430 iz M\u0430kedonije. K\u0430o i njeni preci im\u0430l\u0430 je eksplozivnu n\u0430r\u0430v, veliku str\u0430st \u0430li i nepromi\u0161ljenost. ");
		txtpnKleopatraKleopatraIli.setEditable(false);
		txtpnKleopatraKleopatraIli.setBounds(525, 678, 404, 318);
		contentPane.add(txtpnKleopatraKleopatraIli);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(AntickoDoba.class.getResource("/Images/Pitagora.png")));
		lblNewLabel_3.setBounds(939, 11, 505, 318);
		contentPane.add(lblNewLabel_3);
		
		JTextPane txtpnPitagoraPitagoragr = new JTextPane();
		txtpnPitagoraPitagoragr.setEditable(false);
		txtpnPitagoraPitagoragr.setText("Pitagora\r\n\r\nPitagora (gr\u010D. \u03A0\u03C5\u03B8\u03B1\u03B3\u03CC\u03C1\u03B1\u03C2, oko 580. pne. \u2013 oko 497. pne.) je anti\u010Dki gr\u010Dki matemati\u010Dar, nau\u010Dnik, astrononom i filozof, osniva\u010D filozofskog, matemati\u010Dkog, misti\u010Dkog i nau\u010Dnog dru\u0161tva ili zajednice, koja je poznata pod imenom Pitagorejska \u0161kola. Danas je najpoznatiji kao tvorac Pitagorine teoreme koja je nazvana po njemu. Pitagora je sna\u017Eno uticao na filozofsku misao i religijska razmatranja u drugoj polovini 6. veka st. e. \r\n\r\nPitagorina li\u010Dnost obavijena je gustom maglom mitova i legendi, \u010Dak i vi\u0161e nego \u0161to je slu\u010Daj kod ostalih presokratskih filozofa, pa se o njegovom \u017Eivotu i u\u010Denju malo toga mo\u017Ee sa sigurno\u0161\u0107u re\u0107i. Pitagora, sin Mnesarha, rodio se oko 580. st. e. na ostrvu Samosu. Mogu\u0107e je da je po nare\u0111enju samoskog tiranina Polikrata putovao u Cacak kako bi se bolje upoznao s ustanovama tamo\u0161njih sve\u0161tenika. ");
		txtpnPitagoraPitagoragr.setBounds(1454, 11, 404, 318);
		contentPane.add(txtpnPitagoraPitagoragr);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(AntickoDoba.class.getResource("/Images/Tiberije.png")));
		lblNewLabel_4.setBounds(939, 341, 505, 318);
		contentPane.add(lblNewLabel_4);
		
		JTextPane txtpnTiberijeTiberijeKlaudije = new JTextPane();
		txtpnTiberijeTiberijeKlaudije.setText("Tiberije\r\n\r\nTiberije Klaudije Neron Cezar (lat. Tiberius Claudius Nero Caesar, ro\u0111en 42. st.e., vladao od 14. n.e., umro 37. n.e.) bio je rimski car, naslednik Oktavijana Avgusta. Nakon perioda Avgustove vladavine, koji predstavlja prelazno doba s republike na monarhiju, po\u010Dinje period ranog Rimskog Carstva. Prema odredbama Avgustovog testamenta, vlast je pre\u0161la na njegovog pastorka Tiberija. Tiberije je bio iskusan vojskovo\u0111a i diplomata. On je podvla\u010Dio da prema senatu nastavlja politiku svog prethodnika. Jedna od prvih njegovih mera bilo je ja\u010Danje vlasti senata. Pod Tiberijem su prestale da se sastaju izborne komicije, a izbor magistrata prelazi na senat, tako da senat sada postaje i izborno i zakonodavno telo. Prve godine Tiberijeve vladavine obele\u017Eene su slogom izme\u0111u senata i cara, ali se ona zatim naru\u0161ava. Tiberije nije hteo da prima nove titule, odbio je da naziv imperatora u\u010Dini delom svoga imena , a odbio je da primi i po\u010Dasnu titulu oca domovine. On se prvih godina vladavine trudio da podvu\u010De svoju lojalnost prema senatu. ");
		txtpnTiberijeTiberijeKlaudije.setEditable(false);
		txtpnTiberijeTiberijeKlaudije.setBounds(1454, 341, 404, 318);
		contentPane.add(txtpnTiberijeTiberijeKlaudije);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(AntickoDoba.class.getResource("/Images/Nefertiti.png")));
		lblNewLabel_5.setBounds(939, 678, 505, 318);
		contentPane.add(lblNewLabel_5);
		
		JTextPane txtpnNefertitiNefertitiNefertitis = new JTextPane();
		txtpnNefertitiNefertitiNefertitis.setText("Nefertiti\r\n\r\nNefertiti, Nefertitis ili Nofretete je bila \u017Eena egipatskog faraona Amenhotepa IV (Ahenatona). Njeno ime pribli\u017Eno zna\u010Di \u201Elepotica je stigla\u201C. Iako je jedna od najpopularnijih li\u010Dnosti Starog Egipta, danas je od nje sa\u010Duvano veoma malo predmeta, od kojih je najpoznatija njena bista, koja se \u010Duva u muzeju u Berlinu. U istoriji je upam\u0107ena po verskoj reformi, koju je sprovela u Egiptu zajedno sa svojim mu\u017Eem, faraonom Amenhotepom IV. \r\n\r\nNefertiti postaje istorijska li\u010Dnost od udaje za Ahenatona. Veruje se da ju je na to mesto dovela kraljica Tij, tada\u0161nja vladarka Egipta, a ro\u0111ena sestra Nefertitinog oca Aja. Ona je svoju ne\u0107aku udala za svog sina, s' namerom da ga ova odvoji od monoteizma. Me\u0111utim, Nefertiti je i\u0161la ka tome da u\u010Dvrsti svoj polo\u017Eaj glavne supruge, ba\u0161 tako \u0161to \u0107e Ahenatonu pomagati u nastojanjima da Egipat prevede na monoteisti\u010Dku veru. Ona i faraon su verovali u Atona, boga svetlosti i njemu u \u010Dast podigli novu prestonicu - Amarnu. Preseljenje prestonice iz Tebe, koja je bila vekovno sedi\u0161te Egipta bilo je ravno revoluciji. ");
		txtpnNefertitiNefertitiNefertitis.setBounds(1454, 678, 404, 318);
		contentPane.add(txtpnNefertitiNefertitiNefertitis);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(AntickoDoba.class.getResource("/Images/background.png")));
		lblNewLabel_6.setBounds(0, 0, 1904, 1041);
		contentPane.add(lblNewLabel_6);
		
	}

}
