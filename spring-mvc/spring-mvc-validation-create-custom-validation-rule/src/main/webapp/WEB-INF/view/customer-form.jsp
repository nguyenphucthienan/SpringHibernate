<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Spring MVC</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<h2>Spring MVC</h2>
<form:form action="/customer/process" method="post" modelAttribute="customer">
    <label>First name: </label>
    <form:input path="firstName"/>
    <br>
    <label>Last name: </label>
    <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br>
    <label>Course code: </label>
    <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="error"/>
    <br>
    <input type="submit"/>
</form:form>
</body>
</html>