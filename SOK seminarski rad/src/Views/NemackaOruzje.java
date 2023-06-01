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

public class NemackaOruzje extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NemackaOruzje frame = new NemackaOruzje();
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
	public NemackaOruzje() {
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Legion\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\lugerp08.png"));
		lblNewLabel.setBounds(10, 11, 505, 318);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnPeriklePeriklestgr = new JTextPane();
		txtpnPeriklePeriklestgr.setText("Luger P08\r\n\r\nP08 ili Luger P08 je bio prvi poluautomatski pi\u0161tolj kori\u0161ten od nema\u010Dke vojske. Konstrukcija je trajala od 1893. do 1908. godine kada je uveden u upotrebu kao zamjena za dotada kori\u0161ten Reichsrevolver. \r\n\r\nKonstruisan je kao moderan primjer pi\u0161tolja sa zatvara\u010Dem u obliku koljena. Pri pucnju, zatvara\u010D se sa cijevi vra\u0107a nekoliko milimetara unazad pri \u010Demu se zatvara\u010D osloba\u0111a i putem zgloba se pomjera prema gore kako bi otvorio put za \u010Dahuru. Pri povratku prema naprijed, tjeran oprugom, zatvara\u010D iz magazina kupi novi metak i gura ga u cijev. Za povratak unazad i izbacivanje ispaljene \u010Dahure se koristi suvi\u0161na (reakciona) energija metka pri paljenju. U njema\u010Dkoj vojsci ga kao standardni pi\u0161tolj naslje\u0111uje Walther P38. ");
		txtpnPeriklePeriklestgr.setEditable(false);
		txtpnPeriklePeriklestgr.setBounds(525, 11, 404, 318);
		contentPane.add(txtpnPeriklePeriklestgr);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Legion\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\mp40.png"));
		lblNewLabel_2.setBounds(10, 678, 505, 318);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnKleopatraKleopatraIli = new JTextPane();
		txtpnKleopatraKleopatraIli.setText("Maschinenpistole 40\r\n\r\nMP 40 (nem. Maschinenpistole 40), popularno poznat kao \u0161majser (nem. Schmeisser) je nema\u010Dki automat kalibra 9x19mm, iz perioda Drugog svetskog rata. Dizajnirao ga je konstruktor Hajnrih Folmer, me\u0111utim ostao je upam\u0107en po pogre\u0161nom nazivu \u0160majser. Masovno je kori\u0161\u0107en na svim frontovima, te je postao simbol nema\u010Dkog Vermahta, kao i jedno od najupe\u010Datljivijih oru\u017Eja 20. veka, kao i neizostavni deo brojnih ratnih filmova.\r\n\r\nUkupno ih je proizvedeno oko 1,100.000 komada svih verzija, me\u0111utim nema\u010Dke fabrike su tokom 1944 obustavile proizvodnju doma\u0107eg \u201E\u0161majsera\u201D u korist italijanske Berete 38/42.\r\n\r\nNema\u010Dka je bila pionir kao prva zemlja koja je u naoru\u017Eanje uvela automat jo\u0161 1918, bio je to MP18. Me\u0111utim, on nije bio savr\u0161en, a kako je vreme prolazilo, bio je ve\u0107 zastareo tokom 1930-ih. Sa dolaskom nacista na vlast je po\u010Delo ponovo naoru\u017Eavanje nema\u010Dke vojske.");
		txtpnKleopatraKleopatraIli.setEditable(false);
		txtpnKleopatraKleopatraIli.setBounds(525, 678, 404, 318);
		contentPane.add(txtpnKleopatraKleopatraIli);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Legion\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\mauserc96.png"));
		lblNewLabel_3.setBounds(939, 11, 505, 318);
		contentPane.add(lblNewLabel_3);
		
		JTextPane txtpnPitagoraPitagoragr = new JTextPane();
		txtpnPitagoraPitagoragr.setEditable(false);
		txtpnPitagoraPitagoragr.setText("Mauser C96\r\n\r\nMauzer C96 (nem. Construktion 96) je nema\u010Dki poluatomatski pi\u0161tolj, razvijen 1895. u fabrici \u010Duvenog Paula Mauzera. Pi\u0161tolj odlikuju duga cev, te\u017Eina i mogu\u0107nost kori\u0161\u0107enja magacina. U trenutku nastanka, pi\u0161tolj C96 je bio revolucionarno oru\u017Eje ve\u0107eg kapaciteta i dometa.\r\n\r\nPi\u0161tolj Mauzer C96 je kori\u0161\u0107en u mnogim atentatima,a od kojih je najpoznatiji atentat na kralja Aleksandra. \r\n\r\nVeruje se da su ovaj pi\u0161tolj 1895. napravili radnici fabrike Mauzer, bra\u0107a Fidel, Fridrih i Jozef Federle. Fidel Federle je radio na odeljenju za testiranje oru\u017Eja i novi pi\u0161tolj je dobio oznaku \u201EP-7.63\u201D,a nakon toga pi\u0161tolj je patentiran na ime Paula Mauzera. Pi\u0161tolj je patentiran u Nema\u010Dkoj 1895, a u Velikoj Britaniji 1896.\r\n\r\nTokom 1896. su proizvedeni prvi primerci,a ve\u0107 tokom 1897. po\u010Dinje serijska proizvodnja pi\u0161tolja koja \u0107e trajati sve do 1939. U tom periodu je samo u fabrici Mauzer proizvedeno oko milion primeraka. ");
		txtpnPitagoraPitagoragr.setBounds(1454, 11, 404, 318);
		contentPane.add(txtpnPitagoraPitagoragr);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Legion\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\gewehr43.png"));
		lblNewLabel_4.setBounds(939, 341, 505, 318);
		contentPane.add(lblNewLabel_4);
		
		JTextPane txtpnTiberijeTiberijeKlaudije = new JTextPane();
		txtpnTiberijeTiberijeKlaudije.setText("Gewehr 43\r\n\r\nPu\u0161ka Gever 41 u re\u017Eimu poluautomatskog pucanja uvedena je u njema\u010Dku vojsku 1941. Ona je odgovorna za pove\u0107anje stope pucanja njema\u010Dkih kompanija, koje su u to vrijeme uglavnom opremljene pu\u0161kama Mauser K98, manualno pucanje sa cilindri\u010Dnom glavom. 1943. njema\u010Dki in\u017Eenjeri su odlu\u010Dili da naprave modernizovanu verziju poluautomatske pu\u0161ke Gever 41, nazvanu 43, koja se proizvodila u prili\u010Dno velikom broju.\r\n\r\nGever 43 (Gev 43) postao je sljede\u0107a evolucija Valtera Gever 41 iz 1941. godine - samopunjuju\u0107e, poluautomatske pu\u0161ke koja nije uspjela da ispuni da zahtjevaju\u0107u proizvodnju da bi napravilia pravi utisak u ratnim vremenima. 1940. godine, Nijemci su donijeli program za isporuku standardne poluautomatske pu\u0161ke njihovim pje\u0161adijskim odredima, kako bi pobolj\u0161ali svoje zastarjele pu\u0161ke. Britanci, Amerikanci i Sovjeti ve\u0107 su izdavali takvo oru\u017Eje svojim trupama, ostavljaju\u0107i Nemce sa malo izbora. ");
		txtpnTiberijeTiberijeKlaudije.setEditable(false);
		txtpnTiberijeTiberijeKlaudije.setBounds(1454, 341, 404, 318);
		contentPane.add(txtpnTiberijeTiberijeKlaudije);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Legion\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\stg44.png"));
		lblNewLabel_5.setBounds(939, 678, 505, 318);
		contentPane.add(lblNewLabel_5);
		
		JTextPane txtpnNefertitiNefertitiNefertitis = new JTextPane();
		txtpnNefertitiNefertitiNefertitis.setText("Sturmgewehr 44\r\n\r\n\u0160turmgever 44 (nem. Sturmgewehr 44) je prva njema\u010Dka juri\u0161na pu\u0161ka iz perioda Drugog svjetskog rata, prete\u010Da dana\u0161njih automatskih pu\u0161aka. Studije razvoja zapo\u010Dele su 1942. i nastavile se do 1944. Nekoliko modela je proizvedeno u razli\u010Dito vrijeme, kao \u0161to je MP 43, po\u010Detni ishod dizajnerskih radova na juri\u0161noj pu\u0161ci, Zapad i posebno tokom bitke za Normandiju. Izvje\u0161taji o efikasnosti oru\u017Eja veoma su ohrabruju\u0107i za Nijemce koji su odlu\u010Dili da nastave sa pobolj\u0161anjima.\r\n\r\nTokom Prvog svjetskog rata, njema\u010Dki in\u017Einjer Hugo \u0160majser je zaklju\u010Dio da su 7.92mm pu\u0161ke vrlo nezgodne za juri\u0161 na rovove i zato je razvio kompaktno automatsko oru\u017Eje pomo\u0107u metaka pi\u0161toljskog kalibra koji su \u017Ertvovali ta\u010Dnost velikog dometa za male dimenzije, malu masu i smanjeni odboj. Godine 1934. Heresvafenamt (vojni biro za naoru\u017Eanje) po\u010Deo je da razvija metke srednjeg dometa sa skra\u0107enom \u010Daurom i smanjenom koli\u010Dinom baruta, i dalje sposobne za efikasan domet od 400 metara.");
		txtpnNefertitiNefertitiNefertitis.setBounds(1454, 678, 404, 318);
		contentPane.add(txtpnNefertitiNefertitiNefertitis);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Legion\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\kar98.png"));
		lblNewLabel_1.setBounds(10, 340, 505, 318);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnKarbinerKarabin = new JTextPane();
		txtpnKarbinerKarabin.setText("Karbiner 98\r\n\r\nKarabin 98 kratki (Kar98k, K98 ili K98k nem. Mauser Modell 98 - Karabiner 98k) je pu\u0161ka prilago\u0111ena pe\u0161adiji, \u010Diju proizvodnju je zapo\u010Dela fabrika Mauzer 1935. godine u Nema\u010Dkoj. Karabin 98k je nastao kra\u0107enjem pu\u0161ke Gewehr 98.\r\n\r\nFabrika Mauzer, koju su osnovala bra\u0107a Paul i Vilhelm Mauzer, je stekla reputaciju jedne od najboljih fabrika oru\u017Eja jo\u0161 krajem 19. veka, i odr\u017Eala ju je do kraja Drugog svetskog rata. Nakon rata, kompanija je ostala u Zapadnoj Nema\u010Dkoj i bavila se uglavnom oru\u017Ejem velikog kalibra (avionski topovi i sl.). Prva pu\u0161ka kojom se Mauzer proslavio je bila \u201EMauzer M1871\" koja je bila i u naoru\u017Eanju Srpske vojske, najve\u0107i udarac zaa firmu je bio to \u0161to je Nema\u010Dka vojska 1888. izabrala sistem Manliher za svoju novu \u0161u\u0161ku, a koju je Mauzer odbio da proizvodi iz li\u010Dnih razloga. Narednih godina se kompanija Mauzer na\u0161la u ozbiljnim finansijskim problemima i na rubu egzistencije, a spa\u0161avale su je jedino kupovine iz inostranstva, pre svega Mauzerovi najbolji kupci (Srbija, \u0160panija, Turska i neke ju\u017Enoameri\u010Dke zemlje).");
		txtpnKarbinerKarabin.setEditable(false);
		txtpnKarbinerKarabin.setBounds(525, 340, 404, 318);
		contentPane.add(txtpnKarbinerKarabin);
	}
}
