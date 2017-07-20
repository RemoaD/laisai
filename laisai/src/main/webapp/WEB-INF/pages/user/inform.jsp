<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html>
<html>
<head>
	<title>通知</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />   
    <script type="text/javascript" src="${path }/bootstrap/js/jquery.min.js"></script>
    <link rel="stylesheet" href="${path }/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="${path }/css/reset.css">
	<link rel="stylesheet" type="text/css" href="${path }/css/global.css">
  	<link rel="stylesheet" type="text/css" href="${path }/css/nav_footer.css">
  	<link rel="stylesheet" type="text/css" href="${path }/css/alert.css">
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
            <p>来赛通知</p>
            <div class="alert-box">
            	<table class="table table-bordered table-hover table-condensed table-striped" style="text-align:center">
            		<thead>
            			<tr>
            				<th><center>通知内容</center></th>
            				<th><center>创建时间</center></th>
            			</tr>
            		</thead>
            		<tbody>
            			<c:forEach items="${managermessageList }" var="item">
            				<tr>
            					<td>${item.messagecontent }</td>
            					<td><fmt:formatDate value="${item.createtime }"/></td>
            				</tr>
            			</c:forEach>
            		</tbody>
            	</table>
            	<table class="table table-bordered table-hover table-condensed table-striped" style="text-align:center">
            		<thead>
            			<tr>
            				<th><center>通知内容</center></th>
            				<th><center>操作</center></th>
            			</tr>
            		</thead>
            		<tbody>
            			<c:forEach items="${usermessageList }" var="item">
            				<tr>
            					<td>${item.messagecontent }</td>
            					<td>
            						<div class="col-md-12 col-sm-12 col-xs-12 col-lg-12">
            							<div class="row">
            								<div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
            									<form method="post" action="accept.action">
			            							<input type="text" name="sendinviteid" value="${item.sendinviteid }" style="display:none"/>
			            							<input type="submit" class="btn btn-success" value="接受"/>
			            						</form>
            								</div>
            								<div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
            									<form method="post" action="deleteinvite.action">
			            							<input type="text" name="sendinviteid" value="${item.sendinviteid }" style="display:none"/>
			            							<input type="submit" class="btn btn-danger" value="拒绝"/>
			            						</form>
		            						</div>
            							</div>
            						</div>
            					</td>
            				</tr>
            			</c:forEach>
            			<c:forEach items="${usermessageList2 }" var="item">
            				<tr>
            					<td>${item.messagecontent }</td>
            					<td>
            						<div class="col-md-12 col-sm-12 col-xs-12 col-lg-12">
            							<div class="row">
            								<div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
            									<form method="post" action="acceptshenqing.action">
			            							<input type="text" name="sendapplicationid" value="${item.sendapplicationid }" style="display:none"/>
			            							<input type="submit" class="btn btn-success" value="接受"/>
			            						</form>
            								</div>
            								<div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
            									<form method="post" action="deleteshenqing.action">
			            							<input type="text" name="sendapplicationid" value="${item.sendapplicationid }" style="display:none"/>
			            							<input type="submit" class="btn btn-danger" value="拒绝"/>
			            						</form>
		            						</div>
            							</div>
            						</div>
            					</td>
            				</tr>
            			</c:forEach>
            		</tbody>
            	</table>
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