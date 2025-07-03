<%-- 
    Document   : error_mess
    Created on : 03 Jul 2025, 11:21:40 AM
    Author     : Philasande
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Invalid id Page</title>
    </head>
    <body>
        <h1>Invalid id Page</h1>
        <%
            String computerName = pageContext.getServletContext().getInitParameter("computer_name");
            String name = (String) session.getAttribute("name");
            Long id = (Long) session.getAttribute("id");
            
        %>
        <p>
             Hi <b><%=name%> <%=id%></b>.I'm <b><%=computerName%></b> you entered an invalid id number.
        </p>
        <p>
            Please click <a href="session_started.jsp">here</a> to go back and enter a correct id number.
        </p>
    </body>
</html>
