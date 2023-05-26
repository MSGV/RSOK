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

public class SSSRTU extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SSSRTU frame = new SSSRTU();
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
	public SSSRTU() {
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
		
		JTextPane txtpnLetnjaUniformaManeken = new JTextPane();
		txtpnLetnjaUniformaManeken.setEditable(false);
		txtpnLetnjaUniformaManeken.setText("Letnja uniforma\r\n\r\nManeken obučen u letnju uniformu sovjetske Crvene armije iz Drugog svetskog rata (RKKA):\r\nRuski čelični šlem: SSh-39 ili SSh-40\r\nGimnastiorka (Гимнастёрка, gimnasterka, gymnastiorka, gymnasterka, gimnastyorka) poljska bluza/prebacujuća tunika/smok jakna\r\nZnačka odličnog snajpera (Znak Otličnij snajper) stvorena 1942\r\nSovjetski malokalibarska puška PPSh-41 (Pistolet-pulemet Špagina, pistolet-pulemet Špagina, nadimak papaš, papaša) sa kesama za municiju u pojasu\r\n:Uniforme i oprema RKKA tokom Velikog otadžbinskog rata (GPV/2SVR) mogu se opisati kao jednostavne, ali udobne i praktične. Osnovnu uniformu čine kačket na klin (bočni kačket, garnizon kapa), pilotka sa kokardom Crvene zvezde, pulover tunika, gimnastiorka, pantalone, šarovari i na kraju čizme, sapogi ili municije (gležnjače) nosi se sa kitovima, botinkama c obmotki. Telogreika (vatnik, fufaika) jakne i pantalone, topla, prošivena, podstavljena pamučna zimska odeća, postali su deo zimske uniforme sovjetske Crvene armije tokom Nemačko-sovjetskog rata (2. svetski rat).");
		txtpnLetnjaUniformaManeken.setBounds(352, 11, 316, 500);
		contentPane.add(txtpnLetnjaUniformaManeken);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Legion\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\WW2_Soviet_Russian_Red_Army_summer_uniform_Senior_lieutenant_gymnastiorka_steel_helmet_PP_sh_41_machine_gun_Lofoten_Krigsminnemuseum_Norway_banner_2019_0229.jpg"));
		lblNewLabel.setBounds(26, 11, 316, 503);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Legion\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\Padobranska garda.jpg"));
		lblNewLabel_1.setBounds(685, 11, 229, 500);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnSovjetskiIzviakiPaket = new JTextPane();
		txtpnSovjetskiIzviakiPaket.setEditable(false);
		txtpnSovjetskiIzviakiPaket.setText("Sovjetski izviđački paket iz sredine rata 1943-1945\r\nOvaj komplet je reprezentativan za uniforme izdate sovjetskim trupama iz\r\nod januara 1943. do kraja rata 1945. Uniforme M43 dostupne u bilo kojoj\r\nKaki ili zelena boja tkanine iz sovjetskog doba.\r\n\r\nUključuje:\r\n· M43 tunika\r\n· M43 pantalone\r\n· EM ramena\r\n· M43 pilotka sa crvenom ili zelenom zvezdicom\r\n· EM pojas\r\n· 2 k smeđa Mosin Nagant torbica za municiju\r\n· Menza sa poklopcem\r\n· Kamuflažna uniforma-vaš izbor\r\n SCS1, SCS2, SCS3, SCS4, SCS5, SCS6, SCS7\r\n· Izviđačka značka\r\n· Izviđački nož");
		txtpnSovjetskiIzviakiPaket.setBounds(924, 11, 285, 500);
		contentPane.add(txtpnSovjetskiIzviakiPaket);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Legion\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\Inzenjerska uniforma.jpg"));
		lblNewLabel_1_1.setBounds(1219, 11, 317, 500);
		contentPane.add(lblNewLabel_1_1);
		
		JTextPane txtpnInenjerskeUniformeJurine = new JTextPane();
		txtpnInenjerskeUniformeJurine.setEditable(false);
		txtpnInenjerskeUniformeJurine.setText("Inženjerske uniforme\r\n\r\nJurišne inžinjerijske i saperske brigade formirane su od inžinjerijskih trupa Rezerve Vrhovne komande Crvene armije (RVGK), namenjene su za juriš prilagođen odbrani naselja i za razbijanje snažno utvrđene odbrane fronta. Glavna prepoznatljiva karakteristika sapera bila je izdavanje pancira SN-42, ekvivalenta savremenim prslucima iz Drugog svetskog rata. Neobičan oblik oklopa je dizajniran da zaštiti glavne vitalne organe sapera, napravljen je od čelika debljine 2 mm i težak 3,5 kg, njegov razvoj je počeo 1938. dok konačni dizajn nije izdat Crvenoj armiji 1942. godine i korišćen je. da bi se tokom bitke za Staljingrad iste godine izvršile borbe od kuće do kuće.\r\n\r\nNosili su standardne sovjetske pešadijske uniforme sa jednim od prvih telesnih zaštitnih oklopa.");
		txtpnInenjerskeUniformeJurine.setBounds(1546, 11, 317, 500);
		contentPane.add(txtpnInenjerskeUniformeJurine);
	}
}
