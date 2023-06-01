package Resources;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTable;

import Common.Helper;
import Common.HelperPrikaz;
import Exceptions.DosloJeDoGreskeException;


public class CRUD_Ops {
	 static HelperPrikaz HP = new HelperPrikaz();

	static Helper Helper = new Helper();
	static HelperPrikaz HelperP = new HelperPrikaz();
	
	public static String prikaz(JTable table) {
		String query = "SELECT * FROM Artefakti";
		HelperP.PopuniTabelu(query, table);
		return query;
	}
 

	public static void Dodaj(String Naziv, String Zemlja, String Mesto, String Period, String Godina) throws DosloJeDoGreskeException {
    	if(Naziv.equals("") ||  Zemlja.equals("") || Mesto.equals("") || Period.equals("") || Godina.equals("")) {
    		throw new DosloJeDoGreskeException("Greska pri dodavanju (Nisu popunjena sva polja)!");
		}else { 
			
			Connection conn = Common.Helper.DBSetup();
			String query = "INSERT INTO Artefakti(Naziv, Zemlja, Mesto, Period, Godina) VALUES ('"+Naziv+"', '"+Zemlja+"', '"+Mesto+"', '"+Period+"', '"+Integer.valueOf(Godina)+"')";
			
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
	
	public static void Izmeni(String Naziv, String Zemlja, String Mesto, String Period, String Godina, String ID) throws DosloJeDoGreskeException {
    	if(Naziv.equals("") ||  Zemlja.equals("") || Mesto.equals("") || Period.equals("") || Godina.equals("")) {
    		throw new DosloJeDoGreskeException("Greska pri izmeni (Neka polja su ostala prazna, ili nista nije promenjeno)!");
		}else { 
			
			Connection conn = Common.Helper.DBSetup();
			String query = "UPDATE Artefakti SET Naziv ='"+Naziv+"', Zemlja = '"+Zemlja+"', Mesto='"+Mesto+"', Period = '"+Period+"', Godina ='"+Integer.valueOf(Godina)+"' WHERE ID = "+ID+"";
			
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


    public static void Obrisi(String Naziv, String Zemlja, String Mesto, String Period, String Godina, String ID) throws DosloJeDoGreskeException   {
    	Connection connect = Common.Helper.DBSetup();
		String sql = "DELETE FROM Artefakti WHERE ID = "+ID+"";
		System.out.print(sql);
		
		Statement stm;
		try {
			stm = connect.createStatement();
			stm.execute(sql);
			   
			connect.close();		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DosloJeDoGreskeException("Greska pri brisanju");
		}
		
	}
    
   
    
    
}