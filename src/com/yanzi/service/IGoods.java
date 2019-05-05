package com.yanzi.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.openlab.bean.Goods;
import com.openlab.util.Page;

public interface IGoods {

	// 查询总记录数
	public int getCount();

	// 每一页显示的数据量
	public List<Goods> findGoodsLimit(@Param("currentPage") int currentPage, @Param("pageSize") int pageSize);

	// 分页的方法
	public Page<Goods> methodPage(int currentPage);
	
	public Goods findByIdGoods(int gid);
	
	public int updateGoods(Goods goods);

	public void addGoods(Goods goods);
	
}
