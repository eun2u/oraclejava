<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	public String dateFormat(int year, int month, int date){
		return year+"년 "+month +"월 "+ date + "일";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Calendar cal = Calendar.getInstance(); //인스턴스를 얻어온 그 시점의 연, 월, 일로 셋팅

%>

<h1>
<%=dateFormat(cal.get(Calendar.YEAR), 
					cal.get(Calendar.MONTH)+1, 
					cal.get(Calendar.DATE))%>
</h1>
</body>
</html>