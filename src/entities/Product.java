package entities;

public class Product {

	private String name;
	private double price;
	private Integer quantity;
	
	//constructor
	public Product(String name, double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	//method
	public double total() {
		return price * quantity;
	}
	
	//getters setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuatity(Integer quantity) {
		this.quantity = quantity;
	}
}
