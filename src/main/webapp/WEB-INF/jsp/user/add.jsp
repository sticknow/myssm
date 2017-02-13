<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/jsp/common/common.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
	<title>用户信息</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
<!-- 标题显示 -->
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/css/images/title_arrow.gif"/> 用户信息
        </div>
        <div id="Title_End"></div>
    </div>
</div>
<!--显示表单内容-->
<div id=MainArea>
    <form action="${pageContext.request.contextPath}/save.action" method="post">
        <div class="ItemBlock_Title1"><!-- 信息说明 --><div class="ItemBlock_Title1">
        	<img border="0" width="4" height="7" src="${pageContext.request.contextPath}/css/blue/images/item_point.gif" /> 用户信息 </div> 
        </div>
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr><td width="100">所属部门</td>
                        <td>
                            <select name="department" cssClass="SelectStyle">
                            <c:forEach items="${departmentList}" var="d">
                            <option>${d.dname}</option>
                            </c:forEach>
                        </select>
                        </td>
                    </tr>
                    <tr><td>登录名</td>
                        <td cssClass="InputStyle">
                            <input type="text" name="username"/>
                            （登录名要唯一）
						</td>
                    </tr>
                    <tr>
                        <td>密码</td>
                        <td cssClass="InputStyle">
                            <input type="password" name="password"/>
                        </td>
                    </tr>
					<tr>
                        <td>性别</td>
                        <td cssClass="InputStyle">
                        	<input type="radio" name="sex" value="男"/>男
                            <input type="radio" name="sex" value="女"/>女
						</td>
                    </tr>
					<tr><td>联系电话</td>
                        <td cssClass="InputStyle">
                            <input type="text" name="phone"/>
                        </td>
                    </tr>
                    <tr><td>E-mail</td>
                        <td cssClass="InputStyle">
                            <input type="text" name="email"/>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
		<div class="ItemBlock_Title1"><!-- 信息说明 --><div class="ItemBlock_Title1">
        	<img border="0" width="4" height="7" src="${pageContext.request.contextPath}/css/blue/images/item_point.gif" /> 岗位设置 </div> 
        </div>
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr>
						<td width="100">岗位</td>
                        <td>
                        <select name="role" cssClass="SelectStyle" multiple="true">
                            <c:forEach items="${roleList}" var="r">
                                <option>${r.rname}</option>
                            </c:forEach>
                        </select>
                        </td>
                    </tr>
                </table>
            </div>
        </div>		
        <!-- 表单操作 -->
        <div id="InputDetailBar">
            <input type="image" src="${pageContext.request.contextPath}/css/images/save.png"/>
            <a href="javascript:history.go(-1);"><img src="${pageContext.request.contextPath}/css/images/goBack.png"/></a>
        </div>
    </form>
</div>
</body>
</html>