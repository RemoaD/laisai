<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>我的队伍</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />  
    <script type="text/javascript" src="${path }/bootstrap/js/jquery.min.js"></script>
    <link rel="stylesheet" href="${path }/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="${path }/css/reset.css">
	<link rel="stylesheet" type="text/css" href="${path }/css/global.css">
    <link rel="stylesheet" type="text/css" href="${path }/css/nav_footer.css">
    <link rel="stylesheet" type="text/css" href="${path }/css/myteam.css">
	<link rel="stylesheet" type="text/css" href="${path }/css/font-awesome.min.css">
	<link rel="prerender prefetch" href="${path }/img/slider1.png">
	<link rel="prerender prefetch" href="${path }/img/slider2.png">
	<link rel="prerender prefetch" href="${path }/img/slider3.png">
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
            <div class="right-box clearfix">
                <!-- 轮播图和选择老师 -->
                <div class="right-left-box">
                    <!-- 轮播图 -->
                    <div class="slider-box">
                        <!-- 图片 -->
                        <div class="slider-main">
                            <div class="slider-i {{css}}" id="slider_{{index}}" index="{{index}}">
                                <img src="../img/slider{{index}}.png" alt="slider{{index}}" />
                            </div>
                        </div>
                        
                        <!-- 控制按钮 -->
                        <div class="slider-ctrl-box" id="sliderctrl">
                            <ul class="slider-ctrl-ul">
                                <li class="slider-ctrl" id="ctrl_{{index}}" index="{{index}}"></li>
                            </ul>
                        </div>
                        <!-- 向前 -->
                        <div class="prev-slider" id="prevSlider">
                            <a href="javascript:prevSlider();">
                                <img src="../img/prev-slider.png" alt="prev" />
                            </a>
                        </div>
                        <!-- 向后 -->
                        <div class="next-slider" id="nextSlider">
                            <a href="javascript:nextSlider();">
                                <img src="../img/next-slider.png" alt="next" />
                            </a>
                        </div>
                    </div>
                    <!-- 选择老师 -->
                    <div class="choose-teacher-box">
                        <p style="margin-top:0px; paddingt-top:0px">指导老师：</p>
                            <table class="table table-bordered table-hover table-condensed table-striped " style="text-align:center; margin-top:0px; paddingt-top:0px">
                                <tr >
                                    <th><center>指导老师<center></th>
                                    <th><center>所带队伍数<center></th>
                                    <th><center>剩余名额<center></th>
                                    <th><center>操作<center></th>
                                </tr>
                                <c:forEach items="${teacherList }" var="item">
                                	<tr >
	                                    <td style="padding:0">${item.groupteachername }</td>
	                                    <td style="padding:0">${item.studentnumber }</td>
	                                    <td style="padding:0">${item.remainnumber }</td>
	                                    <td style="padding:0">
	                                    	<c:choose>
		                                    	<c:when test="${not empty user3.usertruename }">
		                                    		<form method="post" action="selectteacher.action">
		                                    			<input type="text" style="display:none" name="remainnumber" value="${item.remainnumber }"/>
		                                    			<input type="text" style="display:none" name="groupteacherid" value="${item.groupteacherid }"/>
						                       			<input type="text" style="display:none" name="groupfirstmemberid" value="${user1.userid }"/>
						                        		<input type="submit" class="btn btn-success" style="line-height:1" value="选择" />
					                        		</form>
		                                    	</c:when>
		                                    	<c:otherwise></c:otherwise>
	                                    	</c:choose>
	                                    </td>
	                                </tr>
                                </c:forEach>
                                
                            </table>
                   
                        <p>
                            您的选择是：<span>${teacher.groupteachername }</span>
                            
                        </p>
                    </div>
                </div>
                <!-- 日历和队伍成员 -->
                <div class="right-right-box">
                    <!-- 日历 -->
                    <div class="calendar" id="calendar">
                        
                    </div>
                    <!-- 队伍成员 -->
                    <div class="teammates-box">
                        <h3>队伍成员<span style="color:red;font-weight:bold">${yibaomingMsg }</span><c:if test="${not empty thegroupid }"><span style="color:red;font-weight:bold">队伍号:${thegroupid }</span></c:if></h3>
                        <ul>
                            <li>
                            	<c:if test="${not empty user1.userheadimg}">
                            		<img src="/images/${user1.userheadimg }" />
                            	</c:if>
                                
                                <a href="">${user1.usertruename }</a>
                            </li>
                            <li>
	                            	<c:if test="${not empty user2.userheadimg}">
	                            		<img src="/images/${user2.userheadimg }" />
	                            	</c:if>
                                <a href="">${user2.usertruename }</a>
                            </li>
                            <li>
	                            	<c:if test="${not empty user3.userheadimg}">
	                            		<img src="/images/${user3.userheadimg }" />
	                            	</c:if>
                                <a href="">${user3.usertruename }</a>
                            </li>
                        </ul>
                       		<c:if test="${not empty user1.usertruename}">
	                       		<form method="post" action="deletegroup.action">
	                       			<input type="text" style="display:none" name="groupfirstmemberid" value="${user1.userid }"/>
	                        		<input type="submit" value="解散队伍" id="jiesanBtn" name="" />
                        		</form>
                        	</c:if>
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
   

    <script type="text/javascript" src="${path }/js/calendar.js"></script>
    <script type="text/javascript" src="${path }/js/myteam.js"></script>
</body>
</html>