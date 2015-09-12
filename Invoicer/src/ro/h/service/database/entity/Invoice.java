package ro.h.service.database.entity;

import java.util.Arrays;
import java.util.Date;

public class Invoice {

	private int id;
	private String invNumber;
	private Date invDate;
	private int[] prodList;
	private String clientId;
	private String deliveryAddr;
	private int[] servReq;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInvNumber() {
		return invNumber;
	}
	public void setInvNumber(String invNumber) {
		this.invNumber = invNumber;
	}
	public Date getInvDate() {
		return invDate;
	}
	public void setInvDate(Date invDate) {
		this.invDate = invDate;
	}
	public int[] getProdList() {
		return prodList;
	}
	public void setProdList(int[] prodList) {
		this.prodList = prodList;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getDeliveryAddr() {
		return deliveryAddr;
	}
	public void setDeliveryAddr(String deliveryAddr) {
		this.deliveryAddr = deliveryAddr;
	}
	public int[] getServReq() {
		return servReq;
	}
	public void setServReq(int[] servReq) {
		this.servReq = servReq;
	}
	
	public Invoice(String invNumber, Date invDate, int[] prodList, String clientId, String deliveryAddr,
			int[] servReq) {
		super();
		this.invNumber = invNumber;
		this.invDate = invDate;
		this.prodList = prodList;
		this.clientId = clientId;
		this.deliveryAddr = deliveryAddr;
		this.servReq = servReq;
	}
	
	public Invoice(){
		
	}
	
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", invNumber=" + invNumber + ", invDate=" + invDate + ", prodList="
				+ Arrays.toString(prodList) + ", clientId=" + clientId + ", deliveryAddr=" + deliveryAddr + ", servReq="
				+ Arrays.toString(servReq) + "]";
	}

}
