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
<h1>书本新增</h1>
${param.message}
<f:form modelAttribute="book" action="${ctx}/book/addBook" method="post">
    书本名称：<f:input path="book_name"/><br>
    书本价格：<f:input path="book_price"/><br>
    书本类型：<f:select path="book_category_id" items="${btype}"
                   itemValue="bvalue" itemLabel="bname" cssStyle="width: 161px;"/><br>
    <input type="submit" value="提交"/>
</f:form>
</body>
</html>
