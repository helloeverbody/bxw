<%@page import="java.net.URLDecoder"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName

()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body style="background-color: windowframe;">
  		<form action="user/login" method="post">
			<ul style="list-style: none;float: left;line-height: 35px;margin-top: 10%;margin-left: 40%;">
				<li style="text-align: center;">欢迎</li>
				<li>用户:<input type="text" name="name"  value="${URLDecoder.decode(cookie.name.value,'utf-8')}" /></li>
				<li>密码:<input type="password" name="psd"  value="${cookie.psd.value}" /></li>
				<li>七天内自动登录<input type="checkbox" value="yes" name="zidong"/>
				<li><div id="" style="text-align: center;">
				<input type="submit" value="登录"/> <a href="zhuche.jsp"><input type="button" value="注册" /></a></div></li>
		</ul>
		</form>
  </body>
</html>
