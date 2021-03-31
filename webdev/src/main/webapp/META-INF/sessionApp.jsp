<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>세션 테스트입니다.</h1>
<hr/>
세션 유지 시간 : <%=session.getMaxInactiveInterval() %>
<hr/>
<a href="sessionMake.jsp">[세션 값 생성]</a>
<a href="removeItem.jsp?item=id">[아이디 삭제]</a>
<a href="removeItem.jsp?item=name">[이름 삭제]</a>
<a href="removeItem.jsp?item=lev">[레벨 삭제]</a>
<a href="sessionInvalidate.jsp">[세션 초기화]</a>
<hr/>
id : 
<%
	if(session.getAttribute("id") ==null){
		out.println("값이 없습니다.");
	}else{
		out.println(session.getAttribute("id"));
	}
%><br/>
name : 
<%
	if(session.getAttribute("name") ==null){
		out.println("값이 없습니다.");
	}else{
		out.println(session.getAttribute("name"));
	}
%><br/>
lev : 
<%
	if(session.getAttribute("lev") ==null){
		out.println("값이 없습니다.");
	}else{
		out.println(session.getAttribute("lev"));
	}
%><br/>
</body>
</html>