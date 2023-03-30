package model;


public class Cart{
	private int quanty;
	private double price;
	private item_listingData product;
	
	public Cart(int quanty, double price, item_listingData product) {
		this.quanty = quanty;
		this.price = price;
		this.product = product;
	}

	public Cart() {
	
	}

	public int getQuanty() {
		return quanty;
	}

	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public item_listingData getProduct() {
		return product;
	}

	public void setProduct(item_listingData product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Cart [quanty=" + quanty + ", price=" + price + ", product=" + product + "]";
	}
	
	
	
}
