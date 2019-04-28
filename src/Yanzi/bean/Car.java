package com.Yanzi.bean;

//购物车表
public class Car {
	
	// CREATE TABLE car(
	// cid INT AUTO_INCREMENT COMMENT '购物车id',
	// cmoney INT COMMENT'单价',
	// cnum INT DEFAULT '1' COMMENT'商品数量',
	// cname VARCHAR(20) COMMENT'物品名称',
	// cimage VARCHAR(50) COMMENT'物品图片',
	// cstatus VARCHAR(20)DEFAULT '正常销售' COMMENT'商品状态',
	// gid INT COMMENT'关联的商品id',
	// uid VARCHAR(50) COMMENT'关联的用户id',
	// PRIMARY KEY(cid)
	// )ENGINE=INNODB CHARSET=utf8 AUTO_INCREMENT=1000;
	
	int cid;
	int cmoney;
	int cnum;
	String cname;
	String cimage;
	String cstatus;
	int gid;
	String uid;
	
	public Car() {
		super();
	}
	public Car(int cmoney,String cname, String cimage, int gid, String uid) {
		super();
		this.cmoney = cmoney;
		this.cname = cname;
		this.cimage = cimage;
		this.gid = gid;
		this.uid = uid;
	}
	public Car(int cid, int cmoney, int cnum, String cname, String cimage, String cstatus, int gid, String uid) {
		super();
		this.cid = cid;
		this.cmoney = cmoney;
		this.cnum = cnum;
		this.cname = cname;
		this.cimage = cimage;
		this.cstatus = cstatus;
		this.gid = gid;
		this.uid = uid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCmoney() {
		return cmoney;
	}
	public void setCmoney(int cmoney) {
		this.cmoney = cmoney;
	}
	public int getCnum() {
		return cnum;
	}
	public void setCnum(int cnum) {
		this.cnum = cnum;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCimage() {
		return cimage;
	}
	public void setCimage(String cimage) {
		this.cimage = cimage;
	}
	public String getCstatus() {
		return cstatus;
	}
	public void setCstatus(String cstatus) {
		this.cstatus = cstatus;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cmoney=" + cmoney + ", cnum=" + cnum + ", cname=" + cname + ", cimage=" + cimage
				+ ", cstatus=" + cstatus + ", gid=" + gid + ", uid=" + uid + "]";
	}		
}
