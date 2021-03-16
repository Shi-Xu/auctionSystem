
$(document).ready(function () {
    $.validator.setDefaults({
        submitHandler: function () {
            alert( "Form successful submitted!" );
        }
    });

    /*//邮箱验证
        $.validator("isCodeEq",function (value) {
            return value === verify;
        },"验证码错误")*/
    $('#quickForm').validate({
        rules: {
            email: {
                required: true,
                email: true,
            },
            gender: {
                required: true,
            },
            birthday: {
                required: true,
            },
            telephone: {
                required: true,
                rangelength:[11,11]
            },
            username: {
                required: true,
                minlength:4,
                maxlength:10,
            },
            confirm: {
                equalTo: "#password"

            },
            validate: {
                required:true,


            },
            password: {
                required: true,
                minlength: 6

            },
            terms: {
                required: true
            },
        },
        messages: {
            email: {
                required: "邮箱不能为空",
                email: "请输入正确的邮箱"
            },
            validate: {
                required: "验证码不能为空",

            },
            username: {
                required: "用户名不能为空",
                minlength: "不能少于四个字符",
                maxlength:"不能多于十个字符"
            },
            telephone: {
                required: "电话不能为空",
                rangelength: "请输入正确的11位电话号码",

            },
            birthday: {
                required: "生日不能为空",
            },
            gender: {
                required: "性别不能为空",
                email: "请输入正确的邮箱"
            },
            confirm: {
                equalTo:"两次密码输入不一致"
            },
            password: {
                required: "密码不能为空",
                minlength: "密码必须大于6位"
            },
            terms: "请勾选我以悉知"
        },
        errorElement: 'span',
        errorPlacement: function (error, element) {
            error.addClass('invalid-feedback');
            element.closest('.input-group').append(error);
        },
        highlight: function (element, errorClass, validClass) {
            $(element).addClass('is-invalid');
        },
        unhighlight: function (element, errorClass, validClass) {
            $(element).removeClass('is-invalid');
        }
    });
    //验证码发送请求
    $('#verifyMailCode').click(function () {
        $('#inputCode').removeAttr("hidden");
        var address = $('#address').val();
        $.ajax({
            type:"get",
            url:"/user/sendMail/"+address,
            dataType:"text",
        })
    })
});