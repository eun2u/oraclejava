<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String title = request.getParameter("title");
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	String content = request.getParameter("content");
	
	String sql=
			"INSERT INTO m1board(no, title, name, password, content) " +
				"VALUES(m1board_seq.nextval, ?,?,?,?)";
	
	boolean result=false;
	
	Connection cn= null;
	PreparedStatement ps = null;
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oraclejava", "oraclejava");
		
		//st=cn.createStatement();
		ps=cn.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, name);
		ps.setString(3, password);
		ps.setString(4, content);
		
		ps.executeUpdate();
		result=true;
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(ps!=null) try{ps.close();} catch(Exception e){};
		if(cn!=null) try{cn.close();} catch(Exception e){};
		
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type ="text/javascript">
<% if(result){ %>
	alert('글이 등록되었습니다.');
	location.href='list.jsp';
<%} else{ %>
	alert('글 등록 실패');
	location.href = 'javascript:history.back();';
<%} %>
</script>
</body>
</html>