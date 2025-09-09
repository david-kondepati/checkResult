<%@ page isELIgnored="false" %>


<html>
	<head>
		<title>Result</title>
	</head>
	
	
	<style>
		#parent{
			width:40%;
			border:1px solid black;
		}
	</style>
	
	
	<body>
		<center>
			<h1>Result Page</h1>
			
			<div id="parent">
				<h1>Student Roll No:  ${id}</h1>
				<h1>Student Name: ${name} </h1>
				<h1>Student email: ${email}</h1>
			</div>
			
			<br/><br/>
			
			<table border="1" style = "border-collapse: collapse; font-size: 24px; text-align:center;">
				<tr>
					<th>Core Java</th>
					<th>Advanced Java</th>
					<th>Spring</th>
					<th>React</th>
					<th>Oracle</th>
				</tr>
				
				<tr>
					<td>${core}</td>
					<td>${adv}</td>
					<td>${spring}</td>
					<td>${react}</td>
					<td>${oracle}</td>
				</tr>
				
				<tr>
					<th colspan="2" style="text-align:left">Status</th>
					<td colspan="3" style="text-align:right">${status}</td>
				</tr>
			</table>
		</center>
	</body>
</html>