<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/css/mystyles.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-3.0.0.min.js"></script>
</head>

<script type="text/javascript">
	$(function(){
		$(
			"getBrandList",
			{},
			function(obj){
				$("#bid").append("<option value='"+obj[i].bid+"'>"+obj[i].bname+"</option>");
			},
			"json"
		);


		$(
			"getTypeList",
			{},
			function(obj){
				$("#tid").append("<option value='"+obj[i].tid+"'>"+obj[i].tname+"</option>");
			},
			"json"
		);
	})
</script>

<body>
	<form action="addGoods" method="post">
		商品名称:<input type="text" name="gname">
		英文名称:<input type="text" name="ename">
		品牌:<select id="bid">
			<option>-请选择品牌-</option>
			</select>
		种类:<select id="tid">
			<option>-请分类-</option>
			</select>
		尺寸:<input type="text" name="size">
		价格:<input type="text" name="price">
		数量:<input type="text" name="sum">
		标签:<input type="text" name="bq">
	</form>
</body>
</html>