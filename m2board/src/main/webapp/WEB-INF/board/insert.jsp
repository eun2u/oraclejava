<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert</title>
<link rel="stylesheet" href="css/board.css" type="text/css" />
<script type="text/javascript" src="se2/js/service/HuskyEZCreator.js"></script>
<script type="text/javascript">
var goUpdate=function(){
	var f= document.myform;
	oEditors[0].exec("UPDATE_CONTENTS_FIELD", []);
	f.submit();
}
</script>
</head>
<body>
<form action="BoardInsertAction.do" method="post" name="myform">
<table>
	<caption>글 쓰기</caption>

<tr>
	<th>제목</th>
	<td><input type="text" name="title" style="width:645px;" autofocus="autofocus" required="required"/></td>
</tr>
<tr>
	<th>내용</th>
	<td>
		<textarea style="width:645px;" rows="5"  name="content" id="content" required="required"></textarea> 
		<script type="text/javascript">
		var oEditors = [];
		nhn.husky.EZCreator.createInIFrame({
		 oAppRef: oEditors,
		 elPlaceHolder: "content",
		 sSkinURI: "se2/SmartEditor2Skin.html",
		 fCreator: "createSEditor2"
		});
		</script>
	</td>
</tr>
<tr>
	<td colspan="2" align="center">
		<input type="button" value="완료" onclick="goUpdate();" />	
	</td>
</tr>
</table>
</form>
</body>
</html>