<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/src/main/webapp/resource/css"/> 
<script type="text/javascript" src="<%=path%>/src/main/webapp/resource/js/jquery-3.2.1.j"></script>
</head>
<body>
		按规模:
		<a href="list.do?vo=1">小型企业</a>
		<a href="list.do?vo=2">中型企业</a>
		<a href="list.do?vo=3">大型企业</a>
		<a href="list.do">小型企业</a><br><br>
		按类型:
		<a href="list.do?vo2=1">有限责任公司</a>
		<a href="list.do?vo2=2">股份有限公司</a>
		<a href="list.do?vo3=3">国有独资企业</a>
		<a href="list.do">其他</a>		
		<a href="list.do">全部</a><br><br>
	<table>
		<tr>
			<td>编号</td>
			<td>公司名称</td>
			<td>公司法人</td>
			<td>注册地址</td>
			<td>注册资本</td>
			<td>营业执照号</td>
			<td>公司类型</td>
			<td>营业期限</td>
			<td>成立时间</td>
			<td>详情</td>
		</tr>
		<c:forEach items="${info.list}" var="u">
		<tr>
			<td>${u.id}</td>
			<td>${u.name}</td>
			<td>${u.corporation}</td>
			<td>${u.address}</td>
			<td>${u.capital}</td>
			<td>${u.regist_no}</td>
			<td>${u.type}</td>
			<td>${u.period}</td>
			<td>${u.created}</td>
			<td>
				<input type="button" value="详情">
			</td>
		</tr>
		</c:forEach>
	</table>
	<tr>
		<td colspan="10">
			当前是${info.pageNum}/${info.pages}--共${info.total }条数据
			<a href="list.do?pageNum=1">首页</a>
			<a href="list.do?pageNum=${info.prePage }">上一页</a>
			<a href="list.do?pageNum=${info.nextPage }">下一页</a>
			<a href="list.do?pageNum=${info.pages }">尾页</a>
	</td>
	</tr>
</body>
</html>