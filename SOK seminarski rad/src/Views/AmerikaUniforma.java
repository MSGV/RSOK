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

public class AmerikaUniforma extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AmerikaUniforma frame = new AmerikaUniforma();
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
	public AmerikaUniforma() {
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
		
		JTextPane txtpnM1941 = new JTextPane();
		txtpnM1941.setEditable(false);
		txtpnM1941.setText("M1941 Uniforma\r\n\r\nM1941 Uniforma, takođe poznata kao \"Class A\" uniforma, bila je zvanična uniforma američke vojske tokom Drugog svetskog rata. Ova uniforma je imala karakteristične elemente i bila je sastavljena od nekoliko komada odeće. Evo detaljnijeg opisa M1941 Uniforme:\r\n\r\nJakna: Jakna je bila glavni deo uniforme i izrađena je od smeđe boje (kasnije zamijenjene tamno zelenom bojom). Imala je dugme s prednje strane i dva reda džepova na prsima. Ovi džepovi su imali preklope sa zakopčavanjem na gornjem delu, što je bilo karakteristično za ovu uniformu. Na jakni su se nalazile oznake čina i vojne oznake, koje su varirale u zavisnosti od vojne jedinice i čina vojnika.\r\n\r\nPantalone: Pantalone su bile iste boje kao jakna i izrađene od istog materijala. Imale su klasičan dizajn s džepovima na prednjem i zadnjem delu. Pantalone su se nosile visoko na struku i imale su gajke za kaiš.\r\n\r\nKošulja: Bijela košulja se nosila ispod jakne i bila je standardni deo M1941 uniforme. Imala je dugmiće s prednje strane i kratke rukave.\r\n\r\n");
		txtpnM1941.setBounds(352, 11, 316, 500);
		contentPane.add(txtpnM1941);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AmerikaUniforma.class.getResource("/Images/m1941.png")));
		lblNewLabel.setBounds(26, 11, 316, 500);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AmerikaUniforma.class.getResource("/Images/m1942.png")));
		lblNewLabel_1.setBounds(685, 11, 229, 500);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnM1942 = new JTextPane();
		txtpnM1942.setEditable(false);
		txtpnM1942.setText("M1942 Parratrooper Uniforma\r\n\r\nM1942 Paratrooper Uniforma bila je specifično dizajnirana uniforma za padobranske jedinice američke vojske tokom Drugog svetskog rata. Ova uniforma je bila prilagođena potrebama i zahtevima padobranaca i imala je neke karakteristične elemente. Evo detaljnijeg opisa M1942 Paratrooper Uniforme:\r\n\r\nSkakačka uniforma: Skakačka uniforma je bila središnji deo M1942 Paratrooper Uniforme. Izrađena je od teget plavog teksasa ili vunenog materijala i imala je poseban dizajn koji je omogućavao veću slobodu kretanja prilikom skakanja padobranom i izvođenja borbenih operacija. Jakna je imala zakopčavanje na prednjoj strani, najčešće s patentnim zatvaračem, a na ramenima su se nalazili naglašeni jastučići koji su služili za ublažavanje udara prilikom padova. Jakna je takođe imala džepove na grudima i ramenima za skladištenje sitne opreme i mapa.\r\n\r\n");
		txtpnM1942.setBounds(924, 11, 285, 500);
		contentPane.add(txtpnM1942);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(AmerikaUniforma.class.getResource("/Images/m1943.png")));
		lblNewLabel_1_1.setBounds(1219, 11, 317, 500);
		contentPane.add(lblNewLabel_1_1);
		
		JTextPane txtpnM1943 = new JTextPane();
		txtpnM1943.setEditable(false);
		txtpnM1943.setText("M1943 Kamp Uniform\r\n\r\nM1943 Kamp Uniforma, takođe poznata kao \"HBT uniforma\" (Herringbone Twill), bila je standardna borbeno-radna uniforma koju su nosile američke vojne snage tokom Drugog svetskog rata. Ova uniforma je bila praktična i izdržljiva, namenjena za upotrebu u terenskim uslovima. Evo detaljnijeg opisa M1943 Kamp Uniforme:\r\n\r\nJakna: Jakna je bila središnji deo M1943 Kamp Uniforme. Izrađena je od gustog tkanog pamučnog materijala u smeđe-zelenoj boji, poznatom kao Herringbone Twill. Jakna je imala dugačke rukave i gumbiće na prednjoj strani za zakopčavanje. Takođe je imala dva džepa na grudima i dva džepa na kukovima, koji su se zakopčavali. Ovi džepovi su služili za skladištenje sitne opreme i ličnih predmeta.\r\n\r\nPantalone: Pantalone su bile izrađene od istog gustog tkanog pamučnog materijala kao i jakna. Imale su klasičan dizajn s džepovima na prednjem i zadnjem delu. Pantalone su se nosile visoko na struku i imale su gajke za kaiš.\r\n\r\nKošulja: Ispod jakne, vojnici su nosili košulju koja je bila izrađena od lagane pamučne tkanine. Košulja je obično bila svetlo smeđe ili belo-zelene boje, s dugmićima na prednjoj strani i dugim rukavima.\r\n");
		txtpnM1943.setBounds(1546, 11, 317, 500);
		contentPane.add(txtpnM1943);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(AntickoDoba.class.getResource("/Images/background.png")));
		lblNewLabel_6.setBounds(0, 0, 1904, 1041);
		contentPane.add(lblNewLabel_6);
	}
}
