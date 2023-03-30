package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.connect.DatabaseConfig;
import model.Customer;

public class CustomerDAO {
	
Connection conn = null;
	
	java.sql.PreparedStatement sttm = null;
	
	public List<Customer> readCustomer() {
		List<Customer> list = new ArrayList<>();
		ResultSet rs = null;
		Statement sttm = null;
		try {
			String sql = "Select * from customer";
			conn = DatabaseConfig.getConnection();
			sttm = conn.createStatement()	;
			rs = sttm.executeQuery(sql);
			while(rs.next()) {
				Customer pd = new Customer();
				pd.setId_customer(rs.getLong(1));
				pd.setName(rs.getString(2));
				pd.setEmail(rs.getString(3));
				pd.setAddress(rs.getString(4));
				pd.setPhone_number(rs.getString(5));
				pd.setNote(rs.getString(6));
				pd.setCreate_at(rs.getTimestamp(7));
				pd.setId_user(rs.getLong(8));
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
