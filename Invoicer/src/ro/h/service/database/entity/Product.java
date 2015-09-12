package ro.h.service.database.entity;

import java.math.BigDecimal;
import java.util.Arrays;

public class Product {

	private int id;
	private String prodId;
	private String prodDesc;
	private String prodOpt;
	private BigDecimal price;
	private int[] compList;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public String getProdOpt() {
		return prodOpt;
	}
	public void setProdOpt(String prodOpt) {
		this.prodOpt = prodOpt;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int[] getCompList() {
		return compList;
	}
	public void setCompList(int[] compList) {
		this.compList = compList;
	}
	
	public Product(String prodId, String prodDesc, String prodOpt, BigDecimal price, int[] compList) {
		super();
		this.prodId = prodId;
		this.prodDesc = prodDesc;
		this.prodOpt = prodOpt;
		this.price = price;
		this.compList = compList;
	}
	
	public Product(){
		
	}
	
	@Override
	public String toString() {
		return "Products [id=" + id + ", prodId=" + prodId + ", prodDesc=" + prodDesc + ", prodOpt=" + prodOpt
				+ ", price=" + price + ", compList=" + Arrays.toString(compList) + "]";
	}
	
}
