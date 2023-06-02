package Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NemackaUniforma extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NemackaUniforma frame = new NemackaUniforma();
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
	public NemackaUniforma() {
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
		btnNewButton.setBounds(10, 1007, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnModel1936 = new JTextPane();
		txtpnModel1936.setEditable(false);
		txtpnModel1936.setText("Model 1936\r\n\r\nKada su nacisti došli na vlast početkom 1933. godine, Reichswehr, vojne snage Vajmarske Republike, bile su blizu završetka dvogodišnjeg projekta preoblikovanja uniforme vojnog feldbluza (poljska bluza). Počevši te godine, nova tunika je izdata Reichsheeru, a potom i brzo rastućoj Wehrmacht Heer vojsci, iako su se vršile manje dizajnerske promene sve do pojavljivanja standardizovane Heeres Dienstanzug Modell 1936 uniforme. M36 tunika je i dalje zadržala tradicionalnu boju uniforme carske i Reichswehr sive-zelene boje \"poljsko sivo\" (feldgrau)[a] od vune, ali je uključivala četiri prednja džepa sa šiljastim režnjevima i naborima (na Reichswehr tunikama donji džepovi su bili unutrašnji i uglavljeni). Prednji deo je bio zatvoren sa pet dugmadi umesto prethodnih osam, a okovratnik i epoletne su bile tamno boce-zelene umesto Reichswehr sive.[1] U odnosu na uniforme iz Vajmarskog perioda, suknja feldbluze je bila kraća, a krojenje je bilo prilagođeno telu zbog usvajanja mehanizovanih ratovanja u Nemačkoj: vojnici su sada provodili mnogo vremena u skučenom prostoru vozila, a kraća jakna je manje privlačila prljavštinu sa sedišta.[2] Takođe je uključivala unutrašnji sistem vešanja, gde je vojnik mogao okačiti opasač na seriju kukica spolja na tunici. Ove kukice su bile povezane sa dve trake unutar postave, što je rasporedilo težinu opreme bez potrebe za spoljnim vešalicama za opremu. M36 je proizvođena i izdata do samog kraja rata, iako su kasnije verzije postale dominantne.");
		txtpnModel1936.setBounds(352, 11, 316, 500);
		contentPane.add(txtpnModel1936);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(SSSRTU.class.getResource("/Images/model1936.png")));
		lblNewLabel.setBounds(26, 11, 316, 500);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(SSSRTU.class.getResource("/Images/waffenrock.png")));
		lblNewLabel_1.setBounds(685, 11, 229, 500);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnWaffenrock = new JTextPane();
		txtpnWaffenrock.setEditable(false);
		txtpnWaffenrock.setText("Waffenrock\r\n\r\nWaffenrock (vojni kaput) potiče od onog koji je uveden u Prusku vojsku 1842. godine i brzo je usvojen od strane drugih nemačkih država. U svom obliku kao uniforma Wehrmachta koja je izdata 1935. godine, bio je usko krojen dvoredni kaput do sredine butina, napravljen od finog vunenog materijala u boji feldgrau, bez spoljnih džepova. Okovratnik je bio viši od službene tunike i imao je složenije Litzen vezene u potpunosti srebrno-belo, postavljene na podlogu boje Waffenfarbe; manji Ärmelpatten, slični Litzen-u, nalazili su se ispod dugmadi na tamno-zelenim manžetnama. Waffenfarbe trake su takođe ivicale okovratnik, manžetne, prednje zatvaranje i špicasti zadnji izrez.\r\n\r\nOficiri su nosili formalni pojas od srebrne trake. Pantalone su bile steingrau, sa bočnim šavovima ivičenim Waffenfarbe trakom. U svečanom odijelu (grosser Gesellschaftanzug), Waffenrock se nosio sa medaljama, agiletom (za oficire), pantalonama i cipelama, Schirmmütze (kapa sa šiltom), rukavicama i mačem (za oficire/starije podoficire) ili paradnom bajonetom (za vojnike nižih činova). U paradnoj uniformi se nosio čelični šlem i čizme. Polusvečano (kleiner Gesellschaftanzug) i izlazni (Ausgangsanzug) odela bila su slična svečanoj uniformi, ali bez agilete i sa trakama umesto medalja.");
		txtpnWaffenrock.setBounds(924, 11, 285, 500);
		contentPane.add(txtpnWaffenrock);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(SSSRTU.class.getResource("/Images/rommel.png")));
		lblNewLabel_1_1.setBounds(1219, 11, 317, 500);
		contentPane.add(lblNewLabel_1_1);
		
		JTextPane txtpnRomel = new JTextPane();
		txtpnRomel.setEditable(false);
		txtpnRomel.setText("Uniforma Afrika Korpusa pod komandom Rommela:\r\n\r\nUniforma Afrika Korpusa, koji je bio pod komandom feldmaršala Ervina Romela tokom Drugog svetskog rata, imala je nekoliko karakterističnih elemenata. Afrika Korpus je bio nemačka vojna formacija koja je služila u severnoj Africi.\r\n\r\n-Tunic (Tunika): Afrika Korpus je nosio tamno smeđu tuniku koja je bila izrađena od lagane tkanine pogodne za tople klimatske uslove pustinje. Tunika je imala četiri džepa na prednjoj strani i zakopčavala se sa šest dugmadi.\r\n\r\n-Tropical Shirt (Tropska košulja): Ispod tunike, vojnici Afrika Korpusa nosili su tropsku košulju od lagane tkanine sa kratkim rukavima. Ova košulja je bila u smeđoj ili peskovitoj boji.\r\n\r\n-Shorts (Kratke pantalone): Umesto dugih pantalona, Afrika Korpus je nosio kratke pantalone. Ove kratke pantalone su bile smeđe boje i dizajnirane tako da budu prikladne za pustinjske uslove.\r\n\r\n-M41 Tropical Field Cap (Tropska vojnička kapa M41): Kao deo uniforme, vojnici su nosili tropsku vojničku kapu M41. Ova kapa je imala šiljati vrh i mogla se nositi sa ili bez šlema. Obično je bila u smeđoj boji.\r\n\r\n-Boots (Čizme): Afrika Korpus je nosio visoke vojničke čizme u smeđoj boji. Ove čizme su bile prilagođene za pustinjsko okruženje i pružale su zaštitu od peska i vrućine.");
		txtpnRomel.setBounds(1546, 11, 317, 500);
		contentPane.add(txtpnRomel);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(AntickoDoba.class.getResource("/Images/background.png")));
		lblNewLabel_6.setBounds(0, 0, 1904, 1041);
		contentPane.add(lblNewLabel_6);
	}
}
