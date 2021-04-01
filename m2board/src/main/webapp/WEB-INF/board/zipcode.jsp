<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/board.css" type="text/css" />
<script type="text/javascript">
function setZipcode(zip1, zip2, addr1){
	var f=opener.document.regist; //f는 form태그. opener는 부모 객체
	f.zipcode.value=zip1+'-'+zip2;
	f.address1.value=addr1;
	self.close();
}
</script>
</head>
<body>
<form>
<table>
	<caption>우편번호 검색</caption>
<tr>
	<th colspan="2"> 동:
		<input type="text" name="area" autofocus="autofocus" required="required" style="width:100px;" value="${area }"/>
		<input type="submit" value="검색"/>
	</th>
</tr>

<c:if test="${area != null && list.size()==0 }">
<tr>
	<td colspan="2">검색한 [${area }]동을 포함한 주소는 존재하지 않습니다.</td>
</tr>
</c:if>

<c:if test="${list != null }">
	<c:forEach items="${list }" var="dto">
	<tr>
		<td width="65">
			<a href="javascript:;" onclick="setZipcode('${dto.zipcode1 }','${dto.zipcode2 }','${dto.address1}');">
			${dto.zipcode1 }-${dto.zipcode2 }</a>
		</td>
		<td>${dto.address1}</td>
	</tr>
	</c:forEach>
</c:if>
</table>
</form>
</body>
</html>