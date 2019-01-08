<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/26/026
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
</head>
<body>
 <h1>书本查询</h1>
 <
 <form action="${ctx}/book/bookList" method="post">
     <input type="text" name="bookName">
     <<input type="submit" value="查询">
 </form>
<table width="100%" border="1" cellpadding="0" cellspacing="0">
    <tr>
        <td>书本编号</td>
        <td>书本名称</td>
        <td>书本价格</td>
        <td>书本类型</td>
        <td>书本图片</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.bookId}</td>
            <td>${book.bookName}</td>
            <td>${book.bookPrice}</td>
            <td>${book.bookCategoryId}</td>
            <td>
                    <c:if test="${empty book.bookImage}">
                        未上传图片
                    </c:if>
                    <c:if test="${empty book.bookImage}">
                        <img src=" ${book.bookImage}">
                    </c:if>
              </td>
            <td>
                <c:if test="${empty book.bookImage}">
                    <a href="${ctx}/book/toFileUpload?id=${book.bookId}">上传图片</a>
                </c:if>
                <c:if test="${not empty book.bookImage}">
                    <a href="${ctx}/bookFile/download?fileId=${book.bookImage}">下载图片</a>
                </c:if></td>
        </tr>
    </c:forEach>
</table>
${pageBean}
</body>
</html>
