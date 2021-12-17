<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>List of Agents</title>
</head>
<body>
	<c:forEach items="${events}" var="event">
		<p>Name: ${event}</p>
	</c:forEach>
	
	<c:forEach items="${vendors}" var="vendor">
		<p>Name: ${vendor}</p>
	</c:forEach>

	<c:forEach items="${customers}" var="customer">
		<p>${customer}</p>
	</c:forEach>
	
	<c:forEach items="${tickets}" var="ticket">
		<p>${ticket}</p>
	</c:forEach>
	
</body>
</html>