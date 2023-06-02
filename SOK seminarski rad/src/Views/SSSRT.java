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

public class SSSRT extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SSSRT frame = new SSSRT();
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
	public SSSRT() {
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\Screenshot 2023-05-01 212056.png"));
		lblNewLabel.setBounds(10, 11, 600, 334);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnIsIsruski = new JTextPane();
		txtpnIsIsruski.setEditable(false);
		txtpnIsIsruski.setText("IS-2\r\n\r\nIS-2 (ruski: IS-2, ponekad romanizovan kao JS-2) je sovjetski teški tenk, prvi iz serije tenkova IS nazvan po sovjetskom vođi Josifu Staljinu. Razvijen je i učestvovao u borbama tokom Drugog svetskog rata, a služio je i u drugim sovjetskim savezničkim zemljama nakon rata.");
		txtpnIsIsruski.setBounds(620, 11, 296, 334);
		contentPane.add(txtpnIsIsruski);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\KV1.png"));
		lblNewLabel_1.setBounds(939, 11, 600, 334);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnKvTenkoviKliment = new JTextPane();
		txtpnKvTenkoviKliment.setEditable(false);
		txtpnKvTenkoviKliment.setText("KV-1\r\n\r\nTenkovi Kliment Vorošilov (KV) su serija sovjetskih teških tenkova nazvana po sovjetskom komesaru odbrane i političaru Klimentu Vorošilovu koji je delovao sa Crvenom armijom tokom Drugog svetskog rata. Tenkovi KV su bili poznati po svojoj teškoj oklopnoj zaštiti tokom ranih faza rata, posebno tokom prve godine nemačke invazije na Sovjetski Savez. U određenim situacijama, čak i jedan KV-1 ili KV-2 uz podršku pešadije mogao bi da zaustavi nemačke formacije. Nemački Vermaht je u to vreme retko koristio svoje tenkove protiv KV, pošto je njihovo sopstveno naoružanje bilo suviše slabo da bi se izborilo sa „Russischer Koloss“ – „Ruskim Kolosom“.");
		txtpnKvTenkoviKliment.setBounds(1549, 11, 296, 334);
		contentPane.add(txtpnKvTenkoviKliment);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\T3485.png"));
		lblNewLabel_2.setBounds(10, 366, 600, 334);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnTSerijaTenkova = new JTextPane();
		txtpnTSerijaTenkova.setEditable(false);
		txtpnTSerijaTenkova.setText("T34 Serija tenkova\r\n\r\nT-34 je sovjetski srednji tenk iz Drugog svetskog rata. Kada je predstavljen, njegov tenkovski top od 76,2 mm (3 inča) bio je snažniji od svojih savremenika, a njegov oklop pod uglom od 60 stepeni pružao je dobru zaštitu od protivtenkovskog oružja. T-34 je imao dubok uticaj na sukob na Istočnom frontu i imao je dugotrajan uticaj na dizajn tenkova. Tenk je pohvaljen od strane više nemačkih generala kada su naišli na njega tokom operacije Barbarosa, iako su njegov oklop i naoružanje nadmašeni kasnije u ratu.\r\n");
		txtpnTSerijaTenkova.setBounds(620, 366, 296, 334);
		contentPane.add(txtpnTSerijaTenkova);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\SOK seminarski rad\\src\\Images\\T26.png"));
		lblNewLabel_2_1.setBounds(939, 366, 600, 334);
		contentPane.add(lblNewLabel_2_1);
		
		JTextPane txtpnTTenkT = new JTextPane();
		txtpnTTenkT.setEditable(false);
		txtpnTTenkT.setText("T-26\r\n\r\nTenk T-26 je bio sovjetski laki tenk korišćen tokom mnogih sukoba u međuratnom periodu i u Drugom svetskom ratu. Bio je to razvoj britanskog tenka Vickers od 6 tona i bio je jedan od najuspešnijih dizajna tenkova 1930-ih sve dok njegov laki oklop nije postao ranjiv na novije protivtenkovske topove. Proizveden je u većim brojrvima nego bilo koji drugi tenk iz tog perioda, sa više od 11.000 proizvedenih jedinica. Tokom 1930-ih, SSSR je razvio 53 varijante T-26, uključujući tenkove za bacanje plamena, borbena inženjerijska vozila, tenkove na daljinsko upravljanje, samohodne topove, artiljerijske traktore i oklopne transportere. Dvadeset tri od njih su serijski proizvedeni, drugi su bili eksperimentalni modeli.");
		txtpnTTenkT.setBounds(1549, 366, 296, 334);
		contentPane.add(txtpnTTenkT);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(AntickoDoba.class.getResource("/Images/background.png")));
		lblNewLabel_6.setBounds(0, 0, 1904, 1041);
		contentPane.add(lblNewLabel_6);
	}
}
