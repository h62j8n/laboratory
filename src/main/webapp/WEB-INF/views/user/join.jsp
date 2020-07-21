<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/" var="root"></c:url>

<article id="container" class="login_wrap">
	<p id="codeTag"><a href=""></a></p>
	<div>
		<h2>회원가입</h2>
		<form id="signUpForm" class="comm_form" action="" method="POST">
			<ul>
				<li>
					<input type="email" id="userId" name="userId">
					<label for="userId">이메일</label>
				</li>
				<li>
					<input type="password" id="userPw" name="userPw">
					<label for="userPw">비밀번호 <span>(8~16자, 숫자, 영문, 특수문자 조합)</span></label>
				</li>
				<li>
					<input type="password" id="userPw2" name="userPw2">
					<label for="userPw">비밀번호 확인</label>
				</li>
				<li>
					<input type="checkbox" id="userTerms" name="userTerms">
					<label for="userTerms" class="label_chk"><a href="user_layer_terms.html" class="btn_layer">이메일 정보 수집에 동의합니다.</a></label>
				</li>
				<li class="btn"><button type="submit">가입하기</button></li>
			</ul>
		</form>
	</div>
</article>

<script type="text/javascript">

</script>