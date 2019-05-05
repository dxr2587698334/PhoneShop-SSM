package com.yanzi.bean;

//中间表
public class Pr {

	// CREATE TABLE `pr` (
	// `r_id`INT(50) NOT NULL,
	// `p_id`VARCHAR(50) NOT NULL,
	// PRIMARY KEY (`r_id`,`p_id`)
	// ) ENGINE=INNODB DEFAULT CHARSET=utf8

	int r_id;
	String p_id;

	public Pr() {
		super();
	}

	public Pr(int r_id, String p_id) {
		super();
		this.r_id = r_id;
		this.p_id = p_id;
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	@Override
	public String toString() {
		return "Pr [r_id=" + r_id + ", p_id=" + p_id + "]";
	}

}
