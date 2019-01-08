<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/26/026
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
</head>
<body>
${bookId}
<%--${params.id}--%>
<form action="${ctx}/bookFile/upload"
        enctype="multipart/form-data" method="post">
    <input type="hidden" name="bookId" value="${bookId}"/><br>
    <input type="file" name="img"/><br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
