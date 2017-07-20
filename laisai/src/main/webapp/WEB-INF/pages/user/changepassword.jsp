<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>修改密码</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	 <script type="text/javascript" src="${path }/bootstrap/js/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${path }/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${path }/css/reset.css">
	<link rel="stylesheet" type="text/css" href="${path }/css/global.css">
    <link rel="stylesheet" type="text/css" href="${path }/css/nav_footer.css">
    <link rel="stylesheet" type="text/css" href="${path }/css/changePassword.css">
	<link rel="stylesheet" type="text/css" href="${path }/css/font-awesome.min.css">
	<style>
		body {
    font-family: "Helvetica Neue", Helvetica, Arial, "Microsoft Yahei UI", "Microsoft YaHei", SimHei, "\5B8B\4F53", simsun, sans-serif;
			}
		.error{
			color:red;
		}
	</style>
</head>
<body>

    <!-- 中间部分 -->
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

            <div class="right-box" style="padding-top:100px">
            	<div class="col-md-12 col-sm-12 col-xs-12">
            		<div class="col-md-12 col-sm-12 col-lg-12" style="margin-bottom:10px">
                		<p style="text-align:center;font-size:26px;padding-bottom:10px; letter-spacing:2px">密码修改</p>
                	</div>
            		<div class="col-hidden-sm col-hidden-xs col-md-2 col-lg-2"></div>
           			<form:form class="form" action="dochangepassword.action" method="post"  modelAttribute="passwordModel" role="form">
           				<div class="col-lg-8 col-sm-8 col-md-8 col-xs-8">
           					<div class="col-md-12 col-lg-12 col-xs-12 col-sm-12">
			                	<div class="form-group row">
			                		<label for="oldpassword" class="control-label col-md-3 col-lg-3 col-sm-3 col-xs-3" style="padding-top:8px; text-align:right; letter-spacing:2px">
			                			旧密码：
			                		</label>
			                		<div class="col-md-6 col-lg-6 col-sm-6 col-xs-6">
			                			<input type="password" name="oldpassword" class="form-control"  value="${changePasswordValidate.oldpassword }"  placeholder="请输入旧密码"/>
			                		</div>
			                		<div class="col-md-3 col-lg-3 col-sm-3 col-xs-3" style="padding-left:0px;">
			                			<form:errors path="oldpassword" class="error"></form:errors>
			                		</div>
			                	</div>
			                	<div class="form-group row">
			                		<label for="newpassword" class="control-label col-md-3 col-lg-3 col-sm-3 col-xs-3" style="padding-top:8px; text-align:right; letter-spacing:2px">
			                			新密码：
			                		</label>
			                		<div class="col-md-6 col-lg-6 col-sm-6 col-xs-6">
			                			<input type="password" name="newpassword" class="form-control" value="${changePasswordValidate.newpassword }" placeholder="请输入8-16位新密码"/>
			                		</div>
			                		<div class="col-md-3 col-lg-3 col-sm-3 col-xs-3" style="padding-left:0px;">
			                			<form:errors path="newpassword" class="error"></form:errors>
			                		</div>
			                	</div>
			                	<div class="form-group row">
			                		<label for="checkpassword" class="control-label col-md-3 col-lg-3 col-sm-3 col-xs-3" style="padding-top:8px; text-align:right; letter-spacing:2px">
			                			密码确认：
			                		</label>
			                		<div class="col-md-6 col-lg-6 col-sm-6 col-xs-6">
			                			<input type="password" name="checkpassword" class="form-control" value="${changePasswordValidate.checkpassword }" placeholder="请再次输入新密码"/>
			                		</div>
			                		<div class="col-md-3 col-lg-3 col-sm-3 col-xs-3" style="padding-left:0px;">
			                			<form:errors path="checkpassword" class="error"></form:errors>
			                		</div>
			                	</div>
			                	<div>
			                		<div class="col-md-3 col-lg-3 col-sm-3 col-xs-3"></div>
			                		<input type="submit" class="btn btn-primary col-md-3 col-lg-3 col-sm-3 col-xs-3" style="width:100px;" value="确认" />
			                		<div class="col-md-1 col-lg-1 col-sm-1 col-xs-1"></div>
			                		<input type="reset" class="btn btn-success col-md-3 col-lg-3 col-sm-3 col-xs-3" style="width:100px" value="重置" />
		                		</div>
		                	</div>
	                		<p class="error" style="font-size: 15px; padding-left: 40px;">${passwordMess }</p>
           				</div>
           			</form:form>
           			<div class="col-hidden-sm col-hidden-xs col-md-2 col-lg-2"></div>
            	</div>
			</div>     
        </div>

        <div class="footer">
            <p>
                <a href="http://www.miitbeian.gov.cn/" class="beian">粤ICP备16087794号-1</a>&nbsp;&nbsp;广州市塔塔信息科技有限公司
            </p>
        </div>
    </div>
</body>
</html>