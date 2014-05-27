<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="form1"  action="calculation">
<table><tr>
<td>Number1:</td>
<td><input type="number" id="n1" name="number1" value='<%= request.getAttribute("name1")%>'/></td>
</tr>
<tr>
<td>Number2:</td>
<td><input type="number" id="n2" name="number2"  value='<%= request.getAttribute("name2")%>' /></td>
</tr>
<tr>
<td>select:</td>
<td><select id="myList" name="drop" oncontextmenu="submit()" value='<%= request.getAttribute("drop")%>'> <option>choose</option>
  <option >Addition</option>
  <option>Subtraction</option>  
  <option>Multiplication</option>
  <option>Division</option>
  </select></td>
</tr>
<tr>
<td>result:</td>
<td><input type="number" id="n3" name="number3" value='<%= request.getAttribute("result")%>' /></td>
</tr>
<tr>
<tr><td>
<input type="submit" onclick="validateform()" value="submit"/></td>
<td><input type="reset"  value="cancel" onClick="return a=clearFields()"/></td>
</tr></table>
</form>
<script>   
function validateform(){
var num1=parseInt(document.form1.number1.value);
var num2=parseInt(document.form1.number2.value);

var mylist=document.getElementById("myList");
var selected=mylist.options[mylist.selectedIndex].value;

//var total=num1+num2;
//alert(total);

 }
 function clearFields(){
	 document.getElementById("n1").value=""; 
	 document.getElementById("n2").value=""; 
	 document.getElementById("n3").value=""; 
	
	 return false;
 }
 
 
</script>
</body>
</html>