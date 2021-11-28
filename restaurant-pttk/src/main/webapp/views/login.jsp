<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<link href="css/login.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" />
</head>
<body>


	<!------ Include the above in your HEAD tag ---------->

	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-pic js-tilt" data-tilt>
					<img src="https://colorlib.com/etc/lf/Login_v1/images/img-01.png"
						alt="IMG">
				</div>

				<form action="../Login" cclass="login100-form validate-form" method="post">
					<span class="login100-form-title" style="font-size: 40px"><i class="fas fa-utensils" style="font-size: 50px"></i>   Restaurant </span>

					<div class="wrap-input100 validate-input"
						data-validate="Valid email is required: ex@abc.xyz">
						<input class="input100" type="text" name="username"
							placeholder="Username" required="required"> <span class="focus-input100"></span>
						<span class="symbol-input100"> <i class="fa fa-envelope"
							aria-hidden="true"></i>
						</span>
					</div>

					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<input class="input100" type="password" name="password"
							placeholder="Password" required="required"> <span class="focus-input100"></span>
						<span class="symbol-input100"> <i class="fa fa-lock"
							aria-hidden="true"></i>
						</span>
					</div>

					<div class="container-login100-form-btn">
						<button class="login100-form-btn">Login</button>
					</div>

					<div class="text-center p-t-12">
						<span class="txt1"> Forgot </span> <a class="txt2" href="#">
							Username / Password? </a>
					</div>

					<div class="text-center p-t-136">
						<a class="txt2" href="#"> Create your Account <i
							class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="js/login.js"></script>
	<!-- <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->
</body>
</html>