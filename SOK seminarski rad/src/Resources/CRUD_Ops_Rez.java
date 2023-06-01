package Resources;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import Common.Helper;
import Common.HelperPrikaz;
import Exceptions.DosloJeDoGreskeException;


public class CRUD_Ops_Rez {
	 static HelperPrikaz HP = new HelperPrikaz();

	static Helper Helper = new Helper();
	static HelperPrikaz HelperP = new HelperPrikaz();
	
	public static String prikaz(JTable table) {
		String query = "SELECT * FROM korisnik";
		HelperP.PopuniTabelu(query, table);
		return query;
	}
 

	public static void Rezervacija(String Ime, String Prezime, String BrKreditneKartice, String brkarata) throws DosloJeDoGreskeException {
    	if(Ime.equals("") ||  Prezime.equals("") || BrKreditneKartice.equals("") || brkarata.equals("")) {
    		throw new DosloJeDoGreskeException("Greska pri Rezervaciji (Nisu popunjena sva polja)!");
		}else { 
			Connection conn = Common.Helper.DBSetup();
			String query = "INSERT INTO korisnik(ime, prezime, brkk, brkarata) VALUES ('"+Ime+"', '"+Prezime+"', '"+Integer.valueOf(BrKreditneKartice)+"', '"+Integer.valueOf(brkarata)+"')";
			String poruka = "Hvala vam na poslovanju, vidimo se uskoro!";
			JOptionPane.showMessageDialog(null, poruka);	
			try {
				java.sql.Statement stm = conn.createStatement();
				stm.execute(query);
				conn.close();
				
			}
			catch(Exception be){
					be.printStackTrace();
			}

	  }


}
    
    
}