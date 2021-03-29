<%@page import="board.model.BoardDao"%>
<%@page import="board.model.BoardDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardDao boardDao = new BoardDao();
	List<BoardDto> list = boardDao.getBoardList();
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 리스트</title>
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
<%for(BoardDto dto : list){ %>
<tr>
	<td><%=dto.getNo()%></td>
	<td><%=dto.getTitle() %></td>
	<td><%=dto.getName() %></td>
	<td><%=dto.getWriteday() %></td>
	<td align="right"><%=dto.getReadcount() %></td>
</tr>
<%} %>
</table>
<a href="insert.jsp">[글쓰기]</a>
</body>
</html>