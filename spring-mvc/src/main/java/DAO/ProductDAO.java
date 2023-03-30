package DAO;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import DB.connect.DatabaseConfig;
import model.Product;
import model.item_listingData;
import model.slides;

public class ProductDAO {
	Connection conn = null;
	
	java.sql.PreparedStatement sttm = null;
	
	public int addProduct(Product product) {
		try {
		String sql = "INSERT INTO `products` "
				+ "(`ProductId`, `ProductName`, `ListPrice`, `ProductImage`, `Image1`, `Image2`, `Description`, `Create_at`, `categoryID`) "
				+ "		VALUES (?, ?, ?,?, ?,?,?, ?, ?);";
			conn = DatabaseConfig.getConnection();
			sttm = conn.prepareStatement(sql);	
		
			sttm.setLong(1, product.getProductId());
			sttm.setString(2, product.getProductName());
			sttm.setInt(3, product.getListPrice());
			sttm.setString(4, product.getProductImage());
			sttm.setString(5, product.getImage1());
			sttm.setString(6, product.getImage2());
			sttm.setString(7, product.getDescription());
	        sttm.setTimestamp(8,product.getCreate_at());
			sttm.setLong(9, product.getCategoryID());
			if(sttm.executeUpdate()>0) {
				System.out.print("Them san pham thanh cong");
				return 1;
			}
			else {
				return 0;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				sttm.close();
				conn.close();
			}
			catch(Exception error){
				System.out.println("error: " +error.toString());
			}
		}
		return -1;
	}
	
