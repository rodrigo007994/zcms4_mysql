<!DOCTYPE html>
<html>
	<head>
	<link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
	<link href="css/style.css" rel="stylesheet">
	<title><%			
		  out.print(request.getAttribute("ztitle"));				  
		%></title>
<jsp:include page="header.jsp" flush="true" />
	</head>
	<body>
<jsp:include page="logo.jsp" flush="true" />
<div class="wrapper">
<div class="left">
<jsp:include page="navigation.jsp" flush="true" />
</div>
<div class="right">
<div class="content">
<div class="contact">
<h3>Contact</h3>
<form action="sendcontact" method="post">
<ul>
<li><label>First Name:</label> <input name="fname" type="text"/></li>
<li><label>Last Name:</label> <input name="lname"type="text"/></li>
<li><label>Company:</label> <input name="company" type="text"/></li>
<li><label>Email:</label> <input name="email" type="text"/></li>
<li><label>Phone:</label> <input name="phone" type="text"/></li>
<li><label>Regarding:</label>
<select name="regarding">
<option value="Inquiry" selected >Inquiry</option>
<option value="Partner With Us" >Partner With Us</option>
<option value="Customer Support" >Customer Support</option>
<option value="Careers/Jobs" >Careers/Jobs</option>
<option value="Other" >Other</option>
</select>
</li>
<li><label>Message:</label> <textarea name="message" cols="32" rows="8"></textarea></li>
<li><input type="submit" value="Submit"></li>
</ul>
</form>
</div>
</div>
</div>
</div>
<jsp:include page="footer.jsp" flush="true" />
