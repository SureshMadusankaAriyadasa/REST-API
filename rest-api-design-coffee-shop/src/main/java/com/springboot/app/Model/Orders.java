package com.springboot.app.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="customer_fname")
	private String customer_fname;
	
	@Column(name="customer_lname")
	private String customer_lname;
	
	@Column(name="customer_address")
	private String customer_address;
	
	@Column(name="customer_tel")
	private String customer_tel;
	
	@Column(name="item_id")
	private String item_id;
	
	@Column(name="qty")
	private int qty;
	
	@Column(name="price")
	private double price;
	
	@Column(name="ctr_id")
	private int cId;

	public Orders() {
		super();
	}

	public Orders(int id, String customer_fname, String customer_lname, String customer_address, String customer_tel, String item_id, int qty,double price,int cId) {
		super();
		this.id = id;
		this.customer_fname = customer_fname;
		this.customer_lname = customer_lname;
		this.customer_address = customer_address;
		this.customer_tel = customer_tel;
		this.item_id = item_id;
		this.qty = qty;
		this.price= price;
		this.cId=cId;
	}

	public Orders(String string, String string2, String string3, String string4, String string5, String string6,
			String string7, String string8, String string9) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer_fname() {
		return customer_fname;
	}

	public void setCustomer_fname(String customer_fname) {
		this.customer_fname = customer_fname;
	}
	
	public String getCustomer_lname() {
		return customer_lname;
	}

	public void setCustomer_lname(String customer_lname) {
		this.customer_lname = customer_lname;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public String getCustomer_tel() {
		return customer_tel;
	}

	public void setCustomer_tel(String customer_tel) {
		this.customer_tel = customer_tel;
	}

	public String getItem_id() {
		return item_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price=price;
	}
	
	
	public int getCustomerId() {
		return cId;
	}

	public void setCustomerId(int cId) {
		this.cId=cId;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", customer_fname=" + customer_fname +",customer_lname=" + customer_lname +", customer_address=" + customer_address
				+ ", customer_tel=" + customer_tel + ", item_id=" + item_id + ", qty=" + qty + ",price=" + price + ", ctr_id="+ cId +"]";
	}

	public void add(Orders orders) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