	public String getNameById(long id) {

		ResultSet rs = null;
		String categoryName = "";
		try {
			String sql = "SELECT categoryName "
					+ "FROM categories c,products p "
					+ "WHERE c.categoryID = p.categoryID "
					+ "and p.ProductId = ?";
			conn = DatabaseConfig.getConnection();
			sttm = conn.prepareStatement(sql)	;
			sttm.setLong(1, id);
			rs = sttm.executeQuery();
			while(rs.next()) {
				categoryName = rs.getString("categoryName");
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
		return categoryName;
	}
	
	
	public int updateProduct(Product product) {
		try {
		String sql = "UPDATE `products` "
				+ "SET `ProductName` = ?, "
				+ "`ListPrice` = ?, "
				+ "`ProductImage` = ?, "
				+ "`Image1` = ?, "
				+ "`Image2` = ?, "
				+ "`Description` = ?, "
				+ "`Create_at` = ?, "
				+ "`categoryID` = ? "
				+ "WHERE `products`.`ProductId` = ?";
			conn = DatabaseConfig.getConnection();
			sttm = conn.prepareStatement(sql);
		
			sttm.setLong(9, product.getProductId());
			sttm.setString(1, product.getProductName());
			sttm.setInt(2, product.getListPrice());
			sttm.setString(3, product.getProductImage());
			sttm.setString(4, product.getImage1());
			sttm.setString(5, product.getImage2());
			sttm.setString(6, product.getDescription());
	        sttm.setTimestamp(7,product.getCreate_at());
			sttm.setLong(8, product.getCategoryID());
			if(sttm.executeUpdate()>0) {
				System.out.println("Update sản phẩm thành công!");
				return 1;
			}
			else {
				return 0;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				sttm.close();
				conn.close();
			}
			catch(Exception error){
				System.out.println("error: " +error.toString());
			}
		}
		return -1;
	}
	
	public int hideProduct(int id) {
		try {
		String sql = "UPDATE `products` "
				+ "SET "
				+ "`status` = 0, "
				+ "WHERE `products`.`ProductId` = ?";
			conn = DatabaseConfig.getConnection();
			sttm = conn.prepareStatement(sql);
		
			sttm.setLong(1, id);
			
			if(sttm.executeUpdate()>0) {
				System.out.println("Update sản phẩm thành công!");
				return 1;
			}
			else {
				return 0;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				sttm.close();
				conn.close();
			}
			catch(Exception error){
				System.out.println("error: " +error.toString());
			}
		}
		return -1;
	}
	public int deleteProduct(long id) {
		try {
		String sql = "DELETE FROM products WHERE `products`.`ProductId` = ?";
		conn = DatabaseConfig.getConnection();
			sttm = conn.prepareStatement(sql);
			sttm.setLong(1, id);
			
			if(sttm.executeUpdate()>0) {
				System.out.println("Delete sản phẩm thành công!");
				return 1;
			}
			else {
				return 0;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				sttm.close();
				conn.close();
			}
			catch(Exception error){
				System.out.println("error: " +error.toString());
			}
		}
		return -1;
	}
	
	
	public List<Product> readProduct() {
		List<Product> list = new ArrayList<>();
		ResultSet rs = null;
		Statement sttm = null;
		try {
			String sql = "Select * from products";
			conn = DatabaseConfig.getConnection();
			sttm = conn.createStatement()	;
			rs = sttm.executeQuery(sql);
			while(rs.next()) {
				Product pd = new Product();
				pd.setProductId(rs.getLong(1));
				pd.setProductName(rs.getNString(2));
				pd.setListPrice(rs.getInt(3));
				pd.setProductImage(rs.getString(4));
				pd.setImage1(rs.getString(5));
				pd.setImage2(rs.getString(6));
				pd.setDescription(rs.getString(7));
				pd.setCreate_at(rs.getTimestamp(8));
				pd.setCategoryID(rs.getLong(9));
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
	public List<slides> readProductSlides() {
		List<slides> list = new ArrayList<>();
		ResultSet rs = null;
		Statement sttm = null;
		try {
			String sql = "Select * from slides";
			conn = DatabaseConfig.getConnection();
			sttm = conn.createStatement()	;
			rs = sttm.executeQuery(sql);
			while(rs.next()) {
				slides pd = new slides();
				pd.setId(rs.getInt(1));
				pd.setImg(rs.getString(2));
				pd.setCaption(rs.getString(3));
				pd.setContent(rs.getString(4));

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
		System.out.println(list.toString());
		return list;
	}
	
	public List<item_listingData> readProductListing() {
		List<item_listingData> list = new ArrayList<>();
		ResultSet rs = null;
		Statement sttm = null;
		try {
			String sql = "SELECT p.id AS id_product, p.id_category, p.sizes, p.name, p.price, p.sale, p.title, p.highlight, p.new_items, p.details, c.id AS id_color, c.name AS name_color, c.code AS code_color, c.img, p.create_date, p.update_date FROM items_listing as p INNER JOIN colors AS c ON p.id = c.id_product GROUP BY p.id, c.id_product ORDER BY RAND() LIMIT 6";
			conn = DatabaseConfig.getConnection();
			sttm = conn.createStatement()	;
			rs = sttm.executeQuery(sql);
			while(rs.next()) {
				item_listingData pd = new item_listingData();
				pd.setId_product(rs.getInt(1));
				pd.setCategoryID(rs.getInt(2));
				pd.setSizes(rs.getInt(3));
				pd.setProductName(rs.getString(4));
				pd.setPrice(rs.getInt(5));
				pd.setSale(rs.getInt(6));
				pd.setTitle(rs.getString(7));
				pd.setHighlight(rs.getInt(8));
				pd.setNewItem(rs.getInt(9));
				pd.setDetail(rs.getString(10));
				pd.setColorID(rs.getInt(11));
				pd.setColorName(rs.getString(12));
				pd.setColorCode(rs.getString(13));
				pd.setImg(rs.getString(14));
				pd.setCreatedDate(rs.getDate(15));
				pd.setUpdateDate(rs.getDate(16));

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
		System.out.println(list.toString());
		return list;
	}
	
	
	public item_listingData getProductById(long id) throws SQLException {
		 Connection connection = DatabaseConfig.getConnection();
		 String sql = "SELECT p.id AS id_product, p.id_category, p.sizes, p.name, p.price, p.sale, p.title, p.highlight, p.new_items, p.details, c.id AS id_color, c.name AS name_color, c.code AS code_color, c.img, p.create_date, p.update_date FROM items_listing as p INNER JOIN colors AS c ON p.id = c.id_product WHERE p.id = "+ id;
		 PreparedStatement ps = connection.prepareCall(sql);
		 ResultSet rs = ps.executeQuery();
		 item_listingData pd = new item_listingData();
		 while (rs.next()) {
				
				pd.setId_product(rs.getInt(1));
				pd.setCategoryID(rs.getInt(2));
				pd.setSizes(rs.getInt(3));
				pd.setProductName(rs.getString(4));
				pd.setPrice(rs.getInt(5));
				pd.setSale(rs.getInt(6));
				pd.setTitle(rs.getString(7));
				pd.setHighlight(rs.getInt(8));
				pd.setNewItem(rs.getInt(9));
				pd.setDetail(rs.getString(10));
				pd.setColorID(rs.getInt(11));
				pd.setColorName(rs.getString(12));
				pd.setColorCode(rs.getString(13));
				pd.setImg(rs.getString(14));
				pd.setCreatedDate(rs.getDate(15));
				pd.setUpdateDate(rs.getDate(16));
		 }
		 return pd;
		}

}