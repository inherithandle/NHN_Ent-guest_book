<%@page import="com.guestbook.Posting"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>spring guestbook</title>
<meta name="keywords" content="Book Store Template, Free CSS Template, CSS Website Layout, CSS, HTML" />
<meta name="description" content="Book Store Template, Free CSS Template, Download CSS Website" />
<link href="style/templatemo2.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div id="templatemo_container">
	<div id="templatemo_menu">
    	<ul>
            <li><a href="index.php" class="current">NHN Entertainment</a></li>
            <li><a href="normal_search.php">최규태</a></li>

    	</ul>
    </div> <!-- end of menu -->
    
    <div id="templatemo_content">
        <div id="templatemo_content_right">
        	<div id="main_contents">
        	<h2></h2><p></p>
    		<h1 id="login_message">아래의 양식을 채우고 확인 버튼을 누르세요</h1>
    <p></p>
    <form:form method="POST" action="/Guestbook/hello" modelAttribute="posting">
      <table>
        <tr>
          <th><form:label path="Email">Email:</form:label></th>
          <td>
        	<form:input path="Email" />
          </td>
        </tr>

        <tr>
          <th><form:label path="Password">비밀번호:</form:label></th>
          <td>
            <form:password path="Password" />
          </td>
        </tr>

        <tr>
          <th><form:label path="Content" > 내용:</form:label></th>
            <td>
				<form:textarea path="Content" id="my-text-box" />
            </td>
	  	</tr>          
          <tr>
	    <th></th>
            <td>
              <input type="submit" value="확인" />
            </td>
          </tr>
        </table>
      </form:form>
      </div>
            
            <div class="cleaner_with_height">&nbsp;</div>
            
       <jsp:useBean id="postings" scope="request" class="java.util.ArrayList" type="java.util.ArrayList<Posting>"/>
		<%
		for(Posting posting : postings) {
		%>
		<p>
		<%=posting.getEmail()%><br>
		<%=posting.getContent()%><br>
		<%=posting.getCreatedtime().toString()%><br>
		</p>
		<%} %>     
        </div> <!-- end of content right -->
    
    	<div class="cleaner_with_height">&nbsp;</div>
    </div> <!-- end of content -->
    
    
    <!-- end of footer -->
<!--  Free CSS Template www.templatemo.com -->
</div> <!-- end of container -->
</body>
</html>