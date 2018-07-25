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
    <label>Free passes: </label>
    <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error"/>
    <br>
    <label>Postal code: </label>
    <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>
    <br>
    <input type="submit"/>
</form:form>
</body>
</html>