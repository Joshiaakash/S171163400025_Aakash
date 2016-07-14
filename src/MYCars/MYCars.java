package MYCars;

public class MYCars {
	private String company;
	private String category_id;
	private String desc1;
	private float price;
	private float discount;

	public MYCars(String company, String category_id, String desc1, float price, float discount ){
		this.company=company;
		this.category_id=category_id;
		this.desc1=desc1;
		this.price=price;
		this.discount=discount;
	}
	public String getCompany() {
		return company;
	}
	public String getCategory_id() {
		return category_id;
	}
	public String getDesc1() {
		return desc1;
	}
	public float getPrice() {
		return price;
	}
	public float getDiscount() {
		return discount;
	}
}