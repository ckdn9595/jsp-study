<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/jspcls/w3.css"/>
</head>
<body>
	<h1 class="w3-black" style="text-align:center;">구구단을 외자</h1>
	<div style="border:1px solid gray; background-color:pink; margin:50px; padding:20px; text-align:center">
<%
	for(int j = 1; j < 10; j++){
%>
		<div style="border:1px solid gray; background-color:LightGray; margin:10px; padding:0px 10px; display:inline-block;">
			<h2 ><%= j %>단 </h2>
<%	
		for(int i = 1 ; i < 10; i++){
%>
			<p> <%= j %> x <%= i %> = <%= j*i %> </p>
<%
		}
%>
		</div>
<%
	}
%>
	</div>
</body>
</html>