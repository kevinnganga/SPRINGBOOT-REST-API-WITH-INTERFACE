<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Customer</title>

	
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>EDIT UNIT FORM</h2>
		</div>
	</div>

	<div id="container">
		<h3>EDIT UNIT</h3>
	
		<form:form action="updateUnit" modelAttribute="updateUnit" method="POST">
		
		<!-- ASSOCIATING THE DATA WITH THE UNIT NAME SO AS WHEN UPDATING THE SYSTEM WILL KNOW WHICH ROW TO UPDATE -->
		
		
			
				 
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="name" /></td>
					</tr>
				
					<tr>
						<td><label>Last code:</label></td>
						<td><form:input path="code" /></td>
					</tr>

					<tr>
						<td><label>department:</label></td>
						<td><form:input path="department" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
		</p>
	
	</div>

</body>

</html>










