package com.bawei.mapper;

import java.util.List;

import com.bawei.entity.Goods;

public interface GoodsMapper {

	List getGoodsList();
	
	//��ӻ���
	List getBrandList();
	
	//��ӻ���
	List getTypeList();
	
	//���
	void addGoods(Goods goods);

}
