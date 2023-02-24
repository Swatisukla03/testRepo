<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.util.*"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ include file="newOne.jsp" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jsp</title>
</head>
<body>


 
<%! int num=20; %>
<% out.println(num);%>
<%= new java.util.Date() %>
 

</body>
</html>