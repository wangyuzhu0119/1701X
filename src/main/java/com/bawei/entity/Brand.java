package com.bawei.entity;

public class Brand {
	private int bid;
	private String bname;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	public Brand(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	
	public Brand() {
		super();
	}
	
	@Override
	public String toString() {
		return "Brand [bid=" + bid + ", bname=" + bname + "]";
	}
}
