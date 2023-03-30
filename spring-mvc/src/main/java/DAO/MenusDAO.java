package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.connect.DatabaseConfig;
import model.Menus;

public class MenusDAO {
Connection conn = null;
	
	java.sql.PreparedStatement sttm = null;
	
	public List<Menus> readMenus() {
		List<Menus> list = new ArrayList<>();
		ResultSet rs = null;
		Statement sttm = null;
		try {
			String sql = "Select * from menus";
			conn = DatabaseConfig.getConnection();
			sttm = conn.createStatement()	;
			rs = sttm.executeQuery(sql);
			while(rs.next()) {
				Menus pd = new Menus();
				pd.setId(rs.getInt(1));
				pd.setName(rs.getString(2));
				pd.setUrl(rs.getString(3));
				list.add(pd);
			}	
		
		} catch (Exception e) {	
			System.out.println("error: " +e.toString());
		}
		finally {
			try {
				rs.close();
				sttm.close();
				conn.close();
			}
			catch(Exception error){
				System.out.println("error: " +error.toString());
			}
		}
		return list;
	}
}
