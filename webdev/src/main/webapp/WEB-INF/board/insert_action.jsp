<%@page import="board.model.BoardDao"%>
<%@page import="board.model.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <jsp:useBean id="boardDto" class="board.model.BoardDto"/> --%> <!-- BoardDto boardDto = new BoardDto(); -->
<%-- <jsp:setProperty property="*" name="boardDto" /> --%>
<%
	String title = request.getParameter("title");
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	String content = request.getParameter("content");
	
	BoardDto boardDto = new BoardDto();
	boardDto.setTitle(title);
	boardDto.setName(name);
	boardDto.setPassword(password);
	boardDto.setContent(content);
	
	
	BoardDao boardDao = BoardDao.getInstance();
	System.out.println("boardDao hashcode : "+ boardDao.hashCode());
	boolean result = boardDao.insertBoard(boardDto);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert_action</title>
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