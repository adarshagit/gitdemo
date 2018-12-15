package com.git.gitdemo;

public class Order {
	private  String username;
	private double amount;
	private String prodctName;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getProdctName() {
		return prodctName;
	}
	public void setProdctName(String prodctName) {
		this.prodctName = prodctName;
	}
	@Override
	public String toString() {
		return "Order [username=" + username + ", amount=" + amount + ", prodctName=" + prodctName + "]";
	}
	

	
}
