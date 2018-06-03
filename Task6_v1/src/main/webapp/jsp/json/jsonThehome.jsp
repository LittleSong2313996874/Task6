<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="application/json;charset=UTF-8" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ page isELIgnored="false" %>

  <json:object>
      <json:property name="在学人数" value="${allCount}"/>
      <json:property name="找到工作" value="${workSize}"/>
      <json:array name="包含成员" var="stu" items="${listBean}">
          <json:object>
              <json:property name="法号" value="${stu.p_Name}"/>
              <json:property name="毕业院校" value="${stu.p_graduation}"/>
              <json:property name="信念" value="${stu.p_oath}"/>
              <json:property name="加入时间" value="${stu.p_createTime}"/>
          </json:object>
      </json:array>
  </json:object>







