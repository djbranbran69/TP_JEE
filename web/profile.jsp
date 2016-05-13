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
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <title>Profile</title>
</head>
<body>

    <jsp:useBean id="myUser" scope="session" class="beans.UserBean">
        <!-- INITIALISATION -->
        <jsp:setProperty name="myUser" property="name"          value="none" />
        <jsp:setProperty name="myUser" property="surname"       value="none" />
        <jsp:setProperty name="myUser" property="age"           value="0" />
     </jsp:useBean>


    <jsp:setProperty name="myUser" property="name" />
    <jsp:setProperty name="myUser" property="surname"/>
    <jsp:setProperty name="myUser" property="age"/>


    <form action="showProfile.jsp" method="post">
        Put your name       <input type="text" name="name" />
        Put your surname    <input type="text" name="surname" />
        Put your age    <input type="text" name="age" />
        <input type="submit" value="GO!">
    </form>




</body>
</html>
