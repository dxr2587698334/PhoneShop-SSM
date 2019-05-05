package com.yanzi.bean;

import java.util.List;

//角色表
public class Role {

//	CREATE TABLE `role` (
//	  `r_id` INT AUTO_INCREMENT COMMENT '角色ID',
//	  `r_name` VARCHAR(50) NOT NULL COMMENT '角色名称',
//	  `r_describe` VARCHAR(500) NOT NULL COMMENT '角色描述',
//	  PRIMARY KEY (`r_id`)
//	) ENGINE=INNODB DEFAULT CHARSET=utf8 AUTO_INCREMENT=100;

	int r_id;
	String r_name;
	String r_describe;

	List<User> listU;

	public Role() {
		super();
	}

	public Role(int r_id, String r_name, String r_describe) {
		super();
		this.r_id = r_id;
		this.r_name = r_name;
		this.r_describe = r_describe;
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public String getR_name() {
		return r_name;
	}

	public void setR_name(String r_name) {
		this.r_name = r_name;
	}

	public String getR_describe() {
		return r_describe;
	}

	public void setR_describe(String r_describe) {
		this.r_describe = r_describe;
	}

	public List<User> getListU() {
		return listU;
	}

	public void setListU(List<User> listU) {
		this.listU = listU;
	}

	@Override
	public String toString() {
		return "Role [r_id=" + r_id + ", r_name=" + r_name + ", r_describe=" + r_describe + "]";
	}

}
