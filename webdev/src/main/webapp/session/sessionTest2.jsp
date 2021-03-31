<%@page import="javabean.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//request는 요청 정보를 담은 객체 (HttpServletRequest)
	//session은 사용자에 대한 정보를 접속한 기간동안 유지
	
	String name = (String) session.getAttribute("name");
	int age=(Integer) session.getAttribute("age");
	double height = (Double) session.getAttribute("height");
	Member member = (Member) session.getAttribute("member");
	
	
%>
이름 : <%=name %><br/>
나이 : <%=age %><br/>
키 : <%=height %><br/>
멤버 : <%=member %>

</body>
</html>