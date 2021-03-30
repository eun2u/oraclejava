<%@page import="board.model.BoardDto"%>
<%@page import="board.model.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Long no = Long.parseLong(request.getParameter("no"));
	BoardDao boardDao = BoardDao.getInstance();
	BoardDto boardDto = boardDao.getBoardView(no);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 삭제</title>
<link rel="stylesheet" href="../css/board.css" type="text/css" />
</head>
<body>
<form action="delete_action.jsp" method="post">
<table>
	<caption>글 삭제</caption>

<tr>
	<th>번호</th>
	<td><%=boardDto.getNo() %><input type="hidden" name="no" readonly="readonly"  value="<%=boardDto.getNo()%>"/></td>
</tr>

<input type="hidden" name="title" autofocus="autofocus" required="required" value="<%=boardDto.getTitle()%>"/>
<input type="hidden" name="name" required="required" value="<%=boardDto.getName()%>"/>
<tr>
	<th>비밀번호</th>
	<td>
		<input type="password" name="password" required="required" /><br/>
		* 처음 글을 작성시 입력한 비밀번호를 동일하게 재입력해주세요.
	</td>
</tr>
<textarea type="hidden" rows="5" cols="50" name="content" required="required" style=display:none ><%=boardDto.getContent()%></textarea> 
<tr>
	<td colspan="2" align="center">
		<input type="submit" value="완료" />	
	</td>
</tr>
</table>
</form>
</body>
</html>