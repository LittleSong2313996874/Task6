<%@ page language="java" pageEncoding="UTF-8"%>
<%--引入JSTL核心标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>显示用户信息</title>
    <style type="text/css">
        table,td{
            border: 1px solid;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<br/>
<br/>
<table border="2" align="center">
    <tr>
        <th>用户ID</th>
        <th>用户名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>毕业院校</th>
        <th>师兄</th>
        <th><a href="${pageContext.request.contextPath}/taskUser">返回首页 </a></th>
    </tr>
        <tr>
            <td>${user.INTID}</td>
            <td>${user.p_Name}</td>
            <td>${user.p_qq}</td>
            <td>${user.p_traintype}</td>
            <td>${user.p_jointime}</td>
            <td>${user.p_graduation}</td>
            <td>${user.p_onlineid}</td>
            <td>${user.p_dailylink}</td>
            <td>${user.p_oath}</td>
            <td>${user.p_senior}</td>
            <td>${user.p_source}</td>

        </tr>
</table>

</body>
</html>