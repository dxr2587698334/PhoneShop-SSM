package com.yanzi.bean;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

//商品表
public class Goods {

	// CREATE TABLE goods(
	// gid INT AUTO_INCREMENT COMMENT'商品id',
	// gmoney INT COMMENT'单价',
	// gname VARCHAR(20) COMMENT'商品名称',
	// gimage VARCHAR(50) COMMENT'商品图片',
	// gstatus VARCHAR(20)DEFAULT '正常销售' COMMENT'商品状态',
	// PRIMARY KEY(gid)
	// )ENGINE=INNODB CHARSET=utf8;

	int gid;
	int gmoney;
	String gname;
	String gimage;
	String gstatus;

	public Goods() {
		super();
	}

	public Goods(int gid, int gmoney, String gname, String gimage, String gstatus) {
		super();
		this.gid = gid;
		this.gmoney = gmoney;
		this.gname = gname;
		this.gimage = gimage;
		this.gstatus = gstatus;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public int getGmoney() {
		return gmoney;
	}

	public void setGmoney(int gmoney) {
		this.gmoney = gmoney;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGimage() {
		return gimage;
	}

	public void setGimage(String gimage) {
		this.gimage = gimage;
	}

	public String getGstatus() {
		return gstatus;
	}

	public void setGstatus(String gstatus) {
		this.gstatus = gstatus;
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gmoney=" + gmoney + ", gname=" + gname + ", gimage=" + gimage + ", gstatus="
				+ gstatus + "]";
	}

}
