package com.qa.chocolate.domain;

public class Chocolates {

	private String name;
	private String brand;
	private String type;
	private int sugarContent;

	public Chocolates() {
		super();
	}

	public Chocolates(String name, String brand, String type, int sugarContent) {
		super();
		this.name = name;
		this.brand = brand;
		this.type = type;
		this.sugarContent = sugarContent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSugarContent() {
		return sugarContent;
	}

	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}

}
