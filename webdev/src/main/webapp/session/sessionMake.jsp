<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="sessionMakeAction.jsp" method="post">
<table>
	<caption>세션 생성</caption>
<tr>
	<th>ID</th>
	<td><input type="text" name="id"/> </td>
</tr>
<tr>
	<th>이름</th>
	<td><input type="text" name="name"/> </td>
</tr>
<tr>
	<th>레벨</th>
	<td>
		<select name="lev">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select>
	</td>
</tr>
<tr>
	<td colspan="2">
		<input type="submit" value="세션 생성" />
	</td>
</tr>
</table>
</form>
</body>
</html>