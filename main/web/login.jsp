<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/22
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="/css/bootstrap-theme.css">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <script type="text/javascript" src="/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap.js"></script>
</head>
<body>

<form class="form-horizontal" role="form" action="user?flag=login" method="post">
    <div class="form-group">
        <label for="account" class="col-sm-2 control-label">账号</label>
        <div class="col-sm-5">
            <input type="text" class="form-control" id="account"
                   placeholder="请输入名字" name="account" required>
        </div>
        <div class="col-sm-5">
            <span style="color: red">${login_error}</span>
        </div>
    </div>

    <div class="form-group">
        <label for="pwd" class="col-sm-2 control-label">密码</label>
        <div class="col-sm-5">
            <input type="password" class="form-control" id="pwd"
                   placeholder="请输入密码" name="pwd" required>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-5">
            <button type="submit" class="btn btn-default">登录</button>
        </div>
    </div>
</form>

</body>
</html>
