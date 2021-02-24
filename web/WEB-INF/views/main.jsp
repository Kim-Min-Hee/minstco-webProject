<%--
  Created by IntelliJ IDEA.
  User: kimminhee
  Date: 21. 2. 20.
  Time: 오후 2:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Minstco HomePage</title>
<%--    <link rel="stylesheet" href="resources/css/main.css">--%>
<%--    <script--%>
<%--            src="https://code.jquery.com/jquery-3.4.1.js"--%>
<%--            integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="--%>
<%--            crossorigin="anonymous"></script>--%>
</head>
<body>

<div class="wrapper">
    <div class="wrap">
        <div class="top_gnb_area">
            <ul class="list">
                <c:if test = "${member == null}">	<!-- 로그인 x -->
                    <li >
                        <a href="/member/login">로그인</a>
                    </li>
                    <li>
                        <a href="/member/join">회원가입</a>
                    </li>
                </c:if>
                <c:if test="${member != null }">	<!-- 로그인 o -->
                    <c:if test="${member.adminCk == 1 }">	<!-- 관리자 계정 -->
                        <li><a href="/admin/main">관리자 페이지</a></li>
                    </c:if>
                    <li>
                        <a id="gnb_logout_button">로그아웃</a>
                    </li>
                    <li>
                        마이룸
                    </li>
                    <li>
                        장바구니
                    </li>
                </c:if>
                <li>
                    고객센터
                </li>
            </ul>
        </div>
        <div class="top_area">
            <!-- 로고영역 -->
            <div class="logo_area">
                <a href="/main"><img src="resources/img/mLogo.png"></a>
            </div>
            <div class="search_area">
                <h1>Search area</h1>
            </div>
            <div class="login_area">

                <!-- 로그인 하지 않은 상태 -->
                <c:if test = "${member == null }">
                    <div class="login_button"><a href="/member/login">로그인</a></div>
                    <span><a href="/member/join">회원가입</a></span>
                </c:if>

                <!-- 로그인한 상태 -->
                <c:if test="${ member != null }">
                    <div class="login_success_area">
                        <span>회원 : ${member.memberName}</span>
                        <span>충전금액 : <fmt:formatNumber value="${member.money }" pattern="\#,###.##"/></span>
                        <span>포인트 : <fmt:formatNumber value="${member.point }" pattern="#,###" /></span>
                        <a href="/member/logout.do">로그아웃</a>
                    </div>
                </c:if>

            </div>
            <div class="clearfix"></div>
        </div>
        <div class="navi_bar_area">
            <h1>navi area</h1>
        </div>
        <div class="content_area">
            <h1>content area</h1>
        </div>

        <!-- Footer 영역 -->
        <div class="footer_nav">
            <div class="footer_nav_container">
                <ul>
                    <li>회사소개</li>
                    <span class="line">|</span>
                    <li>이용약관</li>
                    <span class="line">|</span>
                    <li>고객센터</li>
                    <span class="line">|</span>
                    <li>광고문의</li>
                    <span class="line">|</span>
                    <li>채용정보</li>
                    <span class="line">|</span>
                </ul>
            </div>
        </div> <!-- class="footer_nav" -->

        <div class="footer">
            <div class="footer_container">

                <div class="footer_left">
                    <img src="resources/img/Logo.png">
                </div>
                <div class="clearfix"></div>
            </div>
        </div> <!-- class="footer" -->

    </div>	<!-- class="wrap" -->
</div>	<!-- class="wrapper" -->

<script>
    /* gnb_area 로그아웃 버튼 작동 */
    $("#gnb_logout_button").click(function(){
        //alert("버튼 작동");
        $.ajax({
            type:"POST",
            url:"/member/logout.do",
            success:function(data){
                alert("로그아웃 성공");
                document.location.reload();
            }
        }); // ajax
    });

</script>

</body>
</html>
