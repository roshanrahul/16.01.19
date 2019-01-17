package com.lti.shopping.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name = "Cart")
public class Cart implements Serializable {
private static final long serialVersionUID = 1L;
	

@OneToOne
private  UserDetails userDetails;
public UserDetails getUser() {
	return  userDetails;
}
public void setUser( UserDetails  userDetails) {
	this.userDetails =  userDetails;
}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int id;
	@Column(name = "grand_total")
	private double grandTotal;
	@Column(name = "cart_lines")
	private int cartLines;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public int getCartLines() {
		return cartLines;
	}
	public void setCartLines(int cartLines) {
		this.cartLines = cartLines;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	 

	public Cart(int id, double grandTotal, int cartLines, UserDetails userDetails) {
		super();
		this.id = id;
		this.grandTotal = grandTotal;
		this.cartLines = cartLines;
		this.userDetails = userDetails;
	}
	public Cart() {
		super();
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", grandTotal=" + grandTotal + ", cartLines=" + cartLines + ", userDetails="
				+ userDetails + "]";
	}
	
	// linking the cart with a user
		@OneToOne
		private UserDetails user;
		public UserDetails getUserDetails() {
			return userDetails;
		}
		public void setUserDetails(UserDetails userDetails) {
			this.userDetails = userDetails;
		}
	
	
}
