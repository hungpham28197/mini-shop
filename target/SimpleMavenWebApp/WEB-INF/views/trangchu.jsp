<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="header.jsp" />
</head>
<body>
	<div id="header" class="container-fluid header">
		<nav class="navbar navbar-expand-lg navbar-light none_nav"> <a
			class="navbar-brand" href="#"><img style="width: 200px; height: 40px" src="< c:url value="resources/img/logo.jpg"/>"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto navbar-center">
				<li class="nav-item active"><a class="nav-link" href="#">TRANG CHỦ</a></li>
				<li class="nav-item dropdown open">
					<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> DROPDOWN 
					</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Action</a> <a
							class="dropdown-item" href="#">Another action</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">Something else here</a>
					</div>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">DỊCH VỤ</a></li>
				<li class="nav-item"><a class="nav-link" href="#">LIÊN HỆ</a></li>
				
			</ul>
			<ul class="navbar-nav mr-auto navbar-center list-inline">
				<li><a href="dangnhap">ĐĂNG NHẬP</a></li></tab>
				<li style="padding-left:1em"><a href="#"> ĐĂNG KÍ</a></li>
			</ul>
		</div>
		</nav>
		
		<div class="even_header container wow flash">
			<span>Ngày 7/10 - 23/10/2018 </span></br>
			<span style="font-size: 50px">Mua 1 tặng 1</span></br>
			<button>Xem ngay</button>
		</div>
		
	</div>
	<div id="info" class="container">
		<div class="row">
		<div class="col-lg-4 wow fadeInLeft data-wow-duration="1s" data-wow-delay="1s"">
			<img class="icon" src="< c:url value="resources/img/icon_chatluong.png"/>"><br>
			<span style="font-size: 32px; font-weight: 500">Chất lượng</span><br>
			<span>Chúng tôi cam kết sẽ mang đến cho các bạn chất lượng sản phẩm tốt nhất</span>
		</div>
		<div class="col-lg-4 wow fadeInDown data-wow-duration="1s" data-wow-delay="1.5s"">
			<img class="icon" src="< c:url value="resources/img/icon_tietkiem.png"/>"><br>
			<span style="font-size: 32px; font-weight: 500">Tiết kiệm</span><br>
			<span>Chúng tôi cam kết sẽ mang đến cho các bạn chất lượng sản phẩm tốt nhất</span>
		</div>
		<div class="col-lg-4 wow fadeInUp data-wow-duration="1s" data-wow-delay="2s"">
			<img class="icon" src="< c:url value="resources/img/icon_giaohang.png"/>"><br>
			<span style="font-size: 32px; font-weight: 500">Giao hàng</span><br>
			<span>Chúng tôi cam kết sẽ mang đến cho các bạn chất lượng sản phẩm tốt nhất</span>
		</div>
		</div>
		
		<div id="title-sanpham">
			<span>SẢN PHẨM HOT</span>
			<div class="row list-sanpham">
				<div class="col-md-3">
					<div class="card wow bounceIn" style="width: 18rem;">
					  <img class="card-img-top" src="< c:url value="resources/img/sanpham.jpeg"/>" alt="Card image cap">
					  <div class="card-body">
					    <p class="card-text">Áo sơ mi</p>
					    <h5 class="card-title">150. 000VND</h5>
					    <a href="#" class="btn btn-primary">Go somewhere</a>
					  </div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card wow bounceIn" style="width: 18rem;">
					  <img class="card-img-top" src="< c:url value="resources/img/sanpham.jpeg"/>" alt="Card image cap">
					  <div class="card-body">
					    <p class="card-text">Áo sơ mi</p>
					    <h5 class="card-title">150. 000VND</h5>
					    <a href="#" class="btn btn-primary">Go somewhere</a>
					  </div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card wow bounceIn" style="width: 18rem;">
					  <img class="card-img-top" src="< c:url value="resources/img/sanpham.jpeg"/>" alt="Card image cap">
					  <div class="card-body">
					    <p class="card-text">Áo sơ mi</p>
					    <h5 class="card-title">150. 000VND</h5>
					    <a href="#" class="btn btn-primary">Go somewhere</a>
					  </div>
					</div>		
				</div>
				<div class="col-md-3">
					<div class="card wow bounceIn" style="width: 18rem;">
					  <img class="card-img-top" src="< c:url value="resources/img/sanpham.jpeg"/>" alt="Card image cap">
					  <div class="card-body">
					    <p class="card-text">Áo sơ mi</p>
					    <h5 class="card-title">150. 000VND</h5>
					    <a href="#" class="btn btn-primary">Go somewhere</a>
					  </div>
					</div>
				</div>
			</div>
			<div class="row list-sanpham">
				<div class="col-md-3">
					<div class="card wow bounceIn" style="width: 18rem;">
					  <img class="card-img-top" src="< c:url value="resources/img/sanpham.jpeg"/>" alt="Card image cap">
					  <div class="card-body">
					    <p class="card-text">Áo sơ mi</p>
					    <h5 class="card-title">150. 000VND</h5>
					    <a href="#" class="btn btn-primary">Go somewhere</a>
					  </div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card wow bounceIn" style="width: 18rem;">
					  <img class="card-img-top" src="< c:url value="resources/img/sanpham.jpeg"/>" alt="Card image cap">
					  <div class="card-body">
					    <p class="card-text">Áo sơ mi</p>
					    <h5 class="card-title">150. 000VND</h5>
					    <a href="#" class="btn btn-primary">Go somewhere</a>
					  </div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="card wow bounceIn" style="width: 18rem;">
					  <img class="card-img-top" src="< c:url value="resources/img/sanpham.jpeg"/>" alt="Card image cap">
					  <div class="card-body">
					    <p class="card-text">Áo sơ mi</p>
					    <h5 class="card-title">150. 000VND</h5>
					    <a href="#" class="btn btn-primary">Go somewhere</a>
					  </div>
					</div>		
				</div>
				<div class="col-md-3">
					<div class="card wow bounceIn" style="width: 18rem;">
					  <img class="card-img-top" src="< c:url value="resources/img/sanpham.jpeg"/>" alt="Card image cap">
					  <div class="card-body">
					    <p class="card-text">Áo sơ mi</p>
					    <h5 class="card-title">150. 000VND</h5>
					    <a href="#" class="btn btn-primary">Go somewhere</a>
					  </div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div id="footer" class="container-fluid">
		<div class="row">
			<div class="col-md-4 wow tada">
				<p><span class="title-footer">THÔNG TIN SHOP</span></p>
				<span>ChauGiangShop là 1 thương hiệu thời trang uy tín</span>
			</div>
			<div class="col-md-4 wow tada">
				<p><span class="title-footer">LIÊN HỆ</span></p>
				<span>ChauGiangShop là 1 thương hiệu thời trang uy tín</span>
				<span>Phạm Văn Hùng</span>
				<span>01684564688</span>
			</div>
			<div class="col-md-4 wow tada">
				<span class="title-footer">THÔNG TIN SHOP</span></br>
				<input tyle="text"/>
				<textarea rows="4" cols="50"></textarea>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>