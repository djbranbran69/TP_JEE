<%--
  Created by IntelliJ IDEA.
  User: djbranbran
  Date: 13/05/16
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Profile</title>
    <jsp:useBean id="myUser" scope="session" class="beans.UserBean"/>
    <jsp:setProperty name="myUser" property="*"/>
</head>
<body>

    name :      </t><jsp:getProperty name="myUser" property="name"/></br>
    surname :   </t><jsp:getProperty name="myUser" property="surname"/></br>
    age :       </t><jsp:getProperty name="myUser" property="age"/></br>

</body>
</html>
