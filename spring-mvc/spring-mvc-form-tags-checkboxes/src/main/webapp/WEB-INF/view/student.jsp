<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Spring MVC</title>
</head>
<body>
<h2>Spring MVC</h2>
<p>First name: ${student.firstName}</p>
<p>Last name: ${student.lastName}</p>
<p>Country: ${student.country}</p>
<p>Favorite language: ${student.favoriteLanguage}</p>
<p>Operating Systems:</p>
<ul>
    <c:forEach var="operatingSystem" items="${student.operatingSystems}">
        <li>${operatingSystem}</li>
    </c:forEach>
</ul>
</form>
</body>
</html>