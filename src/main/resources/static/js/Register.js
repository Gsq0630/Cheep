$(function () {
    //点击下一步
    //判断两个表单验证是否全部正确
    var tag;
    var nameTag;
    var emailTag;
    $("#checked").click(function () {
        $.ajax({
            url:"/register/checkphone",
            type:"post",
            dataType:"text",
            data:{
                'accPhone':$("#phone").val()
            },
            success:function (data) {
                tag =data;
                if($("#register_form").valid()){
                    if(data == "false"){
                        $("span[name='errormsg']").empty();
                        $("span[name='successmsg']").empty();
                        $("#tel_button").append("<span class='error' name='errormsg'>手机号已被注册，请登录！</span>")
                    }else{
                        $("span[name='errormsg']").empty();
                        $("span[name='successmsg']").empty();
                        $("#tel_button").append("<span class='success' name='successmsg'>手机号未被注册！</span>")
                    }

                }else{
                    $("span[name='errormsg']").empty();
                    $("span[name='successmsg']").empty();
                    $("#tel_button").append("<span class='error' name='errormsg'>请正确填写手机号！</span>")
                }

            }
        })
    });
    //当用户失去注册名框的焦点时，执行判断注册名是否重复
    $("input[name='reg_name']").blur(function () {
        $.ajax({
            url:"/register/checkname",
            type:"post",
            dataType:"text",
            data:{
                'accName':$("#reg_name").val()
            },
            success:function (data) {
                nameTag = data;
                var index = $("#error_name");
                // if($("#register_form2").valid()){
                    if(data == "false"){
                        $("span[name='name_emsg']").empty();
                        index.append("<span class='error' name='name_emsg'>该用户名已经存在！</span>")
                    }else{
                        $("span[name='name_emsg']").empty();
                    }
                // }

            }
        })
    });
    //当用户失去注册邮箱框的焦点时，执行判断邮箱是否重复
    $("input[name='form_email']").blur(function () {
        $.ajax({
            url:"/register/checkemail",
            type:"post",
            dataType:"text",
            data:{
                'accEmail':$("#form_email").val()
            },
            success:function (data) {
                emailTag =data;
                var email_index = $("#error_email")
                if(data=="false"){
                    $("span[name='email_emsg']").empty();
                    email_index.append("<span class='error' name='email_emsg'>该邮箱已经存在！</span>")
                }else{
                    $("span[name='email_emsg']").empty();
                }
            }
        })
    });
    $("#tel_next").click(function () {

        if($("#register_form").valid()==true && tag=="true"){
            $("#first_form").css("display", "none");
            $("#second_form").css("display", "inline");
            $("#stepcount").empty();
            $("#stepcount").css("background-position","0 0");

            $("#stepcount2").css("background-position"," 0 -200px");
            $("div[class='line1']").css("background-position","0 -130px");
            $("#accountinfo").css("color","#33BB44");
            $("#register_form2").validate({
                rules: {
                    reg_name:{
                        required: true,
                        regex: /^\w{4,20}$/
                    },
                    reg_pwd:{
                        required:true,
                        minlength:8
                    },
                    confirm_pwd:{
                        required:true,
                        equalTo:'#reg_pwd'
                    },
                    form_email:{
                        required:true,
                        email:true
                    }
                },
                messages: {
                    reg_name:{
                        required: "请输入登录用户名",
                        regex: "用户名格式不正确"
                    },
                    reg_pwd:{
                        required:"请输入登录密码",
                        minlength:"最小长度为8"
                    },
                    confirm_pwd:{
                        required:"请再次输入登录密码",
                        equalTo:"两次密码输入不一致"
                    },
                    form_email:{
                        required:"请输入邮箱",
                        email:"邮箱格式不正确"
                    }
                },
                errorPlacement: function(error, element) {
                    $("span[name='name_emsg']").empty();
                    $("span[name='email_emsg']").empty();
                    error.appendTo(element.parent().next().children());
                }
            });

        }
    });
    //点击注册
    $("#reg_button").click(function () {
        if( $("#register_form2").valid() == true && nameTag =="true" && emailTag=="true" ){
            $.ajax({
                url:"/register/insertAccount",
                type:"post",
                data:{
                    'accPhone':$("#phone").val(),
                    'accName':$("#reg_name").val(),
                    'accEmail':$("#form_email").val(),
                    'accPassword':$("#confirm_pwd").val()
                },
                dataType:"text",
                success:function (data) {
                    $.ajax({
                        url:"/register/selectAccId",
                        type:"post",
                        data:{
                            'accName':$("#reg_name").val(),
                        },
                        dataType:"text",
                        success:function (data) {
                            alert(data)
                        }

                    })
                    if(data=="true"){
                        $("#reg_main").css("display", "none");
                        $("#reg_over").css("display", "inline");
                        $("p[name='welcomeMsg']").append($("#reg_name").val())
                    }else{
                        alert("注册失败");
                    }
                }
            });

        }

    });
    $("#register_form").validate({
        rules: {
            phone: {
                required: true,
                regex:/^\d{11}$/
            }
        },
        messages: {
            phone: {
                required: "请输入电话号码",
                regex:"电话号码格式不正确"
            }
        }
    });

});
