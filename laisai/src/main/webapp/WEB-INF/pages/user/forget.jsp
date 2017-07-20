<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<title><spring:message code="forget"></spring:message></title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<script type="text/javascript" src="${path }/bootstrap/js/jquery.min.js"></script>
	<script type="text/javascript" src="${path }/bootstrap/js/bootstrap.min.js" ></script>
	<link rel="stylesheet" href="${path }/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="${path }/css/reset.css">
	<link rel="stylesheet" type="text/css" href="${path }/css/global.css">
    <link rel="stylesheet" type="text/css" href="${path }/css/login_register.css">
	<link rel="stylesheet" type="text/css" href="${path }/css/font-awesome.min.css">
	<script type="text/javascript">
		function test(){
			var ids = $("#usermail").val();
			$.ajax({
				  url: "${path}/user/getCode.action",
				  type:"POST",
				  //设置为传统方式传送参数
				  //否则传的是pk[]
				  traditional:true,
				  data:{usermail:ids},
				  success: function(list){
					  alert("验证码已发送至" + ids);
					
				  },
				  error: function (html) {
					    
					},
				  dataType:'json'
				});
			}
	</script>
	<style>
		.error{
			color:rgba(0,0,0,.5);
		}
	</style>
</head>
<body>

    <!-- 中间部分 -->
    <div class="middle">
    	<!-- 背景盒子 -->
    	<div class="bg-box">
    		<div class="col-md-11 text-right" style="color: white">
				<a href="${path }/user/resetlang.action?locale=zh" style="color: white; font-size: 15px">中文&nbsp;</a>|
				&nbsp;<a href="${path }/user/resetlang.action?locale=en" style="color: white; font-size: 15px">English</a>
			</div>
    		<div class="row">
				<div class="col-md-3 col-lg-3 hidden-sm hidden-xs"></div>
				<div class="col-md-7 col-lg-7 register-box">
					<div class="col-md-12 col-lg-12 col-sm-12 register-title">
						<div class="col-md-8 col-lg-8 col-sm-8" style="text-align:center">
							<p>
								<spring:message code="forget"></spring:message>
							</p>
						</div>
						<div class="col-md-4 col-lg-4 col-sm-4"></div>
					</div>
					<div class="col-md-12 col-lg-12 col-sm-12">	
						<form:form class="form" action="doforgetpassword.action" modelAttribute="forgetModel" method="post" role="form" >
							<div class="form-group col-md-12">
								<label for="usermail" class="col-md-2 control-label" style="padding-top: 8px; font-size: 11px;">
									<spring:message code="usermail"></spring:message>
								</label>
								<div class="col-md-6">
									<input type="text" name="usermail" id="usermail" class="form-control" value="${validate.usermail }" placeholder='<spring:message code="registermail"></spring:message>' />
								</div>
								<div class="col-md-4">
									<span class="error"></span>
									<form:errors path="usermail" class="error"></form:errors>
								</div>
							</div>
							<div class="form-group col-md-12" >
								<label for="userpassword" class="col-md-2 control-label" style="padding-top: 8px; font-size: 11px;">
									<spring:message code="userpassword"></spring:message>
								</label>
								<div class="col-md-6">
									<input type="password" name="userpassword" class="form-control" id="uPassword" value="${validate.userpassword }" placeholder='<spring:message code="passwordset"></spring:message>' />
								</div>
								<div class="col-md-4">
									<span class="error"></span>
									<form:errors path="userpassword" class="error"></form:errors>
								</div>
							</div>
							<div class="form-group col-md-12">
								<label for="checkpassword" class="col-md-2 control-label" style="padding-top: 8px; font-size: 11px;">
									<spring:message code="confirmPassword"></spring:message>
								</label>
								<div class="col-md-6">
									<input type="password" name="checkpassword" class="form-control" id="uPasswordAgain" value="${validate.checkpassword }" placeholder='<spring:message code="passwordconfirm"></spring:message>' />
								</div>
								<div class="col-md-4">
									<span class="error"></span>
									<form:errors path="checkpassword" class="error"></form:errors>
								</div>
							</div>
							<div class="form-group col-md-12">
								<label for="mailyanzhengma" class="col-md-2 control-label" style="padding-top: 8px; font-size: 11px;">
									<spring:message code="mailyanzhengma"></spring:message>
								</label>
								<div class="col-md-6">
									<span><input type="text" name="mailyanzhengma" class="form-control" id="codes_2" style="float:left;width:70%" value="${emailCode }"placeholder='<spring:message code="mailyzmInstruct"></spring:message>' />
									<input type="button" class="btn btn-primary" value='<spring:message code="getCode"></spring:message>' onclick='test()' style="display: block; width: 30%;
    height: 34px;
    padding: 6px 12px;
    font-size: 14px;
    line-height: 1.42857143;
    border: 1px solid #ccc;
    border-radius: 4px;float:left"/></span>
								</div>
								<div class="col-md-4">
									<span class="error"></span>
									<form:errors path="mailyanzhengma" class="error"></form:errors>
								</div>
							</div>
							<input type="submit" class="btn btn-success col-md-offset-3" id="tijiaoBtn" value='<spring:message code="submit"></spring:message>' />
							<input type="reset" class="btn btn-primary col-md-offset-1" value='<spring:message code="reset"></spring:message>' />
							&nbsp;&nbsp;<a href="${path }/user/login.action"><spring:message code="clickhere"></spring:message></a>
							<p style="color:red;">${passwordNotMatch }</p>
							<p style="color:red;">${yanzhengmaNotMatch }</p>
							<p style="color:red;">${message }
						</form:form>
					</div>
				</div>
			</div>
    	</div>
    </div>
    <script type="text/javascript" src="${path }/js/register.js"></script>
</body>
</html>