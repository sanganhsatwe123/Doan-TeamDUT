package model;

import java.sql.Date;

public class item_listingData {
	
	private int id_product;
	private int categoryID;
	private int sizes;
	private String productName;
	private int price;
	private int sale;
	private String title;
	private int highlight;
	private int newItem;
	private String detail;
	private int colorID;
	private String colorName;
	private String colorCode;
	private String img;
	private Date createdDate;
	private Date updateDate;

	public item_listingData() {
	}

	public item_listingData(int id_product, int categoryID, int sizes, String productName, int price, int sale,
			String title, int highlight, int newItem, String detail, int colorID, String colorName, String colorCode,
			String img, Date createdDate, Date updateDate) {
		this.id_product = id_product;
		this.categoryID = categoryID;
		this.sizes = sizes;
		this.productName = productName;
		this.price = price;
		this.sale = sale;
		this.title = title;
		this.highlight = highlight;
		this.newItem = newItem;
		this.detail = detail;
		this.colorID = colorID;
		this.colorName = colorName;
		this.colorCode = colorCode;
		this.img = img;
		this.createdDate = createdDate;
		this.updateDate = updateDate;
	}

	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public int getSizes() {
		return sizes;
	}

	public void setSizes(int sizes) {
		this.sizes = sizes;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getHighlight() {
		return highlight;
	}

	public void setHighlight(int highlight) {
		this.highlight = highlight;
	}

	public int getNewItem() {
		return newItem;
	}

	public void setNewItem(int newItem) {
		this.newItem = newItem;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getColorID() {
		return colorID;
	}

	public void setColorID(int colorID) {
		this.colorID = colorID;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "item_listingData [id_product=" + id_product + ", categoryID=" + categoryID + ", sizes=" + sizes
				+ ", productName=" + productName + ", price=" + price + ", sale=" + sale + ", title=" + title
				+ ", highlight=" + highlight + ", newItem=" + newItem + ", detail=" + detail + ", colorID=" + colorID
				+ ", colorName=" + colorName + ", colorCode=" + colorCode + ", img=" + img + ", createdDate="
				+ createdDate + ", updateDate=" + updateDate + "]";
	}
	
	
}