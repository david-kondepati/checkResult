<html>
	<head>
		<title>Welcome Admin</title>
	</head>
	
	
	<style>
		#btns{
			height:400px;
			display:flex;
			row-gap:10px;
			flex-direction:column;
			align-items:center;
			justify-content:center;
		}
		
		button{
			cursor:pointer;
			height:45px;
			font-size:20px;
			background-color:blue;
			color:white;
			border:none;
			border-radius:10px;
		}
		
		
		form{
			padding:20px;
			border:1px solid black;
		}
		
		#addStuForm{
			width:30%;
			background-color: coral;
			position:absolute;
			top:120px;
			left:450px;
			display:none;
		}
		
		input{
			height:45px;
			width:230px;
			font-size:20px;
			border:1px solid black;
			outline:none;
			padding-left:10px;
			border-radius:12px;
		}
		
		#deleteStuForm{
			width:30%;
			height:300px;
			background-color:coral;
			position:absolute;
			top:120px;
			left:450px;
			display:none;
		}
		
		#updateMarks{
			width:30%;
			background-color:coral;
			position:absolute;
			top:40px;
			left:450px;
			display:none;
		}
		
	</style>
	
	
	<body>
		
		<div id="btns">
			<h1>Welcome Admin</h1>
			<button onclick="addStudent()">Add a new Student</button>
			<button onclick="deleteStudent()">Delete a Student</button>
			<button onclick="updateMarks()">Update the marks</button>
		</div>
		
		
		<form id="addStuForm" action="addStu" method="post">
			<h1>Add a new Student</h1>
			<input
			type="text"
			name="stuid"
			placeholder="Enter student Id"
			required
			/>  
			
			<br/><br/>
			<input
			type="text"
			name="stuname"
			placeholder="Enter student name"
			required
			/>  
			
			<br/><br/>
			<input
			type="text"
			name="stuemail"
			placeholder="Enter student email"
			required
			/>  
			
			<br/><br/>
			
			<button onclick="submitStudent()">Submit</button>
		</form>
		
		
		<form id="deleteStuForm" action="deleteStu" method="post">
			
			<h1>Delete the student by Id</h1>
			
			<input
			type="text"
			name="stuid"
			required
			placeholder= "Enter the Id of student"
			/>
			
			<br/><br/>
			
			<button>Submit</button>
		</form>
		
		<form id="updateMarks" action="updateMarks" method="post">
			<h1>Update the marks of Student</h1>
		
			<input
			type="text"
			placeholder="Enter Student Id"
			name="id"
			required
			/>
			
			<br/><br/>
			
			<input
			type="text"
			placeholder="Enter Core Java Marks"
			name="core"
			required
			/>
			<br/><br/>
			
			<input
			type="text"
			placeholder = "Enter Advanced Java Marks"
			name="adv"
			required
			/>
			<br/><br/>
			
			<input
			type="text"
			placeholder = "Enter SpringBoot marks"
			name="spring"
			required
			/>
			<br/><br/>
			
			<input
			type="text"
			placeholder="Enter React Marks"
			name="react"
			required
			/>
			<br/><br/>
			
			<input
			type="text"
			placeholder="Enter Oracle Marks"
			name="oracle"
			required
			/>
			<br/><br/>
			
			<button>Submit</button>
		</form>
		
		<script>
			function addStudent(){
				document.getElementById('addStuForm').style.display = "block"
			}
			
			function deleteStudent(){
				document.getElementById('deleteStuForm').style.display = "block"
			}
			
			function updateMarks(){
				document.getElementById('updateMarks').style.display = "block"
			}
		
		</script>
		
	</body>
</html>







