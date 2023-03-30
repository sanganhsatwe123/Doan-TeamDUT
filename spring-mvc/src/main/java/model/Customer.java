package model;

import java.sql.Timestamp;

public class Customer {
	private long Id_customer;
	private String name;
	private String email;
	private String address;
	private String Phone_number;
	private String note;
	private Timestamp create_at;
	private long Id_user;
	
	public Customer() {
		
	}
	public Customer(long id_customer, String name, String email, String address, String phone_number, String note,
			Timestamp create_at, long id_user) {
		super();
		this.Id_customer = id_customer;
		this.name = name;
		this.email = email;
		this.address = address;
		this.Phone_number = phone_number;
		this.note = note;
		this.create_at = create_at;
		this.Id_user = id_user;
	}
	public long getId_customer() {
		return Id_customer;
	}
	public void setId_customer(long id_customer) {
		Id_customer = id_customer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_number() {
		return Phone_number;
	}
	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Timestamp getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Timestamp create_at) {
		this.create_at = create_at;
	}
	public long getId_user() {
		return Id_user;
	}
	public void setId_user(long id_user) {
		Id_user = id_user;
	}
	@Override
	public String toString() {
		return "Customer [Id_customer=" + Id_customer + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", Phone_number=" + Phone_number + ", note=" + note + ", create_at=" + create_at + ", Id_user="
				+ Id_user + "]";
	}
	
	
}
