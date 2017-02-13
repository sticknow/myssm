<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>User List</title>
</head>
<body>
用户列表<br>
<TABLE border="1" width="500">
    <TR>
        <TD>姓名</TD>
        <TD>职务</TD>
        <TD>科室</TD>
    </TR>
    <c:forEach items="${userlist}" var="o">
        <TR>
            <TD>${o.username}</TD>

            <c:forEach items="${o.roles}" var="r">
             <TD>${r.rname}</TD>
            </c:forEach>
            <TD>${o.department.dname}</TD>
        </TR>
    </c:forEach>

</TABLE>
</body>
</html>
