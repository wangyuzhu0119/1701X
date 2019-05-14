package com.bawei.entity;

public class Goods {
	private int gid;
	private String gname;
	private String ename;
	private String size;
	private double price;
	private int sum;
	private String bq;
	private int bid;
	private int tid;
	
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String getBq() {
		return bq;
	}
	public void setBq(String bq) {
		this.bq = bq;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	public Goods(int gid, String gname, String ename, String size, double price, int sum, String bq, int bid, int tid) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.ename = ename;
		this.size = size;
		this.price = price;
		this.sum = sum;
		this.bq = bq;
		this.bid = bid;
		this.tid = tid;
	}
	
	public Goods() {
		super();
	}
	
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", ename=" + ename + ", size=" + size + ", price=" + price
				+ ", sum=" + sum + ", bq=" + bq + ", bid=" + bid + ", tid=" + tid + "]";
	}
}
