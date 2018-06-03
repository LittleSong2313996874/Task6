<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<c:set var="contextpath" value="${pageContext.request.contextPath}" scope="request" />

<a href="${contextpath}/taskUser/jsontest">GetJson</a>
<table border="2" align="center">
    <tr width="900" height="30">
        <td>用户ID</td>
        <td>用户名</td>
        <td>QQ</td>
        <td>修炼类型</td>
        <td>预计入学时间</td>
        <td>毕业院校</td>
        <td>线上id</td>
        <td>日报链接</td>
        <td>誓言</td>
        <td>师兄</td>
        <td>来源</td>
        <td><a href="${contextpath}/taskUser">返回首页 </a></td>
    </tr>
    <%--遍历lstUsers集合中的User对象 --%>
    <c:forEach var="user" items="${pBean.lists}">
        <tr width="900" height="30">
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

            <td width="70" height="30">
                <form action="${contextpath}/taskUser/prepare_update/${user.INTID}" method="post">
                    <input type="submit" value="修改"/>
                </form>

                <form action="${contextpath}/taskUser/Person/${user.INTID}" method="post">
                    <span>
                    <input type="hidden" name="_method" value="DELETE" />
                    <%--把id设为隐藏域，只有name的值和controller对于方法的形参一致，会自动赋值进去
                    <input type="hidden" name="id" value="${user.id}"/>--%>
                    <input type="submit" value="删除"/>
                    </span>
                </form>
            </td>
        </tr>
    </c:forEach>
    <tr width="900" height="30">
        <td colspan="5" class="td2">
            <span>第${pBean.currPage }/ ${pBean.totalPage}页</span>&nbsp;&nbsp;
            <span>总记录数：${pBean.totalCount }&nbsp;&nbsp;每页显示:${pBean.pageSize}</span>&nbsp;&nbsp;
            <span>
               <c:if test="${pBean.currPage != 1}">
                   <a href="${contextpath}/taskUser/Persons?currentPage=1">[首页]</a>&nbsp;&nbsp;
                   <a href="${contextpath}/taskUser/Persons?currentPage=${pBean.currPage-1}">[上一页]</a>&nbsp;&nbsp;
               </c:if>

               <c:if test="${pBean.currPage != pBean.totalPage}">
                   <a href="${contextpath}/taskUser/Persons?currentPage=${pBean.currPage+1}">[下一页]</a>&nbsp;&nbsp;
                   <a href="${contextpath}/taskUser/Persons?currentPage=${pBean.totalPage}">[尾页]</a>&nbsp;&nbsp;
               </c:if>
            </span>
        </td>
    </tr>

</table>

</body>
</html>