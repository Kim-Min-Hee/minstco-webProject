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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/memberjoin.css">
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>member Join Page</title>
</head>
<script type="text/javascript">
    $("#submit").on("click",function (){
        if($("#id").val()===""){
            alert("아이디를 입력해주세요.");
            $("#id").focus();
            return false;
        }

    });
</script>
<body>
<div class="wrapper">
    <form action="/member/joinCheck" method="post" >
        <div class="wrap">
            <div class="subject">
                <spa>회원가입</spa>
            </div>
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
            <div class="user_wrap">
                <div class="user_name">이름</div>
                <div class="user_input_box">
                    <input class="user_input" name="name">
                </div>
            </div>
            <div class="phoneNumber_wrap">
                <div class="phoneNumber_name">휴대폰번호</div>
                <div class="phoneNumber_input_box">
                    <input class="phoneNumber_input" name="phoneNumber">
                </div>
            </div>
            <<button type="button">가입하기</button>>
        </div>
    </form>
</div>
</body>
</html>

