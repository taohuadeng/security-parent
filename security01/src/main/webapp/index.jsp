<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>index</title>
</head>
<body>
username : <sec:authentication property="name"/>
<hr>
<a href="admin.jsp">admin.jsp</a>
<a href="j_spring_security_logout">退出登陆</a>
</body>
</html>