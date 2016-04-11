<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $('#button').click(function () {
                alert(123);
                $.post('hello.do', null, function (data) {

                })
            });
        });
    </script>
</head>
<body>
<h1>success</h1>
<input type="button" id="button" value="点我">
</body>
</html>
