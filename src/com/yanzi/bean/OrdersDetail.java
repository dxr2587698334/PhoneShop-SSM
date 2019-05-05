package com.openlab.bean;

//订单详情表
public class OrdersDetail {
	
	// CREATE TABLE ordersdetail(
	// odid INT AUTO_INCREMENT COMMENT'订单详情id',
	// odnum INT COMMENT'订单数量',
	// odmoney INT COMMENT'订单单价',
	// odtotalmoney INT COMMENT'订单总额',
	// odaddress VARCHAR(50)COMMENT'订单地址',
	// odstatus VARCHAR(4)DEFAULT '等待处理' COMMENT'订单状态',
	// oid VARCHAR(50) COMMENT'关联的订单id',
	// gid INT COMMENT'关联的商品id',
	// PRIMARY KEY(odid)
	//	)ENGINE=INNODB DEFAULT CHARSET=utf8 AUTO_INCREMENT=100;

	int odid;
	int odnum;
	int odmoney;
	int odtotalmoney;
	String odaddress;
	String odstatus;
	String oid;
	int gid;
	
	public OrdersDetail() {
		super();
	}
	public OrdersDetail(int odid, int odnum, int odmoney, int odtotalmoney, String odaddress, String odstatus,
			String oid, int gid) {
		super();
		this.odid = odid;
		this.odnum = odnum;
		this.odmoney = odmoney;
		this.odtotalmoney = odtotalmoney;
		this.odaddress = odaddress;
		this.odstatus = odstatus;
		this.oid = oid;
		this.gid = gid;
	}
	public int getOdid() {
		return odid;
	}
	public void setOdid(int odid) {
		this.odid = odid;
	}
	public int getOdnum() {
		return odnum;
	}
	public void setOdnum(int odnum) {
		this.odnum = odnum;
	}
	public int getOdmoney() {
		return odmoney;
	}
	public void setOdmoney(int odmoney) {
		this.odmoney = odmoney;
	}
	public int getOdtotalmoney() {
		return odtotalmoney;
	}
	public void setOdtotalmoney(int odtotalmoney) {
		this.odtotalmoney = odtotalmoney;
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
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	@Override
	public String toString() {
		return "OrdersDetail [odid=" + odid + ", odnum=" + odnum + ", odmoney=" + odmoney + ", odtotalmoney="
				+ odtotalmoney + ", odaddress=" + odaddress + ", odstatus=" + odstatus + ", oid=" + oid + ", gid=" + gid
				+ "]";
	}	
	
}
