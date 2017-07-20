<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>信息完善</title>
		<script type="text/javascript" src="${path }/bootstrap/js/jquery.min.js" ></script>
		<script type="text/javascript" src="${path }/bootstrap/js/bootstrap.min.js" ></script>
		<link rel="stylesheet" href="${path }/bootstrap/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="${path }/css/reset.css">
		<link rel="stylesheet" type="text/css" href="${path }/css/global.css">
	    <link rel="stylesheet" type="text/css" href="${path }/css/nav_footer.css">
	    <link rel="stylesheet" type="text/css" href="${path }/css/changeInformation.css">
		<link rel="stylesheet" type="text/css" href="${path }/css/font-awesome.min.css">
		<style>
			.error{
				color:rgba(0,0,0,1);
			}
		</style>
	</head>
	<body>
		<div class="middle">
	    	<div class="white-box clearfix">
	            <div class="left-box">
	                <h2>来赛</h2>
	                <ul>
	                    <li>
	                        <a href="${path }/user/checkgeren.action">
	                            <i class="fa fa-user" aria-hidden="true"></i>
	                            <span>个人</span>
	                        </a>
	                    </li>
	                    <li>
	                        <a href="${path }/user/checkxunsai.action">
	                            <i class="fa fa-trophy" aria-hidden="true"></i>
	                            <span>寻赛</span>
	                        </a>
	                    </li>
	                    <li>
	                        <a href="${path }/user/checkzutuan.action">
	                            <i class="fa fa-user-plus" aria-hidden="true"></i>
	                            <span>组团</span>
	                        </a>
	                    </li>
	                    <li>
	                        <a href="${path }/user/checkduiwu.action">
	                            <i class="fa fa-users" aria-hidden="true"></i>
	                            <span>队伍</span>
	                        </a>
	                    </li>
	                    <li>
	                        <a href="${path }/user/checktongzhi.action">
	                            <i class="fa fa-commenting" aria-hidden="true"></i>
	                            <span>通知</span>
	                        </a>
	                    </li>
	                    <li>
	                        <a href="${path }/user/logout.action" class="return">
	                            <i class="fa fa-undo" aria-hidden="true"></i>
	                            <span>注销</span>
	                        </a>
	                    </li>
	                </ul>
	            </div>
	
	            <div class="right-box">
	                <div style="padding-top:10px">
	                	<div class="col-md-12 col-sm-12 col-lg-12" style="margin-bottom:10px">
	                		<h1 style="text-align:center;font-size:20px;padding-bottom:5px">个人信息完善</h1>
	                		<h2 style="letter-spacing:2px;font-weight:bolder;color:red"><span class="glyphicon glyphicon-star"></span>温馨提示：为方便老师的后续管理，需完善个人信息后才能进行其他操作，感谢您的支持！</h2>
	                	</div>
		                <form:form class="form" action="doupdateuser.action" modelAttribute="userInfoModel" method="post" enctype="multipart/form-data" role="form" >
			                <div class="row">
				                <div class="col-md-6 col-lg-6">
									<div class="col-md-12 col-lg-12">
					                	<div class="form-group row">
					                		<label for="usertruename" class="control-label col-md-3 col-lg-3" style="padding-top: 6px; text-align:right; letter-spacing:2px">
					                			真实姓名：
					                		</label>
					                		<div class="col-md-6 col-lg-6">
					                			<input type="text" name="usertruename" class="form-control" id="userName" value="${userInfoValidate.usertruename }" placeholder="请输入真实姓名"/>
					                		</div>
					                		<div class="col-md-3 col-lg-3" style="padding-left:0px;">
					                			<span class="error"></span>
					                			<form:errors path="usertruename" class="error"></form:errors>
					                		</div>
					                	</div>
					                	<div class="form-group row">
					                		<label for="userpinyin" class="control-label col-md-3 col-lg-3" style="padding-top: 6px; text-align:right; letter-spacing:2px">
					                			姓名的拼音：
					                		</label>
					                		<div class="col-md-6 col-lg-6">
					                			<input type="text" name="userpinyin" class="form-control" id="userpingyin" value="${userInfoValidate.userpinyin }" placeholder="请输入姓名的拼音"/>
					                		</div>
					                		<div class="col-md-3 col-lg-3" style="padding-left:0px;">
					                			<span class="error"></span>
					                			<form:errors path="userpinyin" class="error"></form:errors>
					                		</div>
					                	</div>
					                	<div class="form-group row">
					                		<label for="userschool" class="control-label col-md-3 col-lg-3" style="padding-top: 6px; text-align:right; letter-spacing:2px">
					                			学校：
					                		</label>
					                		<div class="col-md-6 col-lg-6">
					                			<input type="text" name="userschool" class="form-control" id="schoolName" value="广东工业大学"/>
					                		</div>
					                		<div class="col-md-3 col-lg-3" style="padding-left:0px;">
					                			<span class="error"></span>
					                			<form:errors path="userschool" class="error"></form:errors>
					                		</div>
					                	</div>
					                	<div class="form-group row">
					                		<label for="userdepartment" class="control-label col-md-3 col-lg-3" style="padding-top: 6px; text-align:right; letter-spacing:2px">
					                			学院：
					                		</label>
					                		<div class="col-md-6 col-lg-6">
					                			<input type="text" name="userdepartment" class="form-control" id="collegeName" value="${userInfoValidate.userdepartment }" placeholder="请输入学院名称"/>
					                		</div>
					                		<div class="col-md-3 col-lg-3" style="padding-left:0px;">
					                			<span class="error"></span>
					                			<form:errors path="userdepartment" class="error"></form:errors>
					                		</div>
					                	</div>
					                	<div class="form-group row">
					                		<label for="usermajor" class="control-label col-md-3 col-lg-3" style="padding-top: 6px; text-align:right; letter-spacing:2px">
					                			专业：
					                		</label>
					                		<div class="col-md-6 col-lg-6">
					                			<input type="text" name="usermajor" class="form-control" id="zhuanyeName" value="${userInfoValidate.usermajor }" placeholder="请输入专业名称"/>
					                		</div>
					                		<div class="col-md-3 col-lg-3" style="padding-left:0px;">
					                			<span class="error"></span>
					                			<form:errors path="usermajor" class="error"></form:errors>
					                		</div>
					                	</div>
					                	<div class="form-group row">
					                		<label for="userstudentnumber" class="control-label col-md-3 col-lg-3" style="padding-top: 6px; text-align:right; letter-spacing:2px">
					                			学号：
					                		</label>
					                		<div class="col-md-6 col-lg-6">
					                			<input type="text" name="userstudentnumber" class="form-control" id="studentNumber" value="${userInfoValidate.userstudentnumber }" placeholder="请输入学号"/>
					                		</div>
					                		<div class="col-md-3 col-lg-3" style="padding-left:0px;">
					                			<span class="error"></span>
					                			<form:errors path="userstudentnumber" class="error"></form:errors>
					                		</div>
					                	</div>
					                	<div class="form-group row">
					                		<label for="usersex" class="col-md-3 control-label" style="padding-top: 6px; text-align:right; letter-spacing:2px">
					                			性别：
					                		</label>
					                		<div class="col-md-6">
					                			<label class="radio-inline">
					                				<input type="radio" name="usersex" value="男" checked />男
					                			</label>
					                			<label class="radio-inline">
					                				<input type="radio" name="usersex" value="女" />女
					                			</label>
					                		</div>
					                		<div class="col-md-3" style="padding-left:0px;">
					                			<form:errors path="usersex" class="error"></form:errors>
					                		</div>
					                	</div>
					                	<div class="form-group row">
					                		<label for="usergrade" class="col-md-3 control-label" style="padding-top: 6px; text-align:right; letter-spacing:2px">
					                			年级：
					                		</label>
					                		<div class="col-md-6 col-lg-6">
					                			<select name="usergrade" class="form-control">
					                				<option  value="大一" selected>大一</option>
					                				<option value="大二">大二</option>
					                				<option value="大三">大三</option>
					                				<option value="大四">大四</option>
					                				<option value="研一">研一</option>
					                				<option value="研二">研二</option>
					                			</select>
					                		</div>
					                		<div class="col-md-3 col-lg-3" style="padding-left:0px;">
					                			<form:errors path="usergrade" class="error"></form:errors>
					                		</div>
					                	</div>
				                	</div>
				            	</div>
				            	<div class="col-md-6 col-lg-6">
				            		<div class="col-md-12 col-lg-12">
					            		<div class="form-group row">
					                		<label for="usertel" class="control-label col-md-3 col-lg-3" style="padding-top: 6px; text-align:right; letter-spacing:2px">
					                			手机号码：
					                		</label>
					                		<div class="col-md-6 col-lg-6">
					                			<input type="text" name="usertel" class="form-control" id="phoneNumber" value="${userInfoValidate.usertel }" placeholder="请输入手机号码"/>
					                		</div>
					                		<div class="col-md-3 col-lg-3" style="padding-left:0px;">
					                			<span class="error"></span>
					                			<form:errors path="usertel" class="error"></form:errors>
					                		</div>
					                	</div>
					                	<div class="form-group row">
					                		<label for="userproperty" class="col-md-3 control-label" style="padding-top: 6px; text-align:right; letter-spacing:2px">
					                			意向职能：
					                		</label>
					                		<div class="col-md-6 col-lg-6">
					                			<label class="checkbox-inline">
					                				<input type="checkbox" name="userproperty" id="jianmo" value="建模" />建模
					                			</label>
					                			<label class="checkbox-inline">
					                				<input type="checkbox" name="userproperty" id="biancheng" value="编程" />编程
					                			</label>
					                			<label class="checkbox-inline">
					                				<input type="checkbox" name="userproperty" id="xiezuo" value="写作" />写作
					                			</label>
					                		</div>
					                		<div class="col-md-3 col-lg-3" style="padding-left:0px;">
					                			<span class="error"></span>
					                			<form:errors path="userproperty" class="error"></form:errors>
					                		</div>
						                	</div>
					                	<div class="form-group row">
					                		<label for="userintroduce" class="control-label col-md-3 col-lg-3" style="padding-top: 6px; text-align:right; letter-spacing:2px">
					                			个人简介：
					                		</label>
					                		<div class="col-md-6 col-lg-6">
					                			<textarea name="userintroduce" class="form-control" id="userIntroduce" maxlength="100" rows="4" placeholder="填写不能为空">${userInfoValidate.userintroduce }</textarea>
					                		</div>
					                		<div class="col-md-3 col-lg-3 error">
					                			<span class="error"></span>
					                			${textareaMess }
					                		</div>
					                	</div>
					                	<div class="form-group row">
					                		<label for="file" class="control-label col-md-3 col-lg-3" style="padding-top: 6px; text-align:right; letter-spacing:2px">
					                			头像上传<br>(可选)：
					                		</label>
					                		<div class="col-md-7 col-lg-7">
					                			<input type="file" name="file" /><br>
					                			<p style="font-weight:bold;letter-spacing:1.1px">#可上传您喜欢的图片作为用户头像</p>
					                			<p style="color:red; font-size:15px; font-weight:bold">${uploadMessage}</p>
					                		</div>
					                		<div class="col-md-2 col-lg-2" style="padding-left:0px;">
					                			
					                		</div>
					                	</div>
					                	<div>
					                		<div class="col-md-2 col-lg-2"></div>
					                		<input type="submit" class="btn btn-primary col-md-3 col-lg-3" style="width:100px;" id="subBtn" value="提交" />
					                		<div class="col-md-1 col-lg-1"></div>
					                		<input type="reset" class="btn btn-success col-md-3 col-lg-3" style="width:100px" value="重置" />
				                		</div>
					                </div>
			            		</div>
		            		</div>
		            	</form:form>
	            	</div>
				</div>
	        </div>
	        <div class="footer">
	            <p>
	                <a href="http://www.miitbeian.gov.cn/" class="beian">粤ICP备16087794号-1</a>&nbsp;&nbsp;广州市塔塔信息科技有限公司
	            </p>
	        </div>
		</div>
		<script type="text/javascript" src="${path }/js/userinfo.js"></script>
	</body>
</html>
