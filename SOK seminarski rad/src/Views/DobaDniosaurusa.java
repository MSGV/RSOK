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

public class DobaDniosaurusa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DobaDniosaurusa frame = new DobaDniosaurusa();
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
	public DobaDniosaurusa() {
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\TREX.png"));
		lblNewLabel.setBounds(20, 48, 571, 373);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnTrexTiranosaurusReks = new JTextPane();
		txtpnTrexTiranosaurusReks.setEditable(false);
		txtpnTrexTiranosaurusReks.setText("T-Rex\r\n\r\nTiranosaurus reks je rod velikih teropodnih dinosaurusa. Vrsta Tirannosaurus reks (reks znači \"kralj\" na latinskom), koja se često naziva T. reks ili kolokvijalno T-Reks, jedna je od najbolje zastupljenih teropoda. Živeo je širom današnje zapadne Severne Amerike, na tadašnjem ostrvskom kontinentu poznatom kao Laramidija. Tiranosaurus je imao mnogo širi raspon od drugih tiranosaurida. Fosili se nalaze u raznim stenskim formacijama koje datiraju iz mastrihtskog doba iz perioda gornje krede, pre 68 do 66 miliona godina. Bio je to poslednji poznati član tiranosaurida i među poslednjim neptičjim dinosaurusima koji su postojali pre izumiranja u periodu kreda-paleogen.");
		txtpnTrexTiranosaurusReks.setBounds(601, 48, 359, 373);
		contentPane.add(txtpnTrexTiranosaurusReks);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\Triceps.jpg"));
		lblNewLabel_1.setBounds(970, 48, 565, 373);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnTriceratopsTriceratopstrorogo = new JTextPane();
		txtpnTriceratopsTriceratopstrorogo.setEditable(false);
		txtpnTriceratopsTriceratopstrorogo.setText("Triceratops\r\n\r\nTriceratops ('trorogo lice') je rod biljojednih chasmosaurine ceratopsid dinosaurusa koji se prvi put pojavio tokom kasnog mastrihtičkog perioda, otprilike 68 miliona evra, u stadijumu kretea godine u sadašnjoj Severnoj Americi. To je jedan od poslednjih poznatih neptičjih rodova dinosaurusa i izumro je u događaju izumiranja kreda-paleogen pre 66 miliona godina. Ime Triceratops, koje doslovno znači „trorogo lice“, potiče od grčkih reči tri- (tri-) što znači „tri“, keras (keras) što znači „rog“ i ops (ōps) što znači „lice“.");
		txtpnTriceratopsTriceratopstrorogo.setBounds(1545, 48, 359, 373);
		contentPane.add(txtpnTriceratopsTriceratopstrorogo);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\Stegosaurus.jpg"));
		lblNewLabel_2.setBounds(20, 432, 571, 359);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnStegosaurusStegosaurus = new JTextPane();
		txtpnStegosaurusStegosaurus.setEditable(false);
		txtpnStegosaurusStegosaurus.setText("Stegosaurus\r\n\r\nStegosaurus ( 'krovni gušter') je rod biljojeda, četvoronožnih, oklopljenih dinosaurusa iz kasne jure, koje karakterišu karakteristične uspravne ploče u obliku zmaja na leđima i repu. Fosili ovog roda pronađeni su u zapadnim Sjedinjenim Državama i u Portugalu, gde se nalaze u slojevima starim od Kimeridža do Titona, koji datiraju između 155 i 145 miliona godina. Od vrsta koje su klasifikovane u gornju Morison formaciju na zapadu SAD, samo tri su univerzalno priznate: S. stenops, S. ungulatus i S. sulcatus. Pronađeni su ostaci preko 80 pojedinačnih životinja ovog roda. Stegosaurus bi živeo zajedno sa dinosaurusima kao što su Apatosaurus, Diplodocus, Camarasaurus i Allosaurus, od kojih je poslednji možda lovio.");
		txtpnStegosaurusStegosaurus.setBounds(601, 432, 359, 359);
		contentPane.add(txtpnStegosaurusStegosaurus);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\Herrerasaurus.jpg"));
		lblNewLabel_3.setBounds(970, 432, 565, 359);
		contentPane.add(lblNewLabel_3);
		
		JTextPane txtpnHerrerasaurusHerrerasaurusJe = new JTextPane();
		txtpnHerrerasaurusHerrerasaurusJe.setEditable(false);
		txtpnHerrerasaurusHerrerasaurusJe.setText("\r\nHerrerasaurus\r\n\r\nHerrerasaurus je rod saurišijanskih dinosaurusa iz perioda kasnog trijasa. Ovaj rod je bio jedan od najranijih dinosaurusa iz fosilnih zapisa. Njegovo ime znači \"Ererin gušter\", po rančeru koji je 1958. otkrio prvi primerak u Južnoj Americi. Svi poznati fosili ovog mesoždera otkriveni su u formaciji Išigualasto iz karnijanskog doba (kasni trijas prema ICS-u, datirano pre 231,4 miliona godina) u severozapadnoj Argentini. Tipsku vrstu, Herrerasaurus ischigualastensis, opisao je Osvaldo Reig 1963. godine i jedina je vrsta koja je dodeljena ovom rodu. Ischisaurus i Frenguellisaurus su sinonimi.\r\n\r\nDugi niz godina, klasifikacija Herrerasaurusa bila je nejasna jer je bio poznat po veoma fragmentarnim ostacima. Pretpostavljalo se da se radi o bazalnom teropodu, bazalnom sauropodomorfu, bazalnom saurišiju ili da uopšte nije dinosaurus, već druga vrsta arhosaurusa. Međutim, sa otkrićem gotovo kompletnog kostura i lobanje 1988. godine, Herrerasaurus je klasifikovan kao rani saurišjan u većini filogenosti o poreklu i ranoj evoluciji dinosaurusa. \r\nTo je član Herrerasauridae, porodice sličnih rodova koji su bili među najranijim evolucionim zračenjem dinosaurusa.");
		txtpnHerrerasaurusHerrerasaurusJe.setBounds(1545, 432, 359, 390);
		contentPane.add(txtpnHerrerasaurusHerrerasaurusJe);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(AntickoDoba.class.getResource("/Images/background.png")));
		lblNewLabel_4.setBounds(0, 0, 1904, 1041);
		contentPane.add(lblNewLabel_4);
	}
}
