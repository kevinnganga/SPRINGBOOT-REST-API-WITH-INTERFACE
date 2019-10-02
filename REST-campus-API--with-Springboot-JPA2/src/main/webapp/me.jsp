<!--  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>WELCOME</h1>
	
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!--  add our html table here -->
		<table>
			
				<tr>
					<th>UnitName</th>
					<th>Code</th>
					<th>Department</th>
					<th>Action</th>
					
					
				</tr>
				 
				 <c:forEach var="tempstudent" items="${kevo}"><!-- kevo is the model attribute name in the controller method for getting all units -->
				<!-- CONSTRUCT AN UPDATE LINK WITH EMBEDED CUSTOMER ID -->
			    <c:url var="updateLink" value="/showFormForUpdate">
			
				  <c:param name="unitName" value="${tempstudent.name }"/> <!-- TRACKING THE UNIT NAME IN THE UNITS LIST WHEN THIS PAGE LOADS SO AS TO USE IT -->
																		<!-- TO PREPOPULATE THE EditUnit.jsp FORM  -->
			   </c:url>
			   <!-- CONSTRUCT AN DELETE LINK WITH EMBEDED CUSTOMER ID -->
			   <c:url var="deleteLink" value="/delete">
			
				  <c:param name="unitName" value="${tempstudent.name }"/> <!-- TRACKING THE UNIT NAME IN THE UNITS LIST WHEN THIS PAGE LOADS SO AS TO USE IT -->
																		<!-- TO PREPOPULATE THE EditUnit.jsp FORM  -->
			   </c:url>
						<tr>
						<td>${tempstudent.name}</td>
						<td>${tempstudent.code}</td>
						<td>${tempstudent.department}</td>
						<td><a href="${updateLink }">Update</a>
						|
						<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
						
						</td>
						
						
					 
				
						</tr>
						
						
						
						
					
				
				 </c:forEach>
					
			</table>
				
		</div>
	
	</div>
	
	

	
</body>
</html>