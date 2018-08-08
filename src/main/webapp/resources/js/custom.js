$(document).ready(function() {
	
	$("#btnDangNhap").click(function() {
		
		var email = $("#email").val();
		var matkhau = $("#matkhau").val();
		
		$.ajax({
			url: "/minishop/api/KiemTraDangNhap",
			type: "GET",
			data:{
				email: email,
				matkhau: matkhau
			},
			success: function(value) {
				if(value == "true"){
					duongDanHienTai = window.location.href;
					duongDan = duongDanHienTai.replace("/dangnhap","");
					window.location = duongDan;
				} else {
					$("#ketqua").append("Đăng nhập thất bại!");
				}
			}
		})
	});
	
})