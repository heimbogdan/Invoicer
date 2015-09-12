package ro.h.service.database.entity;

import java.math.BigDecimal;
import java.util.Arrays;

public class ServicePrice {

	private int id;
	private BigDecimal[] ServValue;
	private BigDecimal[] ServPrice;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BigDecimal[] getServValue() {
		return ServValue;
	}
	public void setServValue(BigDecimal[] servValue) {
		ServValue = servValue;
	}
	public BigDecimal[] getServPrice() {
		return ServPrice;
	}
	public void setServPrice(BigDecimal[] servPrice) {
		ServPrice = servPrice;
	}
	
	public ServicePrice(BigDecimal[] servValue, BigDecimal[] servPrice) {
		super();
		ServValue = servValue;
		ServPrice = servPrice;
	}
	
	public ServicePrice(){
		
	}
	
	@Override
	public String toString() {
		return "ServicePrice [id=" + id + ", ServValue=" + Arrays.toString(ServValue) + ", ServPrice="
				+ Arrays.toString(ServPrice) + "]";
	}
	
	
}
