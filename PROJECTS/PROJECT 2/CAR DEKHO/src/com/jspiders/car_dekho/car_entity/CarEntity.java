package com.jspiders.car_dekho.car_entity;

public class CarEntity {
	private int id;
	private String name;
	private String brand;
	private String engineType;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEngineType() {
		return engineType;
	}
	
	public CarEntity(int id, String name, String brand, String engineType, double price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.engineType = engineType;
		this.price = price;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "----------------------------------------------------------------------------------"
				+"\n\t==========>>>>>>>>>>>>>>> CAR DEKHO <<<<<<<<<<<<<<<<<<<<<============="+
				"\n----------------------------------------------------------------------------------"
				+"\nCar Id " + " || " + "\t" +"Name"+ "\t" +" || " + "\t" +"Brand" + "\t" + " || " + "\t"+"EngineType" + "\t" + " || " + "\t" + "Price" + "\t" + " || "
				+"\n" +id+ "\t\t" +name+ "\t\t" +brand+ "\t" +engineType+ "\t\t\t" +price;
	}
	
	
}
