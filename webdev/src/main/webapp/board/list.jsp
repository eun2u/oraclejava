<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/board.css" type="text/css" />
</head>
<body>
<table width="600">
	<caption>게시판 리스트</caption>
<tr>
	<th>글번호</th>
	<th>제목</th>
	<th>이름</th>
	<th>작성일</th>
	<th>조회수</th>
</tr>
<%
	Connection cn = null;
	PreparedStatement ps = null;
	ResultSet rs = null; //결과 데이터를 얻어오기 위한 인스턴스 참조. 
	
	String sql = 
		"SELECT no, title, name, writedat, readcount "+
		"from m1board "+
		"order by no desc";
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oraclejava", "oraclejava");
		
		ps=cn.prepareStatement(sql);
		rs=ps.executeQuery();
		
		while(rs.next()){
%>
			<tr>
				<td><%=rs.getLong("no") %></td>
				<td><%=rs.getString("title") %></td>
				<td><%=rs.getString("name") %></td>
				<td><%=rs.getString("writeday") %></td>
				<td align="right"><%=rs.getInt("readcount") %></td>
			</tr>

<%
		}
	}catch(Exception e){
		
	}finally{
		
	}

%>
</table>
</body>
</html>