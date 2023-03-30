package DB.connect;

import java.sql.Connection;

import DAO.ProductDAO;
import model.Product;
import model.slides;

public class testDB {
	public static void main(String[] args) {
		Connection conn = DatabaseConfig.getConnection();
		ProductDAO dao = new ProductDAO();
		if(conn != null) {
			System.out.print("Connect thanh cong\n");
			for(slides sl : dao.readProductSlides() ) {
				System.out.println( sl.toString());
			}
			
		}
	}
}
