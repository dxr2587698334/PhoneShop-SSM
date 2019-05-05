package com.yanzi.bean;

//订单表
public class Orders {

	// CREATE TABLE orders(
	// oid VARCHAR(50) COMMENT'订单id',
	// ototalmoney INT COMMENT'总金额',
	// oaddress VARCHAR(50)COMMENT'订单地址',
	// otime VARCHAR(20) COMMENT'订单时间',
	// ostatus VARCHAR(4) DEFAULT '等待处理' COMMENT'订单状态',
	// uid VARCHAR(50) COMMENT'关联的用户id',
	// PRIMARY KEY(oid)
	// )ENGINE=INNODB DEFAULT CHARSET=utf8;

	String oid;
	int ototalMoney;
	String oaddress;
	String oTime;
	String oStatus;
	String uid;

	public Orders() {
		super();
	}

	public Orders(String oid, int ototalMoney, String oaddress, String oTime, String oStatus, String uid) {
		super();
		this.oid = oid;
		this.ototalMoney = ototalMoney;
		this.oaddress = oaddress;
		this.oTime = oTime;
		this.oStatus = oStatus;
		this.uid = uid;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public int getOtotalMoney() {
		return ototalMoney;
	}

	public void setOtotalMoney(int ototalMoney) {
		this.ototalMoney = ototalMoney;
	}

	public String getOaddress() {
		return oaddress;
	}

	public void setOaddress(String oaddress) {
		this.oaddress = oaddress;
	}

	public String getoTime() {
		return oTime;
	}

	public void setoTime(String oTime) {
		this.oTime = oTime;
	}

	public String getoStatus() {
		return oStatus;
	}

	public void setoStatus(String oStatus) {
		this.oStatus = oStatus;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "Orsers [oid=" + oid + ", ototalMoney=" + ototalMoney + ", oaddress=" + oaddress + ", oTime=" + oTime
				+ ", oStatus=" + oStatus + ", uid=" + uid + "]";
	}

}
