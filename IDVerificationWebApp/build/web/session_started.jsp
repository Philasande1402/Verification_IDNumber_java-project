<%-- 
    Document   : session_started
    Created on : 03 Jul 2025, 10:41:06 AM
    Author     : Philasande
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session started Page</title>
    </head>
    <body>
        <h1>Session started</h1>
        <%
            String computerName = pageContext.getServletContext().getInitParameter("computer_name");
            String name = (String) session.getAttribute("name");
            Long id = (Long) session.getAttribute("id");
        %>
        
        <p>
            Hi <b><%=name%> <%=id%></b>.I'm <b><%=computerName%></b> session has started can you please enter you id number.
        </p>
        
        <form action="IdentificationServlet.do" method="POST">
            <table>
                <tr>
                    <td>Identification number : </td>
                    <td><input type="text" name="idNo" required=""/></td>
                </tr>
                
                <tr>
                    <td></td>
                    <td><input type="submit" value="CHECK ID NUMBER"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
