<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>飞凡网上书店</title>
<link href="css/main.css" rel="stylesheet" type="text/css" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<script type="text/javascript">
function login(){
	document.getElementById("ff").submit();
}

</script>
  </head>
  <body>
	<!--top-->
<div id="top_div">	
			<%--		<p class="left">您好，欢迎来到飞凡网上书店 ！</p>--%>
		<p class="right"><a href="login.jsp">登陆</a> | <a href="register.jsp">注册</a> | <a href="#">我的购物车</a> | <a href="#">网站首页</a></p>

	<div class="fixed"></div>
</div>
<div id="header_div">
	<div id="search">
		<!--下面form标签的id属性不能修改，因为在css中使用了一个id选择器-->
		<form id="form">
		<table width="413" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td>
					<input type="text" name="" value="" id="input">
				</td>
				<td>
					<input type="image" name="imageField" src="images/btn_search.png" />
				</td>
			</tr>
		</table>
		</form>
	</div>
</div>

<!--nav-->
<div id="nav">
	<ul id="menu"></ul>
</div>
<!--end nav-->

	<!--end top-->
	
	<!--content-->
	<div class="logoin_wrap mt30">
		<h2>用户登陆</h2>
		<div id="table">
			<form id="ff" method="post" action="userAction.action">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr><td height="30px"></td></tr>
			</table>
			<table width="100%" height="35" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td width="44%" align="right" valign="middle" class="f14">用户名：</td>
					<td width="56%" align="left" valign="middle">
						<input type="text" name="username"" class="input w180">
					</td>
				</tr>
			</table>
			<table width="100%" height="35" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td width="44%" align="right" valign="middle" class="f14">密&nbsp;&nbsp;码：</td>
					<td width="56%" align="left" valign="middle">
						<input type="password" name="password" class="input w180">
					</td>
				</tr>
			</table>
	
			<table width="100%" height="35" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td width="44%" align="right" valign="middle" class="f14"></td>
					<td width="56%" align="left" valign="middle">
						<!-- 图片按钮，与type=submit按钮的效果是一样，也可以用来提交表单 -->
						<input type="hidden" name="methodName:login" />
						<input type="image" src="images/admin_dl.png" onclick="javascript:login();" />
					</td>
				</tr>
			</table>
			
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr><td>&nbsp;</td></tr>
			</table>
			</form>
	    </div>
	</div>
	<!--end content-->
	
	<!--footer-->
	
<div id="footer_wrap">
	<p>Copyright ©2014 飞凡教育，版权所有</p>
</div>

	<!--end footer-->
</body>
</html>
