package com.lti.user;

public class Person {

	private int peodId;
	private String prodName;
	private int prodCost;
	public Person(int peodId, String prodName, int prodCost) {
		super();
		this.peodId = peodId;
		this.prodName = prodName;
		this.prodCost = prodCost;
	}
	@Override
	public String toString() {
		return "Product [peodId=" + peodId + ", prodName=" + prodName + ", prodCost=" + prodCost + "]";
	}
	public int getPeodId() {
		return peodId;
	}
	public void setPeodId(int peodId) {
		this.peodId = peodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdCost() {
		return prodCost;
	}
	public void setProdCost(int prodCost) {
		this.prodCost = prodCost;
	}
}
