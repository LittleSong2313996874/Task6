<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="application/json;charset=UTF-8" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ page isELIgnored="false" %>
  <json:object>

      <json:array name="所有职业" var="vocation" items="${vocationList}">
          <json:object>
              <json:property name="方向" value="${vocation.field}"/>
              <json:property name="职业名称" value="${vocation.NAME}"/>
              <json:property name="职业介绍" value="${vocation.summary}"/>
              <json:property name="门槛" value="${vocation.threshold}"/>
              <json:property name="难易程度" value="${vocation.difficulty_Level}"/>
              <json:property name="成长周期" value="${vocation.threshold}"/>
              <json:property name="稀缺程度(多少公司想要)" value="${vocation.rareness}"/>

              <json:property name="0-1年" value="${vocation.salary_first}"/>
              <json:property name="1-3年" value="${vocation.salary_second}"/>
              <json:property name="3-5年" value="${vocation.salary_third}"/>
              <json:property name="在学人数" value="${vocation.number}"/>
              <json:property name="应该掌握" value="${vocation.basic_knowledge}"/>

          </json:object>
      </json:array>
  </json:object>








