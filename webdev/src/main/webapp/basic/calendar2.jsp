<%@page import="java.util.Calendar"%>
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
	int year=0;
	int month=0;
	
	Calendar cal =Calendar.getInstance();
	
	int sweek =0; //그 달의 첫번째날의 요일(일요일: 1, 월요일: 2 .. 토요일: 7)
	int eday =0; //마지막 날짜
	
	if(request.getParameter("year")==null){

		year=cal.get(Calendar.YEAR);
		month=cal.get(Calendar.MONTH)+1;
	}else{		
		year=Integer.parseInt(request.getParameter("year"));
		month=Integer.parseInt(request.getParameter("month"));
	}
	
	
	cal.set(year, month-1, 1);
	
	sweek=cal.get(Calendar.DAY_OF_WEEK);
	eday=cal.getActualMaximum(Calendar.DATE);
%>
<form action="calendar2.jsp" method="post">
<input type="number" name="year" min="2010" max="2025" value="<%=year %>"/>년
<input type="number" name="month" min="1" max="12" value="<%=month %>"/>월
<input type="submit" value="확인" />
</form></br>

<table border="1" cellpadding="10" cellspacing="0">
	<caption><%=year + "년 "+ month + "월" %></caption>
<tr>
	<th>일</th>
	<th>월</th>
	<th>화</th>
	<th>수</th>
	<th>목</th>
	<th>금</th>
	<th>토</th>
</tr>	
<tr>
	<%for(int i=1;i<sweek;i++){ %>
		<td>&nbsp;</td>
	<%} %>
	
	<%for(int d=1,w=sweek;d<=eday;d++,w++){ %>
		<td><%=d %></td>
		<%if(w%7==0){ %>
			<tr></tr>
		<%} %>
		
		<%if((d==eday) && (w%7!=0)){
			for(int sp=w%7+1;sp<=7;sp++){
				out.println("<td>&nbsp;</td>");
			}
		}
		%>
	<%} %>
</tr>

</table>

</body>
</html>