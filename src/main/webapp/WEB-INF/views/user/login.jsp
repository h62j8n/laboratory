<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/" var="root"></c:url>

<article id="container" class="login_wrap">
	<p id="codeTag"><a href=""></a></p>
	<div>
		<h2>LOGIN</h2>
		<form id="loginForm" class="comm_form" action="${root}user/login" method="POST">
			<ul>
				<li><input type="email" name="userId" value="testuser@email.com"></li>
				<li><input type="password" name="userPw" value="1234"></li>
				<li class="btn"><button type="submit">로그인</button></li>
			</ul>
		</form>
		<ul class="options">
			<li><a href="">회원가입</a></li>
			<!-- <li><a href="">아이디/비밀번호 찾기</a></li> -->
		</ul>
	</div>
</article>

<script type="text/javascript">
login();
</script>