<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/w3.css">
<link rel="stylesheet" type="text/css" href="../css/cls.css">
<script type="text/javascript" src="../js/jquery-3.5.1.min.js"></script>
<!-- <script type="text/javascript" src="../js/"></script> -->
</head>
<body>
	<div class="w3-content w3-center mw600">
		<h2 class="w3-deep-purple w3-card-4">Test01</h2>
		<div class="w3-col w3-card-r w3-margin-top w3-padding">
			<div class="w3-col w3-margin-top">
				<h4 class="w3-col m2 w3-right-align">ID : </h4>
				<h4 class="w3-col m9">${param.id}</h4>
			</div>
			<div class="w3-col w3-margin-top">
				<h4 class="w3-col m2 w3-right-align">PW : </h4>
				<h4 class="w3-col m9">${param.pw}</h4>
			</div>
	</div>
</body>
</html>