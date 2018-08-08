<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="header.jsp" />
<title>Insert title here</title>
</head>
<body id="body-login">
	<div style="width: 200px; float: right; margin:5px;">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="${pageContext.request.contextPath}">Trang chủ</a></li>
				<li class="breadcrumb-item active">Đăng ký</li>
			</ol>	
	</div>
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
					<a href="/minishop/dangnhap"><span style="color: #D8D8D8" id="dangnhap">Đăng nhập</span></a> / <a href="/minishop/dangky"><span class ="actived" id="dangky">Đăng ký</span></a>
				</div>
				<div id="container-center-login-right">
					<form action="/minishop/dangky" method="post">
						<span id="kiemtradangky" >${kiemtradangky}</span>
						<input id="emaildangky" class="meterial-textinput input-icon-email" type="text" placeholder="Email" name="emaildangky"/><br/>
						<input id="matkhaudangky" class="meterial-textinput input-icon-password" type="password" placeholder="Mật khẩu" name="matkhaudangky"/><br/>
						<input id="nhaplaimatkhau" class="meterial-textinput input-icon-password" type="password" placeholder="Nhập lại mật khẩu" name="nhaplaimatkhau"/><br/>
						<input id="btnDangKy" class="meterial-primary-button" type="submit" value="Đăng ký"/><br/>
					</form>
				</div>
				<div id="container-soial-login">
					<img alt="icon_oval" src='< c:url value="resources/img/facebook_circle.png"/>' />
					<img alt="icon_oval" src='< c:url value="resources/img/icons-gmail.png"/>' />
				</div>
			</div>
		</div>
	</div>
	
	<jsp:include page="footer.jsp" />
</body>
</html>