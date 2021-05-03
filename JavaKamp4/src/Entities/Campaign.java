package Entities;

public class Campaign{
	private int id;
	private String name;
	private double discountRate;

	public Campaign(int id, String name, double discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}
}
