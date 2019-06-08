<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link rel="stylesheet" href="new_style_2.css" type="text/css" /> -->

<link rel = "stylesheet" href="resources/new_style_3.css" />



<title>This is a login page</title>
</head>
<body>

<div class="mainContainer"> 
<sf:form action="submitLogin" method="POST" modelAttribute="user">
		<sf:label path="userName">Username</sf:label>
		<sf:input path="userName" size="30" value="user" cssClass="inputClass" />
		<br />
		<sf:label path="password">Password</sf:label>
		<sf:input path="password" size="30" value="password" />
		<input type="submit" name="commit" value="submit" />
		<a href='registration'>Go to register page</a> <br>
	</sf:form>
</div>
</body>
</html>

