<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.setMaxInactiveInterval(10);
	session.setAttribute("name", request.getParameter("name"));
	session.setAttribute("id", request.getParameter("id"));
	session.setAttribute("lev", Integer.parseInt(request.getParameter("lev")));
	
	response.sendRedirect("sessionApp.jsp");
%>