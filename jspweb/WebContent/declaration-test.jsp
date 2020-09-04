<html>

<body>

<h3>Declaration JSP</h3>

<%!
	public String makeItLower(String data){
	return data.toLowerCase();
}
	%>
	
	
	<%= makeItLower("<br>Welcome now Speak") %>


</body>
</html>