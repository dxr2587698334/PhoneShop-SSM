package com.yanzi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanzi.bean.Pr;
import com.yanzi.dao.PrMapper;

@Service
public class IPrImpl implements IPr {

	@Autowired
	PrMapper prMapper;

	@Override
	public void addPr(Pr pr) {
		prMapper.addPr(pr);
	}

	@Override
	public void updatePr(Pr pr) {
		prMapper.updatePr(pr);
	}

	// 删除原有的关系
	@Override
	public void delPr(int r_id) {
		prMapper.delPr(r_id);
	}
	
	// 批量删除
	@Override
	public int delBatchPr(int r_id){
		int i = prMapper.delBatchPr(r_id);
		return i;
	}

}
