package com.yanzi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yanzi.bean.Goods;

public interface GoodsMapper {
	
	//查询总记录数
	public int getCount();
	
	// 每一页显示的数据量
	public List<Goods> findGoodsLimit(@Param("currentPage")int currentPage,@Param("pageSize") int pageSize);

	public Goods findByIdGoods(int gid);
	
	public int updateGoods(Goods goods);
	
	public void addGoods(Goods goods);
	
}
