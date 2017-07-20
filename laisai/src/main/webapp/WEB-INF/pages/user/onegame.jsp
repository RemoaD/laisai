<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
	<title>比赛详情</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script type="text/javascript" src="${path }/bootstrap/js/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${path }/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${path }/css/reset.css">
	<link rel="stylesheet" type="text/css" href="${path }/css/global.css">
    <link rel="stylesheet" type="text/css" href="${path }/css/nav_footer.css">
    <link rel="stylesheet" type="text/css" href="${path }/css/onegame.css">
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
            <div class="onegame-box">
                <h2 style="text-align:center; font-weight:bold">${lookcompetition.competitionname }</h2>
                <p class="game-time">
                    <i class="fa fa-clock-o" aria-hidden="true"></i>&nbsp;<span style="color:black; font-weight:bold">比赛举办时间：</span><fmt:formatDate value="${lookcompetition.competitiontime }"/>
                </p>
                <p class="submit-btn">
               		<c:choose>
						<c:when test='${lookcompetition.competitionproperty eq "个人" }'>
 							<form method="post" action="gerenbaoming.action">
 								<input type="text" name="competitionid" value="${lookcompetition.competitionid }" style="display:none"/>
 								<input type="submit" class="btn btn-success" style="position: absolute;
	bottom: 1rem;
	left: 24rem;" id="baomingBtn" value="报名参赛" />
 							</form>
						</c:when>
						<c:otherwise>
							<%-- <button type="button" class="btn btn-info"style=""><a href="${path }/user/checkzutuan.action" style="color:white">点击组队</a></button> --%>
							<input type="button" value="点击组队" class="btn btn-info" onclick='window.location.href="${path }/user/checkzutuan.action"'/>
						</c:otherwise>
					</c:choose>
                </p>
                <p class="game-infor">
                	<span style="color:black; font-weight:bold">比赛内容：</span>${lookcompetition.competitioncontent }
                </p>
                <p class="game-infor">
                	<span style="color:black; font-weight:bold">参赛形式：</span>${lookcompetition.competitionproperty }
                </p>
                <p class="game-infor">
                	<span style="color:black; font-weight:bold">学生要求：</span>${lookcompetition.studentdemand }
                </p>
                <p class="game-sponsor">
                    <i class="fa fa-clock-o" aria-hidden="true"></i>&nbsp;<span style="color:black; font-weight:bold">报名截止时间：</span><fmt:formatDate value="${lookcompetition.groupdeadline }"/> 23:59:59
                </p>
                <p style="color:red; font-size:20px; font-weight:bold">${baominggerenbisai }</p>
            </div>
          </div>
           
        </div>

        <div class="footer">
            <p>
                <a href="http://www.miitbeian.gov.cn/" class="beian">粤ICP备16087794号-1</a>&nbsp;&nbsp;广州市塔塔信息科技有限公司
            </p>
        </div>
    </div>
   

   
    <script type="text/javascript">
	function dissolveTeam() {
		var baomingBtn = document.getElementById('baomingBtn');
		baomingBtn.onclick = function() {
			var result = window.confirm('确定报名比赛吗？');
			if(result==true) {
				alert("后台已经接受了您的报名，恭喜您报名成功！");
			}else {
				return false;
			}
		}
	}dissolveTeam();
	</script>
</body>
</html>