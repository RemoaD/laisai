<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>个人</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	 <script type="text/javascript" src="${path }/bootstrap/js/jquery.min.js"></script>
	<link rel="stylesheet" type="text/css" href="${path }/css/reset.css">
	<link rel="stylesheet" type="text/css" href="${path }/css/global.css">
    <link rel="stylesheet" type="text/css" href="${path }/css/nav_footer.css">
    <link rel="stylesheet" type="text/css" href="${path }/css/person.css">
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
                <div class="person-box">
                    <img src="/images/${user.userheadimg }" alt="person picture" />
                    <span class="person-name">${user.usertruename }</span>
                </div>
                <div class="message-password">
                    <a href="${path }/user/userinfo.action">
                        <i class="fa fa-user-o" aria-hidden="true"></i>&nbsp;修改个人信息
                    </a>
                    <a href="${path }/user/changepassword.action">
                        <i class="fa fa-envelope-o" aria-hidden="true"></i>&nbsp;修改密码
                    </a>
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