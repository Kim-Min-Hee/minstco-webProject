<%--
  Created by IntelliJ IDEA.
  User: kimminhee
  Date: 21. 2. 20.
  Time: 오후 2:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HomePage</title>
</head>
<body>
<div class="wrapper">
    <div class="wrap">
        <div class="top-gnb_area">
            <h1>logo area</h1>
        </div>
        <div class="top_area">
            <div class="logo_area">
                <h1>logo area</h1>
            </div>

            <div class="search_area">
                <h1>search area</h1>
            </div>
            <div class="login_area">
                <div class="login_button"><a href="/member/login">로그인</a></div>
                <span><a href="${pageContext.request.contextPath}/member/joinMember">회원가입</a> </span>
            </div>
            <div class="clearfix"></div>
        </div>
        <div class="navi_bar_area">
            <h1>navi area</h1>
        </div>
        <div class="content_area">
            <h1>content area</h1>
        </div>
    </div>
</div>
</body>
</html>
