<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>List Customers</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css">
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>Customers</h2>
    </div>
</div>
<div id="container">
    <div id="content">
        <button class="add-button"
                onclick="window.location.href='add-form'; return false;">
            Add Customer
        </button>
        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Action</th>
            </tr>
            <c:forEach var="customer" items="${customers}">
                <tr>
                    <c:url var="updateUrl" value="/customer/update-form">
                        <c:param name="customerId" value="${customer.id}"/>
                    </c:url>
                    <td>${customer.firstName}</td>
                    <td>${customer.lastName}</td>
                    <td>${customer.email}</td>
                    <td><a href="${updateUrl}">Update</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>