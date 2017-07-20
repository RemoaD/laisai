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
	<style>
		.mycompetition{
			font-size:17px;
			padding-bottom:5px;
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
          
          <div class="right-box">
               <div class="col-md-12 col-lg-12 col-sm-12 col-xs-12">
               		<div class="row">
               			<div class="col-md-5 col-lg-5 col-hidden-xs col-hidden-sm" style="padding-top:50px">
               				<img class="img img-circle img-responsive" src="${path }/img/competition.jpg" alt="picture">
               			</div>
               			<div class="col-md-7 col-lg-7 col-sm-7 col-xs-7" style="margin-top:15px;">
               				<c:forEach items="${competitionList }" var="item">
               					<div class="col-md-12 col-lg-12 col-sm-12 col-xs-12" style="padding-top:10px;font-size:15px;letter-spacing:1.5px;-webkit-box-shadow: 3px 3px 3px;  
  -moz-box-shadow: 3px 3px 3px;  
  box-shadow: 3px 3px 3px; margin-bottom:20px;padding-bottom:10px">
	               					<div style="text-align:center; font-size:20px;font-weight:bolder;margin-bottom:10px">${item.competitionname }</div>
	               					<p class="mycompetition"><span style="font-weight:bold">发布时间：</span><fmt:formatDate value="${item.createtime }"/>&nbsp;00:00</p>
	               					<form method="post" action="toonegame.action">
	               						<input type="text" value="${item.competitionid }" style="display:none" name="competitionid">
	               						<input class="btn btn-success " style="float:right;"type="submit" value="查看详情">
	               					</form>
	               					
	               					<!--<c:choose>
	               						<c:when test='${item.competitionproperty eq "个人" }'>
	               							<p class="mycompetition"><span style="font-weight:bold">个人报名截止时间：</span><fmt:formatDate value="${item.groupdeadline }"/>&nbsp;23:59</p>
	               						</c:when>
	               						<c:otherwise>
	               							<p class="mycompetition"><span style="font-weight:bold">组队截止时间：</span><fmt:formatDate value="${item.groupdeadline }"/>&nbsp;23:59</p>
	               						</c:otherwise>
               						</c:choose>
	               					<p class="mycompetition"><span style="font-weight:bold">比赛内容：</span>${item.competitioncontent }</p>
	               					<div class="col-md-12 col-sm-12 col-lg-12" style="padding-left:0px">
		               					<div class="row" >
		               						<div class="col-md-4 col-sm-4 col-lg-4 mycompetition"><span style="font-weight:bold;margin-left:0px">参赛形式：</span>${item.competitionproperty }</div>
			               					<c:choose>
			               						<c:when test='${item.competitionproperty eq "个人" }'>
			               							<div class="col-md-7 col-sm-7 col-lg-7">
				               							<form method="post" action="gerenbaoming.action">
				               								<input type="text" name="competitionid" value="${item.competitionid }" style="display:none"/>
				               								<input type="submit" class="btn btn-success" value="点击报名" />
				               							</form>
			               							</div>
			               						</c:when>
			               						<c:otherwise>
			               							<button type="button" class="btn btn-info"><a href="${path }/user/checkzutuan.action" style="color:white">点击组队</a></button>
			               						</c:otherwise>
			               					</c:choose>
		               					</div>
	               					</div>
	               					<p class="mycompetition"><span style="font-weight:bold">学生要求：</span>${item.studentdemand }</p>-->
								</div>
               				</c:forEach>
               			</div>
               		</div>
               </div>  
         </div>
	</div>
        <div class="footer">
            <p style="text-align:center">
                <a href="http://www.miitbeian.gov.cn/" class="beian">粤ICP备16087794号-1</a>&nbsp;&nbsp;广州市塔塔信息科技有限公司
            </p>
        </div>
    </div>
    <script type="text/javascript" src="${path }/js/competiton.js"></script>
</body>
</html>