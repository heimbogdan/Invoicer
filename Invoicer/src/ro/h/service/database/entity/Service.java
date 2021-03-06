package ro.h.service.database.entity;

public class Service {

	private int id;
	private String servCode;
	private String servName;
	private String priceType;
	private int priceId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServCode() {
		return servCode;
	}
	public void setServCode(String servCode) {
		this.servCode = servCode;
	}
	public String getServName() {
		return servName;
	}
	public void setServName(String servName) {
		this.servName = servName;
	}
	public String getPriceType() {
		return priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	public int getPriceId() {
		return priceId;
	}
	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}
	
	public Service(String servCode, String servName, String priceType, int priceId) {
		super();
		this.servCode = servCode;
		this.servName = servName;
		this.priceType = priceType;
		this.priceId = priceId;
	}
	
	public Service(){
		
	}
	
	@Override
	public String toString() {
		return "Service [id=" + id + ", servCode=" + servCode + ", servName=" + servName + ", priceType=" + priceType
				+ ", priceId=" + priceId + "]";
	}
	
}
