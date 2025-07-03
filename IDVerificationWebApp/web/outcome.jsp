<%-- 
    Document   : outcome
    Created on : 03 Jul 2025, 11:13:08 AM
    Author     : Philasande
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>outcome Page</title>
    </head>
    <body>
        <h1>Outcome Page</h1>
        <%
            String computerName = pageContext.getServletContext().getInitParameter("computer_name");
            String name = (String) session.getAttribute("name");
            Long id = (Long) session.getAttribute("id");
            String idNumber = (String) session.getAttribute("idNumber");
        %>
        <p>
            Hi <b><%=name%> <%=id%></b>.I'm <b><%=computerName%></b> you entered the valid id number.
        </p>
        <form action="AddIdentificationServlet.do" method="POST">
            <table>
                <tr>
                    <td>Name : </td>
                    <td><input type="text" name="name" value="<%=name%>" readonly=""/></td>
                </tr>
                <tr>
                    <td>Unique ID : </td>
                    <td><input type="text" name="id" value="<%=id%>" readonly=""/></td>
                </tr>
                <tr>
                    <td>ID number : </td>
                    <td><input type="text" name="idNumber" value="<%=idNumber%>" readonly=""/></td>
                </tr>
                
                <tr>
                    <td></td>
                    <td><input type="submit" value="ADD TO DATABASE"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
