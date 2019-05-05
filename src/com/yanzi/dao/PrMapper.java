package com.yanzi.dao;

import com.yanzi.bean.Pr;

public interface PrMapper {
	
	public void addPr(Pr pr);
	
	public void updatePr(Pr pr);
	
	//删除原有的关系
	public void delPr(int r_id);

	// 批量删除
	public int delBatchPr(int r_id);

}
