<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="application/json;charset=UTF-8"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ page isELIgnored="false" %>
  <json:object>
      <json:property name="人员id" value="${ONEjson.id}"/>
      <json:property name="姓名" value="${ONEjson.NAME}"/>
      <json:property name="性别" value="${ONEjson.gender}"/>
      <json:property name="年龄" value="${ONEjson.age}"/>
      <json:property name="毕业院校" value="${ONEjson.graduation}"/>
      <json:property name="师兄" value="${ONEjson.senior}"/>
  </json:object>





