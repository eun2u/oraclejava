<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert</title>
<link rel="stylesheet" href="css/board.css" type="text/css" />
</head>
<body>
<form action="BoardInsertAction.do" method="post">
<table>
	<caption>글 쓰기</caption>

<tr>
	<th>제목</th>
	<td><input type="text" name="title" autofocus="autofocus" required="required"/></td>
</tr>
<tr>
	<th>내용</th>
	<td><textarea rows="5" cols="50" name="content" required="required"></textarea> </td>
</tr>
<tr>
	<td colspan="2" align="center">
		<input type="submit" value="완료" />	
	</td>
</tr>
</table>
</form>
</body>
</html>