<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Assignment 01</title>
</head>
<body>
<h1>Anagram To Solve</h1>


<form action="/" method="post">
<c:choose>
<c:when test="${user != null}">
<p>
Welcome ${user.email} <br/>
You can signout <a href="${logout_url}">here</a><br/>
Enter Word to Solve: 
<input type="text" name="text_input"/>
<input type="submit" value="submit"/><br/>
</p>
</c:when>
<c:otherwise>
<p>
Welcome!
<a href="${login_url}">Sign in or register</a>
</p>
</c:otherwise>
</c:choose>
</form>
</body>
</html>