package com.yanzi.bean;

//订单详情表
public class OdCustom {

	String oid;
	int totalmoney;
	String odaddress;
	String odstatus;

	public OdCustom() {
		super();
	}

	public OdCustom(String oid, int totalmoney, String odaddress, String odstatus) {
		super();
		this.oid = oid;
		this.totalmoney = totalmoney;
		this.odaddress = odaddress;
		this.odstatus = odstatus;
	}

	public String getoid() {
		return oid;
	}

	public void setoid(String oid) {
		this.oid = oid;
	}

	public int getTotalmoney() {
		return totalmoney;
	}

	public void setTotalmoney(int totalmoney) {
		this.totalmoney = totalmoney;
	}

	public String getOdaddress() {
		return odaddress;
	}

	public void setOdaddress(String odaddress) {
		this.odaddress = odaddress;
	}

	public String getOdstatus() {
		return odstatus;
	}

	public void setOdstatus(String odstatus) {
		this.odstatus = odstatus;
	}

}
