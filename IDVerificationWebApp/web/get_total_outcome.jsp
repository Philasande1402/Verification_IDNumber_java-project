<%-- 
    Document   : get_total_outcome
    Created on : 03 Jul 2025, 1:07:40 PM
    Author     : Philasande
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get total outcome Page</title>
    </head>
    <body>
        <h1>Get total outcome</h1>
        <%
            Integer count = (Integer) request.getAttribute("size");
        %>
        <p>
            The number of id numbers in the database is <b><%=count%></b>. Please click <a href="EndSessionServlet.do">here</a> to logout.
        </p>
    </body>
</html>
