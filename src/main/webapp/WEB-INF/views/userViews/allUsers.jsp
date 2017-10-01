<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@include file="../templates/head.jsp" %>
<body>
<h1>${xxx}</h1>
<form action="/sendUser" method="post">
    <input type="" name="name" placeholder="name">
    <input type="submit" name="" placeholder="">
</form>

<hr>

<a href="/showAllUsers">show all users</a>

<spring:errors path="name"/>
<input type="text" id="name" placeholder="name">
<input type="text" id="email" placeholder="email">
<button id="send">send</button>

<button id="show">show</button>
<div id="convert"></div>


<script src="/userViews/allUsers.js"></script>

</body>
