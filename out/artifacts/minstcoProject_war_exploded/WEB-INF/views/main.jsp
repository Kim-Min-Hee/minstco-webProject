<%@ page import="com.minstco.vo.MemberVO" %>
<%@ page import="org.springframework.web.servlet.ModelAndView" %><%--
  Created by IntelliJ IDEA.
  User: kimminhee
  Date: 21. 2. 20.
  Time: 오후 2:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%
//    String name = "";
//    if(request.getAttribute("data")!=null){
//        name =  request.getAttribute("data").toString();
//    }
    String result ="";
    String name = "";
    String message ="";
    if(request.getAttribute("result") != null){
        result = request.getAttribute("result").toString();
        name = request.getAttribute("data").toString();
        message = request.getAttribute("message").toString();
    }
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Minstco HomePage</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">

</head>
<body>
<input type ="hidden" name = "name" id ="userName" value="<%=name%>"/>
<input type="hidden" name="result" id="result" value="<%=result%>">
<input type="hidden" name="message" id="message" value="<%=message%>">
 <div class="wrapper">
     <div class="wrap">
         <div class="top-gnb_area">
             <ul class="list">
                 <c:if test = "${memberVo == null}">
                    <li>
                        <a href="/member/login">로그인</a>
                    </li>
                     <li>
                         <a href="/member/join">회원가입</a>
                     </li>
                 </c:if>
                 <c:if test="${memberVo != null}">
                    <li>
                        <a id="gnb_logout_button">로그아웃</a>
                    </li>
                     <li>
                         마이페이지
                     </li>
                     <li>
                         장바구니
                     </li>
                 </c:if>
             </ul>
         </div>
         <div class="top_area">
<%--             <div class="logo_area">--%>
<%--                 <a href="/main"></a>--%>
<%--             </div>--%>
             <div class="search_area">
                 <h1>Search area</h1>
             </div>
             <div class="login_area">
                 <c:if test="${memeberVo == null}">
                     <div class="login_button"><a href="/member/login">로그인</a> </div>
                     <span><a href="/member/join"></a> </span>
                 </c:if>
                 <c:if test="${memberVo != null}">
                     <div class="login_success_area">
                         <span>회원 : ${member.name}</span>
                         <span>회원등급 : ${member.grade}</span>
<%--                         <a href="/member/logout">로그아웃</a>--%>
                     </div>
                 </c:if>
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
     <script>
         var userName = document.getElementById("userName").value;
         var  result = document.getElementById("result").value;
         var message = document.getElementById("message").value;
         if(result=="success"){
             alert(userName+"님 가입을 축하드립니다.");
         }else if(result =="failed"){
             alert(document.getElementById("message"));
         }

     /*    $("#gnb_logout_button").click(function (){
             $.ajax({
                 type: "POST",
                 usr : "/member/logout",
                 success:function (data){
                     alert("로그아웃 되었습니다.");
                     document.location.reload();
                 }
             })
         })*/
     </script>
</body>
</html>
