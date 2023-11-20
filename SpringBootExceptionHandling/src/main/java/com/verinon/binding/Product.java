package com.verinon.binding;

public class Product {
	private String pid;
	private String pname;
	private Double price;

	public Product(String pid, String pname, double price) {
		// TODO Auto-generated constructor stub
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

}
