<%@page import="board.model.BoardDto"%>
<%@page import="board.model.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Long no = Long.parseLong(request.getParameter("no"));
	BoardDao boardDao = BoardDao.getInstance();
	boolean result=boardDao.updateReadcount(no);
	if(!result){
%>
	<script>
		alert('해당하는 글이 존재하지 않습니다.');
		location.href = 'list.jsp';
	</script>
<%
		return;
	}
	
	BoardDto boardDto = boardDao.getBoardView(no);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세보기</title>
<link rel="stylesheet" href="../css/board.css" type="text/css" />
</head>
<body>
<table width="600">
	<caption>글 상세보기</caption>
<tr>
	<th>글번호</th>
	<td><%=boardDto.getNo() %></td>
</tr>
<tr>
	<th>제목</th>
	<td><%=boardDto.getTitle() %></td>
</tr>
<tr>
	<th>이름</th>
	<td><%=boardDto.getName() %></td>
</tr>
<tr>
	<th>조회수</th>
	<td><%=boardDto.getReadcount() %></td>
</tr>
<tr>
	<th>작성시간</th>
	<td><%=boardDto.getWriteday() %></td>
</tr>
<tr>
	<th>내용</th>
	<td><%=boardDto.getContent().replace("\n", "<br/>") %></td>
</tr>
</table><br/>
<a href="list.jsp">[리스트]</a>
<a href="update.jsp?no=<%=boardDto.getNo()%>">[수정]</a>
<a href="delete.jsp?no=<%=boardDto.getNo()%>">[삭제]</a>
</body>
</html>