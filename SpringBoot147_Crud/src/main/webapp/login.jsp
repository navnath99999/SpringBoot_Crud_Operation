<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> SpringBoot Crud </title>
</head>
<style>
h1
{
   text-align:center ;
}
body
{
  background-color:powderblue ;
}

fieldset
{
   width:250px ;
   margin-left:520px ;
   background-color:#800000 ;
   border:2px solid blue ;
   border-radius: 20px ;
}
#submit
{
   background-color:Black ;
   color:white;
}
</style>
<body><br><br>
<h1  > SpringBoot Crud Operation </h1><br><br><br><br>
<fieldset>
<h1 style="background-color:MediumSeaGreen; "> Login Page </h1>
	<form action="login">
		<table border="1" align="center">
			<tr>
				<td id="submit">USERNAME:</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td id="submit">PASSWORD:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login" id="submit"></td>
			</tr>
			<tr>
				<td><a href="registration">New User</a></td>
			</tr>
		</table>


	</form>
	</fieldset>
</body>
</html>