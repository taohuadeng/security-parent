<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="login" method="post">
    <h1>admin登录页</h1>
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="j_username"/></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="j_password"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="登录"/>
                <input type="reset" value="重置"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
