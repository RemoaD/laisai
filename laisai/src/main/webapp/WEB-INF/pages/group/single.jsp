<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>来赛个人</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script type="text/javascript" src="${path }/bootstrap/js/jquery.min.js"></script>
    <link rel="stylesheet" href="${path }/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="${path }/css/reset.css">
	<link rel="stylesheet" type="text/css" href="${path }/css/global.css">
    <link rel="stylesheet" type="text/css" href="${path }/css/nav_footer.css">
    <link rel="stylesheet" type="text/css" href="${path }/css/single.css">
	<link rel="stylesheet" type="text/css" href="${path }/css/font-awesome.min.css">
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
            <div class="right-box">
                <div class="single-box clearfix">
                    <div class="single">
                        <img src="/images/${lookuser.userheadimg }" alt="队员" />
                        <span class="single-name">${lookuser.usertruename }</span>
                        <ul>
                            <li>
                                <i class="fa fa-user-circle-o fa-lg" aria-hidden="true"></i>&nbsp;
                                <span>${lookuser.usersex }</span>
                            </li><!-- 
                         --><li>
                                <i class="fa fa-heart fa-lg" aria-hidden="true"></i>&nbsp;
                                <span>${lookuser.userproperty }</span>
                            </li><!-- 
                         --><li>
                                <i class="fa fa-map-marker fa-lg" aria-hidden="true"></i>&nbsp;
                                <span>${lookuser.userdepartment }</span>
                            </li><!-- 
                         --><li>
                                <i class="fa fa-graduation-cap fa-lg" aria-hidden="true"></i>&nbsp;
                                <span>${lookuser.usergrade }</span>
                            </li><!-- 
                         --><li>
                                <i class="fa fa-phone-square fa-lg" aria-hidden="true"></i>&nbsp;
                                <span>${lookuser.usertel }</span>
                            </li>
                        </ul>
                        <div class="about-myself">
                            <p>个人简介：</p>
                            <p style="text-indent:2rem">${lookuser.userintroduce }</p>
                        </div>
                        <div class="col-md-12 col-sm-12 col-xs-12 col-lg-12">
	                        <div class="row">
	                        	<div class="col-md-4 col-sm-4 col-lg-4 col-xs-4"></div>
	                        	<div class="col-md-2 col-sm-2 col-lg-2 col-xs-2">
	                        		<form method="post" action="invite.action">
	                        			<input type="text" name="userid" value="${lookuser.userid }" style="display:none;">
	                        			<input class="btn btn-primary btn-block" type="submit" value="邀请" id="invitation"/>
		                       	 	</form>
	                        	</div>
		                        <div class="col-md-2 col-sm-2 col-lg-2 col-xs-2">
			                        <input type="button" class="btn btn-success btn-block" value="返回" onclick='window.location.href="${path }/group/pool.action?userproperty=${property }&pool=${pool}" />
		                        </div>
	                        </div>
                        </div>
                    </div>
                </div>
            </div>
           
        </div>

        <div class="footer">
            <p>
                <a href="http://www.miitbeian.gov.cn/" class="beian">粤ICP备16087794号-1</a>&nbsp;&nbsp;广州市塔塔信息科技有限公司
            </p>
        </div>
    </div>
    <script type="text/javascript" src="${path }/js/single.js"></script>
</body>
</html>