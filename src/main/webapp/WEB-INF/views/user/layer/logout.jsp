<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/" var="root"></c:url>

<div class="pop_wrap">
	<div class="box_inform">
		<h3><img src="${root}resources/images/logout.png" alt="로그아웃"></h3>
		<p class="txt_mid">로그아웃하시겠습니까?</p>
	</div>
	<form id="logoutForm" class="confirm_form" action="${root}user/layer/logout" method="POST" data-dest="${root}">
		<ul>
			<li><button type="button" class="btn_close">아니요</button></li>
			<li><button type="submit">예</button></li>
		</ul>
	</form>
</div>

<script type="text/javascript">
logout();
</script>