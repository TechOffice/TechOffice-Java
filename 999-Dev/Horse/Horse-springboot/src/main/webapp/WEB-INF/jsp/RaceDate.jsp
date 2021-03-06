<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html lang="en">
<head>
	<script src="/lib/jquery-3.2.0.min.js"></script>
	<link rel="stylesheet" href="/lib/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
	<link rel="stylesheet" href="/lib/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css"/>
	<script type="text/javascript" src="/lib/bootstrap-filestyle-1.2.1/src/bootstrap-filestyle.min.js"> </script>
	<script src="/js/bootstrapPagingtable.js"></script>
	<script>
		$(function(){
			$("#raceDateTable").pagingTable({pageLimit: 25, enableSearchHeader: true});	
		});
	</script>
</head>
<body>
	<div class="container-fluid">
		<h1>Race Date</h1>
		<ul>
			<li><a href="/RaceDate/updateRaceDateList">Update Race Date</a></li>
			<li><a href="/RaceDate/updateRaceResultQueues">Update Race Result Queue</a></li>
			<li><a href="/RaceResultQueueBatch/executeResultQueueList">Execute Race Result Queue</a></li>
		</ul>
		<br/>
		<c:if test="${not empty raceDates }">
			<table id="raceDateTable">
				<thead>
					<tr>	
						<th>Race Date </th>
						<th>Type</th>
						<th>Count</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="raceDate" items="${raceDates}">
					<tr>
						<fmt:formatDate value="${raceDate.raceDate }" var="formattedRaceDate" pattern="yyyy-MM-dd"/>
						<td>
							<a href="/RaceResult/${formattedRaceDate }">${formattedRaceDate }</a>
						</td>
						<td>${raceDate.raceType }</td>
						<td>${raceDate.raceCount }</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		<!-- End of Fluid Container -->
	</div>
</body>

</html>