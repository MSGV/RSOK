package Resources;

import java.sql.Connection;

import Common.Helper;
import Common.HelperPrikaz;
import Exceptions.DosloJeDoGreskeException;

public class CRUD_Ops_Log {
	
	static Helper Helper = new Helper();
	static HelperPrikaz HelperP = new HelperPrikaz();
	
	public static void Registracija(String ime, String prezime, String email, String sifra) throws DosloJeDoGreskeException {
		
		if(ime.equals("") ||  prezime.equals("") || email.equals("") || sifra.equals("")) {
    		throw new DosloJeDoGreskeException("Greska pri dodavanju (Nisu popunjena sva polja)!");
		}else { 
			
			Connection conn = Common.Helper.DBSetup();
			String query = "INSERT INTO admin(ime, prezime, email, sifra) VALUES ('"+ime+"', '"+prezime+"', '"+email+"', '"+sifra+"')";
			
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
	
	public static void Login() {
		
		
		
		
		
	}



		
	

}
