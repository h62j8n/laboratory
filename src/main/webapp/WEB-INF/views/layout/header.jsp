<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/" var="root"></c:url>

<header>
	<div>
		<!-- <h1><a href=""><img src="../images/logo.png" alt="ê°ë°ì ì¡°íì§"></a></h1> -->
		<nav id="gnb">
			<ul>
				<li><a href="${root}user/login"><i class="xi-user"></i><span>Login</span></a></li>
			</ul>
		</nav>
		<c:if test="${login ne null }">
		<div id="userMenu">
			<dl>
				<dt>${login.mbname} 님<button type="button" id="btnUser"><i class="xi-view-list"></i></button></dt>
				<dd><a href="">정보수정</a></dd>
				<dd><a href="">탈퇴하기</a></dd>
				<dd><a href="${root}user/layer/logout" class="btn_layer">로그아웃</a></dd>
			</dl>
		</div>
		</c:if>
	</div>
</header>