
    $(document).ready(function (){
        $("#loginButton").click(function (){
            var id = document.getElementById('id').value;
            var password = document.getElementById('password').value;

            if(id ==""){
                alert("아이디를 입력해주세요.");
                 $("#id").focus();
                return ;
            }
            if(password == ""){
                alert("비밀번호를 입력해주세요.");
                 $("password").focus();
                return ;
            }

                document.loginCheck.submit();




        });
    });
