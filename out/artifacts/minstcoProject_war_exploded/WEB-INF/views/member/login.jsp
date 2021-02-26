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
    <title>login page</title>
</head>
<body>
<div class="wrapper">
    <form action="/member/loginTest" method="post">
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
        <button type="submit">로그인</button>
    </form>
</div>
</body>
</html>
