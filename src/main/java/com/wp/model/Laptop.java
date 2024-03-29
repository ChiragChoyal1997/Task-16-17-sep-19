package com.wp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	
	@Id
	private String code;
	private String brand;
	private int price;
	
	@OneToOne(mappedBy = "laptop")
	private Employee employee;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Laptop [code=" + code + ", brand=" + brand + ", price=" + price + "]";
	}

	public Laptop(String code, String brand, int price) {
		super();
		this.code = code;
		this.brand = brand;
		this.price = price;
	}

	public Laptop() {
		super();
	}

	
}
