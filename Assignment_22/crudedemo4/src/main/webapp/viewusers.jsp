<%@ page import="com.javatpoint.dao.UserDao,com.javatpoint.bean.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Users</title>
</head>
<body>

<h1>Users List</h1>

<%
List<User> list = UserDao.getAllRecords();
request.setAttribute("list", list);
%>

<c:choose>
    <c:when test="${not empty list}">
        <table border="1" width="90%">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Password</th>
                <th>Email</th>
                <th>Sex</th>
                <th>Country</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <c:forEach items="${list}" var="u">
                <tr>
                    <td>${u.getId()}</td>
                    <td>${u.getName()}</td>
                    <td>${u.getPassword()}</td>
                    <td>${u.getEmail()}</td>
                    <td>${u.getSex()}</td>
                    <td>${u.getCountry()}</td>
                    <td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>
                    <td><a href="deleteuser.jsp?id=${u.getId()}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <p>No users found.</p>
    </c:otherwise>
</c:choose>

<br/><a href="adduserform.jsp">Add New User</a>

</body>
</html>
