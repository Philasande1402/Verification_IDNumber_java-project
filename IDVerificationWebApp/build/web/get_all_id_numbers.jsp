<%-- 
    Document   : get_all_id_numbers
    Created on : 03 Jul 2025, 12:55:51 PM
    Author     : Philasande
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.IDVerification"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get all id numbers Page</title>
    </head>
    <body>
        <h1>Get all id numbers</h1>
        <%
            List<IDVerification> list = (List<IDVerification>) request.getAttribute("list");
        %>
        <p>
            Below is the list of id numbers that persisted in database.
        </p>
        <table border="2">
            <tr>
                <th>NAME</th>
                <th>UNIQUE_ID</th>
                <th>ID_NUMBER</th>
            </tr>
            <%
                for(int i=0;i<list.size();i++){
                    IDVerification ie = list.get(i);
                    String name = ie.getName();
                    String idNumber = ie.getIdNumber();
                    Long id = ie.getId();
                %>
                <tr>
                    <td><%=name%></td>
                    <td><%=idNumber%></td>
                    <td><%=id%></td>
                </tr>
                <%
                    }
%>
        </table>
        <p>
            Please click <a href="EndSessionServlet.do">here</a> to end session.
        </p>
    </body>
</html>
