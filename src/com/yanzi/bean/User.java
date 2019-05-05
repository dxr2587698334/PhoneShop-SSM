package com.yanzi.bean;

//用户表
public class User {

//	  `uid` VARCHAR(50) NOT NULL COMMENT 'ID',
//	  `upwd` VARCHAR(50) NOT NULL COMMENT '密码',
//	  `uname` VARCHAR(50) NOT NULL COMMENT '姓名',
//	  `uphone` VARCHAR(20) NOT NULL COMMENT '电话',
//	  `uaddress` VARCHAR(20) NOT NULL COMMENT '地址',
//	  `role_rid` INT DEFAULT 103 COMMENT '角色id',

	String uid;
	String upwd;
	String uname;
	String uphone;
	String uaddress;
	int role_rid;

	Role role;

	public User() {
		super();
	}

	public User(String uid, String upwd, String uname, String uphone, String uaddress, int role_rid) {
		super();
		this.uid = uid;
		this.upwd = upwd;
		this.uname = uname;
		this.uphone = uphone;
		this.uaddress = uaddress;
		this.role_rid = role_rid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public int getRole_rid() {
		return role_rid;
	}

	public void setRole_rid(int role_rid) {
		this.role_rid = role_rid;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", upwd=" + upwd + ", uname=" + uname + ", uphone=" + uphone + ", uaddress="
				+ uaddress + ", role_rid=" + role_rid + "]";
	}

}
