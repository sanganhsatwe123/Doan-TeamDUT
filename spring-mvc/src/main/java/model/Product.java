package model;

import java.sql.Timestamp;

public class Product {
	private long ProductId;
	private String ProductName;
	private int ListPrice;
	private String ProductImage;
	private String Image1;
	private String Image2;
	private String Description;
	private String Status;
	private Timestamp Create_at;
	private long categoryID;
	
	public Product() {
		
	}
	public Product(long productId, String productName, int listPrice, String productImage, String image1, String image2,
			String description, String status, Timestamp create_at, long categoryID) {
		super();
		ProductId = productId;
		ProductName = productName;
		ListPrice = listPrice;
		ProductImage = productImage;
		Image1 = image1;
		Image2 = image2;
		Description = description;
		Status = status;
		Create_at = create_at;
		
		this.categoryID = categoryID;
	}
	public long getProductId() {
		return ProductId;
	}
	public void setProductId(long productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getListPrice() {
		return ListPrice;
	}
	public void setListPrice(int listPrice) {
		ListPrice = listPrice;
	}
	public String getProductImage() {
		return ProductImage;
	}
	public void setProductImage(String productImage) {
		ProductImage = productImage;
	}
	public String getImage1() {
		return Image1;
	}
	public void setImage1(String image1) {
		Image1 = image1;
	}
	public String getImage2() {
		return Image2;
	}
	public void setImage2(String image2) {
		Image2 = image2;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	

	public Timestamp getCreate_at() {
		return Create_at;
	}
	public void setCreate_at(Timestamp create_at) {
		Create_at = create_at;
	}
	public long getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(long categoryID) {
		this.categoryID = categoryID;
	}
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}

}
