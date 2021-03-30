<%@page import="test.mvc.BasketMember"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
              table {border-top:solid 1px #FFCD12;border-collapse:collapse} 
              table caption {font-size:16px;padding-bottom:20px;font-weight:bold;}
              table th {color:#636363;font-size:13px;background:#FFFFE9;border-top:solid 1px #FFCD12;padding:10px 20px;text-align:left;}
              table td {border-top:solid 1px #FFCD12;padding:5px }
              table td input[type=text] {border:solid 1px #ddd} 
              table td textarea {border:solid 1px #ddd}
              table td input[type=submit] {margin-top:20px;}
              table tr:first-child {border-top:solid 2px #FFCD12;}
</style>
</head>
<body>
<table>
	<caption>북산</caption>
<tr>
	<th>이름</th>
	<th>포지션</th>
	<th>백넘버</th>
	<th>득점력</th>
</tr>
<c:forEach items="${list}" var="member">
<tr>
	<td>${member.name}</td>
	<td>${member.position}</td>
	<td>${member.no}</td>
	<td>${member.point}</td>
</tr>
</c:forEach>
</table>
</body>
</html>