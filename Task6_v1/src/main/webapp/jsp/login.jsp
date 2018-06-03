
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--引入JSTL核心标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>

<c:set var="contextpath" value="${pageContext.request.contextPath}" />
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <link rel="stylesheet" href="css/task5-js.css">
    <link rel="stylesheet" href="css/hover.css">
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="js/jquery-3.3.1.js"></script>
    <script src="js/task5.js"></script>
    <script src="lib/angular-ui-router.js"></script>
    <script src="js/app.js"></script>
    <title>登录</title>
</head>
<body>
<main>
    <form role="form" class="form" action="${contextpath}/u/login" method="post" >
        <div class="form-group"><label for="name">用户名</label>
            <input type="text" class="form-control" id="name" name="username" placeholder="请输入姓名">
        </div>
        <div class="form-group"><label for="code">密码</label>
            <input type="text" class="form-control" id="code" name="password" placeholder="请输入密码">
            <p class="alert"></p>
        </div>
        <input type="submit" value="登录">  &#12288;&#12288;  <a href="${contextpath}/jsp/register.jsp">去注册</a>
        <br/>
        &#12288; ${msg}
    </form>
</main>
</body>
</html>
