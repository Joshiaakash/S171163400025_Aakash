package MYCars;

public class Accessories {
		String category_id;
		String name;
		String desc;
		String company;
		int price;
		float discount;
		
		
		public Accessories(String category_id,String name,String desc,String company,int price,float discount){
			this.category_id=category_id;
			this.name=name;
			this.desc=desc;
			this.company=company;
			this.price=price;
			this.discount=discount;
		}


		public String getCategory_id() {
			return category_id;
		}


		public String getName() {
			return name;
		}


		public String getDesc() {
			return desc;
		}


		public String getCompany() {
			return company;
		}


		public int getPrice() {
			return price;
		}


		public float getDiscount() {
			return discount;
		}
		
		
}
