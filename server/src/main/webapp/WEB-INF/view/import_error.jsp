<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>iHealth data import error</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div style="margin-top: 100px; text-align: center">
    <h2>Error while iHealth data import</h2>
    <p>
        Error: <c:out value="${response.error}"/> <br/>
        Error code: <c:out value="${response.errorCode}"/> <br/>
        Error description: <c:out value="${response.errorDescription}"/>
    </p>

    <button onclick="return window.close();">OK</button>
</div>
</body>
</html>