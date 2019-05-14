package com.bawei.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.entity.Goods;
import com.bawei.service.GoodsService;
import com.bawei.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService service;
	
	@RequestMapping("list")
	public String getGoodsList( @RequestParam(defaultValue="1")Integer cpage , HttpServletRequest request) {
		
		PageHelper.startPage(cpage, 3);
		List list = service.getGoodsList();
		PageInfo pageinfo = new PageInfo(list);
		PageUtils pageUtils = new PageUtils(cpage, (int) pageinfo.getTotal(), 3, "/list", request);
 		request.setAttribute("list", list);
		
		return "list";
	}
	
	
	//添加回显
	@RequestMapping("getBrandList")
	@ResponseBody
	public List getBrandList() {
		List list = service.getBrandList();
		return list;
	}
	
	
	//添加回显
	@RequestMapping("getTypeList")
	@ResponseBody
	public List getTypeList() {
		List list = service.getTypeList();
		return list;
	}
	
	
	//添加
	@RequestMapping("addGoods")
	public String addGoods(Goods goods) {
		service.addGoods(goods);
		return "forward:list";
	}	
}
