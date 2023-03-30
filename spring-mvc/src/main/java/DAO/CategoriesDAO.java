package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.connect.DatabaseConfig;
import model.Categories;
import model.Customer;

public class CategoriesDAO {
Connection conn = null;
	
	java.sql.PreparedStatement sttm = null;
	
	public List<Categories> readCategories() {
		List<Categories> list = new ArrayList<>();
		ResultSet rs = null;
		Statement sttm = null;
		try {
			String sql = "Select * from categories";
			conn = DatabaseConfig.getConnection();
			sttm = conn.createStatement()	;
			rs = sttm.executeQuery(sql);
			while(rs.next()) {
				Categories pd = new Categories();
				pd.setId(rs.getInt(1));
				pd.setName(rs.getString(2));
				pd.setDescription(rs.getString(3));
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
