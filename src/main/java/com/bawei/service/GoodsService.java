package com.bawei.service;

import java.util.List;

import com.bawei.entity.Goods;

public interface GoodsService {
	
	//�б�
	List getGoodsList();
	
	//��ӻ���
	List getBrandList();
	
	//��ӻ���
	List getTypeList();
	
	//���
	void addGoods(Goods goods);

}
