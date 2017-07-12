<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import='com.briancushman.web.models.DogModel' %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dog</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String breed = request.getParameter("breed");
	double weight = Double.parseDouble(request.getParameter("weight"));
	
	DogModel dog = new DogModel(name, breed, weight);
%>

	<h1>Your <%= dog.getBreed() %> dog <%= dog.getName() %>, <%= dog.showAffection() %>, you think.</h1>

</body>
</html>