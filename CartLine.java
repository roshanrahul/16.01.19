//package com.lti.shopping.model;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//
//@Entity
//@Table(name = "CartLine")
//public class CartLine implements Serializable {
//
//	
//private static final long serialVersionUID = 1L;
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
//	
//	@OneToOne
//	private Product product;
//	
//	@Column(name = "cart_id")
//	private int cartId;	
//	
//	@Column(name = "product_count")
//	private int productCount;
//	
//	private double total;
//	
//	@Column(name = "buying_price")
//	private double buyingPrice;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public Product getProduct() {
//		return product;
//	}
//
//	public void setProduct(Product product) {
//		this.product = product;
//	}
//
//	public int getCartId() {
//		return cartId;
//	}
//
//	public void setCartId(int cartId) {
//		this.cartId = cartId;
//	}
//
//	public int getProductCount() {
//		return productCount;
//	}
//
//	public void setProductCount(int productCount) {
//		this.productCount = productCount;
//	}
//
//	public double getTotal() {
//		return total;
//	}
//
//	public void setTotal(double total) {
//		this.total = total;
//	}
//
//	public double getBuyingPrice() {
//		return buyingPrice;
//	}
//
//	public void setBuyingPrice(double buyingPrice) {
//		this.buyingPrice = buyingPrice;
//	}
//
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
//
//	public CartLine(int id, Product product, int cartId, int productCount, double total, double buyingPrice) {
//		super();
//		this.id = id;
//		this.product = product;
//		this.cartId = cartId;
//		this.productCount = productCount;
//		this.total = total;
//		this.buyingPrice = buyingPrice;
//	}
//
//	public CartLine() {
//		super();
//	}
//
//	@Override
//	public String toString() {
//		return "CartLine [id=" + id + ", product=" + product + ", cartId=" + cartId + ", productCount=" + productCount
//				+ ", total=" + total + ", buyingPrice=" + buyingPrice + "]";
//	}
//	
// 
//	
//}
