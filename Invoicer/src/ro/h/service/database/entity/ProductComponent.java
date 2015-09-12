package ro.h.service.database.entity;

public class ProductComponent {

	private int id;
	private String compId;
	private String compDesc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompId() {
		return compId;
	}
	public void setCompId(String compId) {
		this.compId = compId;
	}
	public String getCompDesc() {
		return compDesc;
	}
	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}
	
	public ProductComponent(String compId, String compDesc) {
		super();
		this.compId = compId;
		this.compDesc = compDesc;
	}
	
	public ProductComponent(){
		
	}
	
	@Override
	public String toString() {
		return "ProductComponents [id=" + id + ", compId=" + compId + ", compDesc=" + compDesc + "]";
	}
	
}
