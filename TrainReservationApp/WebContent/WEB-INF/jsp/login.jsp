<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>

<script type="text/javascript">
	function validate()
	{
		var username=document.getElementById("username");
		var password=document.getElementById("password");
		
		re=/(?=.*[!@#$%^&*])/;
	    if(!re.test(myform.password.value)) {
	      alert("Error: password must contain atlest one special character!");
	      form.password.focus();
	      return false;
	    }
	}
</script>

</head>
<body>
<form name="myform"action="logindata" method="post" onsubmit="return validate(this)";>
<label>UserName : </label>
<input type="text"  name="username"required="required" placeholder="Enter User Name"><br><br>
<label>Password : </label>
<input type="password" name="pswd" required="required" placeholder="Enter password"><br><br>
<input type="submit" value="Login">
<input type="reset">
</form>
</body>
</html>