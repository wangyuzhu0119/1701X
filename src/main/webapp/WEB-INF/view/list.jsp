<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8s">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/css/mystyles.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-3.0.0.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<td>编号</td>
			<td>商品名</td>
			<td>商品英文名</td>
			<td>品牌</td>
			<td>分类</td>
			<td>尺寸</td>
			<td>价格</td>
			<td>数量</td>
			<td>标签</td>
		</tr>
		
		<c:forEach items="${list }" var="l">
			<tr>
				<td>${l.gid }</td>
				<td>${l.gname }</td>
				<td>${l.ename }</td>
				<td>${l.bname }</td>
				<td>${l.tname }</td>
				<td>${l.size }</td>
				<td>${l.price }</td>
				<td>${l.sum }</td>
				<td>${l.bq }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>