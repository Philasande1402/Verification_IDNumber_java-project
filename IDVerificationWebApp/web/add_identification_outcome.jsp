<%-- 
    Document   : add_identification_outcome
    Created on : 03 Jul 2025, 11:40:02 AM
    Author     : Philasande
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add identification outcome Page</title>
    </head>
    <body>
        <h1>Add identification outcome Page</h1>
        <%
            String name = (String) session.getAttribute("name");
        %>
        <p>
            <b><%=name%></b> you have been successfully persisted you details in the database. 
            Please click <a href="EndSessionServlet.do">here</a> to end session.
        </p>
    </body>
</html>
