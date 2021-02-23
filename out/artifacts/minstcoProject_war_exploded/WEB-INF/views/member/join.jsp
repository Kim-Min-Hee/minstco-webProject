<%--
  Created by IntelliJ IDEA.
  User: kimminhee
  Date: 21. 2. 22.
  Time: 오전 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>member Join Page</title>
</head>
<body>
<div class="wrapper">
    <form id="join_form" method="post">
        <div class="wrap">
            <div class="subject">
                <spa>회원가입</spa>
            </div>
            <div class="id_wrap">
                <div class="id_name">아이디</div>
                <div class="id_input_box">
                    <input class="id_input">
                </div>
            </div>
            <div class="password_wrap">
                <div class="password_name">비밀번호</div>
                <div class="password_input_box">
                    <input class="password_input">
                </div>
            </div>
            <div class="user_wrap">
                <div class="user_name">이름</div>
                <div class="user_input_box">
                    <input class="user_input">
                </div>
            </div>
            <div class="phoneNumber_wrap">
                <div class="phoneNumber_name">휴대폰번호</div>
                <div class="phoneNumber_input_box">
                    <input class="phoneNumber_input">
                </div>
            </div>
            <div class="join_button_wrap">
                <input type="button" class="join_button" value="가입하기">
            </div>
        </div>
    </form>
</div>
<script>
    $(".join_button").click(function(){

        $("#join_form").attr("action", "/member/joinTest.do");
        $("#join_form").submit();

    });
</script>

</body>
</html>
