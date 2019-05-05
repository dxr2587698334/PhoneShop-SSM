package com.yanzi.util;

import java.util.List;

//公用的分页类
public class Page<T> {

	int currentPage;// 当前页
	int pageSize;// 每页的大小
	int totalCount;// 总记录数*
	int totalPage;// 总页数
	List<T> listT;// 每一页显示的数据量*

	public Page() {
		super();
	}

	public Page(int currentPage, int pageSize, int totalCount, int totalPage, List<T> listT) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.listT = listT;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		int totalPage = totalCount/pageSize;
		if(totalCount%pageSize==0){
			return totalPage;
		}else{
			return totalPage+1;
		}
	}

//	public void setTotalPage(int totalPage) {
//		this.totalPage = totalPage;
//	}

	public List<T> getListT() {
		return listT;
	}

	public void setListT(List<T> listT) {
		this.listT = listT;
	}

}
