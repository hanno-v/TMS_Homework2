<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head><title>Course info</title></head>
<body>

Course info
<table>

    <td>ID</td>
    <td>First name</td>
    <td>Last name</td>
    <td>Course</td>

    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.course}</td>
            <td>${user.role.value}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
