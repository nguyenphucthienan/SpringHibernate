<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
    <title>Spring Security</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h2>Spring Security</h2>
    <p>
        Username:
        <security:authentication property="principal.username"/>
    </p>
    <p>
        Role(s):
        <security:authentication property="principal.authorities"/>
    </p>
    <security:authorize access="hasRole('ADMIN')">
        <p><a href="${pageContext.request.contextPath}/admin-page">Admin</a></p>
    </security:authorize>
    <security:authorize access="hasRole('MANAGER')">
        <p><a href="${pageContext.request.contextPath}/manager-page">Manager</a></p>
    </security:authorize>
    <form:form action="${pageContext.request.contextPath}/logout" method="POST">
        <input type="submit" value="Logout" class="btn btn-success"/>
    </form:form>
</div>
</body>
</html>