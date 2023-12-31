<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Dear employee, please enter your details!</h1>



<%--@elvariable id="employee" type="com.rizvankarimov.spring.mvc.Employee"--%>
<form:form action="showDetails" modelAttribute="employee" cssClass="border-black" >
    Name: <form:input path="name" /><br/>
    Surname: <form:input path="surname" /><br/>
    Salary: <form:input path="salary" /><br/>
    Department: <form:select path="department">
    <form:option value="IT" label="IT"/>
    <form:option value="HR" label="HR"/>
    <form:option value="Sales" label="Sales"/>
    <form:option value="Marketing" label="Marketing"/>
    </form:select><br/>

    Which car do you want?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br />
    <br />
    <input type="submit" value="OK"/>
</form:form>

</body>
</html>
