<%--
  Created by IntelliJ IDEA.
  User: kimminhee
  Date: 21. 2. 26.
  Time: 오후 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>login page</title>
    <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
    <script src="/script/login.js"></script>
</head>
<body>
<div class="wrapper">
    <form name="login" method="post">
        <div class="wrap">
            <div class="login_wrap">
                <span>로그인</span>
            </div>
            <div class="login_wrap">
                <div class="id_wrap">
                    <div class="id_name">아이디</div>
                    <div class="id_input_box">
                        <input class="id_input" name="id">
                    </div>
                </div>
                <div class="password_wrap">
                    <div class="password_name">비밀번호</div>
                    <div class="password_input_box">
                        <input class="password_input" name="password">
                    </div>
                </div>
            </div>
        </div>
        <button type="button" id="loginButton">로그인</button>
        <c:if test="${msg == 'failed'}">
            <div style="color: red">
                아이디 비밀번호가 일치 하지 않습니다.
            </div>
        </c:if>
        <c:if test="${msg == 'logout'}">
            <div style="color: red">
                로그아웃 되었습니다.
            </div>
        </c:if>

    </form>
</div>
</body>
</html>
