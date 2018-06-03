<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--引入JSTL核心标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>

<c:set var="contextpath" value="${pageContext.request.contextPath}" />
<header>
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-md-12 col-lg-12 followus">
                <span>客服热线:010-59478634</span>
                <span class="pull-right"><a class="wechat" href="#"></a>
                <a class="qq" href="#"></a>
                <a class="sina" href="#"></a>
        </span>
            </div>
        </div>
    </div>
    <div class="login">
        <span class="login1"><a href="#">登录</a></span>
        <span><a href="#">注册</a></span>
    </div>
    <div class="btl">
        <div class="container navigation">
            <div class="row">
                <div class="col-xs-12 col-md-12 col-lg-12">
                    <a href="${contextpath}/co-company" class="frontpage">关于</a>
                    <a href="#">推荐</a>
                    <a href="${contextpath}/allvocation">职业</a>
                    <a href="${contextpath}/u/thehome">首页</a>
                </div>
            </div>
        </div>
    </div>
    <div class="dp">
        <div class="dp-cell">
            <ul class="nav nav-pills">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#"><img src="img/holder.png"></a>
                    <ul class="scc dropdown-menu">
                        <li><a href="#">关于</a></li>
                        <li><a href="#">推荐</a></li>
                        <li><a href="#">职业</a></li>
                        <li><a href="#">首页</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</header>