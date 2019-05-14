package com.bawei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.entity.Goods;
import com.bawei.mapper.GoodsMapper;

@Service
public class GoodsServiceImpl implements GoodsService{
	
	@Autowired
	private GoodsMapper mapper;

	public List getGoodsList() {
		return mapper.getGoodsList();
	}

	public List getBrandList() {
		return mapper.getBrandList();
	}

	public List getTypeList() {
		return mapper.getTypeList();
	}

	public void addGoods(Goods goods) {
		mapper.addGoods(goods);
	}
}
