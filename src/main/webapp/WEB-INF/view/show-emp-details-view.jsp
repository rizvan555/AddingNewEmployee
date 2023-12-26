<%--
  Created by IntelliJ IDEA.
  User: rizvan
  Date: 24.12.23
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Show Details</h1>
<br />
<br />
Your name:  ${employee.name} <br>
Your surname: ${employee.surname} <br>
Your department: ${employee.department} <br>
Your salary: ${employee.salary} €<br>
<br />
<br />
<button onclick="window.location.href='http://localhost:8080/spring_course_mvc/askDetails'">Back</button>
</body>
</html>
