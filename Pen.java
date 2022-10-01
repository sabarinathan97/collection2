package Coll2;

public class Pen {
	private float price;
	private String model;
	
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public Pen(float price, String model) {
		this.model = model; this.price = price;
	}
	public String toString() {
		return price+" "+model;
	}

}
