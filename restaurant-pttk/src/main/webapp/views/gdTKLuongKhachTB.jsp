<%@page import="com.restaurant.model.*"%>
<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Dashboard">
<meta name="keyword"
	content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
<title>Dashio - Bootstrap Admin Template</title>

<!-- Favicons -->
<link href="img/favicon.png" rel="icon">
<link href="img/apple-touch-icon.png" rel="apple-touch-icon">

<!-- Bootstrap core CSS -->
<link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!--external css-->
<link href="lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="css/zabuto_calendar.css">
<link rel="stylesheet" type="text/css"
	href="lib/gritter/css/jquery.gritter.css" />
<!-- Custom styles for this template -->
<link href="css/style.css" rel="stylesheet">
<link href="css/style-responsive.css" rel="stylesheet">
<script src="lib/chart-master/Chart.js"></script>
<style>
#customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}

td {
	text-align: center;
}

th {
	text-align: center !important;
}
</style>

</head>

<body>
	<section id="container">
		<!-- **********************************************************************************************************************************************************
        TOP BAR CONTENT & NOTIFICATIONS
        *********************************************************************************************************************************************************** -->
		<!--header start-->
		<header class="header black-bg">
			<div class="sidebar-toggle-box">
				<div class="fa fa-bars tooltips" data-placement="right"
					data-original-title="Toggle Navigation"></div>
			</div>
			<!--logo start-->
			<a href="index.html" class="logo"><b>S<span>M</span>S
			</b></a>
			<!--logo end-->
			<div class="nav notify-row" id="top_menu">
				<!--  notification start -->
				<ul class="nav top-menu">
					<!-- settings start -->
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="index.html#"> <i
							class="fa fa-tasks"></i> <span class="badge bg-theme">4</span>
					</a>
						<ul class="dropdown-menu extended tasks-bar">
							<div class="notify-arrow notify-arrow-green"></div>
							<li>
								<p class="green">You have 4 pending tasks</p>
							</li>
							<li><a href="index.html#">
									<div class="task-info">
										<div class="desc">Dashio Admin Panel</div>
										<div class="percent">20%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-success"
											role="progressbar" aria-valuenow="40" aria-valuemin="0"
											aria-valuemax="100" style="width: 40%">
											<span class="sr-only">40% Complete (success)</span>
										</div>
									</div>
							</a></li>
							<li><a href="index.html#">
									<div class="task-info">
										<div class="desc">Database Update</div>
										<div class="percent">60%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-warning"
											role="progressbar" aria-valuenow="60" aria-valuemin="0"
											aria-valuemax="100" style="width: 60%">
											<span class="sr-only">60% Complete (warning)</span>
										</div>
									</div>
							</a></li>
							<li><a href="index.html#">
									<div class="task-info">
										<div class="desc">Product Development</div>
										<div class="percent">80%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-info" role="progressbar"
											aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"
											style="width: 80%">
											<span class="sr-only">80% Complete</span>
										</div>
									</div>
							</a></li>
							<li><a href="index.html#">
									<div class="task-info">
										<div class="desc">Payments Sent</div>
										<div class="percent">70%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-danger"
											role="progressbar" aria-valuenow="70" aria-valuemin="0"
											aria-valuemax="100" style="width: 70%">
											<span class="sr-only">70% Complete (Important)</span>
										</div>
									</div>
							</a></li>
							<li class="external"><a href="#">See All Tasks</a></li>
						</ul></li>
					<!-- settings end -->
					<!-- inbox dropdown start-->
					<li id="header_inbox_bar" class="dropdown"><a
						data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
							<i class="fa fa-envelope-o"></i> <span class="badge bg-theme">5</span>
					</a>
						<ul class="dropdown-menu extended inbox">
							<div class="notify-arrow notify-arrow-green"></div>
							<li>
								<p class="green">You have 5 new messages</p>
							</li>
							<li><a href="index.html#"> <span class="photo"><img
										alt="avatar" src="img/ui-zac.jpg"></span> <span class="subject">
										<span class="from">Zac Snider</span> <span class="time">Just
											now</span>
								</span> <span class="message"> Hi mate, how is everything? </span>
							</a></li>
							<li><a href="index.html#"> <span class="photo"><img
										alt="avatar" src="img/ui-divya.jpg"></span> <span
									class="subject"> <span class="from">Divya Manian</span>
										<span class="time">40 mins.</span>
								</span> <span class="message"> Hi, I need your help with this. </span>
							</a></li>
							<li><a href="index.html#"> <span class="photo"><img
										alt="avatar" src="img/ui-danro.jpg"></span> <span
									class="subject"> <span class="from">Dan Rogers</span> <span
										class="time">2 hrs.</span>
								</span> <span class="message"> Love your new Dashboard. </span>
							</a></li>
							<li><a href="index.html#"> <span class="photo"><img
										alt="avatar" src="img/ui-sherman.jpg"></span> <span
									class="subject"> <span class="from">Dj Sherman</span> <span
										class="time">4 hrs.</span>
								</span> <span class="message"> Please, answer asap. </span>
							</a></li>
							<li><a href="index.html#">See all messages</a></li>
						</ul></li>
					<!-- inbox dropdown end -->
					<!-- notification dropdown start-->
					<li id="header_notification_bar" class="dropdown"><a
						data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
							<i class="fa fa-bell-o"></i> <span class="badge bg-warning">7</span>
					</a>
						<ul class="dropdown-menu extended notification">
							<div class="notify-arrow notify-arrow-yellow"></div>
							<li>
								<p class="yellow">You have 7 new notifications</p>
							</li>
							<li><a href="index.html#"> <span
									class="label label-danger"><i class="fa fa-bolt"></i></span>
									Server Overloaded. <span class="small italic">4 mins.</span>
							</a></li>
							<li><a href="index.html#"> <span
									class="label label-warning"><i class="fa fa-bell"></i></span>
									Memory #2 Not Responding. <span class="small italic">30
										mins.</span>
							</a></li>
							<li><a href="index.html#"> <span
									class="label label-danger"><i class="fa fa-bolt"></i></span>
									Disk Space Reached 85%. <span class="small italic">2
										hrs.</span>
							</a></li>
							<li><a href="index.html#"> <span
									class="label label-success"><i class="fa fa-plus"></i></span>
									New User Registered. <span class="small italic">3 hrs.</span>
							</a></li>
							<li><a href="index.html#">See all notifications</a></li>
						</ul></li>
					<!-- notification dropdown end -->
				</ul>
				<!--  notification end -->
			</div>
			<div class="top-menu">
				<ul class="nav pull-right top-menu">
					<li><a class="logout" href="login.jsp">Logout</a></li>
				</ul>
			</div>
		</header>
		<!--header end-->
		<!-- **********************************************************************************************************************************************************
        MAIN SIDEBAR MENU
        *********************************************************************************************************************************************************** -->
		<!--sidebar start-->
		<aside>
			<div id="sidebar" class="nav-collapse ">
				<!-- sidebar menu start-->
				<ul class="sidebar-menu" id="nav-accordion">
					<p class="centered">
						<a href="profile.html"><img src="img/ui-sam.jpg"
							class="img-circle" width="80"></a>
					</p>
					<h5 class="centered">Thanh hải</h5>
					<li class="sub-menu"><a href="javascript:;"> <i
							class=" fa fa-bar-chart-o"></i> <span>Xem thống kê</span>
					</a>
						<ul class="sub">
							<li><a href="505.html">Doanh thu theo tháng</a></li>
							<li><a href="505.html">Khách TB theo giờ</a></li>
							<li><a href="505.html">Doanh chi theo NCC</a></li>
							<li><a href="505.html">Món ăn theo doanh thu</a></li>
						</ul></li>
					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-desktop"></i> <span>Quản lí</span>
					</a>
						<ul class="sub">
							<li><a href="505.html">món ăn</a></li>
							<li><a href="505.html">Combo</a></li>
							<li><a href="505.html">Nhân viên</a></li>
							<li><a href="505.html">Nhà cung cấp</a></li>
						</ul></li>
					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-cogs"></i> <span>Cài đặt</span>
					</a>
						<ul class="sub">
							<li><a href="505.html">Grids</a></li>
							<li><a href="505.html">Calendar</a></li>
							<li><a href="505.html">Gallery</a></li>
							<li><a href="505.html">Todo List</a></li>
							<li><a href="505.html">Dropzone File Upload</a></li>
							<li><a href="505.html">Inline Editor</a></li>
							<li><a href="505.html">Multiple File Upload</a></li>
						</ul></li>
					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-book"></i> <span>Nguyên liệu</span>
					</a>
						<ul class="sub">
							<li><a href="500.html">Blank Page</a></li>
							<li><a href="500.html">Login</a></li>
							<li><a href="500.html">Lock Screen</a></li>
							<li><a href="500.html">Profile</a></li>
							<li><a href="500.html">Invoice</a></li>
							<li><a href="500.html">Pricing Table</a></li>
							<li><a href="500.html">FAQ</a></li>
							<li><a href="404.html">404 Error</a></li>
							<li><a href="500.html">500 Error</a></li>
						</ul></li>
					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-tasks"></i> <span>Công thức</span>
					</a>
						<ul class="sub">
							<li><a href="500.html">Form Components</a></li>
							<li><a href="500.html">Advanced Components</a></li>
							<li><a href="500.html">Form Validation</a></li>
							<li><a href="500.html">Contact Form</a></li>
						</ul></li>
					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-th"></i> <span>Bàn ăn</span>
					</a>
						<ul class="sub">
							<li><a href="500.html">Basic Table</a></li>
							<li><a href="500.html">Responsive Table</a></li>
							<li><a href="500.html">Advanced Table</a></li>
						</ul></li>
					<li><a href="inbox.html"> <i class="fa fa-envelope"></i> <span>Thông
								báo </span> <span class="label label-theme pull-right mail-info">2</span>
					</a></li>

					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-comments-o"></i> <span>Tin nhắn</span>
					</a>
						<ul class="sub">
							<li><a href="lobby.html">Lobby</a></li>
							<li><a href="chat_room.html"> Chat Room</a></li>
						</ul></li>
					<li><a href="google_maps.html"> <i
							class="fa fa-map-marker"></i> <span>Bản đồ </span>
					</a></li>
				</ul>
				<!-- sidebar menu end-->

			</div>
		</aside>
		<!--sidebar end-->
		<!-- **********************************************************************************************************************************************************
        MAIN CONTENT
        *********************************************************************************************************************************************************** -->
		<!--main content start-->
		<% 
			TKDoanhThu tk7h = (TKDoanhThu) session.getAttribute("7h");
			TKDoanhThu tk8h = (TKDoanhThu) session.getAttribute("8h");
			TKDoanhThu tk9h = (TKDoanhThu) session.getAttribute("9h");
			TKDoanhThu tk10h = (TKDoanhThu) session.getAttribute("10h");
			TKDoanhThu tk11h = (TKDoanhThu) session.getAttribute("11h");
			TKDoanhThu tk12h = (TKDoanhThu) session.getAttribute("12h");
			TKDoanhThu tk13h = (TKDoanhThu) session.getAttribute("13h");
			TKDoanhThu tk14h = (TKDoanhThu) session.getAttribute("14h");
			TKDoanhThu tk15h = (TKDoanhThu) session.getAttribute("15h");
			TKDoanhThu tk16h = (TKDoanhThu) session.getAttribute("16h");
			TKDoanhThu tk17h = (TKDoanhThu) session.getAttribute("17h");
			TKDoanhThu tk18h = (TKDoanhThu) session.getAttribute("18h");
			TKDoanhThu tk19h = (TKDoanhThu) session.getAttribute("19h");
			TKDoanhThu tk20h = (TKDoanhThu) session.getAttribute("20h");
			
			DecimalFormat formatter = new DecimalFormat("###,###,###");
			String ngayStart = (String) session.getAttribute("ngayStart");
			String ngayEnd = (String) session.getAttribute("ngayEnd");
		%>
		<section id="main-content">
			<section class="wrapper">
				<div class="row">
					<div style="padding: 20px 20px 0px 20px;">
						<h2 style="text-align: center;">Thống kê lượng khách theo
							khung giờ</h2>
						<span><h4>Ngày <%=ngayStart%> -> <%=ngayEnd %></h4></span>
						<form action="../TKLuongKhachTBController" method="post">
							<label for="birthday">Ngày bắt đầu:</label> <input type="date"
								id="birthday" name="ngayStart" required="required"> <label for="birthday">Ngày
								kết thúc:</label> <input type="date" id="birthday" name="ngayEnd" required="required">
							<button type="submit"
								style="margin-left: 20px; background: #04AA6D; color: white">Xem
								thống kê</button>
						</form>
					</div>
					<div style="padding: 20px">
						<table id="customers">
							<tr>
								<th>Các khung giờ</th>
								<th>Lượng khách</th>
								<th>Lượng khách Trung bình</th>
								<th>Doanh thu / Đầu khách</th>
								<th>Doanh thu tổng</th>
							</tr>
							<tr>
								<td><a href="../TKKhungGioController?kg=7&ngayStart=<%=ngayStart%>&ngayEnd=<%=ngayEnd%>>">7h</a></td>
								<td><%=tk7h.getLuongKhach() %></td>
								<td><%=tk7h.getLuongKhachTB() %></td>
								<td><%=formatter.format(tk7h.getDoanhThuTrenMotKhach()) %> vnđ</td>
								<td><%=formatter.format(tk7h.getDoanhThuTong()) %> vnđ</td>
							</tr>
							<tr>
								<td><a href="../TKKhungGioController?kg=8&ngayStart=<%=ngayStart%>&ngayEnd=<%=ngayEnd%>>">8h</a></td>
								<td><%=tk8h.getLuongKhach() %></td>
								<td><%=tk8h.getLuongKhachTB() %></td>
								<td><%=formatter.format(tk8h.getDoanhThuTrenMotKhach()) %> vnđ</td>
								<td><%=formatter.format(tk8h.getDoanhThuTong()) %> vnđ</td>
							</tr>
							<tr>
								<td><a href="../TKKhungGioController?kg=9&ngayStart=<%=ngayStart%>&ngayEnd=<%=ngayEnd%>>">9h</a></td>
								<td><%=tk9h.getLuongKhach() %></td>
								<td><%=tk9h.getLuongKhachTB() %></td>
								<td><%=formatter.format(tk9h.getDoanhThuTrenMotKhach()) %> vnđ</td>
								<td><%=formatter.format(tk9h.getDoanhThuTong()) %> vnđ</td>
							</tr>
							<tr>
								<td><a href="../TKKhungGioController?kg=10&ngayStart=<%=ngayStart%>&ngayEnd=<%=ngayEnd%>>">10h</a></td>
								<td><%=tk10h.getLuongKhach() %></td>
								<td><%=tk10h.getLuongKhachTB() %></td>
								<td><%=formatter.format(tk10h.getDoanhThuTrenMotKhach()) %> vnđ</td>
								<td><%=formatter.format(tk10h.getDoanhThuTong()) %> vnđ</td>
							</tr>
							<tr>
								<td><a href="../TKKhungGioController?kg=11&ngayStart=<%=ngayStart%>&ngayEnd=<%=ngayEnd%>>">11h</a></td>
								<td><%=tk11h.getLuongKhach() %></td>
								<td><%=tk11h.getLuongKhachTB() %></td>
								<td><%=formatter.format(tk11h.getDoanhThuTrenMotKhach()) %> vnđ</td>
								<td><%=formatter.format(tk11h.getDoanhThuTong()) %> vnđ</td>
							</tr>
							<tr>
								<td><a href="../TKKhungGioController?kg=12&ngayStart=<%=ngayStart%>&ngayEnd=<%=ngayEnd%>>">12h</a></td>
								<td><%=tk12h.getLuongKhach() %></td>
								<td><%=tk12h.getLuongKhachTB() %></td>
								<td><%=formatter.format(tk12h.getDoanhThuTrenMotKhach()) %> vnđ</td>
								<td><%=formatter.format(tk12h.getDoanhThuTong()) %> vnđ</td>
							</tr>
							<tr>
								<td><a href="../TKKhungGioController?kg=13&ngayStart=<%=ngayStart%>&ngayEnd=<%=ngayEnd%>>">13h</a></td>
								<td><%=tk13h.getLuongKhach() %></td>
								<td><%=tk13h.getLuongKhachTB() %></td>
								<td><%=formatter.format(tk13h.getDoanhThuTrenMotKhach()) %> vnđ</td>
								<td><%=formatter.format(tk13h.getDoanhThuTong()) %> vnđ</td>
							</tr>
							<tr>
								<td><a href="../TKKhungGioController?kg=14&ngayStart=<%=ngayStart%>&ngayEnd=<%=ngayEnd%>>">14h</a></td>
								<td><%=tk14h.getLuongKhach() %></td>
								<td><%=tk14h.getLuongKhachTB() %></td>
								<td><%=formatter.format(tk14h.getDoanhThuTrenMotKhach()) %> vnđ</td>
								<td><%=formatter.format(tk14h.getDoanhThuTong()) %> vnđ</td>
							</tr>
							<tr>
								<td><a href="../TKKhungGioController?kg=15&ngayStart=<%=ngayStart%>&ngayEnd=<%=ngayEnd%>>">15h</a></td>
								<td><%=tk15h.getLuongKhach() %></td>
								<td><%=tk15h.getLuongKhachTB() %></td>
								<td><%=formatter.format(tk15h.getDoanhThuTrenMotKhach()) %> vnđ</td>
								<td><%=formatter.format(tk15h.getDoanhThuTong()) %> vnđ</td>
							</tr>
							<tr>
								<td><a href="../TKKhungGioController?kg=16&ngayStart=<%=ngayStart%>&ngayEnd=<%=ngayEnd%>>">16h</a></td>
								<td><%=tk16h.getLuongKhach() %></td>
								<td><%=tk16h.getLuongKhachTB() %></td>
								<td><%=formatter.format(tk16h.getDoanhThuTrenMotKhach()) %> vnđ</td>
								<td><%=formatter.format(tk16h.getDoanhThuTong()) %> vnđ</td>
							</tr>
							<tr>
								<td><a href="../TKKhungGioController?kg=17&ngayStart=<%=ngayStart%>&ngayEnd=<%=ngayEnd%>>">17h</a></td>
								<td><%=tk17h.getLuongKhach() %></td>
								<td><%=tk17h.getLuongKhachTB() %></td>
								<td><%=formatter.format(tk17h.getDoanhThuTrenMotKhach()) %> vnđ</td>
								<td><%=formatter.format(tk17h.getDoanhThuTong()) %> vnđ</td>
							</tr>
							<tr>
								<td><a href="../TKKhungGioController?kg=18&ngayStart=<%=ngayStart%>&ngayEnd=<%=ngayEnd%>>">18h</a></td>
								<td><%=tk18h.getLuongKhach() %></td>
								<td><%=tk18h.getLuongKhachTB() %></td>
								<td><%=formatter.format(tk18h.getDoanhThuTrenMotKhach()) %> vnđ</td>
								<td><%=formatter.format(tk18h.getDoanhThuTong()) %> vnđ</td>
							</tr>
							<tr>
								<td><a href="../TKKhungGioController?kg=19&ngayStart=<%=ngayStart%>&ngayEnd=<%=ngayEnd%>>">19h</a></td>
								<td><%=tk19h.getLuongKhach() %></td>
								<td><%=tk19h.getLuongKhachTB() %></td>
								<td><%=formatter.format(tk19h.getDoanhThuTrenMotKhach()) %> vnđ</td>
								<td><%=formatter.format(tk19h.getDoanhThuTong()) %> vnđ</td>
							</tr>
							<tr>
								<td><a href="../TKKhungGioController?kg=20&ngayStart=<%=ngayStart%>&ngayEnd=<%=ngayEnd%>>">20h</a></td>
								<td><%=tk20h.getLuongKhach() %></td>
								<td><%=tk20h.getLuongKhachTB() %></td>
								<td><%=formatter.format(tk20h.getDoanhThuTrenMotKhach()) %> vnđ</td>
								<td><%=formatter.format(tk20h.getDoanhThuTong()) %> vnđ</td>
							</tr>
						</table>

					</div>
				</div>
				<!-- /row -->
			</section>
		</section>
		<!--main content end-->
		<!--footer start-->
		<footer class="site-footer">
			<div class="text-center"></div>
		</footer>
		<!--footer end-->
	</section>
	<!-- js placed at the end of the document so the pages load faster -->
	<script src="lib/jquery/jquery.min.js"></script>

	<script src="lib/bootstrap/js/bootstrap.min.js"></script>
	<script class="include" type="text/javascript"
		src="lib/jquery.dcjqaccordion.2.7.js"></script>
	<script src="lib/jquery.scrollTo.min.js"></script>
	<script src="lib/jquery.nicescroll.js" type="text/javascript"></script>
	<script src="lib/jquery.sparkline.js"></script>
	<!--common script for all pages-->
	<script src="lib/common-scripts.js"></script>
	<script type="text/javascript" src="lib/gritter/js/jquery.gritter.js"></script>
	<script type="text/javascript" src="lib/gritter-conf.js"></script>
	<!--script for this page-->
	<script src="lib/sparkline-chart.js"></script>
	<script src="lib/zabuto_calendar.js"></script>
	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							var unique_id = $.gritter
									.add({
										// (string | mandatory) the heading of the notification
										title : 'Welcome to Thanh Hải!',
										// (string | mandatory) the text inside the notification
										text : 'Hover me to enable the Close Button. You can hide the left sidebar clicking on the button next to the logo.',
										// (string | optional) the image to display on the left
										image : 'img/ui-sam.jpg',
										// (bool | optional) if you want it to fade out on its own or just sit there
										sticky : false,
										// (int | optional) the time you want it to be alive for before fading out
										time : 8000,
										// (string | optional) the class name you want to apply to that specific message
										class_name : 'my-sticky-class'
									});

							return false;
						});
	</script>
	<script type="application/javascript">
		
		
		
		
    $(document).ready(function() {
      $("#date-popover").popover({
        html: true,
        trigger: "manual"
      });
      $("#date-popover").hide();
      $("#date-popover").click(function(e) {
        $(this).hide();
      });

      $("#my-calendar").zabuto_calendar({
        action: function() {
          return myDateFunction(this.id, false);
        },
        action_nav: function() {
          return myNavFunction(this.id);
        },
        ajax: {
          url: "show_data.php?action=1",
          modal: true
        },
        legend: [{
            type: "text",
            label: "Special event",
            badge: "00"
          },
          {
            type: "block",
            label: "Regular event",
          }
        ]
      });
    });

    function myNavFunction(id) {
      $("#date-popover").hide();
      var nav = $("#" + id).data("navigation");
      var to = $("#" + id).data("to");
      console.log('nav ' + nav + ' to: ' + to.month + '/' + to.year);
    }
  
	
	
	
	</script>
</body>

</html>

