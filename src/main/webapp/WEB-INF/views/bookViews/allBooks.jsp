<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 24.09.2017
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book</title>
</head>
<body>
        <form:form modelAttribute="emptyBook" action="saveBookWithAuthor" method="post">

            <form:input path="titleOfBook" placeholder="titleOfBook"></form:input>
            <form:input path="author" placeholder="author"></form:input>
            <input type="submit">

        </form:form>

        <c:forEach items="${books}" var="book">

            ${book.author}

        </c:forEach>


</body>
</html>
