<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="CSS/index.css">
</head>
<body>
<div class="login-dialog">
	<form class="centered" action="CustomerDetailsServlet" method="post">
			<table style="with: 50%">
				<tr>
					<td>User Name</td>
					<td><input type="text" name="UserName" ></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" type="password" name="PassWord" ></td>
				</tr>
				<tr>

					  <td><label for="acctype">Account Type:</label></td>
					  <td><select type="text" id="account" name="accountType">
					    	<option value="savings">Savings</option>
					    	<option value="current">Current</option>
					    	<option value="fixed">Fixed-Deposit</option>
					  </select></td>
					</form>
				</tr>
					<tr>
					<td>age</td>
					<td><input type="text" name="age" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="mobileNo" /></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="branch" /></td>
				</tr></table>
 				<input type="submit" value="Submit" /></form>
</div>

</body>
</html>