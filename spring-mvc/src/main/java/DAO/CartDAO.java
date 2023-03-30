package DAO;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import model.Cart;
import model.item_listingData;

public class CartDAO {
	
	ProductDAO productDAO = new ProductDAO();
	
	public  HashMap<Long, Cart> AddCart(long id, HashMap<Long, Cart> cart) throws SQLException {
		Cart itemcart = new Cart();
		item_listingData items = productDAO.getProductById(id);
		if(items != null && cart.containsKey(id)) {
			itemcart = cart.get(id);
			itemcart.setQuanty(itemcart.getQuanty() + 1);
			itemcart.setPrice(itemcart.getQuanty() * itemcart.getPrice());
		}
		else {
			itemcart.setProduct(items);
			itemcart.setQuanty(1);
			itemcart.setPrice(items.getPrice());
		}
		cart.put(id, itemcart);
		return cart; 
	}
	
	public  HashMap<Long, Cart> edditCart(long id, int quanty,HashMap<Long, Cart> cart) throws SQLException {
		Cart itemcart = new Cart();
		if(cart.containsKey(id)) {
			itemcart = cart.get(id);
			itemcart.setQuanty(quanty);
			double totalprice = quanty * itemcart.getProduct().getPrice();
			itemcart.setPrice(totalprice);
		}
		cart.put(id, itemcart);
		return cart; 
	}
	
	public  HashMap<Long, Cart> deleteCart(long id, HashMap<Long, Cart> cart) throws SQLException {
		if(cart == null) {
			return cart;
		}
		
		if(cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart; 
	}
	
	public  int totalCart(HashMap<Long, Cart> cart) throws SQLException {
		int totalQ = 0;
		for (Map.Entry<Long, Cart> itemcart : cart.entrySet()) {
			totalQ += itemcart.getValue().getQuanty();
		}
		return totalQ; 
	}
	
	public  double totalPrice(HashMap<Long, Cart> cart) throws SQLException {
		double totalprice = 0;
		for (Map.Entry<Long, Cart> itemcart : cart.entrySet()) {
			totalprice += itemcart.getValue().getQuanty();
		}
		return totalprice; 
	}
}
