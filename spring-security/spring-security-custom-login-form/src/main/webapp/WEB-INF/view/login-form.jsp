<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<h2>Login</h2>
<form:form action="${pageContext.request.contextPath}/authenticate" method="POST">
    <c:if test="${param.error != null}">
        <i class="error">Invalid username/password.</i>
    </c:if>
    <p>Username: <input type="text" name="username"/></p>
    <p>Password: <input type="password" name="password"/></p>
    <input type="submit" value="Login"/>
</form:form>
</body>
</html>