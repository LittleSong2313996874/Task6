<%@ page language="java" pageEncoding="UTF-8"%>
<!-- 支持EL表达式 -->
<%@ page isELIgnored="false" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
    
	<form action="${pageContext.request.contextPath}/taskUser/Person" method="post">
		<table border="2" align="center">
			<caption><h3>修改数据</h3></caption>
			<tr>
				<%--把id设为隐藏域，修改信息不需要修改id --%>
				<input type="hidden" name="INTID" value="${person.INTID}"/>
				<th>姓名</th>
				<td><input type="text" name="p_Name" value="${person.p_Name}"/></td>
			</tr>
			<tr>
				<th>QQ</th>
				<td><input type="text" name="p_qq"value="${person.p_qq}"/></td>
			</tr>

			<tr>
				<th>修炼类型</th>
				<td><input type="text" name="p_traintype" value="${person.p_traintype}"/></td>
			</tr>

			<tr>
				<th>预计入学时间</th>
				<td><input type="text" name="p_jointime" value="${person.p_jointime}"/></td>
			</tr>
			<tr>
				<th>毕业院校</th>
				<td><input type="text" name="p_graduation" value="${person.p_graduation}" /></td>
			</tr>
			<tr>
				<th>线上id</th>
				<td><input type="text" name="p_onlineid" value="${person.p_onlineid}" /></td>
			</tr>
			<tr>
				<th>日报链接</th>
				<td><input type="text" name="p_dailylink" value="${person.p_dailylink}" /></td>
			</tr>
			<tr>
				<th>誓言</th>
				<td><input type="text" name="p_oath" value="${person.p_oath}" /></td>
			</tr>

			<tr>
				<th>师兄</th>
				<td><input type="text" name="p_senior" value="${person.p_senior}" /></td>
			</tr>
			<tr>
				<th>来源</th>
				<td><input type="text" name="p_source" value="${person.p_source}" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center">
					<input type="hidden" name="_method" value="PUT" style="width:111px"/>
					<input type="submit" value="提交" style="width:111px"/>
				</td>
			</tr>
			<tr>
				<td><a href="${pageContext.request.contextPath}/taskUser">返回首页 </a></td>
			</tr>
		</table>
	</form>	
	
	<hr/>

  </body>
</html>
