<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
	<title>个人组队</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />   
    <script type="text/javascript" src="${path }/bootstrap/js/jquery.min.js"></script>
    <link rel="stylesheet" href="${path }/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="${path }/css/reset.css">
	<link rel="stylesheet" type="text/css" href="${path }/css/global.css">
    <link rel="stylesheet" type="text/css" href="${path }/css/nav_footer.css">
    <link rel="stylesheet" type="text/css" href="${path }/css/maketeam.css">
    <link rel="stylesheet" type="text/css" href="${path }/css/spjumpout.css">
	<link rel="stylesheet" type="text/css" href="${path }/css/font-awesome.min.css">
</head>
<body>
    <!-- 中间部分 -->
    <div class="middle">
    	<div class="white-box clearfix">
            <!-- 左侧导航栏 -->
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
            

            <!-- 搜索 -->
            <div class="search-box">
                <form class="clearfix" method="get" action="${path }/user/dosearch.action">
                    <input type="text" name="keyword" />
                    <input type="submit" value="Search"/>
                </form>
            </div>

            <!-- 关键字显示 -->
            <div class="keyword-box">
                <ul class="nav list-inline nav-pills">
                    <li>
                        <span>组队池</span>
                    </li>
                    <c:choose>
	                    <c:when test='${pool eq "danren"}'>
		                    <li class="active">
		                        <a href="${path }/group/twain.action?userproperty=${property}&pool=danren">单人池</a>
		                    </li>
	                    </c:when>
	                    <c:otherwise>
	                     	<li>
		                        <a href="${path }/group/twain.action?userproperty=${property}&pool=danren">单人池</a>
		                    </li>
	                    </c:otherwise>
                    </c:choose>
                    <c:choose>
	                    <c:when test='${pool eq "shuangren"}'>
		                    <li class="active">
		                        <a href="${path }/group/twain.action?userproperty=${property}&pool=shuangren">双人池</a>
		                    </li>
	                    </c:when>
	                    <c:otherwise>
	                     	<li>
		                        <a href="${path }/group/twain.action?userproperty=${property}&pool=shuangren">双人池</a>
		                    </li>
	                    </c:otherwise>
                    </c:choose>
                </ul>
                <ul class="nav list-inline nav-pills">
                    <li>
                        <span>职能</span>
                    </li>
                	<c:choose>
                		<c:when test='${property eq "jianmo"}'>
                			<li class="active"><a href="${path }/group/pool.action?userproperty=jianmo&pool=${pool}">建模</a></li>
                		</c:when>
                		<c:otherwise>
                			<li><a href="${path }/group/pool.action?userproperty=jianmo&pool=${pool}">建模</a></li>
                		</c:otherwise>
                	</c:choose>
					<c:choose>
						<c:when test='${property eq "biancheng" }'>
							<li class="active"><a href="${path }/group/pool.action?userproperty=biancheng&pool=${pool}">编程</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="${path }/group/pool.action?userproperty=biancheng&pool=${pool}">编程</a></li>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test='${property eq "xiezuo" }'>
							<li class="active"><a href="${path }/group/pool.action?userproperty=xiezuo&pool=${pool}">写作</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="${path }/group/pool.action?userproperty=xiezuo&pool=${pool}">写作</a></li>
						</c:otherwise>
					</c:choose>
                </ul>
            </div>

            <!-- 队伍 -->
            <div class="persons-box">
                <div class="persons">
               		<c:forEach items="${page.records }" var="item">
	                    <div class="oneperson clearfix" id="person1">
	                    	<form action="${path }/user/look.action" method="get">
	                    	<input type="text" class="number" name="userid" value="${item.userid }" />
	                    	<input type="text" name="userproperty" value="${property }" style="display:none"/>
	                    	<input type="text" name="pool" value="${pool }" style="display:none" />
	                        <span>${item.usertruename }</span>
	                        <input type="submit" class="btn btn-info" style="float:right;margin-top: -7px;padding: 2px 12px;" value="查看" />
	                        </form>
	                        <ul>
	                            <li>
	                                <i class="fa fa-user-circle-o fa-lg" aria-hidden="true"></i>
	                                <span>${item.usersex }</span>
	                            </li>
	                            <li>
	                                <i class="fa fa-graduation-cap fa-lg" aria-hidden="true"></i>
	                                <span>${item.usergrade }</span>
	                            </li>
	                            <li>
	                                <i class="fa fa-map-marker fa-lg" aria-hidden="true"></i>
	                                <span>${item.userdepartment }</span>
	                            </li>
	                        </ul>
	                    </div>
	                </c:forEach>
                </div>

                <!-- 分页页码 -->
                <div style="text-align:center">
                   <ul class="pagination">
						<c:choose>
							<c:when test="${page.curPage<=1 }">
								<li class="disabled"><a href="#">&laquo;</a></li>
							</c:when>
							<c:otherwise>
								<li><a href="${path }/group/pool.action?pageSize=9&curPage=${page.curPage-1}&userproperty=${property}&pool=${pool}">&laquo;</a></li>
							</c:otherwise>
						</c:choose>
					    <c:forEach begin="${page.pageStart }" end="${page.pageEnd }" varStatus="status">
					    	<c:choose>
					    		<c:when test="${status.index eq page.curPage }">
					    			<li class="active"><a href="${path }/group/pool.action?pageSize=9&curPage=${status.index}&userproperty=${property}&pool=${pool}">${status.index }</a></li>
					    		</c:when>
					    		<c:otherwise>
					    			<li><a href="${path }/group/pool.action?pageSize=9&curPage=${status.index}&userproperty=${property}&pool=${pool}">${status.index }</a></li>
					    		</c:otherwise>
					    	</c:choose>
					    </c:forEach>
					    <c:choose>
					    	<c:when test="${page.curPage>=page.totalPage }">
					    		<li class="disabled"><a href="#">&raquo;</a></li>
					    	</c:when>
					    	<c:otherwise>
					    		<li><a href="${path }/group/pool.action?pageSize=9&curPage=${page.curPage+1}&userproperty=${property}&pool=${pool}">&raquo;</a></li>
					    	</c:otherwise>
					    </c:choose>
					</ul>
                </div>
                
            </div>
        </div>

        <div class="footer">
            <p>
                <a href="http://www.miitbeian.gov.cn/" class="beian">粤ICP备16087794号-1</a>&nbsp;&nbsp;广州市塔塔信息科技有限公司
            </p>
        </div>
    </div>
    <script type="text/javascript" src="${path }/js/singlePool.js"></script>
</body>
</html>