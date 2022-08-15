<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/22
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <link rel="stylesheet" href="/css/bootstrap-theme.css">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <script type="text/javascript" src="/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap.js"></script>
</head>
<body>

    <form class="form-horizontal" role="form" action="user?flag=regist" method="post">
        <div class="form-group">
            <label for="account" class="col-sm-2 control-label">账户</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" id="account"
                       placeholder="请输入账户" name="account" required>
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
            <label for="username" class="col-sm-2 control-label">名字</label>
            <div class="col-sm-5 ">
                <input type="text" class="form-control" id="username"
                       placeholder="请输入名字" name="username" required>
            </div>
        </div>

        <div class="form-group">
            <label for="vip" class="col-sm-2 control-label">VIP</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" id="vip"
                       placeholder="是否为VIP" name="vip" required>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-5">
                <button type="submit" class="btn btn-default">注册</button>
            </div>
        </div>
    </form>

</body>
</html>
