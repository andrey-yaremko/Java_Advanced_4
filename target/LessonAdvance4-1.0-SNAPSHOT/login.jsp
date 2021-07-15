<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>login page</title>

    <style type="text/css">
        *{
            margin: 10px;
        }
    </style>
</head>

<body>

<jsp:include page="welcome.jsp"></jsp:include>

<form action="LoginServlet" method="post">

    <label for="login">Email :</label><input id="login" name="login">
    <br>
    <label for="password">Password :</label><input id="password" name="password">
    <br>
    <input type="submit" value="submit">
</form>


</body>
</html>
