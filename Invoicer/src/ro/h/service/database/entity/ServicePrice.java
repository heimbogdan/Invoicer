package ro.h.service.database.entity;

import java.math.BigDecimal;
import java.util.Arrays;

public class ServicePrice {

	private int id;
	private BigDecimal[] servValue;
	private BigDecimal[] servPrice;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BigDecimal[] getServValue() {
		return servValue;
	}
	public void setServValue(BigDecimal[] servValue) {
		this.servValue = servValue;
	}
	public BigDecimal[] getServPrice() {
		return servPrice;
	}
	public void setServPrice(BigDecimal[] servPrice) {
		this.servPrice = servPrice;
	}
	
	public ServicePrice(BigDecimal[] servValue, BigDecimal[] servPrice) {
		super();
		this.servValue = servValue;
		this.servPrice = servPrice;
	}
	
	public ServicePrice(){
		
	}
	
	@Override
	public String toString() {
		return "ServicePrice [id=" + id + ", ServValue=" + Arrays.toString(servValue) + ", ServPrice="
				+ Arrays.toString(servPrice) + "]";
	}
	
	
}
