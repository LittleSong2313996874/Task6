<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="application/json;charset=UTF-8"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ page isELIgnored="false" %>
  <json:object>
      <json:property name="ID" value="${group_.groupId}"/>
      <json:property name="组名" value="${group_.groupName}"/>
      <json:array name="包含成员" var="item" items="${group_.groupMember}">
          <json:object>
              <json:property name="人员id" value="${item.id}"/>
              <json:property name="姓名" value="${item.NAME}"/>
              <json:property name="性别" value="${item.gender}"/>
              <json:property name="年龄" value="${item.age}"/>
              <json:property name="毕业院校" value="${item.graduation}"/>
              <json:property name="师兄" value="${item.senior}"/>
          </json:object>
      </json:array>
  </json:object>









