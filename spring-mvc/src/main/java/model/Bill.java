package model;

import java.sql.Timestamp;

public class Bill {
	private long Bill_id;
	private Timestamp Date_order;
	private float Total;
	private String Status;
	private Timestamp Create_at;
	private long Id_customer;
	
	public Bill() {
		
	}
	public Bill(long bill_id, Timestamp date_order, float total, String status, Timestamp create_at,
			long Id_customer) {
		super();
		Bill_id = bill_id;
		Date_order = date_order;
		Total = total;
		Status = status;
		Create_at = create_at;
		this.Id_customer = Id_customer;
	}
	public long getBill_id() {
		return Bill_id;
	}
	public void setBill_id(long bill_id) {
		Bill_id = bill_id;
	}
	public Timestamp getDate_order() {
		return Date_order;
	}
	public void setDate_order(Timestamp date_order) {
		Date_order = date_order;
	}
	public float getTotal() {
		return Total;
	}
	public void setTotal(float total) {
		Total = total;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Timestamp getCreate_at() {
		return Create_at;
	}
	public void setCreate_at(Timestamp create_at) {
		Create_at = create_at;
	}
	public long getId_customer() {
		return Id_customer;
	}
	public void setId_customer(long id_customer) {
		Id_customer = id_customer;
	}
	@Override
	public String toString() {
		return "Bills [Bill_id=" + Bill_id + ", Date_order=" + Date_order + ", Total=" + Total + ", Status=" + Status
				+ ", Create_at=" + Create_at + ", Id_customer=" + Id_customer + "]";
	}

}
