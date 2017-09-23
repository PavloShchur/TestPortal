<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Answers</title>

    <form:form action="answer" method="post" modelAttribute="emptyAnswer">

        <form:input path="descriptionOfAnswer"/>
        <form:input path="rankOfAnswer"/>

        <input type="submit" value="Save">

    </form:form>

    ${allAnswers}
</head>
<body>

</body>
</html>
