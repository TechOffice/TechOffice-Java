<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
	<script src="/lib/jquery-3.2.0.min.js"></script>
	<link rel="stylesheet" href="/lib/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
	<link rel="stylesheet" href="/lib/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css"/>
	<script src="/js/bootstrapPagingtable.js"></script>
	<script>
		$(function(){
			$("#stockList").pagingTable({pageLimit: 25, enableSearchHeader: true});	
		})
	</script>
</head>

<body>
	<h1>Stock List</h1>
	<div>
		<a href="/stock/updateFromInternet">Update from Internet</a>
		<br/>
		<br/>
	</div>
	<c:if test="${not empty stocks}">
		<table border="1" id="stockList">
			<thead>
				<tr>
					<th>Code</th>
					<th>Name</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="stock" items="${stocks}">
				<tr>
					<td>${stock.stockCode}</td>
					<td>${stock.name}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</c:if>
</body>

</html>