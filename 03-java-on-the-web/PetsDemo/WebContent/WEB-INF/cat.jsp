<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import='com.briancushman.web.models.CatModel' %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cat</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String breed = request.getParameter("breed");
	double weight = Double.parseDouble(request.getParameter("weight"));
	
	CatModel cat = new CatModel(name, breed, weight);
%>
	<h1>Your <%= cat.getBreed() %> cat <%= cat.getName() %>, <%= cat.showAffection() %>, you think.</h1>
</body>
</html>