package com.yanzi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openlab.bean.Goods;
import com.openlab.dao.GoodsMapper;
import com.openlab.util.Page;

@Service
public class IGoodsImpl implements IGoods {

	@Autowired
	GoodsMapper goodsMapper;

	// 查询总记录数
	@Override
	public int getCount() {
		int count = goodsMapper.getCount();
		return count;
	}

	// 每一页显示的数据量
	@Override
	public List<Goods> findGoodsLimit(int currentPage, int pageSize) {
		List<Goods> list = goodsMapper.findGoodsLimit(currentPage, pageSize);
		return list;
	}

	// 分页的方法
	@Override
	public Page<Goods> methodPage(int currentPage) {
		Page<Goods> pg = new Page<Goods>();
		// 设置当前页
		int pageSize = 12;
		pg.setPageSize(pageSize);

		// 设置当前页
		pg.setCurrentPage(currentPage);

		// 设置总记录数
		int count = getCount();
		pg.setTotalCount(count);

		// 设置每一页显示的数据量
		List<Goods> list = findGoodsLimit((currentPage - 1) * pageSize, pageSize);
		pg.setListT(list);
		return pg;
	}

	@Override
	public Goods findByIdGoods(int gid) {
		Goods goods = goodsMapper.findByIdGoods(gid);
		return goods;
	}
	
	@Override
	public int updateGoods(Goods goods){
		int i = goodsMapper.updateGoods(goods);
		return i;
	}
	
	@Override
	public void addGoods(Goods goods){
		goodsMapper.addGoods(goods);
	}

}
