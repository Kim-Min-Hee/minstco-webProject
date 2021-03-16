
function checkAll() {
    var id = document.getElementById('id').value;
    var password = document.getElementById('password').value;
    var passwordCheck = document.getElementById('passwordCheck').value;
    var name = document.getElementById('name').value;
    var phoneNumber = document.getElementById('phoneNumber').value;
    var email = document.getElementById('email').value;
    var memberForm = document.getElementById('memberForm');
    if (!checkId(id)) {
        return false;
    } else if (!checkPassword(id, password, passwordCheck)) {
        return false;
    } else if (!checkName(name)) {
        return false;
    } else if (!checkEmail(email)) {
        return false;
    } else if (!checkPhoneNumber(phoneNumber)) {
        return false;
    } else {
        memberForm.submit();
        return true;
    }
}

    function checkExistData(value, dataName) {
        if (value == "") {
            alert(dataName + "입력해주세요!!!!");
            return false;
        }
        return true;
    }

    function checkId(id) {

        var idEx = /^[a-zA-z0-9]{4,12}$/;
        if (!checkExistData(id, "아이디")) {
            return false;
        }

        if (!idEx.test(id)) {
            alert("아이디는 4자리이상 12자리 이하로 작성 부탁 드립니다.");
            id = "";
            return false;
        }
        return true;
    }
function fn_idCheck() {
    var id = document.getElementById('id').value;
    $.ajax({
        url: "idCheck",
        type: "POST",
        // dataType: "json",
        data: {"id" : id},
        success: function (data) {
            if(data>0){
                alert("이미 사용중인 아이디 입니다.");
                console.log(id);
            }else {
                alert("사용 가능한 아이디 입니다.")
            }
        },
        error : function () {
           alert("ajax failed");
        }
    });
}


    function checkPassword(id, password, passwordCheck) {
        if (!checkExistData(password, "비밀번호")) {
            return false;
        }
        if (!checkExistData(passwordCheck, "비밀번호 확인")) {
            return false;
        }
        var passwordEx = /^[a-zA-z0-9]{4,12}$/;
        if (!passwordEx.test(password)) {
            alert("비밀번호는 영문 대소문자와 숫자를 조합하여 4자리 이상 12자리 이하로 작성 부탁 드립니다.");
            password = "";
            return false;
        }
        if (password != passwordCheck) {
            alert("두 비밀번호가 일치하지 않습니다.");
            passwordCheck = "";
            passwordCheck.value = "";
            return false;
        }
        if (id == password) {
            alert("아이디와 비밀번호는 동일할 수 없습니다.");
            id = "";
            passwordCheck.value = "";
        }
        return true;
    }

    function checkEmail(email) {
        if (!checkExistData(email, "이메일")) {
            return false;
        }
        var emailEx = /^[A-Za-z0-9_]+[A-Za-z0-9]*[@]{1}[A-Za-z0-9]+[A-Za-z0-9]*[.]{1}[A-Za-z]{1,3}$/;
        if (!emailEx.test(email)) {
            alert("이메일 형식이 안맞습니다.");
            email = "";
            return false;
        }
        return true;
    }

    function checkName(name) {
        if (!checkExistData(name, "이름")) {
            return false;
        }
        var nameEx = /^[가-힣]{2,4}$/;
        if (!nameEx.test(name)) {
            alert("이름이 한글이 아닙니다.");
            return false;
        }
        return true;
    }

    function checkPhoneNumber(phoneNumber) {
        if (!checkExistData(phoneNumber, "휴대폰")) {
            return false;
        }
        var phoneNumberEx = /^\d{2,3}-\d{3,4}-\d{4}$/;
        if (!phoneNumberEx.test(phoneNumber)) {
            alert("휴대폰번호는 숫자로만 작성 부탁 드립니다.");
            return false;
        }
        return true;
    }





