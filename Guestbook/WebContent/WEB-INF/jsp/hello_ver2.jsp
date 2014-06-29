<%@page import="com.guestbook.Posting"%>
<%@page import="java.util.ArrayList"%>
<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
<h1>방명록</h1>
<p><a href='add'>그냥 링크다.</a></p>
<jsp:useBean id="postings" scope="request" class="java.util.ArrayList" type="java.util.ArrayList<Posting>"/>
<%
for(Posting posting : postings) {
%>
<%=posting.getEmail()%><br>
<%=posting.getContent()%><br>
<%=posting.getCreatedtime().toString()%><br>
<%} %>
</body>
</html>