package Model;

public class Product {
	private String code,price,description;
	private int quantity;
	public Product() {

	}
	public Product(String code, String price, String description, int quantity) {
		this.code = code;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



}
