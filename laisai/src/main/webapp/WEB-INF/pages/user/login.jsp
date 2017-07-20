<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<script type="text/javascript" src="${path }/bootstrap/js/jquery.min.js"></script>
	<script type="text/javascript"
		src="${path }/bootstrap/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="${path }/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="${path }/css/login.css">
	<title><spring:message code="userLogin"></spring:message></title>
</head>
<body background="../img/newteambg.png">
	<div class="container">
		<div class="col-md-12 col-sm-12 col-xs-12 col-lg-12">
			<div class="col-md-11 col-sm-11 col-xs-11 col-lg-11 text-right" id="language">
				<a href="${path }/user/loginlang.action?locale=zh"
					style="color: white; font-size: 15px">中文&nbsp;</a>| &nbsp;<a
					href="${path }/user/loginlang.action?locale=en"
					style="color: white; font-size: 15px">English</a>
			</div>
			<div class="row">
				<div class="col-md-3 col-lg-3 hidden-sm hidden-xs"></div>
				<div class="col-md-6 col-lg-6 col-sm-12 col-xs-12 login-box">
					<div class="col-md-12 col-lg-12 col-sm-12 col-xs-12" id="login">
						<h1>
							<spring:message code="userLogin"></spring:message>
						</h1>
					</div>
					<div class="col-md-12 col-lg-12 col-sm-12 col-xs-12">
						<form class="form" action="checklogin.action" method="post"
							role="form">
							<div class="form-group col-md-12 col-sm-12 col-lg-12 col-xs-12">
								<label for="usermail"
									class="col-md-4 col-sm-6 col-lg-4 col-xs-6 control-label"
									style="padding-top: 6px; font-size: 20px; padding-left: 10px">
									<spring:message code="usermail">
									</spring:message>
								</label>
								<div class="col-md-8 col-lg-8 col-sm-12 col-xs-12">
									<input type="text" name="usermail" class="form-control"
										placeholder='<spring:message code="usermailInstruction"></spring:message>' />
								</div>
							</div>
							<div class="form-group col-md-12 col-sm-12 col-lg-12 col-xs-12">
								<label for="userpassword"
									class="col-md-4 col-sm-6 col-lg-4  col-xs-6 control-label"
									style="padding-top: 6px; font-size: 20px; padding-left: 10px">
									<spring:message code="userpassword"></spring:message>
								</label>
								<div class="col-md-8 col-lg-8 col-sm-12 col-xs-12">
									<input type="password" name="userpassword" class="form-control"
										placeholder='<spring:message code="userpassword_instruction"></spring:message>' />
								</div>
							</div>
							<div class="form-group col-md-12 col-sm-12 col-lg-12 col-xs-12">
								<div class="col-md-4 hidden-sm col-lg-4 hidden-xs"></div>
								<div class="col-md-8 col-sm-12 col-lg-8 col-xs-12" >
									<a href="${path }/user/forgetpassword.action" class="forger-password" style="color:black"><spring:message
										code="forget"></spring:message></a> | 
									<a href="${path }/user/toregister.action" style="color:black"><spring:message
										code="registerInstruction"></spring:message></a>
								</div>
							</div>
							<div class="col-md-12 col-sm-12 col-lg-12 col-xs-12">
								<div class="col-md-4 col-sm-12 col-lg-4 col-xs-12">
									<p class="error" style="font-size: 14px;padding-left:0;font-weight:bold;">${msg }</p>
								</div>
								<div class="col-md-8 col-sm-12 col-lg-8 col-xs-12">
									<input type="submit" class="btn btn-primary btn-block "
									value='<spring:message code="login"></spring:message>' /> 
								</div>
							</div>
						</form>
					</div>
				</div>
			<div class="col-md-3 col-lg-3 hidden-sm hidden-xs"></div>
			</div>
			
		</div>
	</div>
</body>
</html>