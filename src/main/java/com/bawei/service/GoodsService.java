package com.bawei.service;

import java.util.List;

import com.bawei.entity.Goods;

public interface GoodsService {
	
	//列表
	List getGoodsList();
	
	//添加回显
	List getBrandList();
	
	//添加回显
	List getTypeList();
	
	//添加
	void addGoods(Goods goods);

}
