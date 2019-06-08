<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel = "stylesheet" href="resources/new_style_3.css" />
<!-- <link rel="stylesheet" href="new_style_2.css"> -->
<title>Registration Page</title>
</head>
<body>
<div class="mainContainer">

	<sf:form action="submitRegistration" method="post" modelAttribute="user">
	
	<sf:label path="firstName"> First Name:  </sf:label>
	<sf:input path="firstName" size="30" value="firstName" />
	
	<sf:label path="lastName"> Last Name:  </sf:label>
	<sf:input path="lastName" size="30" value="lastName" />
	
	<sf:label path="userName"> User Name:  </sf:label>
	<sf:input path="userName" size="30" value="userName" />
	
	<sf:label path="password"> Password:   </sf:label>
	<sf:input path="password" size="30" value="password" />
	
	<sf:label path="confirmPassword"> Confirm Password:  </sf:label>
	<sf:input path="confirmPassword" size="30" value="confirmPassword" />
	
	<sf:label path="emailAddress"> Email Address:   </sf:label>
	<sf:input path="emailAddress" size="30" value="emailAddress" />
	
	<a href='${pageContext.request.contextPath}/'>Go to Login page</a> <br>

	</sf:form>

</div>
</body>
</html>