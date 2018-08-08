<%@page import="org.hibernate.Session"%>
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
	<div id="header-chitiet" class="container-fluid header">
		<nav class="navbar navbar-expand-lg navbar-light none_nav"> <a
			class="navbar-brand" href="${pageContext.request.contextPath}"><img src="< c:url value="resources/img/logo.jpg"/>"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto navbar-center">
				<li class="nav-item active"><a class="nav-link" href="${pageContext.request.contextPath}">TRANG CHỦ</a></li>
				<li class="nav-item dropdown open">
					<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> DANH MỤC 
					</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<c:forEach  items="${listDanhMucSP}" var="listDanhMucSP">
							<a class="dropdown-item" href="#">${listDanhMucSP.getTendanhmuc()}</a> 
			   			 </c:forEach>
					</div>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">DỊCH VỤ</a></li>
				<li class="nav-item"><a class="nav-link" href="#">LIÊN HỆ</a></li>
				
			</ul>
			<div>
				<c:choose>
					  <c:when test="${emailUser == null}">
					   <a class="nav-link" href="dangnhap" style="color: white;">ĐĂNG NHẬP</a>
					  </c:when>
					  <c:otherwise>
					    <span id= "icon-user" style="display: inline-grid;">${chucaidau}</span>
					  </c:otherwise>
				</c:choose>
			</div>
		</div>
		</nav>
	</div>
	
	<div class="container">
		<div class="row" style="margin-top: 16px;">
			<div class="col-sm-2 col-md-2">
				<h3>Danh mục sản phẩm</h3>
				<ul class="mymenu">
					<c:forEach  items="${listDanhMucSP}" var="listDanhMucSP">
						<li><a href="#">${listDanhMucSP.getTendanhmuc()}</a></li>
			   		</c:forEach>
				</ul>
			</div>
			<div class="col-sm-8 col-md-8">
				<div class="row">
					<div class="col-sm-4 col-md-4">
						<img style="max-width: 100%" src='< c:url value="resources/img/sanpham/${sanpham.getHinhsanpham()}"/>' ">
					</div>
					<div class="col-sm-8 col-md-8">
						<h3>${sanpham.getTensanpham()}</h3>
						<h4 style="color: red">${sanpham.getGiatien()} VND</h4>
						<table class="table">
						
							<thead>
								<tr>
									<th>Màu sắc sản phẩm</th>
									<th>Size</th>
									<th>Số lượng</th>
									<th>Thao tác</th>
								</tr>
							</thead>
							
							<tbody>
								<c:forEach  items="${sanpham.getChitietsanpham()}" var="chitietsanpham">
									<tr>
										<td>${chitietsanpham.getMausanpham().getTenmau()}</td>
										<td>${chitietsanpham.getSizesanpham().getSize()}</td>
										<td>${chitietsanpham.getSoluong()}</td>
										<td><button type="button" class="btn btn-success">Giỏ hàng</button></td>
									</tr> 
					   			 </c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="col-sm-2 col-md-2">
				<span>
					- ${sanpham.getMota()}
				</span>
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