<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>List of Agents</title>
</head>
<body>
	<c:forEach items="${customers}" var="c">
		<p>Name: ${c}</p>
	</c:forEach>
	
	<c:forEach items="${vendors}" var="vendor">
		<p>Name: ${vendor}</p>
	</c:forEach>

	<c:forEach items="${tickets}" var="t">
		<p>${t}</p>
	</c:forEach>
	
	<c:forEach items="${payments}" var="p">
		<p>${p}</p>
	</c:forEach>
	
</body>
</html>