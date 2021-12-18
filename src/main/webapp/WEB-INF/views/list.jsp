<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	
	<title>Events</title>
	<style>
	.container{
	display: flex;
	flex: 2;
	gap: 2rem;
	}
	.box{
	flex:1;
	padding: 0 2rem;
	}
	
	</style>
</head>
<body>
<h1> Event Database</h1>
<div class="container">
<div class="box">
<h2> Customer Details</h2>
	<c:forEach items="${customers}" var="cList">
		<p>Customer ID: ${cList.getcustomerId()}</p>
		<p>Name:  ${cList.getName()}
		<p>Address:  ${cList.getAddress_line_1()} ${cList.getAddress_line_2()},  ${cList.getCity()},  ${cList.getZipcode()},  ${cList.getAddress_line_1()}</p>
		<p> Telephone:  ${cList.getTel()} </p>
		<p>Email:  ${cList.getEmail()}</p>
		<a href="/deleteCustomer?id=${cList.getcustomerId()}">Remove customer</a>	
	</c:forEach>
	</div>
<div class="box">
	<h2> Vendor Details</h2>
	<c:forEach items="${vendors}" var="vendor">
	<p>Vendor ID: ${vendor.getvendorId()}
		<p>Name: ${vendor.getvendorName()}</p>
		<p>Address:  ${vendor.getAddress_line_1()} ${vendor.getAddress_line_2()},  ${vendor.getCity()},  ${vendor.getZipcode()},  ${vendor.getAddress_line_1()}</p>
		<p> Telephone:  ${vendor.getTel()} </p>
		<p>Email:  ${vendor.getEmail()}</p>
		<a href="/deleteVendor?id=${vendor.getvendorId()}">Remove vendor</a>	
	</c:forEach>
</div>
<div class="box">
<h2>Ticket</h2>
	<c:forEach items="${tickets}" var="t">
		<p>Ticket ID: ${t.getTicketId()}</p>
		<p>Ticket Name:  ${t.getTicketName()}</p>
		<p>Ticket Vendor:  ${t.getVendor().getvendorName()}</p>	
		<a href="/deleteTicket?id=${t.getTicketId()}">Remove ticket</a>	
	</c:forEach>
	</div>
<div class="box">
	<h2> Payment Info</h2>
	<c:forEach items="${payments}" var="p">
		<p>Payment ID: ${p.getPaymentID()}</p>
		<p>Ticket ID: ${p.getTicket().getTicketId()}</p>
		<p>Payment Date: ${p.getPaymentDate()}</p>
		<a href="/deletePayment?id=${p.getPaymentID()}">Remove payment</a>	
	</c:forEach>
	</div>
	</div>
</body>
</html>