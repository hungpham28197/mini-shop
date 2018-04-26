<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/styles.css">
<title>Insert title here</title>
</head>
<body id="body-login">

	<div id="body-flex-login">
		<div id="container-login">
			<div id="container-login-left">
				<div id="header-top-left" class="header-login">
					<span id="text-logo">Welcome</span><br> 
					<span id="hind-text-logo">Hãy tạo nên phong cách của bạn cùng ChâuGiangShop</span>
				</div>
				<div id="header-bottom-left">
					<p><img alt="icon_oval" src='< c:url value="resources/img/icons8-oval-16.png"/>'><span>Luôn cập nhật xu hướng thời trang mới nhất</span></p>
					<p><img alt="icon_oval" src='< c:url value="resources/img/icons8-oval-16.png"/>'><span>Giảm hơn 50% các mặt hàng danh cho khách VIP</span></p>
					<p><img alt="icon_oval" src='< c:url value="resources/img/icons8-oval-16.png"/>'><span>Tận tình tư vấn để tạo nên phong cách của bạn</span></p>
				</div>
			</div>

			<div id="container-login-right">
				<div id="header-top-right" class="header-login">
					<span class="actived">Đăng nhập</span> / <span>Đăng ký</span>
				</div>
				<div id="container-center-login-right">
					<form action="dangnhap" method="post">
						<input class="meterial-textinput input-icon-email" type="text" placeholder="Email" name="tendangnhap"/><br/>
						<input class="meterial-textinput input-icon-password" type="password" placeholder="Mật khẩu" name="matkhau"/><br/>
						<input class="meterial-primary-button" type="submit" value="Đăng nhập"/><br/>
					</form>
				</div>
				<div id="container-soial-login">
					<img alt="icon_oval" src='< c:url value="resources/img/facebook_circle.png"/>' />
					<img alt="icon_oval" src='< c:url value="resources/img/icons-gmail.png"/>' />
				</div>
			</div>
		</div>
	</div>
</body>
</html>