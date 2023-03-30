package model;

import java.sql.Timestamp;

public class slides {
	private int id;
	private String img;
	private String caption;
	private String content;

	
	
	
	@Override
	public String toString() {
		return "slides [id=" + id + ", img=" + img + ", caption=" + caption + ", content=" + content + "]";
	}

	public slides() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public slides(int id, String img, String caption, String content) {
		this.id = id;
		this.img = img;
		this.caption = caption;
		this.content = content;
	}

}
