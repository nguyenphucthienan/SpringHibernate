<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Spring MVC</title>
</head>
<body>
<h2>Spring MVC</h2>
<form:form action="/student/process" method="post" modelAttribute="student">
    <label>First name: </label>
    <form:input path="firstName"/>
    <br>
    <label>Last name: </label>
    <form:input path="lastName"/>
    <br>
    <label>Country: </label>
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br>
    <label>Favorite language: </label>
    <form:radiobutton path="favoriteLanguage" value="Java"/>Java
    <form:radiobutton path="favoriteLanguage" value="C#"/>C#
    <form:radiobutton path="favoriteLanguage" value="JavaScript"/>JavaScript
    <form:radiobutton path="favoriteLanguage" value="Python"/>Python
    <br>
    <input type="submit"/>
</form:form>
</body>
</html>