<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/" var="root"></c:url>

<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="${root}resources/css/layout.css">
	<link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
	<script type="text/javascript" src="${root}resources/js/util.js"></script>
	<script type="text/javascript" src="${root}resources/js/site.js"></script>
	<title>Document</title>
</head>
<body>
	<div id="wrap">
		<header>
			<div>
				<!-- <h1><a href=""><img src="../images/logo.png" alt="ê°ë°ì ì¡°íì§"></a></h1> -->
				<nav id="gnb">
					<ul>
						<li><a href="${root}member/login"><i class="xi-user"></i><span>Login</span></a></li>
					</ul>
				</nav>
			</div>
		</header>
		<article id="main" class="home_wrap">
			<div>
				<h2>
					<img src="${root}resources/images/lab.png" alt="laboratory"><br>
					Laboratory
				</h2>
			</div>
		</article>
		<footer>
			<p>&copy; h62j8n@gmail.com</p>
		</footer>
	</div>
</body>
</html>