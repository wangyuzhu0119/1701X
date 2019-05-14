package com.bawei.mapper;

import java.util.List;

import com.bawei.entity.Goods;

public interface GoodsMapper {

	List getGoodsList();
	
	//添加回显
	List getBrandList();
	
	//添加回显
	List getTypeList();
	
	//添加
	void addGoods(Goods goods);

}
