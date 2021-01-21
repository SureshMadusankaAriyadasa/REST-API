package com.springboot.app.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ctr_id")
	private int customer_id;
	
	@Column(name="fname")
	private String first_name;
	
	@Column(name="lname")
	private String last_name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="telephone")
	private String tel;
	
	
	public Customers() {
		super();
	}
	
	
	public Customers(int customer_id, String first_name, String last_name, String address,String tel) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.tel = tel;
	}
	
	
	public int getId() {
		return customer_id;
	}
	public void setId(int customer_id) {
		this.customer_id = customer_id;
	}
	
	public String getCustomer_fname() {
		return first_name;
	}
	public void setCustomer_fname(String first_name) {
		this.first_name = first_name;
	}
	
	public String getCustomer_lname() {
		return last_name;
	}
	public void setCustomer_lname(String last_name) {
		this.last_name = last_name;
	}
	
	public String getCustomer_address() {
		return address;
	}
	public void setCustomer_address(String address) {
		this.address = address;
	}
	public String getCustomer_tel() {
		return tel;
	}
	public void setCustomer_tel(String tel) {
		this.tel = tel;
	}


	@Override
	public String toString() {
		return "Customer [id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name + ", address="+ address +", tel no="
				+ tel + "]";
	}
}
