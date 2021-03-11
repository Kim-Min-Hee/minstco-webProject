
    $(document).ready(function (){
        $('loginButton').click(function (){
            var id = $("id").val();
            var password = $("password").val();

            if(id ==""){
                alert("아이디를 입력해주세요.");
                $("#id").focus();
                return;
            }
            if(password == ""){
                alert("비밀번호를 입력해주세요.");
                $("password").focus();
                return ;
            }
            document.login.action="${path}/member/loginCheck.do"
            document.login.submit();
        })
    })
