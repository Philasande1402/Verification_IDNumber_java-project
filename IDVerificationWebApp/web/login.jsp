<%-- 
    Document   : login
    Created on : 03 Jul 2025, 6:57:06 PM
    Author     : Philasande
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <p>
            Provide the login username and password.
        </p>
        
        <form action="j_security_check" method="POST">
            <table>
                <tr>
                    <td>Username : </td>
                    <td><input type="text" name="j_username" required=""/></td>
                </tr>
                
                <tr>
                    <td>Password : </td>
                    <td><input type="text" name="j_password" required=""/></td>
                </tr>
                
                <tr>
                    <td></td>
                    <td><input type="submit" value="LOGIN"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
